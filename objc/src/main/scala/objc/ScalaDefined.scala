//     Project: scalanative-cocoa
//      Module:
// Description:
package objc

import de.surfice.smacrotools.MacroAnnotationHandler
import objc.internal.ObjCMacroTools

import scala.annotation.StaticAnnotation

class ScalaDefined() extends StaticAnnotation

object ScalaDefined {
  private[objc] trait Handler extends MacroAnnotationHandler {
    this: ObjC.BaseMacro =>

    import c.universe._


    override def analyze: Analysis = super.analyze andThen {
      case (cls: ClassParts, data: Data) if findAnnotation(cls.modifiers.annotations,"ScalaDefined").isDefined =>
        val exposedMethods = getExposedMethods(cls.body)
        val selectors = exposedMethods map ( m => genSelector(m.name,m.vparamss) )
        val updData = MacroData(data)
        updData.selectors = data.selectors ++ selectors
        updData.objcClassInits = objcClassDef(cls,exposedMethods)
        updData.additionalCompanionStmts = (data.additionalCompanionStmts :+ genActualClassImpl(cls))++
          (exposedMethods map genExposedMethodProxy(cls)) :+ genInit(cls)
        updData.replaceClassBody = Some(replaceClassBody(exposedMethods))
        (cls,updData.data)
      case x => x
    }

    private def objcClassDef(cls: ClassParts, exposedMethods: Seq[DefDef]) = Seq[Tree] {
      val clsName = q"scalanative.native.CQuote(StringContext(${cls.name.toString})).c()"
      q"""import scalanative.native.CQuote
          import objc.runtime._
          import objc.helper._
          val newCls = objc_allocateClassPair(objc_getClass(c"NSObject"),$clsName,0)
          addScalaInstanceIVar(newCls)
          ..${exposedMethods map registerExposedMethod}
          class_addMethod(newCls,cocoa.foundation.NSObject.__sel_init,CFunctionPtr.fromFunction1(__init),c"@:")
          objc_registerClassPair(newCls)
       """
    }

    private def registerExposedMethod(m: DefDef): Tree = {
      q"""class_addMethod(newCls,${genSelector(m.name,m.vparamss)._2},${exposedMethodCast(m)},c"@:")"""
    }

    private def exposedMethodCast(m: DefDef): Tree =
      q"""CFunctionPtr.fromFunction1(${methodProxyName(m)})"""

    private def getExposedMethods(body: Seq[Tree]): Seq[DefDef] = body collect {
      case m: DefDef if isPublic(m.mods) => m
    }

    private def methodProxyName(m: DefDef) = TermName("__m_"+m.name)

    private def genExposedMethodProxy(cls: ClassParts)(m: DefDef) = {
      q"""def ${methodProxyName(m)}(self: id): Unit = {
          println("proxy called")
            val o = objc.helper.getScalaInstanceIVar[${cls.name}](self)
            println(o)
            o.${m.name}()
          }
       """
    }

    private def genInit(cls: ClassParts) =
      q"""def __init(self: id): Any = {
          println("Initializing")
          val o = new ${cls.name}
          println("done")
          objc.helper.setScalaInstanceIVar(self,o)
          self
        }
     """

    private val _extern = q"scalanative.native.extern"

    private def replaceClassBody(exposedMethods: Seq[DefDef]): Seq[Tree] = exposedMethods map {
      case DefDef(mods,name,tparams,args,tpt,rhs) =>
        DefDef(mods,name,tparams,args,tpt,_extern)
    }

    private def genActualClassImpl(cls: ClassParts): Tree = {
      import cls._
      q"""$modifiers class $name[..$tparams] $ctorMods ( ..$params )
                       extends ..$parents { $self => ..$body }
       """
    }

    private def isPublic(mods: Modifiers): Boolean = !(
      mods.hasFlag(Flag.PROTECTED) || mods.hasFlag(Flag.PROTECTED)
    )
  }
}
