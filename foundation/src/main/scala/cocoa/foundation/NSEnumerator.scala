// Copyright (c) 2017 - 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.foundation

import cocoa.foundation.NSFastEnumeration.NSFastEnumerationState

import scala.language.experimental.macros
import scalanative.native._
import scalanative.unsafe._
import objc._

@ObjC
trait NSFastEnumeration {
  @inline def countByEnumeratingWithState_buffer_len_(state: NSFastEnumerationState, buffer: id, len: NSUInteger): NSUInteger = extern
}

object NSFastEnumeration {
  type NSFastEnumerationState = Ptr[Byte]
}

@ObjC
abstract class NSEnumerator[T<:NSObject] extends NSObject with NSFastEnumeration {
  @inline def nextObject(): T = extern
  @inline def allObjects(): NSArray[T] = extern
}
