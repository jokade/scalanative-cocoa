package cocoa.foundation

import de.surfice.smacrotools.MacroAnnotationHandler

import scala.annotation.{StaticAnnotation, compileTimeOnly}
import scala.language.experimental.macros
import scala.reflect.macros.whitebox

@compileTimeOnly("enable macro paradise to expand macro annotations")
class wrapDictionary extends StaticAnnotation {
  def macroTransform(annottees: Any*): Any = macro wrapDictionary.Macro.impl
}

object wrapDictionary {

   private[foundation] class Macro(val c: whitebox.Context)
    extends MacroAnnotationHandler {

     import c.universe._

     implicit class MacroData(var data: Map[String, Any]) {
       type Data = Map[String, Any]
       type Properties = Seq[ValDef]

       // selectors to be defined in the companion object
       def properties: Properties = data.getOrElse("properties", Nil).asInstanceOf[Properties]

       def properties_=(properties: Properties): Data = {
         data += "properties" -> properties
         data
       }
     }


     override val annotationName: String = "wrapDictionary"
     override val supportsClasses: Boolean = true
     override val supportsTraits: Boolean = false
     override val supportsObjects: Boolean = false
     override val createCompanion: Boolean = true

     private val nsDictType = typeOf[NSMutableDictionary[NSString,NSObject]]

     override def analyze: Analysis = super.analyze andThen {
       case (cls: ClassParts, data: Data) =>
         if( !cls.isCase )
           c.error(c.enclosingPosition,"@DictWrapper can only be used on case classes")
         val properties = cls.params.collect {
           case p: ValDef => p
         }
         (cls, data.properties = data.properties ++ properties)
       case x => x
     }

     override def transform: Transformation = super.transform andThen {
       case cls: ClassTransformData =>
          cls
            .updParents(Seq(q"$nsDictType"))
            .updModifiers(Modifiers(Flag.ABSTRACT))
            .updCtorParams(Nil)
            .updBody(Nil)

       case obj: ObjectTransformData =>
         import obj.modParts._
         val typeName = name.toTypeName
         val keys = obj.data.properties map genKeyDef
         val accessors = obj.data.properties flatMap genAccessors
         val apply = genApply(obj.data.properties,typeName)
         val transformedBody = keys :+ apply :+
           q"""
              implicit final class Wrapper(val o: $typeName) extends AnyVal {
                ..$accessors
              }
            """
          obj.updBody(transformedBody)
       case default => default
     }

     private def genKeyDef(prop: ValDef) = {
       val name = genKeyValName(prop)
       val key = Literal(Constant(prop.name.toString))
       q"""private val $name = cocoa.foundation.NSQuote(StringContext($key)).ns().retain()"""
     }

     private def genKeyValName(prop: ValDef): TermName = TermName("__key_"+prop.name)

     private def genAccessors(prop: ValDef): Seq[Tree] = {
       import prop.name
       val key = genKeyValName(prop)
       val tpe = c.typecheck(prop.tpt,c.TYPEmode).tpe
       val setterName = TermName(name.toString+"_$eq")
       val getter = q"def $name: $tpe = o.objectForKey_($key).asInstanceOf[$tpe]"
       val setter = q"def ${setterName}(value: $tpe): Unit = o.setObject_forKey_(value,$key)"
       Seq(getter,setter)
     }

     private def genApply(props: Seq[ValDef], tpe: TypeName): Tree = {
       val map = props.map(p => q"${genKeyValName(p)} -> ${p.name}" )
       q"def apply(..$props) = cocoa.foundation.NSMutableDictionary(..$map).asInstanceOf[$tpe]"
     }
   }
}
