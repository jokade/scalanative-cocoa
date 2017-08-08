//     Project: scalanative-cocoa
//      Module:
// Description:
package objc

import de.surfice.smacrotools.MacroAnnotationHandler

import scala.language.experimental.macros
import scala.annotation.{StaticAnnotation, compileTimeOnly}
import scala.reflect.macros.whitebox

@compileTimeOnly("enable macro paradise to expand macro annotations")
class ObjC() extends StaticAnnotation {
  def macroTransform(annottees: Any*): Any = macro ObjC.Macro.impl
}

object ObjC {

  private[objc] class Macro(val c: whitebox.Context) extends MacroAnnotationHandler {
    import c.universe._

    override val annotationName: String = "ObjC"
    override val supportsClasses: Boolean = true
    override val supportsTraits: Boolean = false
    override val supportsObjects: Boolean = true
    override val createCompanion: Boolean = true


    override def analyze: Analysis = super.analyze andThen {
      case (cls: ClassParts, data) =>
        // collect selectors to be emitted into companion object body
        val selectors = cls.body.collect{
          case DefDef(mods,name,types,args,rettype,Ident(TermName("extern"))) =>
            genSelector(name,args)
        }
        (cls,data + ("selectors" -> selectors))
      case default => default
    }

    override def transform: Transformation = super.transform andThen {
      /* transform class */
      case cls: ClassTransformData =>
        val transformedBody = cls.origParts.body.map {
          case t@DefDef(mods, name, types, args, rettype, Ident(TermName(rhs))) =>
            val selectorTerm = q"NSString.${genSelector(name,args)._2}"
            val call = genCall(q"this",selectorTerm,args,rettype)
            DefDef(mods,name,types,args,rettype,call)
          case x => x
        }
        cls.updBody(transformedBody)

        /* transform companion object */
      case obj: ObjectTransformData =>
        // val containing the class reference
        val objcCls =
          q"""private lazy val _cls = _root_.objc.runtime.objc_getClass(
              scalanative.native.CQuote(StringContext(${obj.origParts.name.toString})).c() )
           """
        // collect selector definitions from class
        val clsSelectors = obj.data("selectors").asInstanceOf[Iterable[(String,TermName)]]
          .map( p => genSelectorDef(p._1,p._2))
          .toSeq
        // replace all methods with 'extern' RHS with the corresponding obj_msgSend call
        val transformedBody = (objcCls +: clsSelectors) ++ obj.origParts.body.flatMap{
          case t @ DefDef(mods,name,types,args,rettype,Ident(TermName("extern"))) =>
            val (selector,selectorTerm) = genSelector(name,args)
            val call = genCall(clsTarget,selectorTerm,args,rettype) //q"objc.objc_msgSend(_cls,$selectorVal,${paramNames(t)})"
            Seq(
              genSelectorDef(selector,selectorTerm),
              DefDef(mods,name,types,args,rettype,call)
            )
          case default => Seq(default)
        }
        obj.updBody(transformedBody)
      case default => default
    }

    private val extern = q"scala.scalanative.native.extern"

    private def genSelector(name: TermName, args: List[List[ValDef]]): (String,TermName) = {
      val s = genSelectorString(name,args)
      (s,TermName("_sel_" + s.replaceAll(":","_")))
    }

    private def genSelectorString(name: TermName, args: List[List[ValDef]]): String = args match {
      case Nil => name.toString
      case List(args) => name.toString +:(args.tail map {
        case ValDef(_,name,_,_) => name.toString
      }) mkString("",":",":")
      case x =>
        c.error(c.enclosingPosition,"multiple parameter lists not supported for ObjC classes")
        ???
    }

    private def genSelectorDef(selector: String, selectorTerm: TermName) =
      q"private lazy val $selectorTerm = _root_.objc.runtime.sel_registerName(scalanative.native.CQuote(StringContext($selector)).c())"

    private val clsTarget = TermName("_cls")

    private def genCall(target: TermName, selectorVal: TermName, argsList: List[List[ValDef]], rettype: Tree): Tree =
      genCall(q"$target",q"$selectorVal",argsList,rettype)

    private def genCall(target: Tree, selectorVal: Tree, argsList: List[List[ValDef]], rettype: Tree): Tree = {
      val argnames = argsList match {
        case Nil => Nil
        case List(args) => args map {
            case ValDef(_,name,_,_) => name
          }
        case x =>
          c.error(c.enclosingPosition,"multiple parameter lists not supported for ObjC classes")
          ???
      }
      q"_root_.objc.runtime.objc_msgSend($target,$selectorVal,..$argnames).cast[$rettype]"
    }

  }
}