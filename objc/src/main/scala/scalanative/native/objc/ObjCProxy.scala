//     Project: scalanative-cocoa
//      Module: objc
// Description: Provides a proxy class to encapsulate scala instances within ObjC objects
// Copyright (c) 2017. Distributed under the MIT License (see included LICENSE file). package objc
package scala.scalanative.native.objc

import scala.scalanative.native._
import scala.scalanative.native.objc.runtime.{ObjCObject, id}

final class ObjCProxy[T] private() extends ObjCObject {
  @inline def get: T = helper.getScalaInstanceIVar[T](this.asInstanceOf[id])
}


