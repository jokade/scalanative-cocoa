// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.foundation

import scalanative.native._
import objc._
import scala.scalanative.native.objc.runtime.ObjCObject

@ObjC
trait NSCoding extends ObjCObject {
  // note: use id instead of NSCoder to avoid cyclic reference problem
  @inline def encodeWithCoder_(aCoder: id): Unit = extern
// note: use id instead of NSCoder to avoid cyclic reference problem
  @inline def initWithCoder_(aDecoder: id): id = extern
}
