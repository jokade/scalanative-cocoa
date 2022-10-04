// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.foundation

import de.surfice.smacrotools.debug

import scala.language.experimental.macros
import scalanative.native._
import scalanative.unsafe._
import scalanative.unsigned._
import objc._


@ObjC
class NSArray[T<:NSObject] extends NSObject with NSCopying with NSMutableCopying with NSSecureCoding { //with NSFastEnumeration {
  @inline def objectAtIndex_(index: NSUInteger): T = extern
  @inline def initWithObjects_cnt_(objects: T, cnt: NSUInteger): NSArray[T] = extern
//  @inline def initWithCoder_(aDecoder: NSCoder): NSArray[T] = extern
  @inline def count(): NSUInteger = extern
  @inline def arrayByAddingObject_(anObject: T): NSArray[T] = extern
  @inline def arrayByAddingObjectsFromArray_(otherArray: T): NSArray[T] = extern
  @inline def componentsJoinedByString_(separator: NSString): NSString = extern
  @inline def containsObject_(anObject: T): BOOL = extern
  @inline def descriptionWithLocale_(locale: id): NSString = extern
  @inline def descriptionWithLocale_level_(locale: id, level: NSUInteger): NSString = extern
  @inline def firstObjectCommonWithArray_(otherArray: T): T = extern
  @inline def getObjects_range_(objects: T, range: NSRange): Unit = extern
  @inline def indexOfObject_(anObject: T): NSUInteger = extern
  @inline def indexOfObject_range_(anObject: T, range: NSRange): NSUInteger = extern
  @inline def indexOfObjectIdenticalTo_(anObject: T): NSUInteger = extern
  @inline def indexOfObjectIdenticalTo_range_(anObject: T, range: NSRange): NSUInteger = extern
  @inline def isEqualToArray_(otherArray: T): BOOL = extern
  @inline def objectEnumerator(): NSEnumerator[T] = extern
  @inline def reverseObjectEnumerator(): NSEnumerator[T] = extern
  @inline def sortedArrayUsingFunction_context_(comparator: NSInteger, context: Ptr[Byte]): NSArray[T] = extern
  @inline def sortedArrayUsingFunction_context_hint_(comparator: NSInteger, context: Ptr[Byte], hint: NSData): NSArray[T] = extern
  @inline def sortedArrayUsingSelector_(comparator: SEL): NSArray[T] = extern
  @inline def subarrayWithRange_(range: NSRange): NSArray[T] = extern
  @inline def writeToFile_useAuxiliaryFile_(path: NSString, useAuxiliaryFile: BOOL): BOOL = extern
  @inline def writeToURL_atomically_(url: NSURL, atomically: BOOL): BOOL = extern
  @inline def makeObjectsPerformSelector_(aSelector: SEL): Unit = extern
  @inline def makeObjectsPerformSelector_argument_(aSelector: SEL, argument: id): Unit = extern
  @inline def objectsAtIndexes_(indexes: NSIndexSet): NSArray[T] = extern
  @inline def objectAtIndexedSubscript_(idx: NSUInteger): T = extern
  @inline def enumerateObjectsUsingBlock_(block: Ptr[Byte]): Unit = extern
  @inline def enumerateObjectsWithOptions_block_(opts: NSEnumerationOptions, block: Ptr[Byte]): Unit = extern
  @inline def enumerateObjectsAtIndexes_opts_block_(s: NSIndexSet, opts: NSEnumerationOptions, block: Ptr[Byte]): Unit = extern
  @inline def indexOfObjectPassingTest_(predicate: BOOL): NSUInteger = extern
  @inline def indexOfObjectWithOptions_predicate_(opts: NSEnumerationOptions, predicate: BOOL): NSUInteger = extern
  @inline def indexOfObjectAtIndexes_opts_predicate_(s: NSIndexSet, opts: NSEnumerationOptions, predicate: BOOL): NSUInteger = extern
  @inline def indexesOfObjectsPassingTest_(predicate: BOOL): NSIndexSet = extern
  @inline def indexesOfObjectsWithOptions_predicate_(opts: NSEnumerationOptions, predicate: BOOL): NSIndexSet = extern
  @inline def indexesOfObjectsAtIndexes_opts_predicate_(s: NSIndexSet, opts: NSEnumerationOptions, predicate: BOOL): NSIndexSet = extern
//  @inline def sortedArrayUsingComparator_(cmptr: NSComparator): NSArray[T] = extern
//  @inline def sortedArrayWithOptions_cmptr_(opts: NSSortOptions, cmptr: NSComparator): NSArray[T] = extern
//  @inline def indexOfObject_r_opts_cmp_(obj: T, r: NSRange, opts: NSBinarySearchingOptions, cmp: NSComparator): NSUInteger = extern
  @inline def firstObject(): T = extern
  @inline def lastObject(): T = extern
  @inline def sortedArrayHint(): NSData = extern
  @inline def initWithObjects_(firstObj: T): NSArray[T] = extern
  @inline def initWithArray_(array: T): NSArray[T] = extern
  @inline def initWithArray_flag_(array: T, flag: BOOL): NSArray[T] = extern
  @inline def initWithContentsOfFile_(path: NSString): NSArray[T] = extern
  @inline def initWithContentsOfURL_(url: NSURL): NSArray[T] = extern
  @inline def getObjects_(objects: T): Unit = extern
}

@ObjCClass
abstract class NSArrayClass extends NSObjectClass {
  @inline def array[T<:NSObject](): NSArray[T] = extern
  @inline def arrayWithObject_[T<:NSObject](anObject: T): NSArray[T] = extern
  @inline def arrayWithObjects_count_[T<:NSObject](objects: Ptr[id], cnt: NSUInteger): NSArray[T] = extern
  @inline def arrayWithObjects_[T<:NSObject](firstObj: T): NSArray[T] = extern
  @inline def arrayWithArray_[T<:NSObject](array: T): NSArray[T] = extern
  @inline def arrayWithContentsOfFile_[T<:NSObject](path: NSString): NSArray[T] = extern
  @inline def arrayWithContentsOfURL_[T<:NSObject](url: NSURL): NSArray[T] = extern
}

object NSArray extends NSArrayClass {
  import runtime._
  override type InstanceType = NSArray[_]

  // TODO: use Iterable instead of Seq
  def arrayWithObjects[T<:NSObject](objects: Seq[T]): NSArray[T] = Zone { implicit z =>
    val count = objects.size
    val array = stackalloc[id]( sizeof[id] * count.toUInt)
    for(i<-0 until count)
      !(array + i) = objects(i).toPtr
    arrayWithObjects_count_(array,count.toULong)
    //objc_msgSend(__cls,__sel_arrayWithObjects_cnt_,array,count).cast[NSArray[T]]
  }

  def apply[T<:NSObject](objects: T*): NSArray[T] = arrayWithObjects(objects)

  implicit final class RichNSArray[T <: NSObject](val ns: NSArray[T]) extends AnyVal {
    def apply(idx: Int): T = ns.objectAtIndex_(idx.toUInt)
  }

}
