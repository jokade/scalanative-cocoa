// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.foundation

import scala.language.experimental.macros
import scalanative.native._
import scalanative.unsafe._
import objc._


@ObjC
class NSString extends NSObject with NSCopying with NSMutableCopying with NSSecureCoding {
  @inline def characterAtIndex_(index: NSUInteger): unichar = extern
  @inline def length(): NSUInteger = extern
  @inline def substringFromIndex_(from: NSUInteger): NSString = extern
  @inline def substringToIndex_(to: NSUInteger): NSString = extern
  @inline def substringWithRange_(range: NSRange): NSString = extern
  @inline def getCharacters_range_(buffer: unichar, range: NSRange): Unit = extern
  @inline def compare_(string: NSString): NSComparisonResult = extern
  @inline def compare_mask_(string: NSString, mask: NSStringCompareOptions): NSComparisonResult = extern
  @inline def compare_mask_compareRange_(string: NSString, mask: NSStringCompareOptions, compareRange: NSRange): NSComparisonResult = extern
  @inline def compare_mask_compareRange_locale_(string: NSString, mask: NSStringCompareOptions, compareRange: NSRange, locale: id): NSComparisonResult = extern
  @inline def caseInsensitiveCompare_(string: NSString): NSComparisonResult = extern
  @inline def localizedCompare_(string: NSString): NSComparisonResult = extern
  @inline def localizedCaseInsensitiveCompare_(string: NSString): NSComparisonResult = extern
  @inline def localizedStandardCompare_(string: NSString): NSComparisonResult = extern
  @inline def isEqualToString_(aString: NSString): BOOL = extern
  @inline def hasPrefix_(str: NSString): BOOL = extern
  @inline def hasSuffix_(str: NSString): BOOL = extern
  @inline def commonPrefixWithString_mask_(str: NSString, mask: NSStringCompareOptions): NSString = extern
  @inline def containsString_(str: NSString): BOOL = extern
  @inline def localizedCaseInsensitiveContainsString_(str: NSString): BOOL = extern
  @inline def localizedStandardContainsString_(str: NSString): BOOL = extern
  @inline def localizedStandardRangeOfString_(str: NSString): NSRange = extern
  @inline def rangeOfString_(searchString: NSString): NSRange = extern
  @inline def rangeOfString_mask_(searchString: NSString, mask: NSStringCompareOptions): NSRange = extern
  @inline def rangeOfString_mask_searchRange_(searchString: NSString, mask: NSStringCompareOptions, searchRange: NSRange): NSRange = extern
  @inline def rangeOfString_mask_searchRange_locale_(searchString: NSString, mask: NSStringCompareOptions, searchRange: NSRange, locale: NSLocale): NSRange = extern
  @inline def rangeOfCharacterFromSet_(searchSet: NSCharacterSet): NSRange = extern
  @inline def rangeOfCharacterFromSet_mask_(searchSet: NSCharacterSet, mask: NSStringCompareOptions): NSRange = extern
  @inline def rangeOfCharacterFromSet_mask_searchRange_(searchSet: NSCharacterSet, mask: NSStringCompareOptions, searchRange: NSRange): NSRange = extern
  @inline def rangeOfComposedCharacterSequenceAtIndex_(index: NSUInteger): NSRange = extern
  @inline def rangeOfComposedCharacterSequencesForRange_(range: NSRange): NSRange = extern
  @inline def stringByAppendingString_(aString: NSString): NSString = extern
  @inline def stringByAppendingFormat_(format: NSString): NSString = extern
  @inline def uppercaseStringWithLocale_(locale: NSLocale): NSString = extern
  @inline def lowercaseStringWithLocale_(locale: NSLocale): NSString = extern
  @inline def capitalizedStringWithLocale_(locale: NSLocale): NSString = extern
  @inline def getLineStart_lineEndPtr_contentsEndPtr_range_(startPtr: NSUInteger, lineEndPtr: NSUInteger, contentsEndPtr: NSUInteger, range: NSRange): Unit = extern
  @inline def lineRangeForRange_(range: NSRange): NSRange = extern
  @inline def getParagraphStart_parEndPtr_contentsEndPtr_range_(startPtr: NSUInteger, parEndPtr: NSUInteger, contentsEndPtr: NSUInteger, range: NSRange): Unit = extern
  @inline def paragraphRangeForRange_(range: NSRange): NSRange = extern
  @inline def enumerateSubstringsInRange_opts_block_(range: NSRange, opts: NSStringEnumerationOptions, block: Ptr[Byte]): Unit = extern
  @inline def enumerateLinesUsingBlock_(block: Ptr[Byte]): Unit = extern
  @inline def dataUsingEncoding_lossy_(encoding: NSStringEncoding, lossy: BOOL): NSData = extern
  @inline def dataUsingEncoding_(encoding: NSStringEncoding): NSData = extern
  @inline def canBeConvertedToEncoding_(encoding: NSStringEncoding): BOOL = extern
  @inline def cStringUsingEncoding_(encoding: NSStringEncoding): Ptr[CSignedChar] = extern
  @inline def getCString_maxBufferCount_encoding_(buffer: Ptr[CSignedChar], maxBufferCount: NSUInteger, encoding: NSStringEncoding): BOOL = extern
  @inline def getBytes_maxBufferCount_usedBufferCount_encoding_options_range_leftover_(buffer: Ptr[Byte], maxBufferCount: NSUInteger, usedBufferCount: NSUInteger, encoding: NSStringEncoding, options: NSStringEncodingConversionOptions, range: NSRange, leftover: NSRangePointer): BOOL = extern
  @inline def maximumLengthOfBytesUsingEncoding_(enc: NSStringEncoding): NSUInteger = extern
  @inline def lengthOfBytesUsingEncoding_(enc: NSStringEncoding): NSUInteger = extern
  @inline def componentsSeparatedByString_(separator: NSString): NSArray[NSString] = extern
  @inline def componentsSeparatedByCharactersInSet_(separator: NSCharacterSet): NSArray[NSString] = extern
  @inline def stringByTrimmingCharactersInSet_(set: NSCharacterSet): NSString = extern
  @inline def stringByPaddingToLength_padString_padIndex_(newLength: NSUInteger, padString: NSString, padIndex: NSUInteger): NSString = extern
  @inline def stringByFoldingWithOptions_locale_(options: NSStringCompareOptions, locale: NSLocale): NSString = extern
  @inline def stringByReplacingOccurrencesOfString_replacement_options_searchRange_(target: NSString, replacement: NSString, options: NSStringCompareOptions, searchRange: NSRange): NSString = extern
  @inline def stringByReplacingOccurrencesOfString_replacement_(target: NSString, replacement: NSString): NSString = extern
  @inline def stringByReplacingCharactersInRange_replacement_(range: NSRange, replacement: NSString): NSString = extern
  @inline def stringByApplyingTransform_reverse_(transform: NSString, reverse: BOOL): NSString = extern
  @inline def writeToURL_useAuxiliaryFile_enc_error_(url: NSURL, useAuxiliaryFile: BOOL, enc: NSStringEncoding, error: NSError): BOOL = extern
  @inline def writeToFile_useAuxiliaryFile_enc_error_(path: NSString, useAuxiliaryFile: BOOL, enc: NSStringEncoding, error: NSError): BOOL = extern
  @inline def initWithCharactersNoCopy_length_freeBuffer_(characters: unichar, length: NSUInteger, freeBuffer: BOOL): NSString = extern
  @inline def initWithCharacters_length_(characters: unichar, length: NSUInteger): NSString = extern
  @inline def initWithUTF8String_(nullTerminatedCString: Ptr[CSignedChar]): NSString = extern
  @inline def initWithString_(aString: NSString): NSString = extern
  @inline def initWithFormat_(format: NSString): NSString = extern
//  @inline def initWithFormat_argList_(format: NSString, argList: va_list): NSString = extern
  @inline def initWithFormat_locale_(format: NSString, locale: id): NSString = extern
//  @inline def initWithFormat_locale_argList_(format: NSString, locale: id, argList: va_list): NSString = extern
  @inline def initWithData_encoding_(data: NSData, encoding: NSStringEncoding): NSString = extern
  @inline def initWithBytes_len_encoding_(bytes: Ptr[Byte], len: NSUInteger, encoding: NSStringEncoding): NSString = extern
  @inline def initWithBytesNoCopy_len_encoding_freeBuffer_(bytes: Ptr[Byte], len: NSUInteger, encoding: NSStringEncoding, freeBuffer: BOOL): NSString = extern
  @inline def initWithCString_encoding_(nullTerminatedCString: Ptr[CSignedChar], encoding: NSStringEncoding): NSString = extern
  @inline def initWithContentsOfURL_enc_error_(url: NSURL, enc: NSStringEncoding, error: NSError): NSString = extern
  @inline def initWithContentsOfFile_enc_error_(path: NSString, enc: NSStringEncoding, error: NSError): NSString = extern
  @inline def doubleValue(): Double = extern
  @inline def floatValue(): Float = extern
  @inline def intValue(): CInt = extern
  @inline def integerValue(): NSInteger = extern
  @inline def longLongValue(): CLongLong = extern
  @inline def boolValue(): BOOL = extern
  @inline def uppercaseString(): NSString = extern
  @inline def lowercaseString(): NSString = extern
  @inline def capitalizedString(): NSString = extern
  @inline def localizedUppercaseString(): NSString = extern
  @inline def localizedLowercaseString(): NSString = extern
  @inline def localizedCapitalizedString(): NSString = extern
  @inline def UTF8String(): Ptr[CSignedChar] = extern
  @inline def fastestEncoding(): NSStringEncoding = extern
  @inline def smallestEncoding(): NSStringEncoding = extern
  @inline def decomposedStringWithCanonicalMapping(): NSString = extern
  @inline def precomposedStringWithCanonicalMapping(): NSString = extern
  @inline def decomposedStringWithCompatibilityMapping(): NSString = extern
  @inline def precomposedStringWithCompatibilityMapping(): NSString = extern
  @inline def propertyList(): id = extern
  @inline def propertyListFromStringsFileFormat(): NSDictionary[NSObject,NSObject] = extern
  @inline def cString(): Ptr[CSignedChar] = extern
  @inline def lossyCString(): Ptr[CSignedChar] = extern
  @inline def cStringLength(): NSUInteger = extern
  @inline def getCString_(bytes: Ptr[CSignedChar]): Unit = extern
  @inline def getCString_maxLength_(bytes: Ptr[CSignedChar], maxLength: NSUInteger): Unit = extern
  @inline def getCString_maxLength_aRange_leftoverRange_(bytes: Ptr[CSignedChar], maxLength: NSUInteger, aRange: NSRange, leftoverRange: NSRangePointer): Unit = extern
  @inline def writeToFile_useAuxiliaryFile_(path: NSString, useAuxiliaryFile: BOOL): BOOL = extern
  @inline def writeToURL_atomically_(url: NSURL, atomically: BOOL): BOOL = extern
  @inline def initWithContentsOfFile_(path: NSString): id = extern
  @inline def initWithContentsOfURL_(url: NSURL): id = extern
  @inline def initWithCStringNoCopy_length_freeBuffer_(bytes: Ptr[CSignedChar], length: NSUInteger, freeBuffer: BOOL): NSString = extern
  @inline def initWithCString_length_(bytes: Ptr[CSignedChar], length: NSUInteger): NSString = extern
  @inline def initWithCString_(bytes: Ptr[CSignedChar]): NSString = extern
  @inline def getCharacters_(buffer: unichar): Unit = extern

