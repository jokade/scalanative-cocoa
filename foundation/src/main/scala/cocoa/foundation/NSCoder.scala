// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.foundation

import scala.language.experimental.macros
import scala.scalanative.native._
import scala.scalanative.native.objc._
import scala.scalanative.native.objc.runtime.{int32_t, int64_t}
import scala.scalanative.posix.inttypes.uint8_t


@ObjC
trait NSCoder extends NSObject {
  @inline def encodeValueOfObjCType_addr_(`type`: Ptr[CSignedChar], addr: Ptr[Byte]): Unit = extern
  @inline def encodeDataObject_(data: NSData): Unit = extern
  @inline def decodeValueOfObjCType_data_(`type`: Ptr[CSignedChar], data: Ptr[Byte]): Unit = extern
  @inline def decodeDataObject(): NSData = extern
  @inline def versionForClassName_(className: NSString): NSInteger = extern
  @inline def encodeObject_(`object`: id): Unit = extern
  @inline def encodeRootObject_(rootObject: id): Unit = extern
  @inline def encodeBycopyObject_(anObject: id): Unit = extern
  @inline def encodeByrefObject_(anObject: id): Unit = extern
  @inline def encodeConditionalObject_(`object`: id): Unit = extern
  @inline def encodeValuesOfObjCTypes_(types: Ptr[CSignedChar]): Unit = extern
  @inline def encodeArrayOfObjCType_count_array_(`type`: Ptr[CSignedChar], count: NSUInteger, array: Ptr[Byte]): Unit = extern
  @inline def encodeBytes_length_(byteaddr: Ptr[Byte], length: NSUInteger): Unit = extern
  @inline def decodeObject(): id = extern
  @inline def decodeTopLevelObjectAndReturnError_(error: NSError): id = extern
  @inline def decodeValuesOfObjCTypes_(types: Ptr[CSignedChar]): Unit = extern
  @inline def decodeArrayOfObjCType_count_array_(itemType: Ptr[CSignedChar], count: NSUInteger, array: Ptr[Byte]): Unit = extern
  @inline def decodeBytesWithReturnedLength_(lengthp: NSUInteger): Ptr[Byte] = extern
  @inline def encodePropertyList_(aPropertyList: id): Unit = extern
  @inline def decodePropertyList(): id = extern
  @inline def setObjectZone_(zone: NSZone): Unit = extern
  @inline def objectZone(): Ptr[NSZone] = extern
  @inline def encodeObject_key_(objv: id, key: NSString): Unit = extern
  @inline def encodeConditionalObject_key_(objv: id, key: NSString): Unit = extern
  @inline def encodeBool_key_(boolv: BOOL, key: NSString): Unit = extern
  @inline def encodeInt_key_(intv: CInt, key: NSString): Unit = extern
  @inline def encodeInt32_key_(intv: int32_t, key: NSString): Unit = extern
  @inline def encodeInt64_key_(intv: int64_t, key: NSString): Unit = extern
  @inline def encodeFloat_key_(realv: Float, key: NSString): Unit = extern
  @inline def encodeDouble_key_(realv: Double, key: NSString): Unit = extern
  @inline def encodeBytes_lenv_key_(bytesp: uint8_t, lenv: NSUInteger, key: NSString): Unit = extern
  @inline def containsValueForKey_(key: NSString): BOOL = extern
  @inline def decodeObjectForKey_(key: NSString): id = extern
  @inline def decodeTopLevelObjectForKey_error_(key: NSString, error: NSError): id = extern
  @inline def decodeBoolForKey_(key: NSString): BOOL = extern
  @inline def decodeIntForKey_(key: NSString): CInt = extern
  @inline def decodeInt32ForKey_(key: NSString): int32_t = extern
  @inline def decodeInt64ForKey_(key: NSString): int64_t = extern
  @inline def decodeFloatForKey_(key: NSString): Float = extern
  @inline def decodeDoubleForKey_(key: NSString): Double = extern
  @inline def decodeBytesForKey_lengthp_(key: NSString, lengthp: NSUInteger): Ptr[uint8_t] = extern
  @inline def encodeInteger_key_(intv: NSInteger, key: NSString): Unit = extern
  @inline def decodeIntegerForKey_(key: NSString): NSInteger = extern
  @inline def decodeObjectOfClass_key_(aClass: id, key: NSString): id = extern
  @inline def decodeTopLevelObjectOfClass_key_error_(aClass: id, key: NSString, error: NSError): id = extern
  @inline def decodeObjectOfClasses_key_(classes: id, key: NSString): id = extern
  @inline def decodeTopLevelObjectOfClasses_key_error_(classes: id, key: NSString, error: NSError): id = extern
  @inline def decodePropertyListForKey_(key: NSString): id = extern
  @inline def failWithError_(error: NSError): Unit = extern
  @inline def systemVersion(): CUnsignedInt = extern
  @inline def allowsKeyedCoding(): BOOL = extern
  @inline def requiresSecureCoding(): BOOL = extern
//  @inline def allowedClasses(): NSSet[id] = extern
  @inline def encodeNXObject_(`object`: id): Unit = extern
  @inline def decodeNXObject(): id = extern
}
