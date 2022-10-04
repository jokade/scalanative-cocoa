package scala.scalanative.native.objc

import scala.scalanative.native._
import scala.scalanative.unsafe._
import objc.runtime._
import scalanative.unsigned.UInt

object reflect {

  def findClasses(): Iterable[ClassDescriptor] = {
    Nil
  }

  /**
   * Provides methods for introspection of Objective-C classes.
   *
   * @param cls ObjC class to be introspected.
   */
  final class ClassDescriptor(val cls: ClassPtr) extends AnyVal {
    /**
     * Returns the name of this class
     */
    def name: String = fromCString(class_getName(cls))

    /**
     * Returns all methods defined on this ObjC class.
     */
    def methods(): Iterable[Method] = {
      val outCount = stackalloc[UInt]()
      val methodsPtr = class_copyMethodList(cls,outCount)
      val count = (!outCount).toInt
      val methods = Array.ofDim[Method](count)
      for(i <- 0 until (!outCount).toInt) {
        methods(i) = methodsPtr(i)
      }
      scalanative.libc.stdlib.free(methodsPtr.asInstanceOf[Ptr[Byte]])
      methods
    }
  }
  object ClassDescriptor {
    def apply(cls: ClassPtr): ClassDescriptor = new ClassDescriptor(cls)
  }

}
