//     Project: scalanative-cocoa
//      Module: Foundation
// Description: Generated with scala-obj-bindgen (with manual postprocessing) from:
//              Foundation/NSValue.h
package cocoa.foundation

import objc.{ObjC, ObjCClass}
import objc.runtime.id
import scala.scalanative.native._

@ObjC
class NSNumber extends NSValue {
  @inline def initWithCoder(aDecoder: NSCoder): NSNumber = extern
  @inline def initWithChar(value: CSignedChar): NSNumber = extern
  @inline def initWithUnsignedChar(value: CUnsignedChar): NSNumber = extern
  @inline def initWithShort(value: CShort): NSNumber = extern
  @inline def initWithUnsignedShort(value: CUnsignedShort): NSNumber = extern
  @inline def initWithInt(value: CInt): NSNumber = extern
  @inline def initWithUnsignedInt(value: CUnsignedInt): NSNumber = extern
  @inline def initWithLong(value: CLong): NSNumber = extern
  @inline def initWithUnsignedLong(value: CUnsignedLong): NSNumber = extern
  @inline def initWithLongLong(value: CLongLong): NSNumber = extern
  @inline def initWithUnsignedLongLong(value: CUnsignedLongLong): NSNumber = extern
  @inline def initWithFloat(value: Float): NSNumber = extern
  @inline def initWithDouble(value: Double): NSNumber = extern
  @inline def initWithBool(value: BOOL): NSNumber = extern
  @inline def initWithInteger(value: NSInteger): NSNumber = extern
  @inline def initWithUnsignedInteger(value: NSUInteger): NSNumber = extern
  @inline def compare(otherNumber: NSNumber): NSComparisonResult = extern
  @inline def isEqualToNumber(number: NSNumber): BOOL = extern
  @inline def descriptionWithLocale(locale: id): NSString = extern
  @inline def charValue(): CSignedChar = extern
  @inline def unsignedCharValue(): CUnsignedChar = extern
  @inline def shortValue(): CShort = extern
  @inline def unsignedShortValue(): CUnsignedShort = extern
  @inline def intValue(): CInt = extern
  @inline def unsignedIntValue(): CUnsignedInt = extern
  @inline def longValue(): CLong = extern
  @inline def unsignedLongValue(): CUnsignedLong = extern
  @inline def longLongValue(): CLongLong = extern
  @inline def unsignedLongLongValue(): CUnsignedLongLong = extern
  @inline def floatValue(): Float = extern
  @inline def doubleValue(): Double = extern
  @inline def boolValue(): BOOL = extern
  @inline def integerValue(): NSInteger = extern
  @inline def unsignedIntegerValue(): NSUInteger = extern
  @inline def stringValue(): NSString = extern
}

@ObjCClass
abstract class NSNumberClass extends NSValueClass {
  @inline def numberWithChar(value: CSignedChar): NSNumber = extern
  @inline def numberWithUnsignedChar(value: CUnsignedChar): NSNumber = extern
  @inline def numberWithShort(value: CShort): NSNumber = extern
  @inline def numberWithUnsignedShort(value: CUnsignedShort): NSNumber = extern
  @inline def numberWithInt(value: CInt): NSNumber = extern
  @inline def numberWithUnsignedInt(value: CUnsignedInt): NSNumber = extern
  @inline def numberWithLong(value: CLong): NSNumber = extern
  @inline def numberWithUnsignedLong(value: CUnsignedLong): NSNumber = extern
  @inline def numberWithLongLong(value: CLongLong): NSNumber = extern
  @inline def numberWithUnsignedLongLong(value: CUnsignedLongLong): NSNumber = extern
  @inline def numberWithFloat(value: Float): NSNumber = extern
  @inline def numberWithDouble(value: Double): NSNumber = extern
  @inline def numberWithBool(value: BOOL): NSNumber = extern
  @inline def numberWithInteger(value: NSInteger): NSNumber = extern
  @inline def numberWithUnsignedInteger(value: NSUInteger): NSNumber = extern
}


object NSNumber extends NSNumberClass {
  override type InstanceType = NSNumber

  def apply(i: Int): NSNumber = NSNumber.numberWithInt(i)
  def apply(d: Double): NSNumber = NSNumber.numberWithDouble(d)
}
