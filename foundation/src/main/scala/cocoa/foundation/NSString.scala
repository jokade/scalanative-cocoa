//     Project: scalanative-cocoa
//      Module:
// Description:
package cocoa.foundation

import de.surfice.smacrotools.debug

import scala.scalanative.native._
import objc.{ObjC, selector}
import objc.runtime._

@ObjC
class NSString extends NSObject with NSCopying with NSMutableCopying with NSSecureCoding {
  @inline def characterAtIndex(index: NSUInteger): unichar = extern
  @inline override def init(): NSString = extern
//  @inline def initWithCoder(aDecoder: NSCoder): NSString = extern
  @inline def length(): NSUInteger = extern
  @inline def substringFromIndex(from: NSUInteger): NSString = extern
  @inline def substringToIndex(to: NSUInteger): NSString = extern
  @inline def substringWithRange(range: NSRange): NSString = extern
  @inline def getCharacters(buffer: unichar, range: NSRange): Unit = extern
  @inline def compare(string: NSString): NSComparisonResult = extern
  @inline def compare(string: NSString, mask: NSStringCompareOptions): NSComparisonResult = extern
  @inline def compare(string: NSString, mask: NSStringCompareOptions, compareRange: NSRange): NSComparisonResult = extern
  @inline def compare(string: NSString, mask: NSStringCompareOptions, compareRange: NSRange, locale: id): NSComparisonResult = extern
  @inline def caseInsensitiveCompare(string: NSString): NSComparisonResult = extern
  @inline def localizedCompare(string: NSString): NSComparisonResult = extern
  @inline def localizedCaseInsensitiveCompare(string: NSString): NSComparisonResult = extern
  @inline def localizedStandardCompare(string: NSString): NSComparisonResult = extern
  @inline def isEqualToString(aString: NSString): BOOL = extern
  @inline def hasPrefix(str: NSString): BOOL = extern
  @inline def hasSuffix(str: NSString): BOOL = extern
  @inline def commonPrefixWithString(str: NSString, mask: NSStringCompareOptions): NSString = extern
  @inline def containsString(str: NSString): BOOL = extern
  @inline def localizedCaseInsensitiveContainsString(str: NSString): BOOL = extern
  @inline def localizedStandardContainsString(str: NSString): BOOL = extern
  @inline def localizedStandardRangeOfString(str: NSString): NSRange = extern
  @inline def rangeOfString(searchString: NSString): NSRange = extern
  @inline def rangeOfString(searchString: NSString, mask: NSStringCompareOptions): NSRange = extern
  @inline def rangeOfString(searchString: NSString, mask: NSStringCompareOptions, searchRange: NSRange): NSRange = extern
//  @inline def rangeOfString(searchString: NSString, mask: NSStringCompareOptions, searchRange: NSRange, locale: NSLocale): NSRange = extern
//  @inline def rangeOfCharacterFromSet(searchSet: NSCharacterSet): NSRange = extern
//  @inline def rangeOfCharacterFromSet(searchSet: NSCharacterSet, mask: NSStringCompareOptions): NSRange = extern
//  @inline def rangeOfCharacterFromSet(searchSet: NSCharacterSet, mask: NSStringCompareOptions, searchRange: NSRange): NSRange = extern
  @inline def rangeOfComposedCharacterSequenceAtIndex(index: NSUInteger): NSRange = extern
  @inline def rangeOfComposedCharacterSequencesForRange(range: NSRange): NSRange = extern
  @inline def stringByAppendingString(aString: NSString): NSString = extern
  @inline def stringByAppendingFormat(format: NSString): NSString = extern
//  @inline def uppercaseStringWithLocale(locale: NSLocale): NSString = extern
//  @inline def lowercaseStringWithLocale(locale: NSLocale): NSString = extern
//  @inline def capitalizedStringWithLocale(locale: NSLocale): NSString = extern
  @inline def getLineStart(startPtr: NSUInteger, lineEndPtr: NSUInteger, contentsEndPtr: NSUInteger, range: NSRange): Unit = extern
  @inline def lineRangeForRange(range: NSRange): NSRange = extern
  @inline def getParagraphStart(startPtr: NSUInteger, parEndPtr: NSUInteger, contentsEndPtr: NSUInteger, range: NSRange): Unit = extern
  @inline def paragraphRangeForRange(range: NSRange): NSRange = extern
  @inline def enumerateSubstringsInRange(range: NSRange, opts: NSStringEnumerationOptions, block: Ptr[Byte]): Unit = extern
  @inline def enumerateLinesUsingBlock(block: Ptr[Byte]): Unit = extern
//  @inline def dataUsingEncoding(encoding: NSStringEncoding, lossy: BOOL): NSData = extern
//  @inline def dataUsingEncoding(encoding: NSStringEncoding): NSData = extern
  @inline def canBeConvertedToEncoding(encoding: NSStringEncoding): BOOL = extern
  @inline def cStringUsingEncoding(encoding: NSStringEncoding): Ptr[CSignedChar] = extern
  @inline def getCString(buffer: Ptr[CSignedChar], maxBufferCount: NSUInteger, encoding: NSStringEncoding): BOOL = extern
//  @inline def getBytes(buffer: Ptr[Unit], maxBufferCount: NSUInteger, usedBufferCount: NSUInteger, encoding: NSStringEncoding, options: NSStringEncodingConversionOptions, range: NSRange, leftover: NSRangePointer): BOOL = extern
  @inline def maximumLengthOfBytesUsingEncoding(enc: NSStringEncoding): NSUInteger = extern
  @inline def lengthOfBytesUsingEncoding(enc: NSStringEncoding): NSUInteger = extern
//  @inline def componentsSeparatedByString(separator: NSString): NSArray[NSString] = extern
//  @inline def componentsSeparatedByCharactersInSet(separator: NSCharacterSet): NSArray[NSString] = extern
//  @inline def stringByTrimmingCharactersInSet(set: NSCharacterSet): NSString = extern
  @inline def stringByPaddingToLength(newLength: NSUInteger, padString: NSString, padIndex: NSUInteger): NSString = extern
//  @inline def stringByFoldingWithOptions(options: NSStringCompareOptions, locale: NSLocale): NSString = extern
  @inline def stringByReplacingOccurrencesOfString(target: NSString, replacement: NSString, options: NSStringCompareOptions, searchRange: NSRange): NSString = extern
  @inline def stringByReplacingOccurrencesOfString(target: NSString, replacement: NSString): NSString = extern
  @inline def stringByReplacingCharactersInRange(range: NSRange, replacement: NSString): NSString = extern
  @inline def stringByApplyingTransform(transform: NSString, reverse: BOOL): NSString = extern
//  @inline def writeToURL(url: NSURL, useAuxiliaryFile: BOOL, enc: NSStringEncoding, error: NSError): BOOL = extern
//  @inline def writeToFile(path: NSString, useAuxiliaryFile: BOOL, enc: NSStringEncoding, error: NSError): BOOL = extern
  @inline def initWithCharactersNoCopy(characters: unichar, length: NSUInteger, freeBuffer: BOOL): NSString = extern
  @inline def initWithCharacters(characters: unichar, length: NSUInteger): NSString = extern
  @inline def initWithUTF8String(nullTerminatedCString: Ptr[CSignedChar]): NSString = extern
  @inline def initWithString(aString: NSString): NSString = extern
  @inline def initWithFormat(format: NSString): NSString = extern
//  @inline def initWithFormat(format: NSString, argList: va_list): NSString = extern
  @inline def initWithFormat(format: NSString, locale: id): NSString = extern
//  @inline def initWithFormat(format: NSString, locale: id, argList: va_list): NSString = extern
//  @inline def initWithData(data: NSData, encoding: NSStringEncoding): NSString = extern
  @inline def initWithBytes(bytes: Ptr[Unit], len: NSUInteger, encoding: NSStringEncoding): NSString = extern
  @inline def initWithBytesNoCopy(bytes: Ptr[Unit], len: NSUInteger, encoding: NSStringEncoding, freeBuffer: BOOL): NSString = extern
  @selector("initWithCString:nullTerminatedCString:encoding:")
  @inline def initWithCString(nullTerminatedCString: Ptr[CSignedChar], encoding: NSStringEncoding): NSString = extern
//  @inline def initWithContentsOfURL(url: NSURL, enc: NSStringEncoding, error: NSError): NSString = extern
//  @inline def initWithContentsOfFile(path: NSString, enc: NSStringEncoding, error: NSError): NSString = extern
//  @inline def initWithContentsOfURL(url: NSURL, enc: NSStringEncoding, error: NSError): NSString = extern
//  @inline def initWithContentsOfFile(path: NSString, enc: NSStringEncoding, error: NSError): NSString = extern
  @inline def doubleValue(): CDouble = extern
  @inline def floatValue(): CFloat = extern
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
  @inline def description(): NSString = extern
//  @inline def hash(): NSUInteger = extern
  @inline def propertyList(): id = extern
//  @inline def propertyListFromStringsFileFormat(): NSDictionary = extern
//  @deprecated
//  @inline def cString(): Ptr[CSignedChar] = extern
//  @deprecated
//  @inline def lossyCString(): Ptr[CSignedChar] = extern
//  @deprecated
//  @inline def cStringLength(): NSUInteger = extern
//  @deprecated
//  @inline def getCString(bytes: Ptr[CSignedChar]): Unit = extern
//  @deprecated
//  @inline def getCString(bytes: Ptr[CSignedChar], maxLength: NSUInteger): Unit = extern
//  @inline def getCString(bytes: Ptr[CSignedChar], maxLength: NSUInteger, aRange: NSRange, leftoverRange: NSRangePointer): Unit = extern
  @inline def writeToFile(path: NSString, useAuxiliaryFile: BOOL): BOOL = extern
//  @inline def writeToURL(url: NSURL, atomically: BOOL): BOOL = extern
  @inline def initWithContentsOfFile(path: NSString): id = extern
//  @deprecated
//  @inline def initWithContentsOfURL(url: NSURL): id = extern
//  @deprecated
//  @inline def initWithCStringNoCopy(bytes: Ptr[CSignedChar], length: NSUInteger, freeBuffer: BOOL): id = extern
//  @deprecated
//  @inline def initWithCString(bytes: Ptr[CSignedChar], length: NSUInteger): id = extern
//  @deprecated
//  @inline def initWithCString(bytes: Ptr[CSignedChar]): id = extern
//  @deprecated
//  @inline def getCharacters(buffer: unichar): Unit = extern
}

