//     Project: scalanative-cocoa
//      Module: 
// Description:

import cocoa.foundation._
import cocoa.foundation.global._
import de.surfice.smacrotools.debug
import objc.runtime._
import objc.{ObjC, ScalaDefined}
import NSConverters._


import scala.scalanative.native._

object Main {

  def main(args: Array[String]): Unit = {
//    NSApplicationMain(args.size,args.cast[Ptr[CString]])
//    println("end")
    f()
//    unistd.sleep(20)
  }

  def f(): Unit = {
    val dict = NSDictionary(
      ns"hello" -> ns"world"
    )
    dict.asScala.foreach{ p =>
      NSLog(ns"%@: %@",p._1,p._2)
    }
//    NSLog(ns"%@",dict)
  }

}

@extern
object unistd {
  def sleep(seconds: CInt): Unit = extern
}
@ObjC
@ScalaDefined
class MyClass extends NSObject {
}
object MyClass extends NSObjectClass {
  override type InstanceType = MyClass
}


//object MyClass extends NSObjectClass[MyClass] {
//  override def alloc(): MyClass = extern
//}

@extern
object NSApplicationMain {
  @name("NSApplicationMain")
  def apply(argc: CInt, argv: Ptr[Byte]) = extern
}
