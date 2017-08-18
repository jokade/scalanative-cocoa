//     Project: scalanative-cocoa
//      Module: objc
// Description:

// Copyright (c) 2017. Distributed under the MIT License (see included LICENSE file).
package objc

import objc.runtime._
import objc.helper._
import scalanative.native._

object ObjCParent {
  private lazy val sel_initWithRef = sel_registerName(c"initWithRef:")
  private lazy val sel_methodSignatureForSelector = sel_registerName(c"methodSignatureForSelector:")
  private lazy val sel_forwardInvocation = sel_registerName(c"forwardInvocation:")

  private lazy val cls = {
    def init(self: id, sel: SEL, ref: id): id = {
      val proxy = objc_msgSend(self,sel_alloc)
      setScalaInstanceIVar(proxy,ref)
      println("Initializing Proxy!")
      proxy
    }
    def methodSignature(self: id, sel: SEL, selForSignature: SEL): id = {
      val ref = getScalaInstanceIVar[Object](self).cast[id]
      objc_msgSend(ref,sel_methodSignatureForSelector,selForSignature)
    }
    def forwardInvocation(self: id, sel: SEL, invocation: id): id = {
      val ref = getScalaInstanceIVar[Object](self).cast[id]
      println("forwarding invocation")
      self
    }
    val newCls = objc_allocateClassPair(objc_getClass(c"NSProxy"),c"ScalaParentProxy",0)
    val metaCls = object_getClass(newCls)
    addScalaInstanceIVar(newCls)
    class_addMethod(metaCls,sel_initWithRef,CFunctionPtr.fromFunction3(init),c"@:@")
    class_addMethod(newCls,sel_methodSignatureForSelector,CFunctionPtr.fromFunction3(methodSignature),c"@:@")
    class_addMethod(newCls,sel_forwardInvocation,CFunctionPtr.fromFunction3(forwardInvocation),c"@:@")
    objc_registerClassPair(newCls)
    newCls
  }

  def apply(ref: id): id = {
    val proxy = objc_msgSend(cls,sel_initWithRef,ref)
    proxy
  }
}
