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
import scala.scalanative.native.CFunctionPtr3

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
    with ObjCMacroTools {

    import c.universe._

    def isObjCClass: Boolean

    override val annotationName: String = "ObjC"
    override val supportsClasses: Boolean = true
    override val supportsTraits: Boolean = true
    override val supportsObjects: Boolean = true
    override val createCompanion: Boolean = true

//    val tAny = weakTypeOf[Any]
//    val tPtrByte = weakTypeOf[scalanative.native.Ptr[Byte]]
//    val msgSendPtr = q"_root_.objc.helper.objc_msgSendPtr"

    override def analyze: Analysis = super.analyze andThen {
      case (cls: TypeParts, data) =>
        // collect selectors to be emitted into companion object body
        val selectors = cls.body.collect {
          case DefDef(mods, name, types, args, rettype, rhs) if isExtern(rhs) =>
            genSelector(name, args)
        }
        (cls, data.selectors = data.selectors ++ selectors)
      case default => default
    }

    override def transform: Transformation = super.transform andThen {
      /* transform class */
      case cls: ClassTransformData =>
        val transformedBody =
          (if(cls.data.replaceClassBody.isDefined)
            cls.data.replaceClassBody.get
          else
            cls.modParts.body)
            .map {
              case t@DefDef(mods, name, types, args, rettype, rhs) if isExtern(rhs)  =>
                val selectorTerm = q"${cls.modParts.name.toTermName}.${genSelector(name, args)._2}"
                val call =
                  if(isObjCClass)
                    genCall(q"__cls", selectorTerm, args, rettype)
                  else
                    genCall(q"this", selectorTerm, args, rettype)
                DefDef(mods, name, types, args, rettype, call)
              case x => x
            }

        cls
          .updBody(ccastImport +: transformedBody)
          .updCtorMods(Modifiers(Flag.PROTECTED))  // ensure that the class can't be instatiated using new

      /* transform companion object */
      case obj: ObjectTransformData =>
        // val containing the class reference
        val objcCls =
          q"""lazy val __cls = {
              ..${obj.data.objcClassInits}
              objc.runtime.objc_getClass(scalanative.native.CQuote(StringContext(${obj.modParts.name.toString})).c() )
              }"""
        // collect selector definitions from class
        val clsSelectors = obj.data.selectors
        // collect selector definitions and statements (transformed ObjC-calls and other statements)
        // from companion
        val (objSelectors, objStmts) = obj.modParts.body
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
        val transformedBody = (Seq(ccastImport) ++ selectorDefs :+ objcCls) ++ objStmts ++ obj.data.additionalCompanionStmts
        obj.updBody(transformedBody)
      case default => default
    }


    private def isExtern(rhs: Tree): Boolean = rhs match {
      case Ident(TermName(id)) =>
        id == "extern"
      case Select(_,name) =>
        name.toString == "extern"
      case x =>
        false
    }


    private def genCall(target: TermName, selectorVal: TermName, argsList: List[List[ValDef]], rettype: Tree): Tree =
      genCall(q"$target", q"$selectorVal", argsList, rettype)


    private def genCall(target: Tree, selectorVal: Tree, argsList: List[List[ValDef]], rettype: Tree): Tree = {
      val argnames = argsList match {
        case Nil => Nil
        case FirstArgList(args,_) => args map {
          case t@ValDef(_, name, tpe, _) =>
            // TODO: do we really need this casting? without, the NIR compiler complains about a missing type tag
            castMode(tpe) match {
              case CastMode.TypeArg =>
                q"$name.asInstanceOf[AnyRef]"
              case _ => q"$name"
            }
        }
        case x =>
          println(x)
          c.error(c.enclosingPosition, "multiple parameter lists not supported for ObjC classes")
          ???
      }

      val call = argsList match {
        case Nil => q"_root_.objc.helper.objc_msgSend0($target,$selectorVal)"
        case FirstArgList(args,_) =>
          val (names,types) = (args map {case ValDef(_, name, tpe, _) => (name,tpe)}).unzip
          args.size match {

            case 0  => q"_root_.objc.helper.objc_msgSend0($target,$selectorVal)"
            case 1  => q"_root_.objc.helper.objc_msgSend1[..$types]($target,$selectorVal,..$names)"
            case 2  => q"_root_.objc.helper.objc_msgSend2[..$types]($target,$selectorVal,..$names)"
            case 3  => q"_root_.objc.helper.objc_msgSend3[..$types]($target,$selectorVal,..$names)"
            case 4  => q"_root_.objc.helper.objc_msgSend4[..$types]($target,$selectorVal,..$names)"
            case 5  => q"_root_.objc.helper.objc_msgSend5[..$types]($target,$selectorVal,..$names)"
            case 6  => q"_root_.objc.helper.objc_msgSend6[..$types]($target,$selectorVal,..$names)"
            case 7  => q"_root_.objc.helper.objc_msgSend7[..$types]($target,$selectorVal,..$names)"
            case 8  => q"_root_.objc.helper.objc_msgSend8[..$types]($target,$selectorVal,..$names)"
            case 9  => q"_root_.objc.helper.objc_msgSend9[..$types]($target,$selectorVal,..$names)"
            case 10 => q"_root_.objc.helper.objc_msgSend10[..$types]($target,$selectorVal,..$names)"
            case n => error(s"unsupported number of arguments: $n"); ???
          }
      }
//      val call = q"_root_.objc.runtime.objc_msgSend($target,$selectorVal,..$argnames)"
//        argnames.size match {
//        case 0 => q"_root_.objc.runtime.objc_msgSend($target,$selectorVal)"
//        case 1 => q"_root_.objc.runtime.objc_msgSend1($target,$selectorVal,..$argnames)"
//        case 2 => q"_root_.objc.runtime.objc_msgSend2($target,$selectorVal,..$argnames)"
//        case 3 => q"_root_.objc.runtime.objc_msgSend3($target,$selectorVal,..$argnames)"
//        case 4 => q"_root_.objc.runtime.objc_msgSend4($target,$selectorVal,..$argnames)"
//        case 5 => q"_root_.objc.runtime.objc_msgSend5($target,$selectorVal,..$argnames)"
//        case 6 => q"_root_.objc.runtime.objc_msgSend6($target,$selectorVal,..$argnames)"
//        case 7 => q"_root_.objc.runtime.objc_msgSend7($target,$selectorVal,..$argnames)"
//        case 8 => q"_root_.objc.runtime.objc_msgSend8($target,$selectorVal,..$argnames)"
//        case 9 => q"_root_.objc.runtime.objc_msgSend9($target,$selectorVal,..$argnames)"
//        case 10 => q"_root_.objc.runtime.objc_msgSend10($target,$selectorVal,..$argnames)"
//      }
      // TODO: check if intermediate casting is still required
      castMode(rettype) match {
        case CastMode.Direct =>
          q"$call.cast[$rettype]"
        case CastMode.Object =>
          q"$call.cast[Object].cast[$rettype]"
        case CastMode.InstanceOf | CastMode.TypeArg =>
          q"$call.cast[Object].asInstanceOf[$rettype]"
      }
    }

    // As of scala-native 0.3.2, casting from unsigned (UInt, ULong, ...) to signed (CInt, CLong, ...)
    // is not supported. Hence we need to add an additional cast to Object in these cases.
    private def castMode(rettype: Tree): CastMode.Value = try{
      getQualifiedTypeName(rettype, withMacrosDisabled = true, dealias = true) match {
        case "Boolean" | "Int" | "Long" | "Short" |
             "scala.scalanative.native.UShort" =>
          CastMode.Object
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

  }
}