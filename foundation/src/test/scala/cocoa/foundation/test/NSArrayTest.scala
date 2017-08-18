package cocoa.foundation.test

import utest._
import cocoa.foundation.{NSArray, NSNumber, NSQuote}
import scalanative.native._

object NSArrayTest extends TestSuite {
  val tests = TestSuite {
    'class- {
      assert(NSArray.className == "NSArray")
      'array - {
        val array = NSArray.array[NSNumber]()
        assert(
          array.className == "__NSArray0",
          array.count().toInt == 0)
      }
      'arrayWithObject - {
        val array = NSArray.arrayWithObject(NSNumber(42))
        assert(array.count().toInt == 1,
          array.objectAtIndex(0.toUInt).intValue() == 42)
      }
    }
    'classExtensions- {
      'arrayWithObjects - {
        val array: NSArray[NSNumber] = NSArray.arrayWithObjects(Seq(NSNumber(0), NSNumber(1), NSNumber(2)))
        assert(
          array.count().toInt == 3,
          array.objectAtIndex(0.toUInt).intValue() == 0,
          array.objectAtIndex(1.toUInt).intValue() == 1,
          array.objectAtIndex(2.toUInt).intValue() == 2)
      }
    }
//    'RichNSArray-{
//      val array = NSArray(NSNumber(42),NSNumber(Int.MinValue),NSNumber(Int.MaxValue))
//      'size-{
//        assert( array.count().toInt == 3 )
//      }
//      'apply-{
//        assert(
//          array(0).intValue() == 42,
//          array(1).intValue() == Int.MinValue,
//          array(2).intValue() == Int.MaxValue )
//      }
//    }
  }
}