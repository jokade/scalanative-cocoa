//     Project: scalanative-cocoa
//      Module: Foundation
// Description: Contains types defined in Foundation and Scala-specific utilities.
package cocoa

import scala.language.experimental.macros
import scala.scalanative.native._
import objc.runtime._

package object foundation {
//  type objc_class = Ptr[Byte]
//  type objc_object = Ptr[Byte]
//  type objc_selector = Ptr[Byte]
  type id         = objc.runtime.id
  type SEL        = objc.runtime.SEL
  type BOOL       = objc.runtime.BOOL
  type NSUInteger = CUnsignedLong
  type NSInteger  = CLong
  type unichar    = UShort

  type NSZone         = Ptr[Byte]
  type NSRange        = Ptr[CStruct2[NSUInteger,NSUInteger]]
  type NSRangePointer = NSRange
  type NSPoint        = Ptr[CStruct2[CDouble,CDouble]]
  type NSSize         = NSPoint
  type NSRect         = Ptr[CStruct2[CStruct2[CDouble,CDouble],CStruct2[CDouble,CDouble]]]
  type NSTimeInterval = CDouble
  type NSNotificationName = NSString

  def registerClass(classes: NSObjectClass*): Unit = classes.foreach(_.__cls)

  private val _objFormat = NSString("%@")
  @inline def NSLog(obj: NSObject): Unit = NSLog(_objFormat,obj)
  @inline def NSLog(str: NSString): Unit = Foundation.NSLog(str.__ptr)

  @inline def NSLog(format: NSString, arg1: ObjCObject): Unit = Foundation.NSLog(format.__ptr,arg1.__ptr)
  @inline def NSLog(format: NSString, arg1: CInt): Unit = Foundation.NSLog(format.__ptr,arg1)
  @inline def NSLog(format: NSString, arg1: NSUInteger): Unit = Foundation.NSLog(format.__ptr,arg1)

  @inline def NSLog(format: NSString, arg1: ObjCObject, arg2: ObjCObject): Unit = Foundation.NSLog(format.__ptr,arg1.__ptr,arg2.__ptr)
  @inline def NSLog(format: NSString, arg1: ObjCObject, arg2: ObjCObject, arg3: ObjCObject): Unit = Foundation.NSLog(format.__ptr,arg1.__ptr,arg2.__ptr,arg3.__ptr)
//  val nil: id = 0.cast[id]

  //implicit def objectToId(o: ObjCObject): id = o.cast[id]
//  implicit final class RichObjCObject(val o: ObjCObject) {
//    def toPtr: id = o.cast[id]
//  }

  /** NSString literal. */
  implicit class NSQuote(val ctx: StringContext) {
    def ns(): NSString = macro Macros.nsquoteImpl
  }

  @inline def @@(int: Int): NSNumber = NSNumber(int)
  @inline def @@(double: Double): NSNumber = NSNumber(double)
  @inline def @@(boolean: Boolean): NSNumber = NSNumber(boolean)

//  @inline def @@(objects: NSObject*): NSArray[NSObject] = NSArray(objects:_*)
//  @inline def @@@(ints: Int*): NSArray[NSNumber] = NSArray(ints.map(NSNumber.apply):_*)
//  @inline def @@@(doubles: Double*): NSArray[NSNumber] = NSArray(doubles.map(NSNumber.apply):_*)
//  @inline def @@@(objects: NSObject*): NSArray[NSObject] = NSArray(objects:_*)

//  @inline def @@@[T<:NSObject](objects: T*) = NSArray.arrayWithObjects(objects:_*)

  type NSComparisonResult = NSInteger
  object NSComparisonResult {
    val NSOrderedAscending :NSComparisonResult = -1L
    val NSOrderedSame      :NSComparisonResult = 0
    val NSOrderedDescending:NSComparisonResult = 1
  }

  type NSStringCompareOptions = NSUInteger
  object NSStringCompareOptions {
    val NSCaseInsensitiveSearch: NSStringCompareOptions = 1.toULong
    val NSLiteralSearch: NSStringCompareOptions = 2.toULong
    val NSBackwardsSearch: NSStringCompareOptions = 4.toULong
    val NSAnchoredSearch: NSStringCompareOptions = 8.toULong
    val NSNumericSearch: NSStringCompareOptions = 64.toULong
    val NSDiacriticInsensitiveSearch: NSStringCompareOptions = 128.toULong
    val NSWidthInsensitiveSearch: NSStringCompareOptions = 256.toULong
    val NSForcedOrderingSearch: NSStringCompareOptions = 512.toULong
    val NSRegularExpressionSearch: NSStringCompareOptions = 1024.toULong
  }

  type NSStringEncoding = NSUInteger
  object NSStringEncoding {
    val NSASCIIStringEncoding: NSStringEncoding = 1.toULong          /* 0..127 only */
    val NSNEXTSTEPStringEncoding: NSStringEncoding = 2.toULong
    val NSJapaneseEUCStringEncoding: NSStringEncoding = 3.toULong
    val NSUTF8StringEncoding: NSStringEncoding = 4.toULong
    val NSISOLatin1StringEncoding: NSStringEncoding = 5.toULong
    val NSSymbolStringEncoding: NSStringEncoding = 6.toULong
    val NSNonLossyASCIIStringEncoding: NSStringEncoding = 7.toULong
    val NSShiftJISStringEncoding: NSStringEncoding = 8.toULong          /* kCFStringEncodingDOSJapanese */
    val NSISOLatin2StringEncoding: NSStringEncoding = 9.toULong
    val NSUnicodeStringEncoding: NSStringEncoding = 10.toULong
    val NSWindowsCP1251StringEncoding: NSStringEncoding = 11.toULong    /* Cyrillic; same as AdobeStandardCyrillic */
    val NSWindowsCP1252StringEncoding: NSStringEncoding = 12.toULong    /* WinLatin1 */
    val NSWindowsCP1253StringEncoding: NSStringEncoding = 13.toULong    /* Greek */
    val NSWindowsCP1254StringEncoding: NSStringEncoding = 14.toULong    /* Turkish */
    val NSWindowsCP1250StringEncoding: NSStringEncoding = 15.toULong    /* WinLatin2 */
    val NSISO2022JPStringEncoding: NSStringEncoding = 21.toULong        /* ISO 2022 Japanese encoding for e-mail */
    val NSMacOSRomanStringEncoding: NSStringEncoding = 30.toULong

    val NSUTF16StringEncoding: NSStringEncoding = NSUnicodeStringEncoding.toULong      /* An alias for NSUnicodeStringEncoding */

    val NSUTF16BigEndianStringEncoding: NSStringEncoding = 0x90000100.toULong          /* NSUTF16StringEncoding encoding with explicit endianness specified */
    val NSUTF16LittleEndianStringEncoding: NSStringEncoding = 0x94000100.toULong       /* NSUTF16StringEncoding encoding with explicit endianness specified */

    val NSUTF32StringEncoding: NSStringEncoding = 0x8c000100.toULong
    val NSUTF32BigEndianStringEncoding: NSStringEncoding = 0x98000100.toULong          /* NSUTF32StringEncoding encoding with explicit endianness specified */
    val NSUTF32LittleEndianStringEncoding: NSStringEncoding = 0x9c000100.toULong        /* NSUTF32StringEncoding encoding with explicit endianness specified */
  }

  type NSStringEncodingConversionOptions = NSUInteger
  object NSStringEncodingConversionOptions {
    val NSStringEncodingConversionAllowLossy: NSStringEncodingConversionOptions = 1.toULong
    val NSStringEncodingConversionExternalRepresentation: NSStringEncodingConversionOptions = 2.toULong
  }

  type NSStringEnumerationOptions = NSUInteger
  object NSStringEnumerationOptions {
    val NSStringEnumerationByLines: NSStringEnumerationOptions = 0.toULong
    val NSStringEnumerationByParagraphs: NSStringEnumerationOptions = 1.toULong
    val NSStringEnumerationByComposedCharacterSequences: NSStringEnumerationOptions = 2.toULong
    val NSStringEnumerationByWords: NSStringEnumerationOptions = 3.toULong
    val NSStringEnumerationBySentences: NSStringEnumerationOptions = 4.toULong
    val NSStringEnumerationReverse: NSStringEnumerationOptions = 1.toULong << 8
    val NSStringEnumerationSubstringNotRequired: NSStringEnumerationOptions = 1.toULong << 9
    val NSStringEnumerationLocalized: NSStringEnumerationOptions = 1.toULong << 10
  }

  type NSTimeZoneNameStyle = NSInteger
  object NSTimeZoneNameStyle {
    val NSTimeZoneNameStyleStandard            :NSTimeZoneNameStyle = 0            // Central Standard Time
    val NSTimeZoneNameStyleShortStandard       :NSTimeZoneNameStyle = 1       // CST
    val NSTimeZoneNameStyleDaylightSaving      :NSTimeZoneNameStyle = 2      // Central Daylight Time
    val NSTimeZoneNameStyleShortDaylightSaving :NSTimeZoneNameStyle = 3 // CDT
    val NSTimeZoneNameStyleGeneric             :NSTimeZoneNameStyle = 4             // Central Time
    val NSTimeZoneNameStyleShortGeneric        :NSTimeZoneNameStyle = 5        // CT
  }

  type NSLocaleLanguageDirection = NSUInteger
  object NSLocaleLanguageDirection {
    val NSLocaleLanguageDirectionUnknown: NSLocaleLanguageDirection = 0.toULong
    val NSLocaleLanguageDirectionLeftToRight: NSLocaleLanguageDirection = 1.toULong
    val NSLocaleLanguageDirectionRightToLeft: NSLocaleLanguageDirection = 2.toULong
    val NSLocaleLanguageDirectionTopToBottom: NSLocaleLanguageDirection = 3.toULong
    val NSLocaleLanguageDirectionBottomToTop: NSLocaleLanguageDirection = 4.toULong
  }

  type NSDataReadingOptions = NSUInteger
  object NSDataReadingOptions {
    val NSDataReadingMappedIfSafe :NSDataReadingOptions = 1.toULong << 0	// Hint to map the file in if possible and safe
    val NSDataReadingUncached     :NSDataReadingOptions = 1.toULong << 1	// Hint to get the file not to be cached in the kernel
    val NSDataReadingMappedAlways :NSDataReadingOptions = 1.toULong << 3	// Hint to map the file in if possible. This takes precedence over NSDataReadingMappedIfSafe if both are given.
  }

  type NSDataWritingOptions = NSUInteger
  object NSDataWritingOptions {
    val NSDataWritingAtomic                           :NSDataWritingOptions = 1.toULong << 0	// Hint to use auxiliary file when saving; equivalent to atomically:YES
    val NSDataWritingWithoutOverwriting               :NSDataWritingOptions = 1.toULong << 1 // Hint to  prevent overwriting an existing file. Cannot be combined with NSDataWritingAtomic.

    val NSDataWritingFileProtectionNone               :NSDataWritingOptions = 0x10000000.toULong
    val NSDataWritingFileProtectionComplete           :NSDataWritingOptions = 0x20000000.toULong
    val NSDataWritingFileProtectionCompleteUnlessOpen :NSDataWritingOptions = 0x30000000.toULong
    val NSDataWritingFileProtectionCompleteUntilFirstUserAuthentication :NSDataWritingOptions = 0x40000000.toULong
    val NSDataWritingFileProtectionMask :NSDataWritingOptions = 0xf0000000.toULong
  }

  type NSDataSearchOptions = NSUInteger
  object NSDataSearchOptions {
    val NSDataSearchBackwards :NSDataSearchOptions = 1.toULong << 0
    val NSDataSearchAnchored  :NSDataSearchOptions = 1.toULong << 1
  }

  type NSDataBase64EncodingOptions = NSUInteger
  object NSDataBase64EncodingOptions {
    // Use zero or one of the following to control the maximum line length after which a line ending is inserted. No line endings are inserted by default.
    val NSDataBase64Encoding64CharacterLineLength :NSDataBase64EncodingOptions = 1.toULong << 0
    val NSDataBase64Encoding76CharacterLineLength :NSDataBase64EncodingOptions = 1.toULong << 1

    // Use zero or more of the following to specify which kind of line ending is inserted. The default line ending is CR LF.
    val NSDataBase64EncodingEndLineWithCarriageReturn :NSDataBase64EncodingOptions = 1.toULong << 4
    val NSDataBase64EncodingEndLineWithLineFeed       :NSDataBase64EncodingOptions = 1.toULong << 5
  }

  type NSDataBase64DecodingOptions = NSUInteger
  object NSDataBase64DecodingOptions {
    val NSDataBase64DecodingIgnoreUnknownCharacters :NSDataBase64DecodingOptions = 1.toULong << 0
  }

  type NSEnumerationOptions = NSUInteger
  object NSEnumerationOptions {
    val NSEnumerationConcurrent: NSEnumerationOptions = 1.toULong << 0
    val NSEnumerationReverse: NSEnumerationOptions = 1.toULong << 1
  }

  type NSErrorUserInfoKey = NSString
  object NSErrorUserInfoKey {
    //val NSLocalizedDescriptionKey; // NSString, a complete sentence (or more) describing ideally both what failed and why it failed.
    //val NSLocalizedFailureReasonErrorKey; // NSString, a complete sentence (or more) describing why the operation failed.
    //val NSLocalizedRecoverySuggestionErrorKey; // NSString, a complete sentence (or more) describing what the user can do to fix the problem.
    //val NSLocalizedRecoveryOptionsErrorKey; // NSArray of NSStrings corresponding to button titles.
    //val NSRecoveryAttempterErrorKey; // Instance of a subclass of NSObject that conforms to the NSErrorRecoveryAttempting informal protocol
    //val NSHelpAnchorErrorKey; // NSString containing a help anchor
    //val NSDebugDescriptionErrorKey
    //API_AVAILABLE (macos(10.5), ios(2.0), watchos(2.0), tvos(9.0)); // NSString. This provides a string which will be shown when constructing the debugDescription of the NSError, to be used when debugging or when formatting the error with %@.  This string will never be used in localizedDescription, so will not be shown to the user.
    //val NSLocalizedFailureErrorKey
    //API_AVAILABLE (macos(10.13), ios(11.0), watchos(4.0), tvos(11.0)); // NSString, a complete sentence (or more) describing what failed.  Setting a value for this key in userInfo dictionary of errors received from framework APIs is a good way to customize and fine tune the localizedDescription of an NSError.  As an example, for Foundation error code NSFileWriteOutOfSpaceError, setting the value of this key to "The image library could not be saved." will allow the localizedDescription of the error to come out as "The image library could not be saved. The volume Macintosh HD is out of space." rather than the default (say) “You can't save the file ImgDatabaseV2 because the volume Macintosh HD is out of space."

    // Other standard keys in userInfo, for various error codes
    //val NSStringEncodingErrorKey ;  // NSNumber containing NSStringEncoding
    //val NSURLErrorKey;              // NSURL
    //val NSFilePathErrorKey;         // NSString
  }

  type NSURLBookmarkCreationOptions = NSUInteger
  object NSURLBookmarkCreationOptions {
    val NSURLBookmarkCreationMinimalBookmark                 :NSURLBookmarkCreationOptions = 1.toULong << 9 /* creates bookmark data with "less" information, which may be smaller but still be able to resolve in certain ways */
    val NSURLBookmarkCreationSuitableForBookmarkFile         :NSURLBookmarkCreationOptions = 1.toULong << 10 /* include the properties required by writeBookmarkData:toURL:options: in the bookmark data created */
    val NSURLBookmarkCreationWithSecurityScope               :NSURLBookmarkCreationOptions = 1.toULong << 11 /* include information in the bookmark data which allows the same sandboxed process to access the resource after being relaunched */
    val NSURLBookmarkCreationSecurityScopeAllowOnlyReadAccess:NSURLBookmarkCreationOptions = 1.toULong << 12 /* if used with kCFURLBookmarkCreationWithSecurityScope, at resolution time only read access to the resource will be granted */
  }

  type NSURLBookmarkResolutionOptions = NSUInteger
  object NSURLBookmarkResolutionOptions {
    val NSURLBookmarkResolutionWithoutUI         :NSURLBookmarkResolutionOptions = 1.toULong << 8  /* don't perform any user interaction during bookmark resolution */
    val NSURLBookmarkResolutionWithoutMounting   :NSURLBookmarkResolutionOptions = 1.toULong << 9  /* don't mount a volume during bookmark resolution */
    val NSURLBookmarkResolutionWithSecurityScope :NSURLBookmarkResolutionOptions = 1.toULong << 10 /* use the secure information included at creation time to provide the ability to access the resource in a sandboxed process */
  }

  type NSKeyValueObservingOptions = NSUInteger
  object NSKeyValueObservingOptions {
    val None    :NSUInteger = 0.toULong
    val New     :NSUInteger = 0x01.toULong
    val Old     :NSUInteger = 0x02.toULong
    val Initial :NSUInteger = 0x04.toULong
    val Prior   :NSUInteger = 0x08.toULong
  }
}
