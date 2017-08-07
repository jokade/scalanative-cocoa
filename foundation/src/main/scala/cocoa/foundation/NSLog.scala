//     Project: scalanative-cocoa
//      Module:
// Description:
package cocoa.foundation

import scala.scalanative.native.{CVararg, extern, name}

@extern
object NSLog {
  @name("NSLog")
  def apply(format: NSString, args: CVararg*): Unit = extern
}
