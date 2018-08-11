// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.foundation

import scala.language.experimental.macros
import scalanative.native._
import objc._
import scala.scalanative.native.objc.runtime.{IMP, ObjCObject}

@ObjC
class NSObject extends ObjCObject {
  @inline def isEqual_(`object`: id): BOOL = extern
  @inline def `class`(): id = extern
  @inline def self(): NSObject = extern
  @inline def performSelector_(aSelector: SEL): id = extern
  @inline def performSelector_object_(aSelector: SEL, `object`: id): id = extern
  @inline def performSelector_object1_object2_(aSelector: SEL, object1: id, object2: id): id = extern
  @inline def isProxy(): BOOL = extern
  @inline def isKindOfClass_(aClass: id): BOOL = extern
  @inline def isMemberOfClass_(aClass: id): BOOL = extern
  @inline def conformsToProtocol_(aProtocol: Protocol): BOOL = extern
  @inline def respondsToSelector_(aSelector: SEL): BOOL = extern
  @inline def retain(): NSObject = extern
  @inline def release(): Unit = extern
  @inline def autorelease(): NSObject = extern
  @inline def retainCount(): NSUInteger = extern
  @inline def zone(): NSZone = extern
  @inline def hash(): NSUInteger = extern
  @inline def superclass(): id = extern
  @inline def description(): NSString = extern
  @inline def debugDescription(): NSString = extern
  @inline def init(): this.type = extern
  @inline def dealloc(): Unit = extern
//  override @inline def `finalize`(): Unit = extern
  @inline def copy(): id = extern
  @inline def mutableCopy(): id = extern
  @inline def methodForSelector_(aSelector: SEL): IMP = extern
  @inline def doesNotRecognizeSelector_(aSelector: SEL): Unit = extern
  @inline def forwardingTargetForSelector_(aSelector: SEL): id = extern
//  @inline def forwardInvocation_(anInvocation: NSInvocation): Unit = extern
//  @inline def methodSignatureForSelector_(aSelector: SEL): NSMethodSignature = extern
  @inline def allowsWeakReference(): BOOL = extern
  @inline def retainWeakReference(): BOOL = extern
  @inline def replacementObjectForCoder_(aCoder: NSCoder): id = extern
  @inline def awakeAfterUsingCoder_(aDecoder: NSCoder): id = extern
  @inline def classForCoder(): id = extern
  @inline def autoContentAccessingProxy(): id = extern
  @inline def attemptRecoveryFromError_recoveryOptionIndex_delegate_didRecoverSelector_contextInfo_(error: NSError, recoveryOptionIndex: NSUInteger, delegate: id, didRecoverSelector: SEL, contextInfo: Ptr[Byte]): Unit = extern
  @inline def attemptRecoveryFromError_recoveryOptionIndex_(error: NSError, recoveryOptionIndex: NSUInteger): BOOL = extern
}


@ObjCClass
abstract class NSObjectClass extends ObjCObject {
  type InstanceType
  def __cls: id
  @inline def load(): Unit = extern
  @inline def initialize(): Unit = extern
  @inline def `new`(): NSObject = extern
  @inline def allocWithZone_(zone: NSZone): NSObject = extern
  @inline def alloc(): NSObject = extern
  @inline def copyWithZone_(zone: NSZone): id = extern
  @inline def mutableCopyWithZone_(zone: NSZone): id = extern
  @inline def instancesRespondToSelector_(aSelector: SEL): BOOL = extern
  @inline def conformsToProtocol_(protocol: Protocol): BOOL = extern
  @inline def instanceMethodForSelector_(aSelector: SEL): IMP = extern
//  @inline def instanceMethodSignatureForSelector_(aSelector: SEL): NSMethodSignature = extern
  @inline def isSubclassOfClass_(aClass: id): BOOL = extern
  @inline def resolveClassMethod_(sel: SEL): BOOL = extern
  @inline def resolveInstanceMethod_(sel: SEL): BOOL = extern
  @inline def hash(): NSUInteger = extern
  @inline def superclass(): id = extern
  @inline def `class`(): id = extern
  @inline def description(): NSString = extern
  @inline def debugDescription(): NSString = extern
  @inline def version(): NSInteger = extern
  @inline def setVersion_(aVersion: NSInteger): Unit = extern
  @inline def poseAsClass_(aClass: id): Unit = extern
}

object NSObject extends NSObjectClass {
  override type InstanceType = NSObject
}