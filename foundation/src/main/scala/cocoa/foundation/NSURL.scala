// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.foundation

import scala.language.experimental.macros
import scalanative.native._
import objc._

@ObjC
class NSURL extends NSObject with NSSecureCoding with NSCopying { //with NSURLHandleClient {
  @inline def initWithScheme_host_path_(scheme: NSString, host: NSString, path: NSString): NSURL = extern
  @inline def initFileURLWithPath_isDir_baseURL_(path: NSString, isDir: BOOL, baseURL: NSURL): NSURL = extern
  @inline def initFileURLWithPath_baseURL_(path: NSString, baseURL: NSURL): NSURL = extern
  @inline def initFileURLWithPath_isDir_(path: NSString, isDir: BOOL): NSURL = extern
  @inline def initFileURLWithPath_(path: NSString): NSURL = extern
  @inline def initFileURLWithFileSystemRepresentation_isDir_baseURL_(path: Ptr[CSignedChar], isDir: BOOL, baseURL: NSURL): NSURL = extern
  @inline def initWithString_(URLString: NSString): NSURL = extern
  @inline def initWithString_baseURL_(URLString: NSString, baseURL: NSURL): NSURL = extern
  @inline def initWithDataRepresentation_baseURL_(data: NSData, baseURL: NSURL): NSURL = extern
  @inline def initAbsoluteURLWithDataRepresentation_baseURL_(data: NSData, baseURL: NSURL): NSURL = extern
  @inline def getFileSystemRepresentation_maxBufferLength_(buffer: Ptr[CSignedChar], maxBufferLength: NSUInteger): BOOL = extern
  @inline def checkResourceIsReachableAndReturnError_(error: NSError): BOOL = extern
  @inline def isFileReferenceURL(): BOOL = extern
  @inline def fileReferenceURL(): NSURL = extern
  @inline def getResourceValue_key_error_(value: id, key: NSString, error: NSError): BOOL = extern
  @inline def resourceValuesForKeys_error_(keys: NSString, error: NSError): NSDictionary[NSString, NSObject] = extern
  @inline def setResourceValue_key_error_(value: id, key: NSString, error: NSError): BOOL = extern
  @inline def setResourceValues_error_(keyedValues: id, error: NSError): BOOL = extern
  @inline def removeCachedResourceValueForKey_(key: NSString): Unit = extern
  @inline def removeAllCachedResourceValues(): Unit = extern
  @inline def setTemporaryResourceValue_key_(value: id, key: NSString): Unit = extern
  @inline def bookmarkDataWithOptions_keys_relativeURL_error_(options: NSURLBookmarkCreationOptions, keys: NSString, relativeURL: NSURL, error: NSError): NSData = extern
  @inline def initByResolvingBookmarkData_options_relativeURL_isStale_error_(bookmarkData: NSData, options: NSURLBookmarkResolutionOptions, relativeURL: NSURL, isStale: BOOL, error: NSError): NSURL = extern
  @inline def startAccessingSecurityScopedResource(): BOOL = extern
  @inline def stopAccessingSecurityScopedResource(): Unit = extern
  @inline def dataRepresentation(): NSData = extern
  @inline def absoluteString(): NSString = extern
  @inline def relativeString(): NSString = extern
  @inline def baseURL(): NSURL = extern
  @inline def absoluteURL(): NSURL = extern
  @inline def scheme(): NSString = extern
  @inline def resourceSpecifier(): NSString = extern
  @inline def host(): NSString = extern
  @inline def port(): NSNumber = extern
  @inline def user(): NSString = extern
  @inline def password(): NSString = extern
  @inline def path(): NSString = extern
  @inline def fragment(): NSString = extern
  @inline def parameterString(): NSString = extern
  @inline def query(): NSString = extern
  @inline def relativePath(): NSString = extern
  @inline def hasDirectoryPath(): BOOL = extern
  @inline def fileSystemRepresentation(): Ptr[CSignedChar] = extern
  @inline def isFileURL(): BOOL = extern
  @inline def standardizedURL(): NSURL = extern
  @inline def filePathURL(): NSURL = extern
  @inline def getPromisedItemResourceValue_key_error_(value: id, key: NSString, error: NSError): BOOL = extern
  @inline def promisedItemResourceValuesForKeys_error_(keys: NSString, error: NSError): NSDictionary[NSString, NSObject] = extern
  @inline def checkPromisedItemIsReachableAndReturnError_(error: NSError): BOOL = extern
  @inline def URLByAppendingPathComponent_(pathComponent: NSString): NSURL = extern
  @inline def URLByAppendingPathComponent_isDirectory_(pathComponent: NSString, isDirectory: BOOL): NSURL = extern
  @inline def URLByAppendingPathExtension_(pathExtension: NSString): NSURL = extern
  @inline def pathComponents(): NSArray[NSString] = extern
  @inline def lastPathComponent(): NSString = extern
  @inline def pathExtension(): NSString = extern
  @inline def URLByDeletingLastPathComponent(): NSURL = extern
  @inline def URLByDeletingPathExtension(): NSURL = extern
  @inline def URLByStandardizingPath(): NSURL = extern
  @inline def URLByResolvingSymlinksInPath(): NSURL = extern
  @inline def resourceDataUsingCache_(shouldUseCache: BOOL): NSData = extern
  @inline def loadResourceDataNotifyingClient_shouldUseCache_(client: id, shouldUseCache: BOOL): Unit = extern
  @inline def propertyForKey_(propertyKey: NSString): id = extern
  @inline def setResourceData_(data: NSData): BOOL = extern
  @inline def setProperty_propertyKey_(property: id, propertyKey: NSString): BOOL = extern
//  @inline def URLHandleUsingCache_(shouldUseCache: BOOL): NSURLHandle = extern
}


