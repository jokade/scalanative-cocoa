// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.foundation

import scala.language.experimental.macros
import scalanative.native._
import objc._

/*
@ObjC
class NSMutableArray[T<:NSObject] extends NSArray[T] {
  @inline def addObject_(anObject: T): Unit = extern
  @inline def insertObject_index_(anObject: T, index: NSUInteger): Unit = extern
  @inline def removeLastObject(): Unit = extern
  @inline def removeObjectAtIndex_(index: NSUInteger): Unit = extern
  @inline def replaceObjectAtIndex_anObject_(index: NSUInteger, anObject: T): Unit = extern
  @inline def initWithCapacity_(numItems: NSUInteger): NSMutableArray[T] = extern
  @inline def addObjectsFromArray_(otherArray: T): Unit = extern
  @inline def exchangeObjectAtIndex_idx2_(idx1: NSUInteger, idx2: NSUInteger): Unit = extern
  @inline def removeAllObjects(): Unit = extern
  @inline def removeObject_range_(anObject: T, range: NSRange): Unit = extern
  @inline def removeObject_(anObject: T): Unit = extern
  @inline def removeObjectIdenticalTo_range_(anObject: T, range: NSRange): Unit = extern
  @inline def removeObjectIdenticalTo_(anObject: T): Unit = extern
  @inline def removeObjectsFromIndices_cnt_(indices: NSUInteger, cnt: NSUInteger): Unit = extern
  @inline def removeObjectsInArray_(otherArray: T): Unit = extern
  @inline def removeObjectsInRange_(range: NSRange): Unit = extern
  @inline def replaceObjectsInRange_otherArray_otherRange_(range: NSRange, otherArray: T, otherRange: NSRange): Unit = extern
  @inline def replaceObjectsInRange_otherArray_(range: NSRange, otherArray: T): Unit = extern
  @inline def setArray_(otherArray: T): Unit = extern
  @inline def sortUsingFunction_context_(compare: NSInteger, context: Ptr[Byte]): Unit = extern
  @inline def sortUsingSelector_(comparator: SEL): Unit = extern
  @inline def insertObjects_indexes_(objects: T, indexes: NSIndexSet): Unit = extern
  @inline def removeObjectsAtIndexes_(indexes: NSIndexSet): Unit = extern
  @inline def replaceObjectsAtIndexes_objects_(indexes: NSIndexSet, objects: T): Unit = extern
  @inline def setObject_idx_(obj: T, idx: NSUInteger): Unit = extern
//  @inline def sortUsingComparator_(cmptr: NSComparator): Unit = extern
//  @inline def sortWithOptions_cmptr_(opts: NSSortOptions, cmptr: NSComparator): Unit = extern
  @inline override def initWithContentsOfFile_(path: NSString): NSMutableArray[T] = extern
  @inline override def initWithContentsOfURL_(url: NSURL): NSMutableArray[T] = extern
}


@ObjCClass
abstract class NSMutableArrayClass extends NSArrayClass {
  @inline def arrayWithCapacity_[T<:NSObject](numItems: NSUInteger): NSMutableArray[T] = extern
//  @inline override def arrayWithContentsOfFile_[T<:NSObject](path: NSString): NSMutableArray[T] = extern
//  @inline override def arrayWithContentsOfURL_[T<:NSObject](url: NSURL): NSMutableArray[T] = extern
  @inline override def array[T<:NSObject](): NSMutableArray[T] = extern
  @inline override def arrayWithObject_[T<:NSObject](anObject: T): NSMutableArray[T] = extern
  @inline override def arrayWithObjects_count_[T<:NSObject](objects: Ptr[id], cnt: NSUInteger): NSMutableArray[T] = extern
  @inline override def arrayWithObjects_[T<:NSObject](firstObj: T): NSMutableArray[T] = extern
  @inline override def arrayWithArray_[T<:NSObject](array: T): NSMutableArray[T] = extern
  @inline override def arrayWithContentsOfFile_[T<:NSObject](path: NSString): NSMutableArray[T] = extern
  @inline override def arrayWithContentsOfURL_[T<:NSObject](url: NSURL): NSMutableArray[T] = extern
}

object NSMutableArray extends NSMutableArrayClass {
  override type InstanceType = NSMutableArray[_]

  // TODO: use Iterable instead of Seq
  def arrayWithObjects[T<:NSObject](objects: Seq[T]): NSMutableArray[T] = Zone { implicit z =>
    val count = objects.size
    val array = stackalloc[id]( sizeof[id] * count)
    for(i<-0 until count)
      !(array + i) = objects(i).toPtr
    arrayWithObjects_count_(array,count.toULong)
  }

  def apply[T<:NSObject](objects: T*): NSMutableArray[T] = arrayWithObjects(objects)

  implicit final class RichNSMutableArray[T <: NSObject](val ns: NSArray[T]) extends AnyVal {
    def apply(idx: Int): T = ns.objectAtIndex_(idx.toUInt)
  }

  def empty[V<:NSObject]: NSMutableArray[V] = alloc().init().asInstanceOf[NSMutableArray[V]]
}
*/