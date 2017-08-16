//     Project: scalanative-cocoa
//      Module:
// Description:
package objc

import de.surfice.smacrotools.BlackboxMacroTools
import objc.internal.ObjCMacroTools

import scala.reflect.macros.blackbox

class RT(val c: blackbox.Context) extends BlackboxMacroTools with ObjCMacroTools {
  import c.universe._

  def sendClsMsg0(): Tree = {
//    c.macroApplication match {
//      case Apply(fun,_) => println(fun.symbol.typeSignature.resultType)
//    }
    // name of the object on which the _cls definition is stored
    val clsTarget = c.prefix.tree
    // name of the val that holds the selector
    val (selectorHolder,selectorTerm,resultType) = c.macroApplication match {
      case Apply(fun@Select(qual,name),args) =>
        (fun.symbol.owner.companion,
        genSelectorTerm(name.toTermName,Nil),
        fun.symbol.typeSignature.resultType)
    }
    val t = q"""objc.runtime.objc_msgSend($clsTarget._cls,$selectorHolder.$selectorTerm).cast[$resultType]"""
    println(t)
    t
  }

  def sendClsMsg1(arg1: Tree) = {
    println(arg1)
//    c.macroApplication match {
//      case Apply(fun,_) => println(fun.symbol.typeSignature.resultType)
//    }
    // name of the object on which the _cls definition is stored
    val clsTarget = c.prefix.tree
    // name of the val that holds the selector
    val (selectorHolder,selectorTerm,resultType) = c.macroApplication match {
      case Apply(fun@Select(qual,name),args) =>
        (fun.symbol.owner.companion,
        genSelectorTerm(name.toTermName,Nil),
        fun.symbol.typeSignature.resultType)
    }
    val t = q"""objc.runtime.objc_msgSend($clsTarget._cls,$selectorHolder.$selectorTerm).cast[$resultType]"""
    println(t)
    t
  }

  def sendClsMsgType[R: WeakTypeTag](): Tree = {
    val retType = c.weakTypeOf[R]
    val clsTarget = c.prefix.tree
    // name of the val that holds the selector
    val (selectorHolder,selectorTerm) = c.macroApplication match {
      case Apply(fun@Select(qual,name),args) =>
        (fun.symbol.owner.companion,
          genSelectorTerm(name.toTermName,Nil))
    }
    val t = q"""objc.runtime.objc_msgSend($clsTarget._cls,$selectorHolder.$selectorTerm).cast[$retType]"""
    println(t)
    t
  }
}
