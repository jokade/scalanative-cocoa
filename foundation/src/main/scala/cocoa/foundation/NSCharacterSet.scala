// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.foundation

import scala.language.experimental.macros
import scalanative.native._
import objc._

import scala.scalanative.posix.inttypes.uint8_t

@ObjC
class NSCharacterSet extends NSObject with NSCopying with NSMutableCopying with NSCoding {
  @inline def characterIsMember_(aCharacter: unichar): BOOL = extern
  @inline def longCharacterIsMember_(theLongChar: CChar32): BOOL = extern
  @inline def isSupersetOfSet_(theOtherSet: NSCharacterSet): BOOL = extern
  @inline def hasMemberInPlane_(thePlane: uint8_t): BOOL = extern
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
  @inline def characterSetWithRange_(aRange: NSRange): NSCharacterSet = extern
  @inline def characterSetWithCharactersInString_(aString: NSString): NSCharacterSet = extern
  @inline def characterSetWithBitmapRepresentation_(data: NSData): NSCharacterSet = extern
  @inline def characterSetWithContentsOfFile_(fName: NSString): NSCharacterSet = extern

  // from NSURL.h
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