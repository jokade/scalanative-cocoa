//     Project: scalanative-cocoa
//      Module: objc
// Description: Helper functions for interaction with the ObjC runtime

// Copyright (c) 2017. Distributed under the MIT License (see included LICENSE file).
package objc

import runtime._
import scalanative.native._

object helper {

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

//  implicit final class RichObjCObject(val o: ObjCObject) extends AnyVal {
    // due to https://github.com/scala-native/scala-native/issues/547 we currently can't pass on CVararg*
    // so we explicitly provide methods for multiple arg counts
//    def msgSend(selector: CString, arg1: CVararg): id = objc_msgSend(o,sel_registerName(selector),arg1)
//    def msgSend(selector: CString, arg1: CVararg, arg2: CVararg): id = objc_msgSend(o,sel_registerName(selector),arg1,arg2)
//  }
}



