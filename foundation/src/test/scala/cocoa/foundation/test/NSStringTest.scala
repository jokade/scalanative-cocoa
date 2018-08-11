//     Project: scalanative-cocoa
//      Module:
// Description:
package cocoa.foundation.test

import cocoa.foundation.NSString
import cocoa.foundation.NSQuote
import scalanative.native._
import utest._

object NSStringTest extends TestSuite {
  val tests = Tests {
    /*
    'class-{
      assert( NSString.className == "NSString" )
    }
    'string-{
      assert( NSString.string().length().toInt == 0 )
    }
    'implicit-{
      assert( fromCString(ns"hello".UTF8String()) == "hello" )
    }
    'RichNSString-{
      assert( ns"hello".string == "hello" )
    }

  */
  }
}
