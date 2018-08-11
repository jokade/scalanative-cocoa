// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.foundation

import scalanative.native._
import objc._

@ObjC
class NSError extends NSObject with NSCopying with NSSecureCoding {
  @inline def initWithDomain_code_dict_(domain: NSString, code: NSInteger, dict: NSDictionary[NSErrorUserInfoKey,NSObject]): NSError = extern
  @inline def domain(): NSString = extern
  @inline def code(): NSInteger = extern
  @inline def userInfo(): NSDictionary[NSErrorUserInfoKey,NSObject] = extern
  @inline def localizedDescription(): NSString = extern
  @inline def localizedFailureReason(): NSString = extern
  @inline def localizedRecoverySuggestion(): NSString = extern
  @inline def localizedRecoveryOptions(): NSArray[NSString] = extern
  @inline def recoveryAttempter(): id = extern
  @inline def helpAnchor(): NSString = extern
}


@ObjCClass
abstract class NSErrorClass extends NSObjectClass {
  @inline def errorWithDomain_code_dict_(domain: NSString, code: NSInteger, dict: NSDictionary[NSErrorUserInfoKey,NSObject]): NSError = extern
  @inline def setUserInfoValueProviderForDomain_provider_(errorDomain: NSString, provider: id): Unit = extern
  @inline def userInfoValueProviderForDomain_userInfoKey_errorDomain_(err: NSError, userInfoKey: NSErrorUserInfoKey, errorDomain: NSString): Ptr[Byte] = extern
}

object NSError extends NSErrorClass {
  override type InstanceType = NSError
}