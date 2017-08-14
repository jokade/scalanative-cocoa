//     Project: scalanative-cocoa
//      Module: objc
// Description: Bindings to the ObjC runtime defined in objc/*.h
package objc

import scala.reflect.macros.blackbox
import scala.scalanative.native
import scala.scalanative.native._
import scala.scalanative.runtime._

/**
 * Raw bindings to the Objective-C runtime defined in objc/\*.h
 */
@extern
object runtime {
  /**
   * An opaque type that represents an Objective-C class.
   */
  type ObjCClass = Ptr[Byte]

  trait ObjCObject

//  implicit final class RichObjCObject(val o: ObjCObject) extends AnyVal {
//    @inline def id: id = o.cast[id]
//  }
  /**
   * A pointer to an object or an atomic response to a message.
   */
  type id = CUnsignedLong //Ptr[Byte]

  type SEL = Ptr[Byte]

  type IMP = CFunctionPtr


  /**
   * Returns whether an object is a class object.
   *
   * @param obj An Objective-C object.
   * @return true if the object is a class or metaclass
   */
  def object_isClass(obj: id): CBool = extern

  /**
   * Returns the class name of a given object.
   *
   * @param obj An Objective-C object.
   * @return The name of the class of which `obj` is an instance
   */
  def object_getClassName(obj: id): CString = extern

  /**
   * Returns the class definition of a specified class.
   *
   * @param name The name of the class to look up.
   *
   * @return The Class object for the named class, or `nil` if the class is not registered
   *         with the Objective-C runtime.
   *
   * @note [[objc_getClass()]] is different from [[objc_lookUpClass()]] in that if the class
   *      is not registered, [[objc_getClass()]] calls the class handler callback and then
   *      checks a second time to see whether the class is registered. [[objc_lookUpClass()]]
   *      does not call the class handler callback.
   */
  def objc_getClass(name: CString): ObjCClass = extern

  /**
   * Registers amethod with the Objective-C runtime system, maps the method
   * name to a selector, and returns the selector value.
   *
   * @param str A pointer to a C string. Pass the name of the method you wish to register.
   *
   * @return A pointer of type SEL specifying the selector for the named method.
   *
   * @note You must register a method name with the Objective-C runtime system to obtain the
   *  method’s selector before you can add the method to a class definition. If the method name
   *  has already been registered, this function simply returns the selector.
   */
  def sel_registerName(str: CString): SEL = extern

  def objc_msgSend(self: Any, op: SEL, args: native.CVararg*): id = extern

}


