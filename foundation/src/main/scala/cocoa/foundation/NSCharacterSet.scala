//     Project: scalanative-cocoa
//      Module: Foundation
// Description: Generated with scala-obj-bindgen (with manual postprocessing) from:
//              Foundation/NSCharacterSet.h Foundation/NSURL.h
package cocoa.foundation

import scala.language.experimental.macros
import objc.{ObjC, ObjCClass}

import scala.scalanative.posix.inttypes.uint8_t
import scalanative.native._

@ObjC
class NSCharacterSet extends NSObject with NSCopying with NSMutableCopying with NSCoding {
  @inline def initWithCoder(aDecoder: NSCoder): NSCharacterSet = extern
  @inline def characterIsMember(aCharacter: unichar): BOOL = extern
  @inline def longCharacterIsMember(theLongChar: CChar32): BOOL = extern
  @inline def isSupersetOfSet(theOtherSet: NSCharacterSet): BOOL = extern
  @inline def hasMemberInPlane(thePlane: uint8_t): BOOL = extern
  @inline def bitmapRepresentation(): NSData = extern
  @inline def invertedSet(): NSCharacterSet = extern
}

@ObjCClass
abstract class NSCharacterSetClass extends NSObjectClass {
  @inline def controlCharacterSet(): NSCharacterSet = extern
  @inline def whitespaceCharacterSet(): NSCharacterSet = extern
  @inline def whitespaceAndNewlineCharacterSet(): NSCharacterSet = extern
  @inline def decimalDigitCharacterSet(): NSCharacterSet = extern
  @inline def letterCharacterSet(): NSCharacterSet = extern
  @inline def lowercaseLetterCharacterSet(): NSCharacterSet = extern
  @inline def uppercaseLetterCharacterSet(): NSCharacterSet = extern
  @inline def nonBaseCharacterSet(): NSCharacterSet = extern
  @inline def alphanumericCharacterSet(): NSCharacterSet = extern
  @inline def decomposableCharacterSet(): NSCharacterSet = extern
  @inline def illegalCharacterSet(): NSCharacterSet = extern
  @inline def punctuationCharacterSet(): NSCharacterSet = extern
  @inline def capitalizedLetterCharacterSet(): NSCharacterSet = extern
  @inline def symbolCharacterSet(): NSCharacterSet = extern
  @inline def newlineCharacterSet(): NSCharacterSet = extern
  @inline def characterSetWithRange(aRange: NSRange): NSCharacterSet = extern
  @inline def characterSetWithCharactersInString(aString: NSString): NSCharacterSet = extern
  @inline def characterSetWithBitmapRepresentation(data: NSData): NSCharacterSet = extern
  @inline def characterSetWithContentsOfFile(fName: NSString): NSCharacterSet = extern
  @inline def URLUserAllowedCharacterSet(): NSCharacterSet = extern
  @inline def URLPasswordAllowedCharacterSet(): NSCharacterSet = extern
  @inline def URLHostAllowedCharacterSet(): NSCharacterSet = extern
  @inline def URLPathAllowedCharacterSet(): NSCharacterSet = extern
  @inline def URLQueryAllowedCharacterSet(): NSCharacterSet = extern
  @inline def URLFragmentAllowedCharacterSet(): NSCharacterSet = extern
}

object NSCharacterSet extends NSCharacterSetClass {
  override type InstanceType = NSCharacterSet
}