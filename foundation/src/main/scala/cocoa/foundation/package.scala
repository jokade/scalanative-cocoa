//     Project: scalanative-cocoa
//      Module:
// Description:
package cocoa

import scala.language.experimental.macros
import scala.scalanative.native._

package object foundation {
  type NSUInteger = CUnsignedLong
  type NSStringEncoding = NSUInteger
  type BOOL = NSUInteger

  private val ZERO_ULong = 0.toULong

  implicit def integerToBoolean(i: NSUInteger): Boolean = i > ZERO_ULong

  /** NSString literal. */
  implicit class NSQuote(val ctx: StringContext) {
    def ns(): NSString = macro Macros.nsquoteImpl
  }

}
