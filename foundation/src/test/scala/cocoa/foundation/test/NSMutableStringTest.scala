//     Project: scalanative-cocoa
//      Module:
// Description:
package cocoa.foundation.test

import utest._
import scalanative.native._
import cocoa.foundation.NSMutableString

object NSMutableStringTest extends TestSuite {
  val tests = TestSuite{
    'class-{
      assert( NSMutableString.className == "NSMutableString" )
    }
  }
}
