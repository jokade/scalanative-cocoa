// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.foundation

import scala.scalanative.native._
import objc._


@ObjC
class NSNumber extends NSValue {
  @inline def initWithChar_(value: CSignedChar): NSNumber = extern
  @inline def initWithUnsignedChar_(value: CUnsignedChar): NSNumber = extern
  @inline def initWithShort_(value: CShort): NSNumber = extern
  @inline def initWithUnsignedShort_(value: CUnsignedShort): NSNumber = extern
  @inline def initWithInt_(value: CInt): NSNumber = extern
  @inline def initWithUnsignedInt_(value: CUnsignedInt): NSNumber = extern
  @inline def initWithLong_(value: CLong): NSNumber = extern
  @inline def initWithUnsignedLong_(value: CUnsignedLong): NSNumber = extern
  @inline def initWithLongLong_(value: CLongLong): NSNumber = extern
  @inline def initWithUnsignedLongLong_(value: CUnsignedLongLong): NSNumber = extern
  @inline def initWithFloat_(value: Float): NSNumber = extern
  @inline def initWithDouble_(value: Double): NSNumber = extern
  @inline def initWithBool_(value: BOOL): NSNumber = extern
  @inline def initWithInteger_(value: NSInteger): NSNumber = extern
  @inline def initWithUnsignedInteger_(value: NSUInteger): NSNumber = extern
  @inline def compare_(otherNumber: NSNumber): NSComparisonResult = extern
  @inline def isEqualToNumber_(number: NSNumber): BOOL = extern
  @inline def descriptionWithLocale_(locale: id): NSString = extern
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
 @inline def numberWithChar_(value: CSignedChar): NSNumber = extern
  @inline def numberWithUnsignedChar_(value: CUnsignedChar): NSNumber = extern
  @inline def numberWithShort_(value: CShort): NSNumber = extern
  @inline def numberWithUnsignedShort_(value: CUnsignedShort): NSNumber = extern
  @inline def numberWithInt_(value: CInt): NSNumber = extern
  @inline def numberWithUnsignedInt_(value: CUnsignedInt): NSNumber = extern
  @inline def numberWithLong_(value: CLong): NSNumber = extern
  @inline def numberWithUnsignedLong_(value: CUnsignedLong): NSNumber = extern
  @inline def numberWithLongLong_(value: CLongLong): NSNumber = extern
  @inline def numberWithUnsignedLongLong_(value: CUnsignedLongLong): NSNumber = extern
  @inline def numberWithFloat_(value: Float): NSNumber = extern
  @inline def numberWithDouble_(value: Double): NSNumber = extern
  @inline def numberWithBool_(value: BOOL): NSNumber = extern
  @inline def numberWithInteger_(value: NSInteger): NSNumber = extern
  @inline def numberWithUnsignedInteger_(value: NSUInteger): NSNumber = extern
}


object NSNumber extends NSNumberClass {
  override type InstanceType = NSNumber

  def apply(b: Boolean): NSNumber = NSNumber.numberWithBool_(b)
  def apply(i: Int): NSNumber = NSNumber.numberWithInt_(i)
  def apply(d: Double): NSNumber = NSNumber.numberWithDouble_(d)
}
