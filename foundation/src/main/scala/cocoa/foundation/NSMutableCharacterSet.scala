// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.foundation

import scala.language.experimental.macros
import scalanative.native._
import objc._


@ObjC
class NSMutableCharacterSet extends NSCharacterSet with NSCopying with NSMutableCopying {
  @inline def addCharactersInRange_(aRange: NSRange): Unit = extern
  @inline def removeCharactersInRange_(aRange: NSRange): Unit = extern
  @inline def addCharactersInString_(aString: NSString): Unit = extern
  @inline def removeCharactersInString_(aString: NSString): Unit = extern
  @inline def formUnionWithCharacterSet_(otherSet: NSCharacterSet): Unit = extern
  @inline def formIntersectionWithCharacterSet_(otherSet: NSCharacterSet): Unit = extern
  @inline def invert(): Unit = extern
}

@ObjCClass
abstract class NSMutableCharacterSetClass extends NSCharacterSetClass  {
  @inline override def controlCharacterSet(): NSMutableCharacterSet = extern
  @inline override def whitespaceCharacterSet(): NSMutableCharacterSet = extern
  @inline override def whitespaceAndNewlineCharacterSet(): NSMutableCharacterSet = extern
  @inline override def decimalDigitCharacterSet(): NSMutableCharacterSet = extern
  @inline override def letterCharacterSet(): NSMutableCharacterSet = extern
  @inline override def lowercaseLetterCharacterSet(): NSMutableCharacterSet = extern
  @inline override def uppercaseLetterCharacterSet(): NSMutableCharacterSet = extern
  @inline override def nonBaseCharacterSet(): NSMutableCharacterSet = extern
  @inline override def alphanumericCharacterSet(): NSMutableCharacterSet = extern
  @inline override def decomposableCharacterSet(): NSMutableCharacterSet = extern
  @inline override def illegalCharacterSet(): NSMutableCharacterSet = extern
  @inline override def punctuationCharacterSet(): NSMutableCharacterSet = extern
  @inline override def capitalizedLetterCharacterSet(): NSMutableCharacterSet = extern
  @inline override def symbolCharacterSet(): NSMutableCharacterSet = extern
  @inline override def newlineCharacterSet(): NSMutableCharacterSet = extern
  @inline override def characterSetWithRange_(aRange: NSRange): NSMutableCharacterSet = extern
  @inline override def characterSetWithCharactersInString_(aString: NSString): NSMutableCharacterSet = extern
  @inline override def characterSetWithBitmapRepresentation_(data: NSData): NSMutableCharacterSet = extern
  @inline override def characterSetWithContentsOfFile_(fName: NSString): NSMutableCharacterSet = extern
}

object NSMutableCharacterSet extends NSMutableCharacterSetClass {
  override type InstanceType = NSMutableCharacterSet
}