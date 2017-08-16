//     Project: scalanative-cocoa
//      Module: Foundation
// Description: Generated with scala-obj-bindgen (with manual postprocessing) from:
//              Foundation/NSCoder.h
package cocoa.foundation

import scala.language.experimental.macros
import objc.runtime._
import objc.{ObjC, ObjCClass}

import scala.scalanative.posix.inttypes.uint8_t
import scalanative.native._

@ObjC
abstract class NSCoder extends NSObject {
  @inline def encodeValueOfObjCType(`type`: Ptr[CSignedChar], addr: Ptr[Byte]): Unit = extern
//  @inline def encodeDataObject(data: NSData): Unit = extern
  @inline def decodeValueOfObjCType(`type`: Ptr[CSignedChar], data: Ptr[Byte]): Unit = extern
//  @inline def decodeDataObject(): NSData = extern
  @inline def versionForClassName(className: NSString): NSInteger = extern
  @inline def encodeObject(`object`: id): Unit = extern
  @inline def encodeRootObject(rootObject: id): Unit = extern
  @inline def encodeBycopyObject(anObject: id): Unit = extern
  @inline def encodeByrefObject(anObject: id): Unit = extern
  @inline def encodeConditionalObject(`object`: id): Unit = extern
  @inline def encodeValuesOfObjCTypes(types: Ptr[CSignedChar]): Unit = extern
  @inline def encodeArrayOfObjCType(`type`: Ptr[CSignedChar], count: NSUInteger, array: Ptr[Byte]): Unit = extern
  @inline def encodeBytes(byteaddr: Ptr[Byte], length: NSUInteger): Unit = extern
  @inline def decodeObject(): id = extern
  @inline def decodeTopLevelObjectAndReturnError(error: NSError): id = extern
  @inline def decodeValuesOfObjCTypes(types: Ptr[CSignedChar]): Unit = extern
  @inline def decodeArrayOfObjCType(itemType: Ptr[CSignedChar], count: NSUInteger, array: Ptr[Byte]): Unit = extern
  @inline def decodeBytesWithReturnedLength(lengthp: NSUInteger): Ptr[Byte] = extern
  @inline def encodePropertyList(aPropertyList: id): Unit = extern
  @inline def decodePropertyList(): id = extern
  @inline def setObjectZone(zone: NSZone): Unit = extern
  @inline def objectZone(): Ptr[NSZone] = extern
  @inline def encodeObject(objv: id, key: NSString): Unit = extern
  @inline def encodeConditionalObject(objv: id, key: NSString): Unit = extern
  @inline def encodeBool(boolv: BOOL, key: NSString): Unit = extern
  @inline def encodeInt(intv: CInt, key: NSString): Unit = extern
  @inline def encodeInt32(intv: int32_t, key: NSString): Unit = extern
  @inline def encodeInt64(intv: int64_t, key: NSString): Unit = extern
  @inline def encodeFloat(realv: Float, key: NSString): Unit = extern
  @inline def encodeDouble(realv: Double, key: NSString): Unit = extern
  @inline def encodeBytes(bytesp: uint8_t, lenv: NSUInteger, key: NSString): Unit = extern
  @inline def containsValueForKey(key: NSString): BOOL = extern
  @inline def decodeObjectForKey(key: NSString): id = extern
  @inline def decodeTopLevelObjectForKey(key: NSString, error: NSError): id = extern
  @inline def decodeBoolForKey(key: NSString): BOOL = extern
  @inline def decodeIntForKey(key: NSString): CInt = extern
  @inline def decodeInt32ForKey(key: NSString): int32_t = extern
  @inline def decodeInt64ForKey(key: NSString): int64_t = extern
  @inline def decodeFloatForKey(key: NSString): Float = extern
  @inline def decodeDoubleForKey(key: NSString): Double = extern
  @inline def decodeBytesForKey(key: NSString, lengthp: NSUInteger): Ptr[uint8_t] = extern
  @inline def encodeInteger(intv: NSInteger, key: NSString): Unit = extern
  @inline def decodeIntegerForKey(key: NSString): NSInteger = extern
  @inline def decodeObjectOfClass(aClass: id, key: NSString): id = extern
  @inline def decodeTopLevelObjectOfClass(aClass: id, key: NSString, error: NSError): id = extern
  @inline def decodeObjectOfClasses(classes: id, key: NSString): id = extern
  @inline def decodeTopLevelObjectOfClasses(classes: id, key: NSString, error: NSError): id = extern
  @inline def decodePropertyListForKey(key: NSString): id = extern
  @inline def failWithError(error: NSError): Unit = extern
  @inline def systemVersion(): CUnsignedInt = extern
  @inline def allowsKeyedCoding(): BOOL = extern
  @inline def requiresSecureCoding(): BOOL = extern
//  @inline def allowedClasses(): NSSet[id] = extern
  @inline def encodeNXObject(`object`: id): Unit = extern
  @inline def decodeNXObject(): id = extern
}

