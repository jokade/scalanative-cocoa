//     Project: scalanative-cocoa
//      Module:
// Description:
package cocoa.foundation

import de.surfice.smacrotools.BlackboxMacroTools

import scala.reflect.macros.blackbox

/**
 * Provides implementations for macros used in package cocoa.foundation.
 *
 * @param c
 */
private[this] class Macros(val c: blackbox.Context) extends BlackboxMacroTools {
  import c.universe._

  def nsquoteImpl()  = {
    val expr = c.prefix match {
      case Expr(Apply(x,args)) => q"scalanative.native.CQuote(..$args).c()"
    }
    c.Expr(q"cocoa.foundation.NSString($expr)")
  }

}
