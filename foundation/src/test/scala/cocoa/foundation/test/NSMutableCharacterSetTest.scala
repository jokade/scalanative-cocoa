package cocoa.foundation.test

import utest._
import cocoa.foundation.NSMutableCharacterSet

object NSMutableCharacterSetTest extends TestSuite {
  val tests = TestSuite {
    'class - {
      assert(NSMutableCharacterSet.className == "NSMutableCharacterSet")
    }
  }
}