//     Project: scalanative-cocoa
//      Module: 
// Description:

import scala.scalanative.native._
import objc._
import cocoa.foundation._
import cocoa.foundation.Foundation._
import de.surfice.smacrotools.debug

import scala.scalanative.native.objc.runtime.ObjCObject

object Main {

  def main(args: Array[String]): Unit = {
    val str = NSString.stringWithUTF8String(c"Hello, world!")
    NSLog(str)
    val x = XClass.alloc()
    x.asInstanceOf[NSObject].init()
  }
/*
  def f(): Unit = {
    val dict = NSDictionary(ns"greeting" -> ns"Hello")
    NSLog(ns"%@",dict)
//    val parent = ObjCParent(x.cast[id])
//    val desc = objc_msgSend(parent,sel_registerName(c"hello"))
//    NSLog(ns"%@",parent)
  }
*/

}

@extern
object util {
  def util_callInit(obj: ObjCProxy[XClass]): Unit = extern
}

@ScalaObjC
@debug
class XClass(self: NSObject) {
//  override type InstanceType = XClass
  var i = 42

  @selector("init")
  def myInit(): NSObject = {
    println("FOO!")
    $super(self)(_.init())

    self
  }

}
object XClass extends NSObjectClass {
  override type InstanceType = ObjCProxy[XClass]

}
