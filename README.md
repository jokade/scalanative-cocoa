# scalanative-cocoa
Experimental [scala-native](https://github.com/scala-native/scala-native) bridge for Objective-C / Cocoa.

**WARNING**: This project is in an early experimental stage. Most of the bindings to Cocoa are still missing. The API and especially the semantics for creating Objective-C classes in Scala may change any time!

#### Contents:
* [Getting Started](#getting-started)
* [Bindings to Foundation](#bindings-to-foundation)
* [Creating Objective-C Classes](#creating-objective-c-classes-in-scala)

## Getting Started

### sbt Settings
Add this to your `build.sbt`:
```scala
libraryDependencies += "de.surfice" %%% "scalanative-cocoa-foundation" % "0.0.1-SNAPSHOT"

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)

resolvers += Resolver.sonatypeRepo("snapshots")
```
Replace `scalanative-cocoa-foundation` with `scalanative-cocoa-appkit` if you want to use AppKit. However, it's probably best to start with the template in that case (see below).

scalanative-cocoa requires scala-native 0.3.2.

### Hello World
```scala
import cocoa.foundation._

object Main {
  def main(args: Array[String]): Unit = {
    Foundation.NSLog(ns"Hello world!")
  }
}
```

### Giter8 Template for Cocoa UI
If you want to create a Cocoa UI application, you can start with the [giter8 template](https://github.com/jokade/scalanative-cocoa-seed.g8):
```sh
# g8 jokade/scalanative-cocoa-seed.g8
``` 
or, with a recent version of sbt:
```sh
# sbt new jokade/scalanative-cocoa-seed.g8
```
This template requires Xcode to be installed.

After you've created the project from the template, open the Xcode project located in `$PROJECT/xcode/` (you might want to rename the Xcode project folder), and build the the project (*Product* -> *Build*).

When the Xcode build is finished, run `sbt nativeLink`. This should create the application bundle in `$PROJECT/target/scala-2.11/`. To run the application in the terminal, execute
```sh
target/scala-2.11/$APPNAME.app/Contents/MacOS/$APPNAME
```

## Bindings to Foundation
The bindings to the Foundation framework are located under the package `cocoa.foundation`. Global functions (e.g. `NSLog`) are located in `cocoa.foundation.Foundation`.

### Collections
TBD


## Creating Objective-C Classes in Scala
Here's an example for an `NSApplicationDelegate` defined in Scala:
```scala
import cocoa.foundation._
import cocoa.appkit._
import objc.ScalaObjC

// @ScalaObjC is a macro annotation that generates at compile time
// the code required to define the Objective-C class
// (the Objective-C class is then defined dynamically at runtime).
//
// Important: the constructor must have exactly one argument, which is
// the actual Object-C proxy that will be injected when the object is created.
@ScalaObjC
class AppDelegate(self: AppDelegate.InstanceType) extends NSApplicationDelegate {
  // protected and private fields are not accessible from Objective-C
  private var _clickCount = 0
  
  // all public vars, vals, and Scala getter/setter are exposed as Objective-C properties
  var window: NSObject = _             // outlet connected in the xib to the application window
  var clickCountView: NSTextField = _  // another xib outlet
  
  // all public methods are exposed to Objective-C using the normal selector semantics
  def takeClick(id: NSObject): Unit = {  // connected in xib as action for a button
    _clickCount += 1
    updateView()
  }
  
  override def applicationDidFinishLaunching(notification: NSNotification): Unit = {
    updateView()
  }
  
  // protected and private methods are not accessible from Objective-C
  private def updateView(): Unit = {
    clickCountView.setIntegerValue(_clickCount)
  } 
}

// companion object required to store the Objective-C class definition
object AppDelegate extends NSApplicationClass {
  // define the type of the proxy class
  type InstanceType = NSObject
}
```
