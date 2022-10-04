//     Project: scalanative-cocoa
//      Module: objc
// Description: Bindings to the ObjC runtime defined in objc/*.h
package scala.scalanative.native.objc

import scala.scalanative.native
import scala.scalanative.native._
import scala.scalanative.unsafe._
import scalanative.unsigned.{UInt, UByte}

/**
 * Raw bindings to the Objective-C runtime defined in objc/\*.h
 */
@extern
object runtime {

  type int32_t = CInt
  type int64_t = CLong

  trait ObjCObject

  type BOOL = Boolean

//  type id =  Ptr[Byte] //CUnsignedLong
  type id =  Ptr[Byte] //CUnsignedLong

  /**
   * An opaque type that represents an Objective-C class.
   */
  type ClassPtr = Ptr[Byte]

  /**
   * Defines an opaque type that represents an Objective-C method selector
   */
  type SEL = Ptr[Byte]

  /**
   * A pointer to an Objective-C method implementation.
   */
  type IMP = CFuncPtr

  type objc_super = CStruct2[id,ClassPtr]

  /**
   * An opaque type that represents an instance variable.
   */
  type IVar = Ptr[Byte]

  /**
   * An opaque type that represents a method in an Objective-C class definition
   */
  type Method = Ptr[Byte]

  /**
   * An opaque type that represents an Objective-C category
   */
  type Category = Ptr[Byte]

  /**
   * Returns the name of a class.
   *
   * @param cls A class object.
   *
   * @return The name of the class, or the empty string if `cls` is null.
   */
  def class_getName(cls: ClassPtr): CString = extern

  /**
   * Creates an instance of a class, allocating memory for the class in the default malloc zone.
   *
   * @param cls The class to be instantiated
   * @param extraBytes number of extra bytes to allocate.
   * @return an instance of the class.
   */
  def class_createInstance(cls: ClassPtr, extraBytes: CSSize): id = extern

  /**
   * Adds a new method to a class with a given anem and implementation.
   *
   * @see [[https://developer.apple.com/library/archive/documentation/Cocoa/Conceptual/ObjCRuntimeGuide/Articles/ocrtTypeEncodings.html#//apple_ref/doc/uid/TP40008048-CH100]]
   *
   * @param cls The class to which to add a method
   * @param name A selector that specifies the name of the method being added
   * @param imp A function which is the implementation of the new method.
   *            The function must take at least two arguments: `self` and `_cmd`
   * @param types An array of characters that describe the type of the arguments to the method.
   * @return true if the method was added successfully, otherwise false (for example, the class
   *         already contains a method implementation with that name.
   */
  def class_addMethod(cls: ClassPtr, name: SEL, imp: IMP, types: CString): CBool = extern

  /**
   * Adds a new instance variable to a class.
   *
   * @param cls
   * @param name
   * @param size
   * @param alignment
   * @param types
   * @return true if the instance variable was added successfully, otherwise false
   *         (for example, the class already contains an instance variable with that name)
   */
  def class_addIvar(cls: ClassPtr, name: CString, size: CSize, alignment: UByte, types: CString): CBool = extern

  def class_getSuperclass(cls: ClassPtr): ClassPtr = extern

  /**
   * Describes the instance methods implemented by a class.
   *
   * @note You must free the returned array with `free()`.
   * @param cls The class to be inspected.
   * @param outCount On return, contains the length of the returned array.
   *                 If outCount is `null`, the length is not returned.
   * @return an array with all [[Method]]s implemented by the specified class.
   *         The array contains `outCount` elements, followed by a `null` terminator.
   *         You must free the array with `free()`
   */
  def class_copyMethodList(cls: ClassPtr, outCount: Ptr[UInt]): Ptr[Method] = extern

  /**
   * Describes the instance variables declared by a class.
   *
   * @param cls
   * @param outCount
   * @return
   */
  def class_copyIvarList(cls: ClassPtr, outCount: Ptr[UInt]): Ptr[IVar] = extern

  def object_isClass(obj: id): CBool = extern

  def object_getClassName(obj: id): CString = extern

  def object_setInstanceVariable(obj: id, name: CString, value: Ptr[Byte]): IVar = extern

  def object_getInstanceVariable(obj: id, name: CString, outValue: Ptr[Ptr[Byte]]): IVar = extern

  /**
   * Returns the class of an object.
   *
   * @param obj
   * @return class of the object, or
   */
  def object_getClass(obj: id): ClassPtr = extern

  /**
   * Returns the class definition of the specified class.
   *
   * @param name the name of the class to look up.
   *
   * @return The class object for the named class, or null if the class is not registered with the
   *         Objective-C runtime.
   */
  def objc_getClass(name: CString): ClassPtr = extern

  /**
   * Creates a new class and metaclass.
   *
   * @see [[https://developer.apple.com/documentation/objectivec/1418559-objc_allocateclasspair?language=objc]]
   *
   * @param superclass The class to use as the new class's superclass, or Nil to create a new root class.
   * @param name The string to use as the new class's name. The string will be copied.
   * @param extraBytes the number of bytes to allocate for indexed ivars at the end of the class and metaclass objects. This should usually be 0.
   * @return The new class, or Nil if the class could not be created (for example, the desired name is already in use).
   */
  def objc_allocateClassPair(superclass: ClassPtr, name: CString, extraBytes: CSize): ClassPtr = extern

  def objc_registerClassPair(newClass: ClassPtr): Unit = extern


  def objc_msgSend(self: Any, op: SEL, args: CVarArg*): id = extern

  def objc_msgSendSuper(objc_super: Ptr[objc_super], op: SEL, args: CVarArg*): id = extern

  /**
   * Registers a method with the ObjC runtime system, maps the method name to a selector, and returns the selector value.
   *
   * @param str name of the method you wish to register.
   */
  def sel_registerName(str: CString): SEL = extern
}


