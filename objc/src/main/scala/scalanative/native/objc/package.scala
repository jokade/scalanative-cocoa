package scala.scalanative.native

import scala.scalanative.unsafe._
import scala.annotation.StaticAnnotation
import scala.scalanative.native.objc.runtime.{ClassPtr, id}
import scala.language.experimental.macros

package object objc {

  val objc_nil: id = null

  val objc_Nil: ClassPtr = null

  var defaultRootObject: ClassPtr = runtime.objc_getClass(c"NSObject")

  implicit def function2Block1[T1,R](f: (Block,T1) => R): Block1[T1,R] = macro Block.Macros.blockImpl
  implicit def function2Block2[T1,T2,R](f: (Block,T1,T2) => R): Block2[T1,T2,R] = macro Block.Macros.blockImpl
}
