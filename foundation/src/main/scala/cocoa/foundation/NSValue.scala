// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.foundation

import scala.scalanative.native._
import scala.scalanative.native.objc._

@ObjC
class NSValue extends NSObject with NSCopying with NSSecureCoding {
  @inline def getValue_(value: Ptr[Byte]): Unit = extern
  @inline def initWithBytes_type_(value: Ptr[Byte], `type`: Ptr[CSignedChar]): NSValue = extern
  @inline def objCType(): Ptr[CSignedChar] = extern
  @inline def isEqualToValue_(value: NSValue): BOOL = extern
  @inline def nonretainedObjectValue(): id = extern
  @inline def pointerValue(): Ptr[Byte] = extern
}


@ObjCClass
abstract class NSValueClass extends NSObjectClass {
  @inline def valueWithBytes_type_(value: Ptr[Byte], `type`: Ptr[CSignedChar]): NSValue = extern
  @inline def value_type_(value: Ptr[Byte], `type`: Ptr[CSignedChar]): NSValue = extern
  @inline def valueWithNonretainedObject_(anObject: id): NSValue = extern
  @inline def valueWithPointer_(pointer: Ptr[Byte]): NSValue = extern
}



object NSValue extends NSValueClass {
  override type InstanceType = NSValue
}
