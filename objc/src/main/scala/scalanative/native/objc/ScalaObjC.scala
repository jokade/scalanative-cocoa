package scala.scalanative.native.objc

import de.surfice.smacrotools.MacroAnnotationHandler

import scala.annotation.{StaticAnnotation, compileTimeOnly}
import scala.language.experimental.macros
import scala.reflect.macros.whitebox
import scala.scalanative.native.objc.runtime.ObjCObject

@compileTimeOnly("enable macro paradise to expand macro annotations")
class ScalaObjC() extends StaticAnnotation {
  def macroTransform(annottees: Any*): Any = macro ScalaObjC.Macro.impl
}

object ScalaObjC {

  private[native] class Macro(val c: whitebox.Context)
    extends MacroAnnotationHandler
      with ObjCMacroTools {
    import c.universe._

    override val annotationName: String = "SNDefined"
    override val supportsClasses: Boolean = true
    override val supportsTraits: Boolean = false
    override val supportsObjects: Boolean = true
    override val createCompanion: Boolean = true

    val tpeRetain = typeOf[retain]

    override def analyze: Analysis = super.analyze andThen {
      case (cls: ClassParts, data: Data) =>
        // all public defs, vals, and vars are exposed to ObjC
        val exposedMembers = getExposedMembers(cls.body)

        // collect all required ObjC selectors (every selector is stored as a lazy val on the companion object)
        val selectors = exposedMembers.map( _.selector ) ++
          // add setter selectors for public vars
          exposedMembers.filter(_.provideSetter).map{m =>
            val name = genSetterSelectorName(m.name)
            (name,genSelectorTerm(name)) //TermName("__sel_"+name))
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
              import scalanative.native.objc
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
        val transformedBody = Seq(objcCls) ++ selectorDefs ++ objStmts ++ obj.data.additionalCompanionStmts
        obj.updBody(transformedBody)
      case default => default
    }

    // generate code to define the ObjC proxy class
    private def objcClassDef(cls: ClassParts, exposedMembers: Seq[ExposedMember]) = Seq[Tree] {
      val clsName = cstring(cls.name.toString)
      val parent = c.typecheck(cls.parents.head,c.TYPEmode).tpe match {
        case p if p =:= weakTypeOf[Object] => q"scalanative.native.objc.defaultRootObject"
        case p if p <:< weakTypeOf[ObjCObject] => q"${p.typeSymbol.companion}.__cls"
        case _ =>
          error("@ScalaObjC class must be a descendant of ObjCObject")
          ???
      }

      val exposedVarSetters = exposedMembers
        .filter(_.provideSetter)
        .map(m =>
          registerExposedMember(
            m.copy(name = TermName(genSetterSelectorName(m.name)), params = List(ValDef(null,m.name,null,null)), isSetter = true)) )

      q"""import scalanative.native._
          import scalanative.unsigned._
          import scalanative.unsafe._
          import objc.runtime._
          import objc.helper._

          val newCls = objc_allocateClassPair($parent,$clsName,0.toULong)
          objc.helper.addScalaInstanceIVar(newCls)
          val metaCls = object_getClass(newCls)
          class_addMethod(metaCls,sel_allocWithZone,CFuncPtr3.fromScalaFunction(__allocWithZone),c"@:@")
          ..${exposedMembers map registerExposedMember}
          ..$exposedVarSetters
          objc_registerClassPair(newCls)
       """
    }
    //class_addMethod(metaCls,sel_alloc,CFuncPtr.fromFunction1(__alloc),c"@:")

    private def allocDef(cls: ClassParts) = Seq[Tree] {
      val clsName = cls.name
      val retType = cls.name.toTypeName // q"$clsName"
      val proxyType = cls.params match {
        case List(ValDef(_,_,tpt,_)) => tpt
        case _ =>
          c.error(c.enclosingPosition,s"ScalaObjC classes must have exactly one constructor argument (self)")
          ???
      }
      q"""def __allocWithZone(clsObj: objc.runtime.id, sel: objc.runtime.SEL, zone: objc.runtime.id): $proxyType = {
            import scalanative.native.objc
            import objc.helper._
            val ref = objc.helper.msgSendSuper1(clsObj,sel_allocWithZone,zone)
            val proxy = ref.asInstanceOf[$proxyType]
            val instance = new $clsName(proxy)
            setScalaInstanceIVar(ref,instance)
            proxy
          }
       """
    }

    private def registerExposedMember(m: ExposedMember): Tree = {
      val typeEncoding = cstring( genTypeEncoding(m) )
      q"""class_addMethod(newCls,${m.selector._2},${exposedMethodCast(m)},$typeEncoding)"""
    }

    private def exposedMethodCast(m: ExposedMember): Tree = m.params.size match {
      case 0 => q"""CFuncPtr2.fromScalaFunction(${methodProxyName(m)})"""
      case 1 => q"""CFuncPtr3.fromScalaFunction(${methodProxyName(m)})"""
      case 2 => q"""CFuncPtr4.fromScalaFunction(${methodProxyName(m)})"""
      case 3 => q"""CFuncPtr5.fromScalaFunction(${methodProxyName(m)})"""
      case 4 => q"""CFuncPtr6.fromScalaFunction(${methodProxyName(m)})"""
      case 5 => q"""CFuncPtr7.fromScalaFunction(${methodProxyName(m)})"""
      case 6 => q"""CFuncPtr8.fromScalaFunction(${methodProxyName(m)})"""
      case 7 => q"""CFuncPtr9.fromScalaFunction(${methodProxyName(m)})"""
      case 8 => q"""CFuncPtr10.fromScalaFunction(${methodProxyName(m)})"""
      case 9 => q"""CFuncPtr11.fromScalaFunction(${methodProxyName(m)})"""
      case 10 => q"""CFuncPtr12.fromScalaFunction(${methodProxyName(m)})"""
      case 11 => q"""CFuncPtr13.fromScalaFunction(${methodProxyName(m)})"""
      case 12 => q"""CFuncPtr14.fromScalaFunction(${methodProxyName(m)})"""
      case 13 => q"""CFuncPtr15.fromScalaFunction(${methodProxyName(m)})"""
      case 14 => q"""CFuncPtr16.fromScalaFunction(${methodProxyName(m)})"""
      case 15 => q"""CFuncPtr17.fromScalaFunction(${methodProxyName(m)})"""
      case 16 => q"""CFuncPtr18.fromScalaFunction(${methodProxyName(m)})"""
      case 17 => q"""CFuncPtr19.fromScalaFunction(${methodProxyName(m)})"""
      case 18 => q"""CFuncPtr20.fromScalaFunction(${methodProxyName(m)})"""
      case 19 => q"""CFuncPtr21.fromScalaFunction(${methodProxyName(m)})"""
      case 20 => q"""CFuncPtr22.fromScalaFunction(${methodProxyName(m)})"""
      case x =>
        c.error(c.enclosingPosition,s"Scala-defined ObjC methods with more than 20 parameters are not supported")
        ???
    }


    private def getExposedMembers(body: Seq[Tree]): Seq[ExposedMember] = body collect {
      case m: DefDef if isPublic(m.mods) =>
        val returnType = getType(m.tpt)
        ExposedMember(m.name,m.vparamss.headOption.getOrElse(Nil),m.vparamss.nonEmpty, tpe = Some(returnType), customSelector = findCustomSelector(m.mods.annotations))
      case p: ValDef if isPublic(p.mods) =>
        val tpe =
          if(p.tpt.nonEmpty)
            c.typecheck(p.tpt,c.TYPEmode,withMacrosDisabled = true).tpe
          else
            c.typecheck(p.rhs,c.TERMmode,withMacrosDisabled = true).tpe
        ExposedMember(p.name,Nil,hasParamList = false, provideSetter = p.mods.hasFlag(Flag.MUTABLE), tpe = Some(tpe), retain = hasAnnotation(p.mods.annotations,tpeRetain) )
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
      q"""def ${methodProxyName(m)}(self: scalanative.native.objc.runtime.id, sel: scalanative.native.objc.runtime.SEL, ..$params) = {
            val o = scalanative.native.objc.helper.getScalaInstanceIVar[${cls.name}](self)
            $call
          }
       """
    }

    private def genExposedVarSetterProxy(cls: ClassParts)(m: ExposedMember) = {
      import m._
      def setValue =
        if(m.retain)
          q"""if(o.$name != null)
                o.$name.release()
              o.$name = value.retain()
           """
        else
        q"""o.$name = value"""

      q"""def ${methodProxyName(genSetterSelectorName(m.name))}(self: scalanative.native.objc.runtime.id, sel: scalanative.native.objc.runtime.SEL, value: ${m.tpe.get}) = {
            val o = scalanative.native.objc.helper.getScalaInstanceIVar[${cls.name}](self)
            $setValue
          }
       """
    }

    private def genTypeEncoding(m: ExposedMember): String = {
      val returnType =
        if(m.isSetter) "v"
        else genTypeCode(m.tpe)

      returnType + "@:" + m.params.map(genTypeCode).mkString
    }

    private def genTypeCode(p: ValDef): String = genTypeCode(p.tpe)

    private def genTypeCode(tpe: Option[Type]): String =
      if(tpe.isEmpty) "v"
      else genTypeCode(tpe.get)

    private def genTypeCode(tpe: Type): String = "@"

    private val _extern = q"scalanative.unsafe.extern"

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
          q"scalanative.native.objc.runtime.objc_msgSend($target,$selectorVal,..$argnames).asInstanceOf[$rettype]"
        case CastMode.Object =>
          q"scalanative.native.objc.runtime.objc_msgSend($target,$selectorVal,..$argnames).asInstanceOf[Object].asInstanceOf[$rettype]"
        case CastMode.InstanceOf | CastMode.TypeArg =>
          q"scalanative.native.objc.runtime.objc_msgSend($target,$selectorVal,..$argnames).asInstanceOf[Object].asInstanceOf[$rettype]"
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
      "set" + name.toString.head.toUpper + name.toString.tail + ":"

    object CastMode extends Enumeration {
      val Direct = Value
      val Object = Value
      val InstanceOf = Value
      val TypeArg  = Value
    }

    def findCustomSelector(annots: Seq[Tree]): Option[String] = {
      findAnnotation(annots,"selector")
        .map(t => extractAnnotationParameters(t,Seq("name")) )
        .map(_.apply("name"))
        .map(t => extractStringConstant(t.get).get)
    }

    case class ExposedMember(name: TermName,
                             params: List[ValDef],
                             hasParamList: Boolean,
                             tpe: Option[Type] = None,
                             provideSetter: Boolean = false,
                             customSelector: Option[String] = None,
                             retain: Boolean = true,
                             isSetter: Boolean = false) {
      lazy val selector: (String,TermName) = customSelector match {
        case Some(sel) => (sel,genSelectorTerm(sel))
        case _ => genSelector(name,List(params))
      }
    }

  }

}
