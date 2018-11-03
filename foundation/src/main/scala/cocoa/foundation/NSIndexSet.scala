// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.foundation

import scala.language.experimental.macros
import scala.scalanative.native._
import scala.scalanative.native.objc._

@ObjC
class NSIndexSet extends NSObject with NSCopying with NSMutableCopying with NSSecureCoding {
  @inline def initWithIndexesInRange_(range: NSRange): NSIndexSet = extern
  @inline def initWithIndexSet_(indexSet: NSIndexSet): NSIndexSet = extern
  @inline def initWithIndex_(value: NSUInteger): NSIndexSet = extern
  @inline def isEqualToIndexSet_(indexSet: NSIndexSet): BOOL = extern
  @inline def indexGreaterThanIndex_(value: NSUInteger): NSUInteger = extern
  @inline def indexLessThanIndex_(value: NSUInteger): NSUInteger = extern
  @inline def indexGreaterThanOrEqualToIndex_(value: NSUInteger): NSUInteger = extern
  @inline def indexLessThanOrEqualToIndex_(value: NSUInteger): NSUInteger = extern
  @inline def getIndexes_bufferSize_range_(indexBuffer: NSUInteger, bufferSize: NSUInteger, range: NSRangePointer): NSUInteger = extern
  @inline def countOfIndexesInRange_(range: NSRange): NSUInteger = extern
  @inline def containsIndex_(value: NSUInteger): BOOL = extern
  @inline def containsIndexesInRange_(range: NSRange): BOOL = extern
  @inline def containsIndexes_(indexSet: NSIndexSet): BOOL = extern
  @inline def intersectsIndexesInRange_(range: NSRange): BOOL = extern
  @inline def enumerateIndexesUsingBlock_(block: Ptr[Byte]): Unit = extern
  @inline def enumerateIndexesWithOptions_block_(opts: NSEnumerationOptions, block: Ptr[Byte]): Unit = extern
  @inline def enumerateIndexesInRange_opts_block_(range: NSRange, opts: NSEnumerationOptions, block: Ptr[Byte]): Unit = extern
  @inline def indexPassingTest_(predicate: BOOL): NSUInteger = extern
  @inline def indexWithOptions_predicate_(opts: NSEnumerationOptions, predicate: BOOL): NSUInteger = extern
  @inline def indexInRange_opts_predicate_(range: NSRange, opts: NSEnumerationOptions, predicate: BOOL): NSUInteger = extern
  @inline def indexesPassingTest_(predicate: BOOL): NSIndexSet = extern
  @inline def indexesWithOptions_predicate_(opts: NSEnumerationOptions, predicate: BOOL): NSIndexSet = extern
  @inline def indexesInRange_opts_predicate_(range: NSRange, opts: NSEnumerationOptions, predicate: BOOL): NSIndexSet = extern
  @inline def enumerateRangesUsingBlock_(block: Ptr[Byte]): Unit = extern
  @inline def enumerateRangesWithOptions_block_(opts: NSEnumerationOptions, block: Ptr[Byte]): Unit = extern
  @inline def enumerateRangesInRange_opts_block_(range: NSRange, opts: NSEnumerationOptions, block: Ptr[Byte]): Unit = extern
  @inline def count(): NSUInteger = extern
  @inline def firstIndex(): NSUInteger = extern
  @inline def lastIndex(): NSUInteger = extern
}

@ObjCClass
abstract class NSIndexSetClass extends NSObjectClass {
  @inline def indexSet(): NSIndexSet = extern
  @inline def indexSetWithIndex_(value: NSUInteger): NSIndexSet = extern
  @inline def indexSetWithIndexesInRange_(range: NSRange): NSIndexSet = extern
}

object NSIndexSet extends NSIndexSetClass {
  override type InstanceType = NSIndexSet
}