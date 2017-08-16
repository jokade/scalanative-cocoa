//     Project: scalanative-cocoa
//      Module: Foundation
// Description: Generated with scala-obj-bindgen (with manual postprocessing) from:
//              Foundation/NSURL.h
package cocoa.foundation

import scala.language.experimental.macros
import objc.{ObjC, ObjCClass}
import scalanative.native._

@ObjC
class NSURLQueryItem extends NSObject with NSSecureCoding with NSCopying {
  @inline def initWithName(name: NSString, value: NSString): NSURLQueryItem = extern
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