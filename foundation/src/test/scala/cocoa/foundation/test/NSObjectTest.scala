//     Project: scalanative-cocoa
//      Module:
// Description:
package cocoa.foundation.test

import cocoa.foundation.NSObject
import utest._

object NSObjectTest extends TestSuite {
  val tests = TestSuite {
    'class-{
      assert( "NSObject" == NSObject.className )
      assert( NSObject.version == 0 )
    }
    'alloc-{
      val o = NSObject.alloc()
      assert( "NSObject" == o.className )
      true
    }
  }
}
