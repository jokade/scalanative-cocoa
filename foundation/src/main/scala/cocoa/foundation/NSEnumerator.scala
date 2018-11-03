// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.foundation

import scala.language.experimental.macros
import scala.scalanative.native._
import scala.scalanative.native.objc._
import scala.scalanative.native.objc.runtime.ObjCObject

@ObjC
trait NSFastEnumeration extends ObjCObject {
  @inline def countByEnumeratingWithState_buffer_len_(state: Ptr[Byte], buffer: id, len: NSUInteger): NSUInteger = extern
}

@ObjC
trait NSEnumerator[T<:NSObject] extends NSObject with NSFastEnumeration {
  @inline def nextObject(): id = extern
  @inline def allObjects(): NSArray[T] = extern
}
