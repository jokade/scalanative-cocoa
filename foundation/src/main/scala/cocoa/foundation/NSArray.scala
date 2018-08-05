//     Project: scalanative-cocoa
//      Module: Foundation
// Description: Generated with scala-obj-bindgen (with manual postprocessing) from:
//              Foundation/NSArray.h
// Copyright (c) 2017. Distributed under the MIT License (see included LICENSE file).
package cocoa.foundation

import scala.scalanative.native._
import objc.runtime.id

import scala.language.experimental.macros

@ObjC
class NSArray[T<:NSObject]
  extends NSObject
    with NSCopying
    with NSMutableCopying
    with NSSecureCoding {
    //with NSSeqLike[T] {//with NSFastEnumeration {
  @inline def objectAtIndex(index: NSUInteger): T = extern
//  @inline def init(): NSArray[T] = extern
//  @inline def initWithObjects(objects: T, cnt: NSUInteger): NSArray[T] = extern
  @inline def initWithCoder(aDecoder: NSCoder): NSArray[T] = extern
  @inline def count(): NSUInteger = extern
  @inline def arrayByAddingObject(anObject: T): NSArray[T] = extern
//  @inline def arrayByAddingObjectsFromArray(otherArray: T): NSArray[T] = extern
//  @inline def componentsJoinedByString(separator: NSString): NSString = extern
//  @inline def containsObject(anObject: T): BOOL = extern
//  @inline def descriptionWithLocale(locale: id): NSString = extern
//  @inline def descriptionWithLocale(locale: id, level: NSUInteger): NSString = extern
//  @inline def firstObjectCommonWithArray(otherArray: T): T = extern
//  @inline def getObjects(objects: T, range: NSRange): Unit = extern
//  @inline def indexOfObject(anObject: T): NSUInteger = extern
//  @inline def indexOfObject(anObject: T, range: NSRange): NSUInteger = extern
//  @inline def indexOfObjectIdenticalTo(anObject: T): NSUInteger = extern
//  @inline def indexOfObjectIdenticalTo(anObject: T, range: NSRange): NSUInteger = extern
//  @inline def isEqualToArray(otherArray: T): BOOL = extern
////  @inline def objectEnumerator(): NSEnumerator[T] = extern
////  @inline def reverseObjectEnumerator(): NSEnumerator[T] = extern
//  @inline def sortedArrayUsingFunction(comparator: NSInteger, context: Ptr[Byte]): NSArray[T] = extern
//  @inline def sortedArrayUsingFunction(comparator: NSInteger, context: Ptr[Byte], hint: NSData): NSArray[T] = extern
//  @inline def sortedArrayUsingSelector(comparator: SEL): NSArray[T] = extern
//  @inline def subarrayWithRange(range: NSRange): NSArray[T] = extern
//  @inline def writeToFile(path: NSString, useAuxiliaryFile: BOOL): BOOL = extern
//  @inline def writeToURL(url: NSURL, atomically: BOOL): BOOL = extern
//  @inline def makeObjectsPerformSelector(aSelector: SEL): Unit = extern
//  @inline def makeObjectsPerformSelector(aSelector: SEL, argument: id): Unit = extern
////  @inline def objectsAtIndexes(indexes: NSIndexSet): NSArray[T] = extern
//  @inline def objectAtIndexedSubscript(idx: NSUInteger): T = extern
//  @inline def enumerateObjectsUsingBlock(block: Ptr[Byte]): Unit = extern
////  @inline def enumerateObjectsWithOptions(opts: NSEnumerationOptions, block: Ptr[Byte]): Unit = extern
////  @inline def enumerateObjectsAtIndexes(s: NSIndexSet, opts: NSEnumerationOptions, block: Ptr[Byte]): Unit = extern
//  @inline def indexOfObjectPassingTest(predicate: BOOL): NSUInteger = extern
////  @inline def indexOfObjectWithOptions(opts: NSEnumerationOptions, predicate: BOOL): NSUInteger = extern
////  @inline def indexOfObjectAtIndexes(s: NSIndexSet, opts: NSEnumerationOptions, predicate: BOOL): NSUInteger = extern
////  @inline def indexesOfObjectsPassingTest(predicate: BOOL): NSIndexSet = extern
////  @inline def indexesOfObjectsWithOptions(opts: NSEnumerationOptions, predicate: BOOL): NSIndexSet = extern
////  @inline def indexesOfObjectsAtIndexes(s: NSIndexSet, opts: NSEnumerationOptions, predicate: BOOL): NSIndexSet = extern
////  @inline def sortedArrayUsingComparator(cmptr: NSComparator): NSArray[T] = extern
////  @inline def sortedArrayWithOptions(opts: NSSortOptions, cmptr: NSComparator): NSArray[T] = extern
////  @inline def indexOfObject(obj: T, r: NSRange, opts: NSBinarySearchingOptions, cmp: NSComparator): NSUInteger = extern
  @inline def firstObject(): T = extern
  @inline def lastObject(): T = extern
//  @inline def sortedArrayHint(): NSData = extern
//  @inline def initWithObjects(firstObj: T): NSArray[T] = extern
//  @inline def initWithArray(array: T): NSArray[T] = extern
//  @inline def initWithArray(array: T, flag: BOOL): NSArray[T] = extern
//  @inline def initWithContentsOfFile(path: NSString): NSArray[T] = extern
//  @inline def initWithContentsOfURL(url: NSURL): NSArray[T] = extern
//  @inline def getObjects(objects: T): Unit = extern
}

@ObjCClass
abstract class NSArrayClass extends NSObjectClass {
  @inline def array[T<:NSObject](): NSArray[T] = extern
  @inline def arrayWithObject[T<:NSObject](anObject: T): NSArray[T] = extern
//  @inline def arrayWithObjects[T<:NSObject](firstObj: T*): NSArray[T] = extern
//  @inline def arrayWithArray[T](array: T): NSArray[T] = extern
//  @inline def arrayWithContentsOfFile[T](path: NSString): NSArray[T] = extern
//  @inline def arrayWithContentsOfURL[T](url: NSURL): NSArray[T] = extern
}

object NSArray extends NSArrayClass {
  import objc.runtime.{objc_msgSend, sel_registerName}
  override type InstanceType = NSArray[_]

  private lazy val __sel_arrayWithObjects_count = sel_registerName(c"arrayWithObjects:count:")

//  def arrayWithObjects[T<:NSObject](firstObj: CVararg*): NSArray[T] =
//    objc_msgSend(_cls,_sel_arrayWithObject_firstObj,firstObj:_*).cast[NSArray[T]]


  // TODO: use Iterable instead of Seq
  def arrayWithObjects[T<:NSObject](objects: Seq[T]): NSArray[T] = Zone { implicit z =>
    val count = objects.size
    val array = stackalloc[id]( sizeof[id] * count)
    for(i<-0 until count)
      !(array + i) = objects(i)
    objc_msgSend(__cls,__sel_arrayWithObjects_count,array,count).cast[NSArray[T]]
  }

  def apply[T<:NSObject](objects: T*): NSArray[T] = arrayWithObjects(objects)
//  def apply[T<:NSObject](objects: Seq[T]): NSArray[T] = arrayWithObjects(objects)

  implicit final class RichNSArray[T <: NSObject](val ns: NSArray[T]) extends AnyVal {
    def apply(idx: Int): T = ns.objectAtIndex(idx.toUInt)
  }
}