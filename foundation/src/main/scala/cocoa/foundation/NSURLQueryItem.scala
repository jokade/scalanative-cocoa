// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.foundation

import scala.language.experimental.macros
import scalanative.native._
import objc._

@ObjC
class NSURLQueryItem extends NSObject with NSSecureCoding with NSCopying {
  @inline def initWithName_value_(name: NSString, value: NSString): NSURLQueryItem = extern
  @inline def name(): NSString = extern
  @inline def value(): NSString = extern
}


@ObjCClass
abstract class NSURLQueryItemClass extends NSObjectClass {
  @inline def queryItemWithName(name: NSString, value: NSString): NSURLQueryItem = extern
}

object NSURLQueryItem extends NSURLQueryItemClass {
  override type InstanceType = NSURLQueryItem
}