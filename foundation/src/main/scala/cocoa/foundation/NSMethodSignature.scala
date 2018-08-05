package cocoa.foundation

import scalanative.native._
import objc.runtime.id

import scala.language.experimental.macros


@ObjC
class NSMethodSignature extends NSObject {
  @inline def getArgumentTypeAtIndex(idx: NSUInteger): Ptr[CSignedChar] = extern
  @inline def isOneway(): BOOL = extern
  @inline def numberOfArguments(): NSUInteger = extern
  @inline def frameLength(): NSUInteger = extern
  @inline def methodReturnType(): Ptr[CSignedChar] = extern
  @inline def methodReturnLength(): NSUInteger = extern
}

@ObjCClass
abstract class NSMethodSignatureClass extends {
  def __cls: id
  @inline def signatureWithObjCTypes(types: Ptr[CSignedChar]): NSMethodSignature = extern
}

object NSMethodSignature extends NSMethodSignatureClass {
}