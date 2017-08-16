package cocoa.foundation.test

import utest._
import cocoa.foundation.NSError

object NSErrorTest extends TestSuite {
  val tests = TestSuite {
    'class - {
      assert(NSError.className == "NSError")
    }
  }
}