//     Project: scalanative-cocoa
//      Module: Foundation
// Description: Generated with scala-obj-bindgen (with manual postprocessing) from:
//              Foundation/NSURL.h
package cocoa.foundation

import scalanative.native._

import scala.language.experimental.macros


@ObjC
class NSURL extends NSObject with NSSecureCoding with NSCopying {//with NSURLHandleClient {
  @inline def initWithScheme(scheme: NSString, host: NSString, path: NSString): NSURL = extern
  @inline def initFileURLWithPath(path: NSString, isDir: BOOL, baseURL: NSURL): NSURL = extern
  @inline def initFileURLWithPath(path: NSString, baseURL: NSURL): NSURL = extern
  @inline def initFileURLWithPath(path: NSString, isDir: BOOL): NSURL = extern
  @inline def initFileURLWithPath(path: NSString): NSURL = extern
  @inline def initFileURLWithFileSystemRepresentation(path: Ptr[CSignedChar], isDir: BOOL, baseURL: NSURL): NSURL = extern
  @inline def initWithString(URLString: NSString): NSURL = extern
  @inline def initWithString(URLString: NSString, baseURL: NSURL): NSURL = extern
  @inline def initWithDataRepresentation(data: NSData, baseURL: NSURL): NSURL = extern
  @inline def initAbsoluteURLWithDataRepresentation(data: NSData, baseURL: NSURL): NSURL = extern
  @inline def getFileSystemRepresentation(buffer: Ptr[CSignedChar], maxBufferLength: NSUInteger): BOOL = extern
  @inline def checkResourceIsReachableAndReturnError(error: NSError): BOOL = extern
  @inline def isFileReferenceURL(): BOOL = extern
  @inline def fileReferenceURL(): NSURL = extern
  @inline def getResourceValue(value: id, key: NSString, error: NSError): BOOL = extern
//  @inline def resourceValuesForKeys(keys: NSString, error: NSError): NSDictionary[NSString, id] = extern
  @inline def setResourceValue(value: id, key: NSString, error: NSError): BOOL = extern
  @inline def setResourceValues(keyedValues: id, error: NSError): BOOL = extern
  @inline def removeCachedResourceValueForKey(key: NSString): Unit = extern
  @inline def removeAllCachedResourceValues(): Unit = extern
  @inline def setTemporaryResourceValue(value: id, key: NSString): Unit = extern
//  @inline def bookmarkDataWithOptions(options: NSURLBookmarkCreationOptions, keys: NSString, relativeURL: NSURL, error: NSError): NSData = extern
//  @inline def initByResolvingBookmarkData(bookmarkData: NSData, options: NSURLBookmarkResolutionOptions, relativeURL: NSURL, isStale: BOOL, error: NSError): NSURL = extern
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
  @inline def getPromisedItemResourceValue(value: id, key: NSString, error: NSError): BOOL = extern
//  @inline def promisedItemResourceValuesForKeys(keys: NSString, error: NSError): NSDictionary[NSString, id] = extern
  @inline def checkPromisedItemIsReachableAndReturnError(error: NSError): BOOL = extern
  @inline def URLByAppendingPathComponent(pathComponent: NSString): NSURL = extern
  @inline def URLByAppendingPathComponent(pathComponent: NSString, isDirectory: BOOL): NSURL = extern
  @inline def URLByAppendingPathExtension(pathExtension: NSString): NSURL = extern
//  @inline def pathComponents(): NSArray[NSString] = extern
  @inline def lastPathComponent(): NSString = extern
  @inline def pathExtension(): NSString = extern
  @inline def URLByDeletingLastPathComponent(): NSURL = extern
  @inline def URLByDeletingPathExtension(): NSURL = extern
  @inline def URLByStandardizingPath(): NSURL = extern
  @inline def URLByResolvingSymlinksInPath(): NSURL = extern
  @inline def resourceDataUsingCache(shouldUseCache: BOOL): NSData = extern
  @inline def loadResourceDataNotifyingClient(client: id, shouldUseCache: BOOL): Unit = extern
  @inline def propertyForKey(propertyKey: NSString): id = extern
  @inline def setResourceData(data: NSData): BOOL = extern
  @inline def setProperty(property: id, propertyKey: NSString): BOOL = extern
//  @inline def URLHandleUsingCache(shouldUseCache: BOOL): NSURLHandle = extern
}

@ObjCClass
abstract class NSURLClass extends NSObjectClass {
  @inline def fileURLWithPath(path: NSString, isDir: BOOL, baseURL: NSURL): NSURL = extern
  @inline def fileURLWithPath(path: NSString, baseURL: NSURL): NSURL = extern
  @inline def fileURLWithPath(path: NSString, isDir: BOOL): NSURL = extern
  @inline def fileURLWithPath(path: NSString): NSURL = extern
  @inline def fileURLWithFileSystemRepresentation(path: Ptr[CSignedChar], isDir: BOOL, baseURL: NSURL): NSURL = extern
  @inline def URLWithString(URLString: NSString): NSURL = extern
  @inline def URLWithString(URLString: NSString, baseURL: NSURL): NSURL = extern
  @inline def URLWithDataRepresentation(data: NSData, baseURL: NSURL): NSURL = extern
  @inline def absoluteURLWithDataRepresentation(data: NSData, baseURL: NSURL): NSURL = extern
//  @inline def URLByResolvingBookmarkData(bookmarkData: NSData, options: NSURLBookmarkResolutionOptions, relativeURL: NSURL, isStale: BOOL, error: NSError): NSURL = extern
//  @inline def resourceValuesForKeys(keys: NSString, bookmarkData: NSData): NSDictionary[NSString, id] = extern
//  @inline def writeBookmarkData(bookmarkData: NSData, bookmarkFileURL: NSURL, options: NSURLBookmarkFileCreationOptions, error: NSError): BOOL = extern
  @inline def bookmarkDataWithContentsOfURL(bookmarkFileURL: NSURL, error: NSError): NSData = extern
//  @inline def URLByResolvingAliasFileAtURL(url: NSURL, options: NSURLBookmarkResolutionOptions, error: NSError): NSURL = extern
  @inline def fileURLWithPathComponents(components: NSString): NSURL = extern
}

object NSURL extends NSURLClass {
  override type InstanceType = NSURL
}