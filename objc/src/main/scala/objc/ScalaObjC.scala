//     Project: scalanative-cocoa
//      Module: 
// Description: 
// Copyright (c) 2017. Distributed under the MIT License (see included LICENSE file). package objc
package objc

import de.surfice.smacrotools.MacroAnnotationHandler
import objc.internal.ObjCMacroTools

import scala.annotation.{StaticAnnotation, compileTimeOnly}
import scala.language.experimental.macros
import scala.reflect.macros.whitebox

@compileTimeOnly("enable macro paradise to expand macro annotations")
class ScalaObjC() extends StaticAnnotation {
    def macroTransform(annottees: Any*): Any = macro ScalaObjC.Macro.impl
}

object ScalaObjC {

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
        // all public defs, vals, and vars are exposed to ObjC
        val exposedMembers = getExposedMembers(cls.body)

        // collect all required ObjC selectors (every selector is stored as a lazy val on the companion object)
        val selectors = exposedMembers.map( m => genSelector(m.name,List(m.params)) ) ++
          // add setter selectors for public vars
          exposedMembers.filter(_.provideSetter).map{m =>
            val name = genSetterSelectorName(m.name)
            (name+":",TermName("__sel_"+name+"_"))
          }

        val updData = MacroData(data)
        updData.selectors = data.selectors ++ selectors
        updData.objcClassInits = allocDef(cls) ++
          objcClassDef(cls,exposedMembers) ++
          (exposedMembers map genExposedMethodProxy(cls)) ++
          (exposedMembers filter(_.provideSetter) map genExposedVarSetterProxy(cls))
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

    // generate code to define the ObjC proxy class
    private def objcClassDef(cls: ClassParts, exposedMembers: Seq[ExposedMember]) = Seq[Tree] {
      val clsName = cstring(cls.name.toString)
      // TODO: use actual parent instead of NSObject!
      val parent = q"cocoa.foundation.NSObject"

      val exposedVarSetters = exposedMembers
        .filter(_.provideSetter)
        .map(m => registerExposedMember(m.copy(name = TermName(genSetterSelectorName(m.name)), params = List(ValDef(null,m.name,null,null)))) )

      q"""import scalanative.native._
          import objc.runtime._
          import objc.helper._

          val newCls = objc_allocateClassPair($parent.__cls,$clsName,0)
          objc.helper.addScalaInstanceIVar(newCls)
          val metaCls = object_getClass(newCls)
          class_addMethod(metaCls,sel_alloc,CFunctionPtr.fromFunction1(__alloc),c"@:")
          ..${exposedMembers map registerExposedMember}
          ..$exposedVarSetters
          objc_registerClassPair(newCls)
       """
    }

    private def allocDef(cls: ClassParts) = Seq[Tree] {
      val clsName = cls.name
      val retType = cls.name.toTypeName // q"$clsName"
      q"""def __alloc(clsObj: objc.runtime.id): objc.ObjCProxy[$retType] = {
            import objc.helper._
            val ref = objc.helper.msgSendSuper(clsObj,sel_alloc)
            val proxy = ref.cast[objc.ObjCProxy[$clsName]]
            val instance = new $clsName(proxy)
            setScalaInstanceIVar(ref,instance)
            proxy
          }
       """
    }

    private def registerExposedMember(m: ExposedMember): Tree = {
      val typeEncoding = cstring( "@:" + m.params.map(genTypeEncoding).mkString )
      q"""class_addMethod(newCls,${genSelector(m.name,List(m.params))._2},${exposedMethodCast(m)},$typeEncoding)"""
    }

