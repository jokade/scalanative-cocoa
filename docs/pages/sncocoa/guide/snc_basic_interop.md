---
title: Basic Interop
keywords:
summary:
sidebar: sncocoa_sidebar
permalink: snc_basic_interop.html
folder: sncocoa
---

## Calling Objective-C Methods from Scala
You can call Objective-C class and instance methods using the normal Scala method call syntax,
if there is a [binding](snc_create_binding.html) defined for that class, e.g.:

<div class="container-fluid comparison">
  <div class="row">
    <div class="col col-md-6">
      <h4 style="text-align:center">Objective-C</h4>
    </div>
    <div class="col col-md-6">
      <h4 style="text-align:center">Scala</h4>
    </div>
  </div>
  
  <div class="row">
    <div class="col col-md-6">
    {% highlight objc %}
    [[NSNumber alloc] initWithInt:42]; {% endhighlight %}
    </div>
    
    <div class="col col-md-6">
    {% highlight scala %}
    NSNumber.alloc().initWithInt(42){% endhighlight %}
    </div>
  </div>
</div>  

SNCocoa provides bindings for the *Foundation* and *AppKit* frameworks, located in the packages `cocoa.foundation`
and `cocoa.appkit`, respectively.

{% include callout.html content='Methods with varargs are currently not supported' type="warning" %}

## Objective-C Functions
Bindings to global Objective-C functions are provided as functions in an object named after the framework to which they belong.
`NSLog()` for example is provided by `cocoa.foundation.Foundation`
```scala
import cocoa.foundation._

Foundation.NSLog(ns"Hello world!")
```  

## Strings and Numbers
### Literals
Similar to Objective-C, SNCocoa provides short-forms to create strings and numbers from Scala literals:
 <div class="container-fluid comparison">
  <div class="row">
    <div class="col col-md-6">
      <h4 style="text-align:center">Objective-C</h4>
    </div>
    <div class="col col-md-6">
      <h4 style="text-align:center">Scala</h4>
    </div>
  </div>
  
  <div class="row">
    <div class="col col-md-6">
    {% highlight objc %}
    #import <Cocoa/Cocoa.h>
    
    NSString *thString = @"A string";
    NSNumber *intNumber = @42; 
    NSNumber *doubleNumber = @1e42;{% endhighlight %}
    </div>
    
    <div class="col col-md-6">
    {% highlight scala %}
    import cocoa.foundation._
    
    val theString = ns"A string"
    val intNumber = @@(42)
    val doubleNumber = @@(1e42) {% endhighlight %}
    </div>
  </div>
</div>  

{% include callout.html content='In contrast to Objective-C, NSString literals created with the `ns""` syntax are
not constants, but a short-hand for writing `NSString.stringWithCString(c"...", NSStringEncoding.NSUTF8StringEncoding)`' type="info" %}

### Scala Extensions
SNCocoa provides extension methods for `NSString`:
```scala
import cocoa.foundation._

val nsString = ns"The String"
nsString.string     // returns the NSString value as Scala string
nsString.cstring    // returns the NSString value as CString
```

## Enums
Enums defined by cocoa frameworks are represented in Scala as type aliases for `NSInteger` and `NSUInteger`,
plus a companion object that holds the enum values. For example, the values for `NSStringEncoding` are defined
in `cocoa.foundation.NSStringEncoding`: 
```scala
import scalanative.native._
import cocoa.foundation._

val string = NSString.stringWithCString(c"The string", NSStringEncoding.NSUTF8StringEncoding)
``` 
{% include links.html %}
