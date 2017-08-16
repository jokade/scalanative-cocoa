//     Project: scalanative-cocoa
//      Module: Foundation
// Description: Generated with scala-obj-bindgen (with manual postprocessing) from:
//              objc/objc.h, objc/NSObject.h, objc/Protocol.h, Foundation/NSObject.h
package cocoa.foundation

import de.surfice.smacrotools.debug
import objc._
import objc.runtime._

import scala.language.experimental.macros
import scala.scalanative.native._

@ObjC
//@debug
class NSObject extends ObjCObject {
  @inline def isEqual(`object`: id): BOOL = extern
  @inline def `class`(): id = extern
  @inline def self(): NSObject = extern
  @inline def performSelector(aSelector: SEL): id = extern
  @inline def performSelector(aSelector: SEL, `object`: id): id = extern
  @inline def performSelector(aSelector: SEL, object1: id, object2: id): id = extern
  @inline def isProxy(): BOOL = extern
  @inline def isKindOfClass(aClass: id): BOOL = extern
  @inline def isMemberOfClass(aClass: id): BOOL = extern
  @inline def conformsToProtocol(aProtocol: Protocol): BOOL = extern
  @inline def respondsToSelector(aSelector: SEL): BOOL = extern
  @inline def retain(): NSObject = extern
  @inline def release(): Unit = extern
  @inline def autorelease(): NSObject = extern
  @inline def retainCount(): NSUInteger = extern
  @inline def zone(): NSZone = extern
  @inline def hash(): NSUInteger = extern
  @inline def superclass(): id = extern
  @inline def description(): NSString = extern
  @inline def debugDescription(): NSString = extern
  @inline def init(): NSObject = extern
  @inline def dealloc(): Unit = extern
  @inline override def `finalize`(): Unit = extern
  @inline def copy(): id = extern
  @inline def mutableCopy(): id = extern
  @inline def methodForSelector(aSelector: SEL): IMP = extern
  @inline def doesNotRecognizeSelector(aSelector: SEL): Unit = extern
  @inline def forwardingTargetForSelector(aSelector: SEL): id = extern
//  @inline def forwardInvocation(anInvocation: NSInvocation): Unit = extern
//  @inline def methodSignatureForSelector(aSelector: SEL): NSMethodSignature = extern
  @inline def allowsWeakReference(): BOOL = extern
  @inline def retainWeakReference(): BOOL = extern
//  @inline def replacementObjectForCoder(aCoder: NSCoder): id = extern
//  @inline def awakeAfterUsingCoder(aDecoder: NSCoder): id = extern
  @inline def classForCoder(): id = extern
  @inline def autoContentAccessingProxy(): id = extern
}

@ObjCClass
@debug
abstract class NSObjectClass {
  type InstanceType
  def _cls: id
  val _sel_alloc = sel_registerName(c"alloc")
  @inline def load(): Unit = extern
  @inline def initialize(): Unit = extern
//  @inline def `new`(): T = macro RT.clsMsgSend
//  @inline def allocWithZone(zone: NSZone): T = extern
  @inline def alloc(): NSObject = extern
//  @inline def alloc(): T = macro RT.clsMsgSend
  @inline def copyWithZone(zone: NSZone): id = extern
  @inline def mutableCopyWithZone(zone: NSZone): id = extern
  @inline def instancesRespondToSelector(aSelector: SEL): BOOL = extern
  @inline def conformsToProtocol(protocol: Protocol): BOOL = extern
  @inline def instanceMethodForSelector(aSelector: SEL): IMP = extern
  //  @inline def instanceMethodSignatureForSelector(aSelector: SEL): NSMethodSignature = extern
  @inline def isSubclassOfClass(aClass: id): BOOL = extern
  @inline def resolveClassMethod(sel: SEL): BOOL = extern
  @inline def resolveInstanceMethod(sel: SEL): BOOL = extern
  @inline def hash(): NSUInteger = extern
  @inline def superclass(): id = extern
  @inline def `class`(): id = extern
  @inline def description(): NSString = extern
  @inline def debugDescription(): NSString = extern
//  @inline def version(): NSInteger = macro RT.clsMsgSend
  @inline def setVersion(aVersion: NSInteger): Unit = extern
  @inline def poseAsClass(aClass: id): Unit = extern
}


object NSObject extends NSObjectClass {
  override type InstanceType = NSObject
}
