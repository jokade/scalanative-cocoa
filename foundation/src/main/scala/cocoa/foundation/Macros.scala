//     Project: scalanative-cocoa
//      Module:
// Description:
package cocoa.foundation

import de.surfice.smacrotools.BlackboxMacroTools
import objc.internal.ObjCMacroTools

import scala.reflect.macros.blackbox

/**
 * Provides implementations for macros used in package cocoa.foundation.
 *
 * @param c
 */
private[this] class Macros(val c: blackbox.Context) extends BlackboxMacroTools with ObjCMacroTools {
  import c.universe._

  def nsquoteImpl()  = {
    val expr = c.prefix match {
      case Expr(Apply(x,args)) => q"scalanative.native.CQuote(..$args).c()"
    }
    c.Expr(q"cocoa.foundation.NSString($expr)")
  }

  def superImpl(self: Tree)(f: Tree) = {
    val t = f match {
      case Function(_,Apply(f,args)) =>
        val method = f.symbol.asMethod
        val params = method.paramLists.head
        q"""import objc.runtime._
            import objc.helper._
           val sel = sel_registerName(${cstring(genSelectorString(method))})
           msgSendSuper0($self,sel,..$args).cast[${method.returnType}]
         """
    }
    t
  }
}
