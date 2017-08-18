package cocoa.foundation

import objc.runtime.{SEL, id}
import objc.{ObjC, ObjCClass}
import scalanative.native._

import scala.language.experimental.macros


@ObjC
class NSProxy extends NSObject {
  @inline def forwardInvocation(invocation: NSInvocation): Unit = extern
  @inline def methodSignatureForSelector(sel: SEL): NSMethodSignature = extern
//  @inline def dealloc(): Unit = extern
//  @inline def `finalize`(): Unit = extern
//  @inline def allowsWeakReference(): BOOL = extern
//  @inline def retainWeakReference(): BOOL = extern
//  @inline def description(): NSString = extern
//  @inline def debugDescription(): NSString = extern
}

@ObjCClass
abstract class NSProxyClass extends NSObjectClass {
  def __cls: id
//  @inline def alloc(): id = extern
  @inline def allocWithZone(zone: NSZone): id = extern
//  @inline def `class`(): id = extern
  @inline def respondsToSelector(aSelector: SEL): BOOL = extern
}

object NSProxy extends NSProxyClass {
  override type InstanceType = NSProxy
}