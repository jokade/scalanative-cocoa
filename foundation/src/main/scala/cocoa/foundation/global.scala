//     Project: scalanative-cocoa
//      Module: Foundation
// Description: Contains all functions defined in the Foundation global scope.
package cocoa.foundation

import scala.scalanative.native._
import objc.runtime._
import cocoa.foundation._

@extern
object global {
//  def sel_getName(sel: SEL): Ptr[CSignedChar] = extern
//  def sel_registerName(str: Ptr[CSignedChar]): SEL = extern
//  def object_getClassName(obj: id): Ptr[CSignedChar] = extern
//  def object_getIndexedIvars(obj: id): Ptr[Unit] = extern
//  def sel_isMapped(sel: SEL): BOOL = extern
//  def sel_getUid(str: Ptr[CSignedChar]): SEL = extern
//  def NSAllocateObject(aClass: ObjCClass, extraBytes: NSUInteger, zone: NSZone): id = extern
  def NSDeallocateObject(`object`: id): Unit = extern
//  def NSCopyObject(`object`: id, extraBytes: NSUInteger, zone: NSZone): id = extern
//  def NSShouldRetainWithZone(anObject: id, requestedZone: NSZone): BOOL = extern
  def NSIncrementExtraRefCount(`object`: id): Unit = extern
  def NSDecrementExtraRefCountWasZero(`object`: id): BOOL = extern
  def NSExtraRefCount(`object`: id): NSUInteger = extern
//  def CFBridgingRetain(X: id): CFTypeRef = extern
//  def CFBridgingRelease(X: CFTypeRef): id = extern

  def NXReadNSObjectFromCoder(decoder: NSCoder): NSObject = extern

  def NSLog(format: NSString, args: CVararg*): Unit = extern
}
