//     Project: scalanative-cocoa
//      Module: objc
// Description: Helper functions for interaction with the ObjC runtime

// Copyright (c) 2017. Distributed under the MIT License (see included LICENSE file).
package objc

import objc.runtime._

import scala.reflect.macros.blackbox.Context
import scala.language.experimental.macros
import scala.scalanative.native._

object helper {

//  implicit def objectToId(o: ObjCObject): id = o.cast[id]

  private val scalaInstanceIVar = c"s"
  val sel_alloc: SEL = sel_registerName(c"alloc")
  val sel_allocWithZone: SEL = sel_registerName(c"allocWithZone:")

  val objc_msgSendPtr: CFunctionPtr0[Unit] = CFunctionPtr.fromFunction0(objc_msgSend _)

  @inline def objc_msgSend0(self: id, op: SEL): id = objc_msgSendPtr.cast[CFunctionPtr2[id,SEL,id]].apply(self,op)
  @inline def objc_msgSend1[T1](self: id, op: SEL, arg1: T1): id = macro Macros.objc_msgSend1Impl[T1]
  @inline def objc_msgSend2[T1,T2](self: id, op: SEL, arg1: T1, arg2: T2): id = macro Macros.objc_msgSend2Impl[T1,T2]
  @inline def objc_msgSend3[T1,T2,T3](self: id, op: SEL, arg1: T1, arg2: T2, arg3: T3): id = macro Macros.objc_msgSend3Impl[T1,T2,T3]
  @inline def objc_msgSend4[T1,T2,T3,T4](self: id, op: SEL, arg1: T1, arg2: T2, arg3: T3, arg4: T4): id = macro Macros.objc_msgSend4Impl[T1,T2,T3,T4]
  @inline def objc_msgSend5[T1,T2,T3,T4,T5](self: id, op: SEL, arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5): id = macro Macros.objc_msgSend5Impl[T1,T2,T3,T4,T5]

  def msgSendSuper0(self: id, op: SEL): id = {
    val objc_super = stackalloc[objc_super]( sizeof[objc_super] )
    val super_class = class_getSuperclass(object_getClass(self))
    !objc_super._1 = self
    !objc_super._2 = super_class
    runtime.objc_msgSendSuper(objc_super,op)
  }

  def msgSendSuper1(self: id, op: SEL, arg1: Ptr[Byte]): id = {
    val objc_super = stackalloc[objc_super]( sizeof[objc_super] )
    val super_class = class_getSuperclass(object_getClass(self))
    !objc_super._1 = self
    !objc_super._2 = super_class
    runtime.objc_msgSendSuper(objc_super,op, arg1)
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
    val obj = msgSendSuper0(clsObj,sel_alloc)
    setScalaInstanceIVar(obj,instance(obj))
    obj
  }

//  def setPropertyAttributes(cls: id, property: CString, attributes: Seq[CString]): Unit = {
//    val attrs = stackalloc[objc_property_attribute_t]( sizeof[objc_property_attribute_t] )
//    !attrs._1 = attributes.head
//    !attrs._2 = c""
//    if( !runtime.class_addProperty(cls,property,attrs,1.toUInt) )
//      throw new RuntimeException(s"could not register property ${property.toString}")
//  }

}

class Macros(val c: Context) {
  import c.universe._

  val tPtrByte = weakTypeOf[scalanative.native.Ptr[Byte]]

  def objc_msgSend1Impl[T1: c.WeakTypeTag](self: c.Tree, op: c.Tree, arg1: c.Tree): c.Expr[id] =
    c.Expr[id](q"_root_.objc.helper.objc_msgSendPtr.cast[scalanative.native.CFunctionPtr3[$tPtrByte,$tPtrByte,${c.weakTypeOf[T1]},$tPtrByte]].apply($self,$op,$arg1)")

  def objc_msgSend2Impl[T1: c.WeakTypeTag,T2: c.WeakTypeTag](self: c.Tree, op: c.Tree, arg1: c.Tree, arg2: c.Tree): c.Expr[id] =
    c.Expr[id](q"_root_.objc.helper.objc_msgSendPtr.cast[scalanative.native.CFunctionPtr4[$tPtrByte,$tPtrByte,${c.weakTypeOf[T1]},${c.weakTypeOf[T2]},$tPtrByte]].apply($self,$op,$arg1,$arg2)")

  def objc_msgSend3Impl[T1: c.WeakTypeTag,T2: c.WeakTypeTag,T3: c.WeakTypeTag](self: c.Tree, op: c.Tree, arg1: c.Tree, arg2: c.Tree, arg3: c.Tree): c.Expr[id] =
    c.Expr[id](q"_root_.objc.helper.objc_msgSendPtr.cast[scalanative.native.CFunctionPtr5[$tPtrByte,$tPtrByte,${c.weakTypeOf[T1]},${c.weakTypeOf[T2]},${c.weakTypeOf[T3]},$tPtrByte]].apply($self,$op,$arg1,$arg2,$arg3)")

  def objc_msgSend4Impl[T1: c.WeakTypeTag,T2: c.WeakTypeTag,T3: c.WeakTypeTag,T4: c.WeakTypeTag](self: c.Tree, op: c.Tree, arg1: c.Tree, arg2: c.Tree, arg3: c.Tree, arg4: c.Tree): c.Expr[id] =
    c.Expr[id](q"_root_.objc.helper.objc_msgSendPtr.cast[scalanative.native.CFunctionPtr6[$tPtrByte,$tPtrByte,${c.weakTypeOf[T1]},${c.weakTypeOf[T2]},${c.weakTypeOf[T3]},${c.weakTypeOf[T4]},$tPtrByte]].apply($self,$op,$arg1,$arg2,$arg3,$arg4)")

  def objc_msgSend5Impl[T1: c.WeakTypeTag,T2: c.WeakTypeTag,T3: c.WeakTypeTag,T4: c.WeakTypeTag,T5: c.WeakTypeTag](self: c.Tree, op: c.Tree, arg1: c.Tree, arg2: c.Tree, arg3: c.Tree, arg4: c.Tree, arg5: c.Tree): c.Expr[id] =
    c.Expr[id](q"_root_.objc.helper.objc_msgSendPtr.cast[scalanative.native.CFunctionPtr7[$tPtrByte,$tPtrByte,${c.weakTypeOf[T1]},${c.weakTypeOf[T2]},${c.weakTypeOf[T3]},${c.weakTypeOf[T4]},${c.weakTypeOf[T5]},$tPtrByte]].apply($self,$op,$arg1,$arg2,$arg3,$arg4,$arg5)")
}