  // from NSURL.h
  @inline def stringByAddingPercentEncodingWithAllowedCharacters_(allowedCharacters: NSCharacterSet): NSString = extern
  @inline def stringByAddingPercentEscapesUsingEncoding_(enc: NSStringEncoding): NSString = extern
  @inline def stringByReplacingPercentEscapesUsingEncoding_(enc: NSStringEncoding): NSString = extern
  @inline def stringByRemovingPercentEncoding(): NSString = extern
}

@ObjCClass
abstract class NSStringClass extends NSObjectClass {
  @inline def availableStringEncodings(): Ptr[NSStringEncoding] = extern
  @inline def localizedNameOfStringEncoding_(encoding: NSStringEncoding): NSString = extern
  @inline def defaultCStringEncoding(): NSStringEncoding = extern
  @inline def string(): NSString = extern
  @inline def stringWithString_(string: NSString): NSString = extern
  @inline def stringWithCharacters_length_(characters: unichar, length: NSUInteger): NSString = extern
  @inline def stringWithUTF8String_(nullTerminatedCString: Ptr[CSignedChar]): NSString = extern
  @inline def stringWithFormat_(format: NSString): NSString = extern
  @inline def localizedStringWithFormat_(format: NSString): NSString = extern
  @inline def stringWithCString_encoding_(cString: Ptr[CSignedChar], enc: NSStringEncoding): NSString = extern
  @inline def stringWithContentsOfURL_encoding_error_(url: NSURL, enc: NSStringEncoding, error: NSError): NSString = extern
  @inline def stringWithContentsOfFile_encoding_error_(path: NSString, enc: NSStringEncoding, error: NSError): NSString = extern
  @inline def stringEncodingForData_opts_string_usedLossyConversion_(data: NSData, opts: id, string: NSString, usedLossyConversion: BOOL): NSStringEncoding = extern
  @inline def stringWithContentsOfFile_(path: NSString): id = extern
  @inline def stringWithContentsOfURL_(url: NSURL): id = extern
  @inline def stringWithCString_length_(bytes: Ptr[CSignedChar], length: NSUInteger): id = extern
  @inline def stringWithCString_(bytes: Ptr[CSignedChar]): id = extern
}

object NSString extends NSStringClass {
  override type InstanceType = NSString

  /**
   * Convenience Method for creating UTF8 encoded NSStrings from scala-native CStrings.
   * @param cstring
   * @return
   */
  def apply(cstring: CString): NSString = stringWithCString_encoding_(cstring,NSStringEncoding.NSUTF8StringEncoding)

  def apply(string: String): NSString = Zone{ implicit z =>
    stringWithCString_encoding_(toCString(string),NSStringEncoding.NSUTF8StringEncoding)
  }

  implicit final class RichNSString(val ns: NSString) extends AnyVal {
    /**
     * Returns the CString representation of this NSString.
     */
    @inline def cstring: CString = ns.UTF8String()

    /**
     * Returns the Scala String representation of this NSString
     */
    @inline def string: String = fromCString(ns.UTF8String())
  }
}
