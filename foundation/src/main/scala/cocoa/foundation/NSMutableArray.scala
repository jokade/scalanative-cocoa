//     Project: scalanative-cocoa
//      Module: Foundation
// Description: Generated with scala-obj-bindgen (with manual postprocessing) from:
//              Foundation/NSArray.h
package cocoa.foundation

import objc.runtime.SEL

import scala.language.experimental.macros
import objc.{ObjC, ObjCClass}

import scalanative.native._

@ObjC
class NSMutableArray[T<:NSObject] extends NSArray[T] {
  @inline def addObject(anObject: T): Unit = extern
  @inline def insertObject(anObject: T, index: NSUInteger): Unit = extern
  @inline def removeLastObject(): Unit = extern
  @inline def removeObjectAtIndex(index: NSUInteger): Unit = extern
  @inline def replaceObjectAtIndex(index: NSUInteger, anObject: T): Unit = extern
//  @inline def init(): NSMutableArray[T] = extern
  @inline def initWithCapacity(numItems: NSUInteger): NSMutableArray[T] = extern
//  @inline def initWithCoder(aDecoder: NSCoder): NSMutableArray[T] = extern
  @inline def addObjectsFromArray(otherArray: T): Unit = extern
  @inline def exchangeObjectAtIndex(idx1: NSUInteger, idx2: NSUInteger): Unit = extern
  @inline def removeAllObjects(): Unit = extern
  @inline def removeObject(anObject: T, range: NSRange): Unit = extern
  @inline def removeObject(anObject: T): Unit = extern
  @inline def removeObjectIdenticalTo(anObject: T, range: NSRange): Unit = extern
  @inline def removeObjectIdenticalTo(anObject: T): Unit = extern
  @inline def removeObjectsFromIndices(indices: NSUInteger, cnt: NSUInteger): Unit = extern
  @inline def removeObjectsInArray(otherArray: T): Unit = extern
  @inline def removeObjectsInRange(range: NSRange): Unit = extern
  @inline def replaceObjectsInRange(range: NSRange, otherArray: T, otherRange: NSRange): Unit = extern
  @inline def replaceObjectsInRange(range: NSRange, otherArray: T): Unit = extern
  @inline def setArray(otherArray: T): Unit = extern
  @inline def sortUsingFunction(compare: NSInteger, context: Ptr[Byte]): Unit = extern
  @inline def sortUsingSelector(comparator: SEL): Unit = extern
//  @inline def insertObjects(objects: T, indexes: NSIndexSet): Unit = extern
//  @inline def removeObjectsAtIndexes(indexes: NSIndexSet): Unit = extern
//  @inline def replaceObjectsAtIndexes(indexes: NSIndexSet, objects: T): Unit = extern
  @inline def setObject(obj: T, idx: NSUInteger): Unit = extern
//  @inline def sortUsingComparator(cmptr: NSComparator): Unit = extern
//  @inline def sortWithOptions(opts: NSSortOptions, cmptr: NSComparator): Unit = extern
  @inline def initWithContentsOfFile(path: NSString): NSMutableArray[T] = extern
  @inline def initWithContentsOfURL(url: NSURL): NSMutableArray[T] = extern
}

@ObjCClass
abstract class NSMutableArrayClass extends NSArrayClass {
  @inline override def array[T<:NSObject](): NSMutableArray[T] = extern
  @inline override def arrayWithObject[T<:NSObject](anObject: T): NSMutableArray[T] = extern
  @inline def arrayWithCapacity[T<:NSObject](numItems: NSUInteger): NSMutableArray[T] = extern
  @inline def arrayWithContentsOfFile[T<:NSObject](path: NSString): NSMutableArray[T] = extern
  @inline def arrayWithContentsOfURL[T<:NSObject](url: NSURL): NSMutableArray[T] = extern
}

object NSMutableArray extends NSMutableArrayClass {
  override type InstanceType = NSMutableArray[_]
}