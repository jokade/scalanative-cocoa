package cocoa.foundation.test

import utest._
import cocoa.foundation.NSCharacterSet

object NSCharacterSetTest extends TestSuite {
  val tests = TestSuite {
    'class - {
      assert(NSCharacterSet.className == "NSCharacterSet")
    }
  }
}