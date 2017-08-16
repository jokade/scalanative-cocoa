//     Project: scalanative-cocoa
//      Module:
// Description:
package cocoa.foundation

import scalanative.native._
import objc.ObjC
import cocoa.foundation._


@ObjC
class NSMutableString extends NSString {
  @inline def replaceCharactersInRange(range: NSRange, aString: NSString): Unit = extern
  @inline def insertString(aString: NSString, loc: NSUInteger): Unit = extern
  @inline def deleteCharactersInRange(range: NSRange): Unit = extern
  @inline def appendString(aString: NSString): Unit = extern
  @inline def appendFormat(format: NSString): Unit = extern
  @inline def setString(aString: NSString): Unit = extern
  @inline def replaceOccurrencesOfString(target: NSString, replacement: NSString, options: NSStringCompareOptions, searchRange: NSRange): NSUInteger = extern
//  @inline def applyTransform(transform: NSString, reverse: BOOL, range: NSRange, resultingRange: NSRangePointer): BOOL = extern
  @inline def initWithCapacity(capacity: NSUInteger): NSMutableString = extern
}

object NSMutableString {
  @inline def stringWithCapacity(capacity: NSUInteger): NSMutableString = extern
}

