//     Project: scalanative-cocoa
//      Module: 
// Description:

import cocoa.foundation._
import cocoa.foundation.global._
import de.surfice.smacrotools.debug
import objc.runtime._
import objc._
import NSConverters._

import scala.scalanative.native._
import scala.scalanative.runtime.struct

object Main {

  def main(args: Array[String]): Unit = {
    f()
  }

  def f(): Unit = {
    val o = NSObject.alloc()
    NSLog(ns"%@",o)
    val x = XClass.alloc()
    NSLog(ns"%@",x)
    x.get.init()
    NSLog(ns"%@",objc_msgSend(x,sel_registerName(c"init")))

//    val parent = ObjCParent(x.cast[id])
//    val desc = objc_msgSend(parent,sel_registerName(c"hello"))
//    NSLog(ns"%@",parent)
  }


}

@extern
object unistd {
  def sleep(seconds: CInt): Unit = extern
}


@SNDefined
@debug
class XClass(self: ObjCProxy[XClass]) {
//  override type InstanceType = XClass
  var i = 42

  def init(): ObjCObject = {
    $super(self)(_.get.init())

//    NSLog(ns"super_init: %@",p)
    self
  }
}
object XClass extends NSObjectClass {
  override type InstanceType = ObjCProxy[XClass]

}
