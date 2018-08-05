//     Project: scalanative-cocoa
//      Module: Foundation
// Description: Generated with scala-obj-bindgen (with manual postprocessing) from:
//              Foundation/NSError.h
package cocoa.foundation

import scalanative.native._


@ObjC
class NSError extends NSObject with NSCopying with NSSecureCoding {
//  @inline def initWithDomain(domain: NSString, code: NSInteger, dict: NSDictionary): NSError = extern
  @inline def domain(): NSString = extern
  @inline def code(): NSInteger = extern
//  @inline def userInfo(): NSDictionary = extern
  @inline def localizedDescription(): NSString = extern
  @inline def localizedFailureReason(): NSString = extern
  @inline def localizedRecoverySuggestion(): NSString = extern
//  @inline def localizedRecoveryOptions(): NSArray[NSString] = extern
  @inline def recoveryAttempter(): id = extern
  @inline def helpAnchor(): NSString = extern
}

@ObjCClass
abstract class NSErrorClass extends NSObjectClass {
//  @inline def errorWithDomain(domain: NSString, code: NSInteger, dict: NSDictionary): NSError = extern
  @inline def setUserInfoValueProviderForDomain(errorDomain: NSString, provider: id): Unit = extern
  @inline def userInfoValueProviderForDomain(err: NSError, userInfoKey: NSString, errorDomain: NSString): Ptr[Byte] = extern
}

object NSError extends NSErrorClass {
  override type InstanceType = NSError
}