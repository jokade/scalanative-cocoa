//     Project: scalanative-cocoa
//      Module: ObjC
// Description:
package objc.internal

import de.surfice.smacrotools.CommonMacroTools
import scala.language.reflectiveCalls

trait ObjCMacroTools extends CommonMacroTools {
  import c.universe._

  protected[this] def genSelector(name: TermName, args: List[List[ValDef]]): (String, TermName) = {
    val s = genSelectorString(name, args)
    (s, genSelectorTerm(s))
  }

  protected[this] def genSelectorTerm(name: TermName, args: List[List[ValDef]]): TermName =
    genSelectorTerm(genSelectorString(name,args))

  protected[this] def genSelectorTerm(selectorString: String): TermName = {
    TermName("_sel_"+selectorString.replaceAll(":","_"))
  }

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
