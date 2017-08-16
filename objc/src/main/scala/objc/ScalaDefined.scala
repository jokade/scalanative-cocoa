//     Project: scalanative-cocoa
//      Module:
// Description:
package objc

import de.surfice.smacrotools.MacroAnnotationHandler

import scala.annotation.StaticAnnotation

class ScalaDefined() extends StaticAnnotation

object ScalaDefined {
  private[objc] trait Handler extends MacroAnnotationHandler {
    this: ObjC.BaseMacro =>

    import c.universe._

    override def analyze: Analysis = super.analyze andThen {
      case (cls: ClassParts, data: Data) if findAnnotation(cls.modifiers.annotations,"ScalaDefined").isDefined =>
        val clsName = q"scalanative.native.CQuote(StringContext(${cls.name.toString})).c()"
        val objcClassDef =
          q"""
             import objc.runtime._
             val newCls = objc_allocateClassPair(objc_getClass(c"NSObject"),$clsName,0)
             objc_registerClassPair(newCls)
           """
        (cls,data.objcClassInits = Seq(objcClassDef))
      case x => x
    }
  }
}
