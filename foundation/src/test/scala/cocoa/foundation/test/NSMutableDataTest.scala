package cocoa.foundation.test

import utest._
import cocoa.foundation.NSMutableData

object NSMutableDataTest extends TestSuite {
  val tests = TestSuite {
    'class - {
      assert(NSMutableData.className == "NSMutableData")
    }
  }
}