//     Project: scalanative-cocoa
//      Module: Foundation
// Description: Generated with scala-obj-bindgen (with manual postprocessing) from:
//              Foundation/NSURL.h
package cocoa.foundation

import scala.language.experimental.macros
import scalanative.native._

@ObjC
class NSURLComponents extends NSObject with NSCopying {
  @inline def initWithURL(url: NSURL, resolve: BOOL): NSURLComponents = extern
  @inline def initWithString(URLString: NSString): NSURLComponents = extern
  @inline def URLRelativeToURL(baseURL: NSURL): NSURL = extern
  @inline def URL(): NSURL = extern
  @inline def string(): NSString = extern
  @inline def scheme(): NSString = extern
  @inline def setScheme(scheme: NSString): Unit = extern
  @inline def user(): NSString = extern
  @inline def setUser(user: NSString): Unit = extern
  @inline def password(): NSString = extern
  @inline def setPassword(password: NSString): Unit = extern
  @inline def host(): NSString = extern
  @inline def setHost(host: NSString): Unit = extern
  @inline def port(): NSNumber = extern
  @inline def setPort(port: NSNumber): Unit = extern
  @inline def path(): NSString = extern
  @inline def setPath(path: NSString): Unit = extern
  @inline def query(): NSString = extern
  @inline def setQuery(query: NSString): Unit = extern
  @inline def fragment(): NSString = extern
  @inline def setFragment(fragment: NSString): Unit = extern
  @inline def percentEncodedUser(): NSString = extern
  @inline def setPercentEncodedUser(percentEncodedUser: NSString): Unit = extern
  @inline def percentEncodedPassword(): NSString = extern
  @inline def setPercentEncodedPassword(percentEncodedPassword: NSString): Unit = extern
  @inline def percentEncodedHost(): NSString = extern
  @inline def setPercentEncodedHost(percentEncodedHost: NSString): Unit = extern
  @inline def percentEncodedPath(): NSString = extern
  @inline def setPercentEncodedPath(percentEncodedPath: NSString): Unit = extern
  @inline def percentEncodedQuery(): NSString = extern
  @inline def setPercentEncodedQuery(percentEncodedQuery: NSString): Unit = extern
  @inline def percentEncodedFragment(): NSString = extern
  @inline def setPercentEncodedFragment(percentEncodedFragment: NSString): Unit = extern
  @inline def rangeOfScheme(): NSRange = extern
  @inline def rangeOfUser(): NSRange = extern
  @inline def rangeOfPassword(): NSRange = extern
  @inline def rangeOfHost(): NSRange = extern
  @inline def rangeOfPort(): NSRange = extern
  @inline def rangeOfPath(): NSRange = extern
  @inline def rangeOfQuery(): NSRange = extern
  @inline def rangeOfFragment(): NSRange = extern
//  @inline def queryItems(): NSArray[NSURLQueryItem] = extern
//  @inline def setQueryItems(queryItems: NSArray[NSURLQueryItem]): Unit = extern
}

@ObjCClass
abstract class NSURLComponentsClass extends NSObjectClass {
  @inline def componentsWithURL(url: NSURL, resolve: BOOL): NSURLComponents = extern
  @inline def componentsWithString(URLString: NSString): NSURLComponents = extern
}

object NSURLComponents extends NSURLComponentsClass {
  override type InstanceType = NSURLComponents
}