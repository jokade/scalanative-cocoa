//     Project: scalanative-cocoa
//      Module: Foundation
// Description: Generated with scala-obj-bindgen (with manual postprocessing) from:
//
package cocoa.foundation

import scala.language.experimental.macros
import scalanative.native._

@ObjC
class NSMutableCharacterSet extends NSCharacterSet with NSCopying with NSMutableCopying {
  @inline def addCharactersInRange(aRange: NSRange): Unit = extern
  @inline def removeCharactersInRange(aRange: NSRange): Unit = extern
  @inline def addCharactersInString(aString: NSString): Unit = extern
  @inline def removeCharactersInString(aString: NSString): Unit = extern
  @inline def formUnionWithCharacterSet(otherSet: NSCharacterSet): Unit = extern
  @inline def formIntersectionWithCharacterSet(otherSet: NSCharacterSet): Unit = extern
  @inline def invert(): Unit = extern
}

@ObjCClass
abstract class NSMutableCharacterSetClass extends NSCharacterSetClass {
//  @inline def controlCharacterSet(): NSMutableCharacterSet = extern
//  @inline def whitespaceCharacterSet(): NSMutableCharacterSet = extern
//  @inline def whitespaceAndNewlineCharacterSet(): NSMutableCharacterSet = extern
//  @inline def decimalDigitCharacterSet(): NSMutableCharacterSet = extern
//  @inline def letterCharacterSet(): NSMutableCharacterSet = extern
//  @inline def lowercaseLetterCharacterSet(): NSMutableCharacterSet = extern
//  @inline def uppercaseLetterCharacterSet(): NSMutableCharacterSet = extern
//  @inline def nonBaseCharacterSet(): NSMutableCharacterSet = extern
//  @inline def alphanumericCharacterSet(): NSMutableCharacterSet = extern
//  @inline def decomposableCharacterSet(): NSMutableCharacterSet = extern
//  @inline def illegalCharacterSet(): NSMutableCharacterSet = extern
//  @inline def punctuationCharacterSet(): NSMutableCharacterSet = extern
//  @inline def capitalizedLetterCharacterSet(): NSMutableCharacterSet = extern
//  @inline def symbolCharacterSet(): NSMutableCharacterSet = extern
//  @inline def newlineCharacterSet(): NSMutableCharacterSet = extern
//  @inline def characterSetWithRange(aRange: NSRange): NSMutableCharacterSet = extern
//  @inline def characterSetWithCharactersInString(aString: NSString): NSMutableCharacterSet = extern
//  @inline def characterSetWithBitmapRepresentation(data: NSData): NSMutableCharacterSet = extern
//  @inline def characterSetWithContentsOfFile(fName: NSString): NSMutableCharacterSet = extern
}

object NSMutableCharacterSet extends NSMutableCharacterSetClass {
  override type InstanceType = NSMutableCharacterSet
}