    private def exposedMethodCast(m: ExposedMember): Tree = m.params.size match {
      case 0 => q"""CFunctionPtr.fromFunction2(${methodProxyName(m)})"""
      case 1 => q"""CFunctionPtr.fromFunction3(${methodProxyName(m)})"""
      case 2 => q"""CFunctionPtr.fromFunction4(${methodProxyName(m)})"""
      case 3 => q"""CFunctionPtr.fromFunction5(${methodProxyName(m)})"""
      case 4 => q"""CFunctionPtr.fromFunction6(${methodProxyName(m)})"""
      case 5 => q"""CFunctionPtr.fromFunction7(${methodProxyName(m)})"""
      case 6 => q"""CFunctionPtr.fromFunction8(${methodProxyName(m)})"""
      case 7 => q"""CFunctionPtr.fromFunction9(${methodProxyName(m)})"""
      case 8 => q"""CFunctionPtr.fromFunction10(${methodProxyName(m)})"""
      case 9 => q"""CFunctionPtr.fromFunction11(${methodProxyName(m)})"""
      case 10 => q"""CFunctionPtr.fromFunction12(${methodProxyName(m)})"""
      case 11 => q"""CFunctionPtr.fromFunction13(${methodProxyName(m)})"""
      case 12 => q"""CFunctionPtr.fromFunction14(${methodProxyName(m)})"""
      case 13 => q"""CFunctionPtr.fromFunction15(${methodProxyName(m)})"""
      case 14 => q"""CFunctionPtr.fromFunction16(${methodProxyName(m)})"""
      case 15 => q"""CFunctionPtr.fromFunction17(${methodProxyName(m)})"""
      case 16 => q"""CFunctionPtr.fromFunction18(${methodProxyName(m)})"""
      case 17 => q"""CFunctionPtr.fromFunction19(${methodProxyName(m)})"""
      case 18 => q"""CFunctionPtr.fromFunction20(${methodProxyName(m)})"""
      case 19 => q"""CFunctionPtr.fromFunction21(${methodProxyName(m)})"""
      case 20 => q"""CFunctionPtr.fromFunction22(${methodProxyName(m)})"""
      case x =>
        c.error(c.enclosingPosition,s"Scala-defined ObjC methods with more than 20 parameters are not supported")
        ???
    }


    private def getExposedMembers(body: Seq[Tree]): Seq[ExposedMember] = body collect {
      case m: DefDef if isPublic(m.mods) =>
        ExposedMember(m.name,m.vparamss.headOption.getOrElse(Nil),m.vparamss.nonEmpty)
      case p: ValDef if isPublic(p.mods) =>
        val tpe =
          if(p.tpt.nonEmpty)
            c.typecheck(p.tpt,c.TYPEmode,withMacrosDisabled = true).tpe.typeSymbol
          else
            c.typecheck(p.rhs,c.TERMmode,withMacrosDisabled = true).tpe.typeSymbol
        ExposedMember(p.name,Nil,hasParamList = false, provideSetter = p.mods.hasFlag(Flag.MUTABLE), tpe = Some(tpe) )
    }


    private def methodProxyName(m: ExposedMember): TermName =
    if(m.provideSetter) methodProxyName(m.name.toString)
    else {
      val name = m.params.map(_.name).mkString(m.name.toString+"_","_","")
      methodProxyName(name)
    }
    private def methodProxyName(name: String): TermName = TermName("__m_"+name)

    private def genExposedMethodProxy(cls: ClassParts)(m: ExposedMember) = {
      import m._
      val call = if(hasParamList) q"o.$name(..${paramNames(params)})" else q"o.$name"
        q"""def ${methodProxyName(m)}(self: objc.runtime.id, sel: objc.runtime.SEL, ..$params) = {
            val o = objc.helper.getScalaInstanceIVar[${cls.name}](self)
            $call
          }
       """
    }

    private def genExposedVarSetterProxy(cls: ClassParts)(m: ExposedMember) = {
      import m._
      q"""def ${methodProxyName(genSetterSelectorName(m.name))}(self: objc.runtime.id, sel: objc.runtime.SEL, value: ${m.tpe.get}) = {
            val o = objc.helper.getScalaInstanceIVar[${cls.name}](self)
            o.$name = value
          }
       """
    }

    private def genTypeEncoding(p: ValDef) = "@"

    private val _extern = q"scalanative.native.extern"

    private def isPublic(mods: Modifiers): Boolean =
      !( mods.hasFlag(Flag.PROTECTED) || mods.hasFlag(Flag.PRIVATE) )


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

    private def genSetterSelectorName(name: TermName): String =
      "set" + name.toString.head.toUpper + name.toString.tail

    object CastMode extends Enumeration {
      val Direct = Value
      val Object = Value
      val InstanceOf = Value
      val TypeArg  = Value
    }

    case class ExposedMember(name: TermName,
                             params: List[ValDef],
                             hasParamList: Boolean,
                             tpe: Option[Symbol] = None,
                             provideSetter: Boolean = false)

  }

}
