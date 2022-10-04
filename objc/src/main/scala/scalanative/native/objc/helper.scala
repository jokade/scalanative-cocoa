//     Project: scalanative-cocoa
//      Module: objc
// Description: Helper functions for interaction with the ObjC runtime

// Copyright (c) 2017. Distributed under the MIT License (see included LICENSE file).
package scala.scalanative.native.objc

import scala.scalanative.native._
import scala.scalanative.unsafe._
import scala.scalanative.unsigned._
import runtime._

object helper {

//  implicit def objectToId(o: ObjCObject): id = o.cast[id]

  private val scalaInstanceIVar = c"s"
  val sel_alloc: SEL = sel_registerName(c"alloc")
  val sel_allocWithZone: SEL = sel_registerName(c"allocWithZone:")

  def msgSendSuper0(self: id, op: SEL): id = {
    val objc_super = stackalloc[objc_super]( sizeof[objc_super] )
    val super_class = class_getSuperclass(object_getClass(self))
    //TODO: removed dereference here
    objc_super._1 = self
    objc_super._2 = super_class
    runtime.objc_msgSendSuper(objc_super,op)
  }

  def msgSendSuper1(self: id, op: SEL, arg1: Ptr[Byte]): id = {
    val objc_super = stackalloc[objc_super]( sizeof[objc_super] )
    val super_class = class_getSuperclass(object_getClass(self))
    //TODO: removed dereference here
    objc_super._1 = self
    objc_super._2 = super_class
    runtime.objc_msgSendSuper(objc_super,op, arg1)
  }

  @inline def addScalaInstanceIVar(cls: ClassPtr): Boolean = runtime.class_addIvar(cls,scalaInstanceIVar,8.toULong,3.toUByte,null)

  @inline def setScalaInstanceIVar(obj: id, instance: Object): runtime.IVar =
    runtime.object_setInstanceVariable(obj,scalaInstanceIVar,instance.asInstanceOf[Ptr[Byte]])

  // TODO: can we use IVar instead of getInstanceVariable?
  @inline def getScalaInstanceIVar[T](obj: id): T = {
    val out = stackalloc[Ptr[Byte]]( sizeof[Ptr[Byte]] )
    runtime.object_getInstanceVariable(obj,scalaInstanceIVar,out)
    (!out).asInstanceOf[Object].asInstanceOf[T]
  }

  def allocProxy(clsObj: id, instance: id=>Object): id = {
    val obj = msgSendSuper0(clsObj,sel_alloc)
    setScalaInstanceIVar(obj,instance(obj))
    obj
  }

//  implicit final class RichObjCObject(val o: ObjCObject) extends AnyVal {
    // due to https://github.com/scala-native/scala-native/issues/547 we currently can't pass on CVararg*
    // so we explicitly provide methods for multiple arg counts
//    def msgSend(selector: CString, arg1: CVararg): id = objc_msgSend(o,sel_registerName(selector),arg1)
//    def msgSend(selector: CString, arg1: CVararg, arg2: CVararg): id = objc_msgSend(o,sel_registerName(selector),arg1,arg2)
//  }

}



