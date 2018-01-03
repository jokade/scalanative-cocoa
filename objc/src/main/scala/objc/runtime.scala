//     Project: scalanative-cocoa
//      Module: objc
// Description: Bindings to the ObjC runtime defined in objc/*.h
package objc

import objc.runtime.{ObjCObject, SEL, id, objc_super}

import scala.reflect.ClassTag
import scala.reflect.macros.blackbox
import scala.scalanative.native
import scala.scalanative.native._
import scala.scalanative.runtime._

/**
 * Raw bindings to the Objective-C runtime defined in objc/\*.h
 */
@extern
object runtime {

  type int32_t = CInt
  type int64_t = CLong

  trait ObjCObject


//  type id =  Ptr[Byte] //CUnsignedLong
  type id =  Ptr[Byte] //CUnsignedLong

  type SEL = Ptr[Byte]

  type IMP = CFunctionPtr

  type objc_super = CStruct2[id,id]

  type IVar = Ptr[Byte]

  type objc_property_attribute_t = CStruct2[CString,CString]


  def object_isClass(obj: id): CBool = extern

  def object_getClassName(obj: id): CString = extern

  def objc_getClass(name: CString): id = extern

  def objc_allocateClassPair(superclass: id, name: CString, extraBytes: CSize): id = extern

  def objc_registerClassPair(newClass: id): Unit = extern

  def class_addMethod(cls: id, name: SEL, imp: IMP, types: CString): CBool = extern

  def sel_registerName(str: CString): SEL = extern

  /**
   * This is just a dummy definition of `objc_msgSend`, which needs to be cast to the correct signature
   * using [[scalanative.native.CFunctionPtr]] before it is called. The reason for this is message dispatch
   * on iOS / arm64, which does not work properly if we call `objc_msgSend` directly with varargs.
   *
   * You can use [[objc.helper.objc_msgSend1()]], etc., for convenience.
   *
   * @see [[https://developer.apple.com/library/content/documentation/General/Conceptual/CocoaTouch64BitGuide/ConvertingYourAppto64-Bit/ConvertingYourAppto64-Bit.html#//apple_ref/doc/uid/TP40013501-CH3-SW26]]
   */
  def objc_msgSend(): Unit = extern


  def objc_msgSendSuper(objc_super: Ptr[objc_super], op: SEL, args: native.CVararg*): id = extern

  def class_addIvar(cls: id, name: CString, size: CSize, alignment: UByte, types: CString): CBool = extern

  def object_setInstanceVariable(obj: id, name: CString, value: Ptr[Byte]): IVar = extern

  def object_getInstanceVariable(obj: id, name: CString, outValue: Ptr[Ptr[Byte]]): IVar = extern

  def object_getClass(obj: id): id = extern

  def class_getSuperclass(cls: id): id = extern

  def class_addProperty(cls: id, name: CString, attributes: Ptr[objc_property_attribute_t], attributeCount: UInt): CBool = extern
}


