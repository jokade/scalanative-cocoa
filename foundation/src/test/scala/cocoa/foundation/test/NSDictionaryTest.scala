package cocoa.foundation.test

import cocoa.foundation.{@@, NSDictionary, NSQuote}
import utest._

object NSDictionaryTest extends TestSuite {
  val tests = TestSuite {
    'class - {
      assert(NSDictionary.className == "NSDictionary")
      'dictionary-{
        val dict = NSDictionary.dictionary()
        assert( dict.count().toInt == 0 )
      }
      'dictionaryWithObject-{
        val dict = NSDictionary.dictionaryWithObject(@@(42),ns"int")
        assert(
          dict.count().toInt == 1,
          dict.objectForKey(ns"int").intValue() == 42 )
      }
    }
    'classExtensions-{
      val dict = NSDictionary.dictionaryWithObjects(Seq(
        ns"int" -> @@(42),
        ns"bool" -> @@(true)
      ))
      assert(
        dict.count().toInt == 2,
        dict.objectForKey(ns"int").intValue() == 42,
        dict.objectForKey(ns"bool").boolValue() == true )
    }
  }
}