@ObjCClass
abstract class NSURLClass extends NSObjectClass {
  @inline def fileURLWithPath_isDir_baseURL_(path: NSString, isDir: BOOL, baseURL: NSURL): NSURL = extern
  @inline def fileURLWithPath_baseURL_(path: NSString, baseURL: NSURL): NSURL = extern
  @inline def fileURLWithPath_isDir_(path: NSString, isDir: BOOL): NSURL = extern
  @inline def fileURLWithPath_(path: NSString): NSURL = extern
  @inline def fileURLWithFileSystemRepresentation_isDir_baseURL_(path: Ptr[CSignedChar], isDir: BOOL, baseURL: NSURL): NSURL = extern
  @inline def URLWithString_(URLString: NSString): NSURL = extern
  @inline def URLWithString_baseURL_(URLString: NSString, baseURL: NSURL): NSURL = extern
  @inline def URLWithDataRepresentation_baseURL_(data: NSData, baseURL: NSURL): NSURL = extern
  @inline def absoluteURLWithDataRepresentation_baseURL_(data: NSData, baseURL: NSURL): NSURL = extern
  @inline def URLByResolvingBookmarkData_options_relativeURL_isStale_error_(bookmarkData: NSData, options: NSURLBookmarkResolutionOptions, relativeURL: NSURL, isStale: BOOL, error: NSError): NSURL = extern
  @inline def resourceValuesForKeys_bookmarkData_(keys: NSString, bookmarkData: NSData): NSDictionary[NSString, NSObject] = extern
//  @inline def writeBookmarkData_bookmarkFileURL_options_error_(bookmarkData: NSData, bookmarkFileURL: NSURL, options: NSURLBookmarkFileCreationOptions, error: NSError): BOOL = extern
  @inline def bookmarkDataWithContentsOfURL_error_(bookmarkFileURL: NSURL, error: NSError): NSData = extern
  @inline def URLByResolvingAliasFileAtURL_options_error_(url: NSURL, options: NSURLBookmarkResolutionOptions, error: NSError): NSURL = extern
  @inline def fileURLWithPathComponents_(components: NSString): NSURL = extern
}

object NSURL extends NSURLClass {
  override type InstanceType = NSURL
}