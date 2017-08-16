package cocoa.foundation.test

import utest._
import cocoa.foundation.NSURLComponents

object NSURLComponentsTest extends TestSuite {
  val tests = TestSuite {
    'class - {
      assert(NSURLComponents.className == "NSURLComponents")
    }
  }
}