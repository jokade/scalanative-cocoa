package cocoa.foundation

import scala.language.experimental.macros
import scala.scalanative.native._
import scala.scalanative.native.objc._

@ObjC
class NSData extends NSObject with NSCopying with NSMutableCopying with NSSecureCoding {
  @inline def length(): NSUInteger = extern
  @inline def bytes(): Ptr[Byte] = extern
  @inline def getBytes_length_(buffer: Ptr[Byte], length: NSUInteger): Unit = extern
  @inline def getBytes_range_(buffer: Ptr[Byte], range: NSRange): Unit = extern
  @inline def isEqualToData_(other: NSData): BOOL = extern
  @inline def subdataWithRange_(range: NSRange): NSData = extern
  @inline def writeToFile_useAuxiliaryFile_(path: NSString, useAuxiliaryFile: BOOL): BOOL = extern
  @inline def writeToURL_atomically_(url: NSURL, atomically: BOOL): BOOL = extern
  @inline def writeToFile_writeOptionsMask_errorPtr_(path: NSString, writeOptionsMask: NSDataWritingOptions, errorPtr: NSError): BOOL = extern
  @inline def writeToURL_writeOptionsMask_errorPtr_(url: NSURL, writeOptionsMask: NSDataWritingOptions, errorPtr: NSError): BOOL = extern
  @inline def rangeOfData_mask_searchRange_(dataToFind: NSData, mask: NSDataSearchOptions, searchRange: NSRange): NSRange = extern
  @inline def enumerateByteRangesUsingBlock_(block: Ptr[Byte]): Unit = extern
  @inline def initWithBytes_length_(bytes: Ptr[Byte], length: NSUInteger): NSData = extern
  @inline def initWithBytesNoCopy_length_(bytes: Ptr[Byte], length: NSUInteger): NSData = extern
  @inline def initWithBytesNoCopy_length_b_(bytes: Ptr[Byte], length: NSUInteger, b: BOOL): NSData = extern
  @inline def initWithBytesNoCopy_length_deallocator_(bytes: Ptr[Byte], length: NSUInteger, deallocator: Ptr[Byte]): NSData = extern
  @inline def initWithContentsOfFile_readOptionsMask_errorPtr_(path: NSString, readOptionsMask: NSDataReadingOptions, errorPtr: NSError): NSData = extern
  @inline def initWithContentsOfURL_readOptionsMask_errorPtr_(url: NSURL, readOptionsMask: NSDataReadingOptions, errorPtr: NSError): NSData = extern
  @inline def initWithContentsOfFile_(path: NSString): NSData = extern
  @inline def initWithContentsOfURL_(url: NSURL): NSData = extern
  @inline def initWithData_(data: NSData): NSData = extern
  @inline def initWithBase64EncodedString_options_(base64String: NSString, options: NSDataBase64DecodingOptions): NSData = extern
  @inline def base64EncodedStringWithOptions_(options: NSDataBase64EncodingOptions): NSString = extern
  @inline def initWithBase64EncodedData_options_(base64Data: NSData, options: NSDataBase64DecodingOptions): NSData = extern
  @inline def base64EncodedDataWithOptions_(options: NSDataBase64EncodingOptions): NSData = extern
  @inline def getBytes_(buffer: Ptr[Byte]): Unit = extern
  @inline def initWithContentsOfMappedFile_(path: NSString): id = extern
  @inline def initWithBase64Encoding_(base64String: NSString): id = extern
  @inline def base64Encoding(): NSString = extern
}

@ObjCClass
abstract class NSDataClass extends NSObjectClass {
  @inline def data(): NSData = extern
  @inline def dataWithBytes_length_(bytes: Ptr[Byte], length: NSUInteger): NSData = extern
  @inline def dataWithBytesNoCopy_length_(bytes: Ptr[Byte], length: NSUInteger): NSData = extern
  @inline def dataWithBytesNoCopy_length_b_(bytes: Ptr[Byte], length: NSUInteger, b: BOOL): NSData = extern
  @inline def dataWithContentsOfFile_readOptionsMask_errorPtr_(path: NSString, readOptionsMask: NSDataReadingOptions, errorPtr: NSError): NSData = extern
  @inline def dataWithContentsOfURL_readOptionsMask_errorPtr_(url: NSURL, readOptionsMask: NSDataReadingOptions, errorPtr: NSError): NSData = extern
  @inline def dataWithContentsOfFile_(path: NSString): NSData = extern
  @inline def dataWithContentsOfURL_(url: NSURL): NSData = extern
  @inline def dataWithData_(data: NSData): NSData = extern
  @inline def dataWithContentsOfMappedFile_(path: NSString): id = extern
}

object NSData extends NSDataClass {
  override type InstanceType = NSData
}