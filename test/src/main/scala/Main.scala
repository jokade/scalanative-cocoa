//     Project: scalanative-cocoa
//      Module: 
// Description:

import cocoa.foundation._
import cocoa.foundation.global._
import de.surfice.smacrotools.debug
import objc.runtime._
import objc.{ObjC, ScalaDefined}

import scala.scalanative.native._

object Main extends App {

  def hello(self: id, cmd: SEL): Unit = println("Hello!")

  val o = NSObject.alloc()
  val m = MyClass.alloc()
  NSLog(ns"%@",o)
  NSLog(ns"%@",m)

  println("end")
}

@ObjC
@ScalaDefined
@debug
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
