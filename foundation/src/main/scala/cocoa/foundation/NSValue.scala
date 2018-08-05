//     Project: scalanative-cocoa
//      Module: Foundation
// Description: Generated with scala-obj-bindgen (with manual postprocessing) from:
//              Foundation/NSValue.h
package cocoa.foundation

import scala.scalanative.native._

@ObjC
class NSValue extends NSObject with NSCopying with NSSecureCoding {
  @inline def getValue(value: Ptr[Byte]): Unit = extern
  @inline def initWithBytes(value: Ptr[Byte], `type`: Ptr[CSignedChar]): NSValue = extern
//  @inline def initWithCoder(aDecoder: NSCoder): NSValue = extern
  @inline def objCType(): Ptr[CSignedChar] = extern
  @inline def isEqualToValue(value: NSValue): BOOL = extern
  @inline def nonretainedObjectValue(): id = extern
  @inline def pointerValue(): Ptr[Byte] = extern
}

@ObjCClass
abstract class NSValueClass extends NSObjectClass {
  @inline def valueWithBytes(value: Ptr[Byte], `type`: Ptr[CSignedChar]): NSValue = extern
  @inline def value(value: Ptr[Byte], `type`: Ptr[CSignedChar]): NSValue = extern
  @inline def valueWithNonretainedObject(anObject: id): NSValue = extern
  @inline def valueWithPointer(pointer: Ptr[Byte]): NSValue = extern
}



object NSValue extends NSValueClass {
  override type InstanceType = NSValue
}
