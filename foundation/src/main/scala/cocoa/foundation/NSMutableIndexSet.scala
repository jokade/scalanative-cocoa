// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.foundation

import scala.language.experimental.macros
import scalanative.native._
import scalanative.unsafe._
import objc._

@ObjC
class NSMutableIndexSet extends NSIndexSet {
  @inline def addIndexes_(indexSet: NSIndexSet): Unit = extern
  @inline def removeIndexes_(indexSet: NSIndexSet): Unit = extern
  @inline def removeAllIndexes(): Unit = extern
  @inline def addIndex_(value: NSUInteger): Unit = extern
  @inline def removeIndex_(value: NSUInteger): Unit = extern
  @inline def addIndexesInRange_(range: NSRange): Unit = extern
  @inline def removeIndexesInRange_(range: NSRange): Unit = extern
  @inline def shiftIndexesStartingAtIndex_delta_(index: NSUInteger, delta: NSInteger): Unit = extern
}

@ObjCClass
abstract class NSMutableIndexSetClass extends NSIndexSetClass {
}

object NSMutableIndexSet extends NSMutableIndexSetClass {
  override type InstanceType = NSMutableIndexSet
}
