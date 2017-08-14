//     Project: scalanative-cocoa
//      Module:
// Description:
package objc

import de.surfice.smacrotools.MacroAnnotationHandler
import objc.runtime.id

import scala.language.experimental.macros
import scala.annotation.{StaticAnnotation, compileTimeOnly}
import scala.reflect.macros.whitebox

@compileTimeOnly("enable macro paradise to expand macro annotations")
class ObjC() extends StaticAnnotation {
  def macroTransform(annottees: Any*): Any = macro ObjC.Macro.impl
}

class selector(name: String) extends StaticAnnotation

object ObjC {

  def idToString(id: Any): String = ""

  private[objc] class Macro(val c: whitebox.Context) extends MacroAnnotationHandler {
    import c.universe._

    override val annotationName: String = "ObjC"
    override val supportsClasses: Boolean = true
    override val supportsTraits: Boolean = true
    override val supportsObjects: Boolean = true
    override val createCompanion: Boolean = true

    private val ccastImport = q"import scalanative.native.CCast"

    override def analyze: Analysis = super.analyze andThen {
      case (cls: CommonParts, data) =>
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
            val selectorTerm = q"${cls.origParts.name.toTermName}.${genSelector(name,args)._2}"
            val call = genCall(q"this",selectorTerm,args,rettype)
            DefDef(mods,name,types,args,rettype,call)
          case x => x
        }
        val toString = q"""@inline override def toString(): String = ${cls.origParts.fullName}+"("+this.cast[objc.runtime.id]+")""""
        cls.updBody(ccastImport +: transformedBody :+ toString)

        /* transform companion object */
      case obj: ObjectTransformData =>
        // val containing the class reference
        val objcCls =
          q"""private lazy val _cls = _root_.objc.runtime.objc_getClass(
              scalanative.native.CQuote(StringContext(${obj.origParts.name.toString})).c() )
           """
        // collect selector definitions from class
        val clsSelectors = obj.data("selectors").asInstanceOf[Iterable[(String,TermName)]]
        // collect selector definitions and statements (transformed ObjC-calls and other statements)
        // from companion
        val (objSelectors,objStmts) = obj.origParts.body.map{
          case t @ DefDef(mods,name,types,args,rettype,Ident(TermName("extern"))) =>
            val sel = genSelector(name,args)
            val call = genCall(clsTarget,sel._2,args,rettype) //q"objc.objc_msgSend(_cls,$selectorVal,${paramNames(t)})"
            (Some(sel),DefDef(mods,name,types,args,rettype,call))
          case stmt => (None,stmt)
        }.unzip
        // create selector definitions
        val selectorDefs = (clsSelectors ++ objSelectors.collect{case Some(sel) => sel})
          .toMap
          .map( p => genSelectorDef(p._1,p._2) )
        // new body = (transformed) statements ++ selector definitions
        val transformedBody = Seq(ccastImport, objcCls) ++ objStmts ++ selectorDefs
        obj.updBody(transformedBody)
      case default => default
    }

    private val extern = q"scala.scalanative.native.extern"

    private def genSelector(name: TermName, args: List[List[ValDef]]): (String,TermName) = {
      val s = genSelectorString(name,args)
      (s,TermName("_sel_" + s.replaceAll(":","_")))
    }

    private def genSelectorString(name: TermName, args: List[List[ValDef]]): String = args match {
      case Nil | List(Nil) => name.toString
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
      // TODO: check if intermediate casting is still required
      castMode(rettype) match {
        case CastMode.Direct =>
          q"_root_.objc.runtime.objc_msgSend($target,$selectorVal,..$argnames).cast[$rettype]"
        case CastMode.Object =>
          q"_root_.objc.runtime.objc_msgSend($target,$selectorVal,..$argnames).cast[Object].cast[$rettype]"
        case CastMode.Float =>
          q"_root_.objc.runtime.objc_msgSend($target,$selectorVal,..$argnames).toFloat"
      }
    }

    // As of scala-native 0.3.2, casting from unsigned (UInt, ULong, ...) to signed (CInt, CLong, ...)
    // is not supported. Hence we need to add an additional cast to Object in these cases.
    private def castMode(rettype: Tree): CastMode.Value = getQualifiedTypeName(rettype,withMacrosDisabled = true, dealias = true) match {
      case "Boolean" | "Int" | "Long" | "Short" |
           "scala.scalanative.native.UShort" => CastMode.Object
      case "Float" =>
//        println(rettype)
        CastMode.Float
      case x =>
//        println(x)
        CastMode.Direct
    }

    object CastMode extends Enumeration {
      val Direct = Value
      val Object = Value
      val Float =  Value
    }
  }
}