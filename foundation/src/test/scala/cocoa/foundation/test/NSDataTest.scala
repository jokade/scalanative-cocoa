package cocoa.foundation.test

import utest._
import cocoa.foundation.NSData

object NSDataTest extends TestSuite {
  val tests = TestSuite {
    'class - {
      assert(NSData.className == "NSData")
    }
  }
}