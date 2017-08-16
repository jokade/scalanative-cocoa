//     Project: scalanative-cocoa
//      Module:
// Description:
package objc

import de.surfice.smacrotools.MacroAnnotationHandler
import objc.internal.ObjCMacroTools
import objc.runtime.id

import scala.language.experimental.macros
import scala.annotation.{StaticAnnotation, compileTimeOnly}
import scala.reflect.macros.{TypecheckException, whitebox}

@compileTimeOnly("enable macro paradise to expand macro annotations")
class ObjC() extends StaticAnnotation {
  def macroTransform(annottees: Any*): Any = macro ObjC.ObjCMacro.impl
}

@compileTimeOnly("enable macro paradise to expand macro annotations")
class ObjCClass() extends StaticAnnotation {
  def macroTransform(annottees: Any*): Any = macro ObjC.ObjCClassMacro.impl
}

class selector(name: String) extends StaticAnnotation

object ObjC {

  private[objc] class ObjCMacro(val c: whitebox.Context) extends BaseMacro {
    override def isObjCClass: Boolean = false
  }
  private[objc] class ObjCClassMacro(val c: whitebox.Context) extends BaseMacro {
    override def isObjCClass: Boolean = true
  }

  private[objc] abstract class BaseMacro
    extends MacroAnnotationHandler
    with ObjCMacroTools
    with ScalaDefined.Handler {

    import c.universe._

    def isObjCClass: Boolean

    implicit class ObjCData(var data: Map[String, Any]) {
      type Data = Map[String, Any]
      type Selectors = Seq[(String, TermName)]
      type Statements = Seq[Tree]

      // selectors to be defined in the companion object
      def selectors: Selectors = data.getOrElse("selectors", Nil).asInstanceOf[Selectors]

      def selectors_=(selectors: Selectors): Data = {
        data += "selectors" -> selectors
        data
      }

      // statements to be executed during ObjC class intialization for @ScalaDefined classes
      // (i.e. the code required to define the ObjC class when the first call to a class method is issued)
      def objcClassInits: Statements = data.getOrElse("objcClassInits", Nil).asInstanceOf[Statements]

      def objcClassInits_=(stmts: Statements): Data = {
        data += "objcClassInits" -> stmts
        data
      }
    }

    override val annotationName: String = "ObjC"
    override val supportsClasses: Boolean = true
    override val supportsTraits: Boolean = true
    override val supportsObjects: Boolean = true
    override val createCompanion: Boolean = true

    private val ccastImport = q"import scalanative.native.CCast"

    override def analyze: Analysis = super.analyze andThen {
      case (cls: TypeParts, data) =>
        // collect selectors to be emitted into companion object body
        val selectors = cls.body.collect {
          case DefDef(mods, name, types, args, rettype, Ident(TermName("extern"))) =>
            genSelector(name, args)
        }
        (cls, data.selectors = selectors)
      case default => default
    }

    override def transform: Transformation = super.transform andThen {
      /* transform class */
      case cls: ClassTransformData =>
        val transformedBody = cls.modParts.body.map {
          case t@DefDef(mods, name, types, args, rettype, Ident(TermName("extern"))) =>
            val selectorTerm = q"${cls.modParts.name.toTermName}.${genSelector(name, args)._2}"
            val call =
              if(isObjCClass)
                genCall(q"_cls", selectorTerm, args, rettype)
              else
                genCall(q"this", selectorTerm, args, rettype)
            DefDef(mods, name, types, args, rettype, call)
          case x => x
        }
//        val toString = q"""@inline override def toString(): String = ${cls.modParts.fullName}+"("+this.cast[objc.runtime.id]+")""""
        cls.updBody(ccastImport +: transformedBody) // :+ toString)

      /* transform companion object */
      case obj: ObjectTransformData =>
        // val containing the class reference
        val objcCls =
          q"""lazy val _cls = {
              ..${obj.data.objcClassInits}
              objc.runtime.objc_getClass(scalanative.native.CQuote(StringContext(${obj.modParts.name.toString})).c() )
              }"""
        // collect selector definitions from class
        val clsSelectors = obj.data.selectors
        // collect selector definitions and statements (transformed ObjC-calls and other statements)
        // from companion
        val (objSelectors, objStmts) = obj.modParts.body
          // filter out dummy _cls defs
//          .filter{
//            case DefDef(_, name, _, _, _, _) if name.toString == "_cls" => false
//            case _ => true
//          }
          .map {
          case t@DefDef(mods, name, types, args, rettype, Ident(TermName("extern"))) =>
            val sel = genSelector(name, args)
            val call = genCall(clsTarget, sel._2, args, rettype) //q"objc.objc_msgSend(_cls,$selectorVal,${paramNames(t)})"
            (Some(sel), DefDef(mods, name, types, args, rettype, call))
          case stmt => (None, stmt)
        }.unzip
        // create selector definitions
        val selectorDefs = (clsSelectors ++ objSelectors.collect { case Some(sel) => sel })
          .toMap
          .map(p => genSelectorDef(p._1, p._2))
        // new body = (transformed) statements ++ selector definitions
        val transformedBody = Seq(ccastImport, objcCls) ++ objStmts ++ selectorDefs
        obj.updBody(transformedBody)
      case default => default
    }

    private val extern = q"scala.scalanative.native.extern"


    private val clsTarget = TermName("_cls")

    private def genCall(target: TermName, selectorVal: TermName, argsList: List[List[ValDef]], rettype: Tree): Tree =
      genCall(q"$target", q"$selectorVal", argsList, rettype)

//    private def genCall(target: Tree, selectorVal: Tree, argsList: List[List[ValDef]], rettype: Tree): Tree = argsList match {
//      case Nil => q"""objc.helper.msgSend($target,$selectorVal)"""
//      case List(args) =>q"""objc.helper.msgSend($target,$selectorVal, ..$args)"""
//    }

    private def genCall(target: Tree, selectorVal: Tree, argsList: List[List[ValDef]], rettype: Tree): Tree = {
      val argnames = argsList match {
        case Nil => Nil
        case List(args) => args map {
          case t@ValDef(_, name, tpe, _) =>
            // TODO: do we really need this casting? without, the NIR compiler complains about a missing type tag
            castMode(tpe) match {
              case CastMode.TypeArg =>
                q"$name.asInstanceOf[AnyRef]"
              case _ => q"$name"
            }
//            name
        }
        case x =>
          c.error(c.enclosingPosition, "multiple parameter lists not supported for ObjC classes")
          ???
      }
      // TODO: check if intermediate casting is still required
      castMode(rettype) match {
        case CastMode.Direct =>
          q"_root_.objc.runtime.objc_msgSend($target,$selectorVal,..$argnames).cast[$rettype]"
        case CastMode.Object =>
          q"_root_.objc.runtime.objc_msgSend($target,$selectorVal,..$argnames).cast[Object].cast[$rettype]"
        case CastMode.InstanceOf | CastMode.TypeArg =>
          q"_root_.objc.runtime.objc_msgSend($target,$selectorVal,..$argnames).cast[Object].asInstanceOf[$rettype]"
      }
    }

    // As of scala-native 0.3.2, casting from unsigned (UInt, ULong, ...) to signed (CInt, CLong, ...)
    // is not supported. Hence we need to add an additional cast to Object in these cases.
    private def castMode(rettype: Tree): CastMode.Value = try{
      getQualifiedTypeName(rettype, withMacrosDisabled = true, dealias = true) match {
        case "Boolean" | "Int" | "Long" | "Short" |
             "scala.scalanative.native.UShort" => CastMode.Object
        case "Float" | "Double" =>
          CastMode.InstanceOf
        case x =>
          CastMode.Direct
      }
      // TODO: we shouldn't need this catch - can we avoid this Excpetion?
    } catch {
      case _: Throwable => CastMode.TypeArg
    }

    object CastMode extends Enumeration {
      val Direct = Value
      val Object = Value
      val InstanceOf = Value
      val TypeArg  = Value
    }

//    private def collectObjectClassMembers(cls: TypeParts) = {
//      val parents = cls.companion.map(_.parents).getOrElse(Nil)
//      parents.collect {
//        case AppliedTypeTree(tpe, args) =>
//          val parent = c.typecheck(tpe, c.TYPEmode, withMacrosDisabled = true)
//          parent.tpe.decls.collect {
//            case x if x.isMethod && x.name.toString != "$init$" => x.typeSignature
//          }
//      }.flatten
//    }

  }
}