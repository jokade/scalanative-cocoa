//     Project: scalanative-cocoa
//      Module: Foundation
// Description: Contains types defined in Foundation.
package cocoa

import objc.runtime._

import scala.language.experimental.macros
import scala.scalanative.native._

package object foundation {
//  type objc_class = Ptr[Byte]
//  type objc_object = Ptr[Byte]
//  type objc_selector = Ptr[Byte]
  type BOOL       = CBool
  type NSUInteger = CUnsignedLong
  type NSInteger  = CLong
  type unichar    = UShort

  type NSZone  = Ptr[Byte]
  type NSRange = Ptr[CStruct2[NSUInteger,NSUInteger]]
  type NSPoint = Ptr[CStruct2[CDouble,CDouble]]
  type NSSize  = NSPoint
  type NSRect  = Ptr[CStruct2[CStruct2[CDouble,CDouble],CStruct2[CDouble,CDouble]]]

  val nil: id = 0.cast[id]

  implicit def objectToId(o: ObjCObject): id = o.cast[id]

  /** NSString literal. */
  implicit class NSQuote(val ctx: StringContext) {
    def ns(): NSString = macro Macros.nsquoteImpl
  }

  @inline def @@(int: Int): NSNumber = NSNumber(int)
  @inline def @@(double: Double): NSNumber = NSNumber(double)
  @inline def @@(boolean: Boolean): NSNumber = NSNumber(boolean)

  @inline def @@(objects: NSObject*): NSArray[NSObject] = NSArray(objects:_*)
//  @inline def @@@(ints: Int*): NSArray[NSNumber] = NSArray(ints.map(NSNumber.apply):_*)
//  @inline def @@@(doubles: Double*): NSArray[NSNumber] = NSArray(doubles.map(NSNumber.apply):_*)
//  @inline def @@@(objects: NSObject*): NSArray[NSObject] = NSArray(objects:_*)

//  @inline def @@@[T<:NSObject](objects: T*) = NSArray.arrayWithObjects(objects:_*)

  type NSComparisonResult = NSInteger
  object NSComparisonResult {
    val NSOrderedAscending = -1L
    val NSOrderedSame = 0
    val NSOrderedDescending = 1
  }

  type NSStringCompareOptions = NSUInteger
  object NSStringCompareOptions {
    val NSCaseInsensitiveSearch: NSStringCompareOptions = 1.toUInt
    val NSLiteralSearch: NSStringCompareOptions = 2.toUInt
    val NSBackwardsSearch: NSStringCompareOptions = 4.toUInt
    val NSAnchoredSearch: NSStringCompareOptions = 8.toUInt
    val NSNumericSearch: NSStringCompareOptions = 64.toUInt
    val NSDiacriticInsensitiveSearch: NSStringCompareOptions = 128.toUInt
    val NSWidthInsensitiveSearch: NSStringCompareOptions = 256.toUInt
    val NSForcedOrderingSearch: NSStringCompareOptions = 512.toUInt
    val NSRegularExpressionSearch: NSStringCompareOptions = 1024.toUInt
  }

  type NSStringEncoding = NSUInteger
  object NSStringEncoding {
    val NSASCIIStringEncoding: NSStringEncoding = 1.toUInt          /* 0..127 only */
    val NSNEXTSTEPStringEncoding: NSStringEncoding = 2.toUInt
    val NSJapaneseEUCStringEncoding: NSStringEncoding = 3.toUInt
    val NSUTF8StringEncoding: NSStringEncoding = 4.toUInt
    val NSISOLatin1StringEncoding: NSStringEncoding = 5.toUInt
    val NSSymbolStringEncoding: NSStringEncoding = 6.toUInt
    val NSNonLossyASCIIStringEncoding: NSStringEncoding = 7.toUInt
    val NSShiftJISStringEncoding: NSStringEncoding = 8.toUInt          /* kCFStringEncodingDOSJapanese */
    val NSISOLatin2StringEncoding: NSStringEncoding = 9.toUInt
    val NSUnicodeStringEncoding: NSStringEncoding = 10.toUInt
    val NSWindowsCP1251StringEncoding: NSStringEncoding = 11.toUInt    /* Cyrillic; same as AdobeStandardCyrillic */
    val NSWindowsCP1252StringEncoding: NSStringEncoding = 12.toUInt    /* WinLatin1 */
    val NSWindowsCP1253StringEncoding: NSStringEncoding = 13.toUInt    /* Greek */
    val NSWindowsCP1254StringEncoding: NSStringEncoding = 14.toUInt    /* Turkish */
    val NSWindowsCP1250StringEncoding: NSStringEncoding = 15.toUInt    /* WinLatin2 */
    val NSISO2022JPStringEncoding: NSStringEncoding = 21.toUInt        /* ISO 2022 Japanese encoding for e-mail */
    val NSMacOSRomanStringEncoding: NSStringEncoding = 30.toUInt

    val NSUTF16StringEncoding: NSStringEncoding = NSUnicodeStringEncoding.toUInt      /* An alias for NSUnicodeStringEncoding */

    val NSUTF16BigEndianStringEncoding: NSStringEncoding = 0x90000100.toUInt          /* NSUTF16StringEncoding encoding with explicit endianness specified */
    val NSUTF16LittleEndianStringEncoding: NSStringEncoding = 0x94000100.toUInt       /* NSUTF16StringEncoding encoding with explicit endianness specified */

    val NSUTF32StringEncoding: NSStringEncoding = 0x8c000100.toUInt
    val NSUTF32BigEndianStringEncoding: NSStringEncoding = 0x98000100.toUInt          /* NSUTF32StringEncoding encoding with explicit endianness specified */
    val NSUTF32LittleEndianStringEncoding: NSStringEncoding = 0x9c000100.toUInt        /* NSUTF32StringEncoding encoding with explicit endianness specified */
  }

  type NSStringEncodingConversionOptions = NSUInteger
  object NSStringEncodingConversionOptions {
    val NSStringEncodingConversionAllowLossy: NSStringEncodingConversionOptions = 1.toUInt
    val NSStringEncodingConversionExternalRepresentation: NSStringEncodingConversionOptions = 2.toUInt
  }

  type NSStringEnumerationOptions = NSUInteger
  object NSStringEnumerationOptions {
    val NSStringEnumerationByLines: NSStringEnumerationOptions = 0.toUInt
    val NSStringEnumerationByParagraphs: NSStringEnumerationOptions = 1.toUInt
    val NSStringEnumerationByComposedCharacterSequences: NSStringEnumerationOptions = 2.toUInt
    val NSStringEnumerationByWords: NSStringEnumerationOptions = 3.toUInt
    val NSStringEnumerationBySentences: NSStringEnumerationOptions = 4.toUInt
    val NSStringEnumerationReverse: NSStringEnumerationOptions = 1.toUInt << 8
    val NSStringEnumerationSubstringNotRequired: NSStringEnumerationOptions = 1.toUInt << 9
    val NSStringEnumerationLocalized: NSStringEnumerationOptions = 1.toUInt << 10
  }

}
