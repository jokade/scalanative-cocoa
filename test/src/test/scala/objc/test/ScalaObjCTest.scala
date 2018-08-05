//     Project: scalanative-cocoa
//      Module: test
// Description: Tests for Scala-defined ObjC classes
// Copyright (c) 2017. Distributed under the MIT License (see included LICENSE file).
package objc.test
/*
import cocoa.foundation.NSObjectClass
import objc.{ObjCProxy, ScalaObjC}
import objc.runtime._
import objc.helper._

import scalanative.native._
import cocoa.foundation._
import cocoa.foundation.Foundation.NSLog
import de.surfice.smacrotools.debug
import utest._

object ScalaObjCTest extends TestSuite {
  val tests = TestSuite {
    'alloc-{
      val foo = Foo.alloc()
      // check behaviour of ObjC proxy
      'proxy-{
        val eut = foo.asInstanceOf[NSObject]
        val inst = foo.get
        assert( eut.className == "Foo" )

        assert( objc_msgSend(eut,sel_registerName(c"intProp")).cast[Int] == 42 )

        objc_msgSend(eut,sel_registerName(c"incr"))
        assert( objc_msgSend(eut,sel_registerName(c"intProp")).cast[Int] == 43 )

        objc_msgSend(eut,sel_registerName(c"setIntProp:"),-1)
        assert( objc_msgSend(eut,sel_registerName(c"intProp")).cast[Int] == -1 )

        assert( objc_msgSend(eut,sel_registerName(c"booleanProp")).cast[Boolean] == true )

        // TODO: check the result of objc_msgSend instead of the value on the Scala instance
        // (currently the result value seems to be 0 => why?)
        assert( inst.doubleProp == 1.234 )
        objc_msgSend(eut,sel_registerName(c"setDoubleProp:"),-2.345)
        assert( inst.doubleProp == -2.345 )

        assert( objc_msgSend(eut,sel_registerName(c"stringProp")) == null )
        objc_msgSend(eut,sel_registerName(c"setStringProp:"),"foo")
        assert( objc_msgSend(eut,sel_registerName(c"stringProp")).cast[String] == "foo" )

        assert( objc_msgSend(eut,sel_registerName(c"incr:"),42).cast[Int] == 43 )

        assert( objc_msgSend(eut,sel_registerName(c"add:b:"),2,3).cast[Int] == 5 )
      }
      // check behaviour of Scala instance
      'scala-{
        val eut = foo.get
        assert( eut.intProp == 42 )

        eut.incr()
        assert( eut.intProp == 43 )

        eut.intProp = -1
        assert( eut.intProp == -1 )
      }
    }
  }

  @ScalaObjC
//  @debug
  class Foo(self: ObjCProxy[Foo]) extends NSObject {
    private var _intProp = 42
    def intProp = _intProp
    def intProp_=(i: Int) = _intProp = i

    val booleanProp = true
    var doubleProp = 1.234

    var stringProp: String = _

    def incr(): Unit = _intProp += 1

    def incr(i: Int): Int = i+1

    def add(a: Int, b: Int): Int = a + b
  }
  object Foo extends NSObjectClass {
    override type InstanceType = ObjCProxy[Foo]
  }
}
*/