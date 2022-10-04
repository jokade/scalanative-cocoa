// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.foundation

import scalanative.native._
import scalanative.unsigned._
import scalanative.unsafe._
import objc._


@ObjC
class NSMutableString extends NSString {
  @inline def replaceCharactersInRange_aString_(range: NSRange, aString: NSString): Unit = extern
  @inline def insertString_loc_(aString: NSString, loc: NSUInteger): Unit = extern
  @inline def deleteCharactersInRange_(range: NSRange): Unit = extern
  @inline def appendString_(aString: NSString): Unit = extern
  @inline def appendFormat_(format: NSString): Unit = extern
  @inline def setString_(aString: NSString): Unit = extern
  @inline def replaceOccurrencesOfString_replacement_options_searchRange_(target: NSString, replacement: NSString, options: NSStringCompareOptions, searchRange: NSRange): NSUInteger = extern
  @inline def applyTransform_reverse_range_resultingRange_(transform: NSString, reverse: BOOL, range: NSRange, resultingRange: NSRangePointer): BOOL = extern
  @inline def initWithCapacity_(capacity: NSUInteger): NSMutableString = extern
}

@ObjCClass
abstract class NSMutableStringClass extends NSStringClass {
  @inline def stringWithCapacity_(capacity: NSUInteger): NSMutableString = extern
}

object NSMutableString extends NSMutableStringClass {
  override type InstanceType = NSMutableString
}

