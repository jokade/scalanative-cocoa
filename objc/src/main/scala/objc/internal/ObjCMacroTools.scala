//     Project: scalanative-cocoa
//      Module: ObjC
// Description:
package objc.internal

import de.surfice.smacrotools.CommonMacroTools
import scala.language.reflectiveCalls

trait ObjCMacroTools extends CommonMacroTools {
  import c.universe._

  implicit class MacroData(var data: Map[String, Any]) {
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

    def additionalCompanionStmts: Statements = data.getOrElse("compStmts", Nil).asInstanceOf[Statements]
    def additionalCompanionStmts_=(stmts: Statements): Data = {
      data += "compStmts" -> stmts
      data
    }

    def replaceClassBody: Option[Statements] = data.getOrElse("replaceClsBody", None).asInstanceOf[Option[Statements]]
    def replaceClassBody_=(stmts: Option[Statements]): Data = {
      data += "replaceClsBody" -> stmts
      data
    }
  }

  protected[this] val ccastImport = q"import scalanative.native.CCast"
  protected[this] val clsTarget = TermName("__cls")

  protected[this] def cstring(s: String) = q"scalanative.native.CQuote(StringContext($s)).c()"

  protected[this] def genSelector(name: TermName, args: List[List[ValDef]]): (String, TermName) = {
    val s = genSelectorString(name, args)
    (s, genSelectorTerm(s))
  }

  protected[this] def genSelectorTerm(name: TermName, args: List[List[ValDef]]): TermName =
    genSelectorTerm(genSelectorString(name,args))

  protected[this] def genSelectorTermString(selectorString: String): String =
    "__sel_"+selectorString.replaceAll(":","_")

  protected[this] def genSelectorTerm(selectorString: String): TermName = {
    TermName(genSelectorTermString(selectorString))
  }

  // TODO: handle arguments!
  protected[this] def genSelectorString(method: MethodSymbol): String = method.name.toString

  protected[this] def genSelectorString(name: TermName, args: List[List[ValDef]]): String = args match {
    case Nil | List(Nil) => name.toString
    case List(args) => name.toString +: (args.tail map {
      case ValDef(_, name, _, _) => name.toString
    }) mkString("", ":", ":")
    case x =>
      c.error(c.enclosingPosition, "multiple parameter lists not supported for ObjC classes")
      ???
  }

  protected[this] def genSelectorDef(selector: String, selectorTerm: TermName) =
    q"lazy val $selectorTerm = _root_.objc.runtime.sel_registerName(scalanative.native.CQuote(StringContext($selector)).c())"

}
