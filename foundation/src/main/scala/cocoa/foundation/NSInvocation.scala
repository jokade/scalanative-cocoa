package cocoa.foundation

import objc.runtime.{SEL, id}
import objc.{ObjC, ObjCClass}

import scala.language.experimental.macros
import scala.scalanative.native._

@ObjC
class NSInvocation extends NSObject {
  @inline def retainArguments(): Unit = extern
  @inline def getReturnValue(retLoc: Ptr[Byte]): Unit = extern
  @inline def setReturnValue(retLoc: Ptr[Byte]): Unit = extern
  @inline def getArgument(argumentLocation: Ptr[Byte], idx: NSInteger): Unit = extern
  @inline def setArgument(argumentLocation: Ptr[Byte], idx: NSInteger): Unit = extern
  @inline def invoke(): Unit = extern
  @inline def invokeWithTarget(target: id): Unit = extern
  @inline def methodSignature(): NSMethodSignature = extern
  @inline def argumentsRetained(): BOOL = extern
  @inline def target(): id = extern
  @inline def setTarget(target: id): Unit = extern
  @inline def selector(): SEL = extern
  @inline def setSelector(selector: SEL): Unit = extern
}

@ObjCClass
abstract class NSInvocationClass {
  def __cls: id
  @inline def invocationWithMethodSignature(sig: NSMethodSignature): NSInvocation = extern
}

object NSInvocation extends NSInvocationClass {
}