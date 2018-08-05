//     Project: scalanative-cocoa
//      Module: Foundation
// Description: Generated with scala-obj-bindgen (with manual postprocessing) from:
//              Foundation/NSData.h
package cocoa.foundation

import scalanative.native._

import scala.language.experimental.macros


@ObjC
class NSData extends NSObject with NSCopying with NSMutableCopying with NSSecureCoding {
  @inline def length(): NSUInteger = extern
  @inline def bytes(): Ptr[Byte] = extern
  @inline def getBytes(buffer: Ptr[Byte], length: NSUInteger): Unit = extern
  @inline def getBytes(buffer: Ptr[Byte], range: NSRange): Unit = extern
  @inline def isEqualToData(other: NSData): BOOL = extern
  @inline def subdataWithRange(range: NSRange): NSData = extern
  @inline def writeToFile(path: NSString, useAuxiliaryFile: BOOL): BOOL = extern
//  @inline def writeToURL(url: NSURL, atomically: BOOL): BOOL = extern
//  @inline def writeToFile(path: NSString, writeOptionsMask: NSDataWritingOptions, errorPtr: NSError): BOOL = extern
//  @inline def writeToURL(url: NSURL, writeOptionsMask: NSDataWritingOptions, errorPtr: NSError): BOOL = extern
//  @inline def rangeOfData(dataToFind: NSData, mask: NSDataSearchOptions, searchRange: NSRange): NSRange = extern
  @inline def enumerateByteRangesUsingBlock(block: Ptr[Byte]): Unit = extern
  @inline def initWithBytes(bytes: Ptr[Byte], length: NSUInteger): NSData = extern
  @inline def initWithBytesNoCopy(bytes: Ptr[Byte], length: NSUInteger): NSData = extern
  @inline def initWithBytesNoCopy(bytes: Ptr[Byte], length: NSUInteger, b: BOOL): NSData = extern
  @inline def initWithBytesNoCopy(bytes: Ptr[Byte], length: NSUInteger, deallocator: Ptr[Byte]): NSData = extern
//  @inline def initWithContentsOfFile(path: NSString, readOptionsMask: NSDataReadingOptions, errorPtr: NSError): NSData = extern
//  @inline def initWithContentsOfURL(url: NSURL, readOptionsMask: NSDataReadingOptions, errorPtr: NSError): NSData = extern
  @inline def initWithContentsOfFile(path: NSString): NSData = extern
//  @inline def initWithContentsOfURL(url: NSURL): NSData = extern
  @inline def initWithData(data: NSData): NSData = extern
//  @inline def initWithBase64EncodedString(base64String: NSString, options: NSDataBase64DecodingOptions): NSData = extern
//  @inline def base64EncodedStringWithOptions(options: NSDataBase64EncodingOptions): NSString = extern
//  @inline def initWithBase64EncodedData(base64Data: NSData, options: NSDataBase64DecodingOptions): NSData = extern
//  @inline def base64EncodedDataWithOptions(options: NSDataBase64EncodingOptions): NSData = extern
  @inline def getBytes(buffer: Ptr[Byte]): Unit = extern
  @inline def initWithContentsOfMappedFile(path: NSString): id = extern
  @inline def initWithBase64Encoding(base64String: NSString): id = extern
  @inline def base64Encoding(): NSString = extern
}

@ObjCClass
abstract class NSDataClass extends NSObjectClass {
  @inline def data(): NSData = extern
  @inline def dataWithBytes(bytes: Ptr[Byte], length: NSUInteger): NSData = extern
  @inline def dataWithBytesNoCopy(bytes: Ptr[Byte], length: NSUInteger): NSData = extern
  @inline def dataWithBytesNoCopy(bytes: Ptr[Byte], length: NSUInteger, b: BOOL): NSData = extern
//  @inline def dataWithContentsOfFile(path: NSString, readOptionsMask: NSDataReadingOptions, errorPtr: NSError): NSData = extern
//  @inline def dataWithContentsOfURL(url: NSURL, readOptionsMask: NSDataReadingOptions, errorPtr: NSError): NSData = extern
  @inline def dataWithContentsOfFile(path: NSString): NSData = extern
//  @inline def dataWithContentsOfURL(url: NSURL): NSData = extern
  @inline def dataWithData(data: NSData): NSData = extern
  @inline def dataWithContentsOfMappedFile(path: NSString): id = extern
}

object NSData extends NSDataClass {
  override type InstanceType = NSData
}