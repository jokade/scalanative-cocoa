//     Project: scalanative-cocoa
//      Module: Foundation
// Description: Contains all functions defined in the Foundation global scope.
package cocoa.foundation

import scala.scalanative.native._
import objc.runtime._
import cocoa.foundation._

@extern
object Foundation {
//  type objc_class = Ptr[Byte]
//  type objc_object = Ptr[Byte]
//  type objc_selector = Ptr[Byte]
//  type _NSZone = Ptr[Byte]
//  def sel_getName_(sel: SEL): Ptr[CSignedChar] = extern
//  def sel_registerName_(str: Ptr[CSignedChar]): SEL = extern
//  def object_getClassName_(obj: id): Ptr[CSignedChar] = extern
//  def object_getIndexedIvars_(obj: id): Ptr[Byte] = extern
//  def sel_isMapped_(sel: SEL): BOOL = extern
//  def sel_getUid_(str: Ptr[CSignedChar]): SEL = extern
  def NSAllocateObject_extraBytes_zone_(aClass: id, extraBytes: NSUInteger, zone: NSZone): id = extern
  def NSDeallocateObject_(`object`: id): Unit = extern
  def NSCopyObject_extraBytes_zone_(`object`: id, extraBytes: NSUInteger, zone: NSZone): id = extern
  def NSShouldRetainWithZone_requestedZone_(anObject: id, requestedZone: NSZone): BOOL = extern
  def NSIncrementExtraRefCount_(`object`: id): Unit = extern
  def NSDecrementExtraRefCountWasZero_(`object`: id): BOOL = extern
  def NSExtraRefCount_(`object`: id): NSUInteger = extern
//  def CFBridgingRetain_(X: id): CFTypeRef = extern
//  def CFBridgingRelease_(X: CFTypeRef): id = extern

  def NSLog(format: NSString, args: CVararg*): Unit = extern
  def NXReadNSObjectFromCoder_(decoder: NSCoder): NSObject = extern
}
