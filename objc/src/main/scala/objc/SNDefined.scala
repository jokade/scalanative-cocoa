//     Project: scalanative-cocoa
//      Module: 
// Description: 
// Copyright (c) 2017. Distributed under the MIT License (see included LICENSE file). package objc
package objc

import de.surfice.smacrotools.MacroAnnotationHandler
import objc.internal.ObjCMacroTools

import scala.annotation.{StaticAnnotation, compileTimeOnly}
import scala.reflect.macros.whitebox
import scala.language.experimental.macros

@compileTimeOnly("enable macro paradise to expand macro annotations")
class SNDefined() extends StaticAnnotation {
    def macroTransform(annottees: Any*): Any = macro SNDefined.Macro.impl
}

object SNDefined {

  private[objc] class Macro(val c: whitebox.Context)
    extends MacroAnnotationHandler
      with ObjCMacroTools {
    import c.universe._

    override val annotationName: String = "SNDefined"
    override val supportsClasses: Boolean = true
    override val supportsTraits: Boolean = false
    override val supportsObjects: Boolean = true
    override val createCompanion: Boolean = true

    override def analyze: Analysis = super.analyze andThen {
      case (cls: ClassParts, data: Data) =>
        val exposedMethods = getExposedMethods(cls.body)
        val selectors = exposedMethods map ( m => genSelector(m.name,m.vparamss) )
        val updData = MacroData(data)
        updData.selectors = data.selectors ++ selectors
        updData.objcClassInits = allocDef(cls) ++ objcClassDef(cls,exposedMethods) ++
        (exposedMethods map genExposedMethodProxy(cls)) //++ allocDef(cls)// :+ genInit(cls)
//        updData.additionalCompanionStmts = data.additionalCompanionStmts ++
//          (exposedMethods map genExposedMethodProxy(cls)) //++ allocDef(cls)// :+ genInit(cls)
        updData.replaceClassBody = Some(replaceClassBody(exposedMethods))
        (cls,updData.data)
      case x => x
    }


    override def transform: Transformation = super.transform andThen {
      /* transform companion object */
      case obj: ObjectTransformData =>
        val objcCls =
          q"""lazy val __cls = {
              ..${obj.data.objcClassInits}
              objc.runtime.objc_getClass(${cstring(obj.modParts.name.toString)})
              }"""
        // collect selector definitions from class and companion
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
        val selectorDefs = (clsSelectors ++ objSelectors.collect { case Some(sel) => sel })
          .toMap
          .map(p => genSelectorDef(p._1, p._2))
        val transformedBody = Seq(ccastImport, objcCls) ++ selectorDefs ++ objStmts ++ obj.data.additionalCompanionStmts
        obj.updBody(transformedBody)
      case default => default
    }

    private def objcClassDef(cls: ClassParts, exposedMethods: Seq[DefDef]) = Seq[Tree] {
      val clsName = cstring(cls.name.toString)
      // TODO: use actual parent instead of NSObject!
      val parent = q"cocoa.foundation.NSObject"

      q"""import scalanative.native.CQuote
          import objc.runtime._
          import objc.helper._

          val newCls = objc_allocateClassPair($parent.__cls,$clsName,0)
          objc.helper.addScalaInstanceIVar(newCls)
          val metaCls = object_getClass(newCls)
          class_addMethod(metaCls,sel_alloc,CFunctionPtr.fromFunction1(__alloc),c"@:")
          ..${exposedMethods map registerExposedMethod}
          objc_registerClassPair(newCls)
       """
    }

    private def allocDef(cls: ClassParts) = Seq[Tree] {
      val clsName = cls.name
      val retType = cls.name.toTypeName // q"$clsName"
      q"""def __alloc(clsObj: id): objc.ObjCProxy[$retType] = {
            import objc.helper._
            val ref = objc.helper.msgSendSuper(clsObj,sel_alloc)
            val proxy = ref.cast[objc.ObjCProxy[$clsName]]
            val instance = new $clsName(proxy)
            setScalaInstanceIVar(ref,instance)
            proxy
          }
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
      q"""def ${methodProxyName(m)}(self: id): ${m.tpt} = {
          println("proxy called")
            val o = objc.helper.getScalaInstanceIVar[${cls.name}](self)
            o.${m.name}()
          }
       """
    }

//    private def genInit(cls: ClassParts) =
//      q"""def __init(self: id): Any = {
//          println("Initializing")
//          val o = new ${cls.name}
//          println("done")
//          objc.helper.setScalaInstanceIVar(self,o)
//          self
//        }
//     """

    private val _extern = q"scalanative.native.extern"

    private def replaceClassBody(exposedMethods: Seq[DefDef]): Seq[Tree] = exposedMethods map {
      case DefDef(mods,name,tparams,args,tpt,rhs) =>
        DefDef(mods,name,tparams,args,tpt,_extern)
    }

//    private def genActualClassImpl(cls: ClassParts): Tree = {
//      import cls._
//      q"""$modifiers class $name[..$tparams] $ctorMods ( ..$params )
//                       extends ..$parents { $self => ..$body }
//       """
//    }

    private def isPublic(mods: Modifiers): Boolean = !(
      mods.hasFlag(Flag.PROTECTED) || mods.hasFlag(Flag.PROTECTED)
      )


    private def genCall(target: TermName, selectorVal: TermName, argsList: List[List[ValDef]], rettype: Tree): Tree =
      genCall(q"$target", q"$selectorVal", argsList, rettype)


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
