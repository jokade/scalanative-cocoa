---
title: Memory Management
keywords:
summary:
sidebar: sncocoa_sidebar
permalink: snc_memory_management.html
folder: sncocoa
---

{% include callout.html content='SNCocoa does not supported [Automatic Reference Counting (ARC)](https://developer.apple.com/library/content/releasenotes/ObjectiveC/RN-TransitioningToARC/Introduction/Introduction.html#//apple_ref/doc/uid/TP40011226),
so you have to manage memory of Objective-C objects allocated in Scala manually. Make sure you are familiar with the Objective-C 
[Memory Management Policy](https://developer.apple.com/library/content/documentation/Cocoa/Conceptual/MemoryMgmt/Articles/mmRules.html#//apple_ref/doc/uid/20000994-BAJHFBGH).'
type="info" %}


## Memory Management in UI delegates
### Transient Objects
Callbacks from AppKit, e.g. to your `NSApplicationDelegate` are contained within autorelease pools.
For transient objects, that are only referenced during the callback, there are two simple rules:
  - for objects you own, call `autorelease()` before you loose the reference to the object
  - objects you don't own need no special consideration.
  
The same applies to objects created during initialization of the delegate.
  
**Example:**
```scala
@ScalaObjC
class AppDelegate(self: NSObject) extends NSApplicationDelegate {
  
  // IBAction callback
  def action(sender: id): Unit = {
    // objects without ownership interest -> automatically released
    val int = @@(42)
    val string = ns"The String"
    val date = NSDate.date()
    val array = NSArray(@@(1),@@(2),@@(3))
    
    // call autorelease() on objects you own
    val ownedDate = NSDate.alloc().init().autorelease()
  }
}
``` 

### Objects stored in instance vars
Objective-C objects created in callbacks and stored in instance vars must be released explicitly when they are no longer
referenced by the class by calling `release()`. Furthermore, if you don't own the object, you also must call `retain()`
on it, to avoid its autorelease after the callback has completed.

Furthermore, if your delegate has a property that is an Objective-C object, you must ensure that an object assigned to it
is not deallocated while you're using it. You must also make sure you relinquish ownership of any currently-held value
when a new value is assigned. To accomplish this, you must call `release()` on the currently-held, and `retain()`
on the new value within the setter of the property.

An exception to this rule are usually IBOutlet properties, since those are auto-released when appropriate.

**Example:**
```scala
@ScalaObjC
class AppDelegate(self: NSObject) extends NSApplicationDelegate {
  private var _int: NSNumber = @@(0).retain() // we need to retain since we call release() in action()_
  private var _date: NSDate = NSDate.alloc().init()
  private var _count: NSNumber = _
  
  // retain/ release usually not required for IBOutlets
  var window: NSWindow = _
  
  def count: NSNumber = _count
  // release currently-held and retain new value in setters for Objective-C objects
  def count_=(n: NSNumber): Unit = {
    n.retain()
    _count.release()
    _count = n
  }
  
  // IBAction callback
  def action(sender: id): Unit = {
    // release old objects
    _int.release()
    _date.release()
    
    // objects without ownership interest must be retained when they are stored
    _int = @@(42).retain()
    
    // owned object
    _date = NSDate.alloc().init()
  }
}
```
#### Simplify memory management using setters
Manually retaining/ releasing objects whenever the old value of a variable is replaced is cumbersome and error-prone.
Hence, you should use also setters for private vars that hold Objective-C objects instead of directly accessing the var.

{% include links.html %}
