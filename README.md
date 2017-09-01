# scalanative-cocoa
Experimental [scala-native](https://github.com/scala-native/scala-native) bridge for Objective-C / Cocoa.

**WARNING**: This project is in an early experimental stage. Most of the bindings to Cocoa are still missing. The API and especially the semantics for creating Objective-C classes in Scala may change any time!

**[Documentation](https://jokade.github.io/scalanative-cocoa/)**

### sbt Settings
Add this to your `build.sbt`:
```scala
libraryDependencies += "de.surfice" %%% "scalanative-cocoa-foundation" % "0.0.1-SNAPSHOT"

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)

resolvers += Resolver.sonatypeRepo("snapshots")
```
Replace `scalanative-cocoa-foundation` with `scalanative-cocoa-appkit` if you want to use AppKit. However, it's probably best to start with the template in that case (see below).

scalanative-cocoa requires scala-native 0.3.2.


