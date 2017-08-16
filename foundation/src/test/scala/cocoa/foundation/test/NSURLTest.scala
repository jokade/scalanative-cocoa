package cocoa.foundation.test

import utest._
import cocoa.foundation._

object NSURLTest extends TestSuite {
  val tests = TestSuite {
    'class - {
      assert(NSURL.className == "NSURL")
      'URLWithString-{
      }
    }
  }
}