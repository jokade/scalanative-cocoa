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


  def object_isClass(obj: id): CBool = extern

  def object_getClassName(obj: id): CString = extern

  def objc_getClass(name: CString): id = extern

  def objc_allocateClassPair(superclass: id, name: CString, extraBytes: CSize): id = extern

  def objc_registerClassPair(newClass: id): Unit = extern

  def class_addMethod(cls: id, name: SEL, imp: IMP, types: CString): CBool = extern

  def sel_registerName(str: CString): SEL = extern

  def objc_msgSend(self: Any, op: SEL, args: native.CVararg*): id = extern

  def objc_msgSendSuper(objc_super: Ptr[objc_super], op: SEL, args: native.CVararg*): id = extern

  def class_addIvar(cls: id, name: CString, size: CSize, alignment: UByte, types: CString): CBool = extern

  def object_setInstanceVariable(obj: id, name: CString, value: Ptr[Byte]): IVar = extern

  def object_getInstanceVariable(obj: id, name: CString, outValue: Ptr[Ptr[Byte]]): IVar = extern

  def object_getClass(obj: id): id = extern

  def class_getSuperclass(cls: id): id = extern
}

object helper {
  import runtime._

//  implicit def objectToId(o: ObjCObject): id = o.cast[id]

  private val scalaInstanceIVar = c"s"
  val sel_alloc: SEL = sel_registerName(c"alloc")

  def msgSendSuper(self: id, op: SEL, args: CVararg*): id = {
    val objc_super = stackalloc[objc_super]( sizeof[objc_super] )
    val super_class = class_getSuperclass(object_getClass(self))
    !objc_super._1 = self
    !objc_super._2 = super_class
    runtime.objc_msgSendSuper(objc_super,op)
  }

  @inline def addScalaInstanceIVar(cls: id): Boolean = runtime.class_addIvar(cls,scalaInstanceIVar,8,3.toUByte,null)

  @inline def setScalaInstanceIVar(obj: id, instance: Object): runtime.IVar =
    runtime.object_setInstanceVariable(obj,scalaInstanceIVar,instance.cast[Ptr[Byte]])

  // TODO: can we use IVar instead of getInstanceVariable?
  @inline def getScalaInstanceIVar[T](obj: id): T = {
    val out = stackalloc[Ptr[Byte]]( sizeof[Ptr[Byte]] )
    runtime.object_getInstanceVariable(obj,scalaInstanceIVar,out)
    (!out).cast[Object].asInstanceOf[T]
  }

  def allocProxy(clsObj: id, instance: id=>Object): id = {
    val obj = msgSendSuper(clsObj,sel_alloc)
    setScalaInstanceIVar(obj,instance(obj))
    obj
  }
}



