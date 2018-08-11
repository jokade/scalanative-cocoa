// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.foundation

import scala.language.experimental.macros
import scalanative.native._
import objc._

@ObjC
class NSURLComponents extends NSObject with NSCopying {
  @inline def initWithURL_resolve_(url: NSURL, resolve: BOOL): NSURLComponents = extern
  @inline def initWithString_(URLString: NSString): NSURLComponents = extern
  @inline def URLRelativeToURL_(baseURL: NSURL): NSURL = extern
  @inline def URL(): NSURL = extern
  @inline def string(): NSString = extern
  @inline def scheme(): NSString = extern
  @inline def setScheme_(scheme: NSString): Unit = extern
  @inline def user(): NSString = extern
  @inline def setUser_(user: NSString): Unit = extern
  @inline def password(): NSString = extern
  @inline def setPassword_(password: NSString): Unit = extern
  @inline def host(): NSString = extern
  @inline def setHost_(host: NSString): Unit = extern
  @inline def port(): NSNumber = extern
  @inline def setPort_(port: NSNumber): Unit = extern
  @inline def path(): NSString = extern
  @inline def setPath_(path: NSString): Unit = extern
  @inline def query(): NSString = extern
  @inline def setQuery_(query: NSString): Unit = extern
  @inline def fragment(): NSString = extern
  @inline def setFragment_(fragment: NSString): Unit = extern
  @inline def percentEncodedUser(): NSString = extern
  @inline def setPercentEncodedUser_(percentEncodedUser: NSString): Unit = extern
  @inline def percentEncodedPassword(): NSString = extern
  @inline def setPercentEncodedPassword_(percentEncodedPassword: NSString): Unit = extern
  @inline def percentEncodedHost(): NSString = extern
  @inline def setPercentEncodedHost_(percentEncodedHost: NSString): Unit = extern
  @inline def percentEncodedPath(): NSString = extern
  @inline def setPercentEncodedPath_(percentEncodedPath: NSString): Unit = extern
  @inline def percentEncodedQuery(): NSString = extern
  @inline def setPercentEncodedQuery_(percentEncodedQuery: NSString): Unit = extern
  @inline def percentEncodedFragment(): NSString = extern
  @inline def setPercentEncodedFragment_(percentEncodedFragment: NSString): Unit = extern
  @inline def rangeOfScheme(): NSRange = extern
  @inline def rangeOfUser(): NSRange = extern
  @inline def rangeOfPassword(): NSRange = extern
  @inline def rangeOfHost(): NSRange = extern
  @inline def rangeOfPort(): NSRange = extern
  @inline def rangeOfPath(): NSRange = extern
  @inline def rangeOfQuery(): NSRange = extern
  @inline def rangeOfFragment(): NSRange = extern
  @inline def queryItems(): NSArray[NSURLQueryItem] = extern
  @inline def setQueryItems_(queryItems: NSArray[NSURLQueryItem]): Unit = extern
}

@ObjCClass
abstract class NSURLComponentsClass extends NSObjectClass {
  @inline def componentsWithURL_resolve_(url: NSURL, resolve: BOOL): NSURLComponents = extern
  @inline def componentsWithString_(URLString: NSString): NSURLComponents = extern
}

object NSURLComponents extends NSURLComponentsClass {
  override type InstanceType = NSURLComponents
}