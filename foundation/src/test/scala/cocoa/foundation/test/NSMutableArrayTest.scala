package cocoa.foundation.test

import utest._
import cocoa.foundation.{NSMutableArray, NSNumber}

object NSMutableArrayTest extends TestSuite {
  val tests = Tests {
    /*
    'class - {
      assert(NSMutableArray.className == "NSMutableArray")
      'array-{
        val array = NSMutableArray.array[NSNumber]()
        assert(
          array.className == "__NSArrayM",
          array.count().toInt == 0 )
      }
    }
    'instance-{
      'addObject-{
        val array = NSMutableArray.array[NSNumber]()
        assert( array.count().toInt == 0 )
        array.addObject(NSNumber(42))
        assert(
          array.count().toInt == 1)//,
//          array(0).intValue == 42 )
      }
    }
    */
  }
}