object NSString {
  /**
   * Convenience Method for creating UTF8 encoded NSStrings from scala-native CStrings.
   * @param cstring
   * @return
   */
  def apply(cstring: CString): NSString = stringWithCString(cstring,NSStringEncoding.NSUTF8StringEncoding)

  @inline def availableStringEncodings(): Ptr[NSStringEncoding] = extern
  @inline def localizedNameOfStringEncoding(encoding: NSStringEncoding): NSString = extern
  @inline def defaultCStringEncoding(): NSStringEncoding = extern
  @inline def string(): NSString = extern
  @inline def stringWithString(string: NSString): NSString = extern
  @inline def stringWithCharacters(characters: unichar, length: NSUInteger): NSString = extern
  @inline def stringWithUTF8String(nullTerminatedCString: Ptr[CSignedChar]): NSString = extern
  @inline def stringWithFormat(format: NSString): NSString = extern
  @inline def localizedStringWithFormat(format: NSString): NSString = extern
  @inline def stringWithCString(cString: Ptr[CSignedChar], encoding: NSStringEncoding): NSString = extern
//  @inline def stringWithContentsOfURL(url: NSURL, enc: NSStringEncoding, error: NSError): NSString = extern
//  @inline def stringWithContentsOfFile(path: NSString, enc: NSStringEncoding, error: NSError): NSString = extern
//  @inline def stringWithContentsOfURL(url: NSURL, enc: NSStringEncoding, error: NSError): NSString = extern
//  @inline def stringWithContentsOfFile(path: NSString, enc: NSStringEncoding, error: NSError): NSString = extern
//  @inline def stringEncodingForData(data: NSData, opts: id, string: NSString, usedLossyConversion: BOOL): NSStringEncoding = extern
  @inline def stringWithContentsOfFile(path: NSString): id = extern
//  @deprecated
//  @inline def stringWithContentsOfURL(url: NSURL): id = extern
//  @deprecated
//  @inline def stringWithCString(bytes: Ptr[CSignedChar], length: NSUInteger): id = extern
//  @deprecated
//  @inline def stringWithCString(bytes: Ptr[CSignedChar]): id = extern
}
