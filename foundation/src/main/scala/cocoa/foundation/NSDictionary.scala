//     Project: scalanative-cocoa
//      Module: Foundation
// Description: Generated with scala-obj-bindgen (with manual postprocessing) from:
//
// Copyright (c) 2017. Distributed under the MIT License (see included LICENSE file).
package cocoa.foundation

import scala.scalanative.native._

import scala.language.experimental.macros

@ObjC
class NSDictionary[K<:NSObject, V<:NSObject]
  extends NSObject
    with NSCopying
    with NSMutableCopying
    with NSSecureCoding {
    //with NSMapLike[K,V]{//with NSFastEnumeration {
  @inline def objectForKey(aKey: K): V = extern
  @inline def keyEnumerator(): NSEnumerator[K] = extern
  @inline def initWithObjects(objects: V, keys: K, cnt: NSUInteger): NSDictionary[K, V] = extern
  @inline def initWithCoder(aDecoder: NSCoder): NSDictionary[K, V] = extern
  @inline def count(): NSUInteger = extern
  @inline def allKeysForObject(anObject: V): NSArray[K] = extern
  @inline def descriptionWithLocale(locale: id): NSString = extern
  @inline def descriptionWithLocale(locale: id, level: NSUInteger): NSString = extern
  @inline def isEqualToDictionary(otherDictionary: V): BOOL = extern
//  @inline def objectEnumerator(): NSEnumerator[V] = extern
  @inline def objectsForKeys(keys: K, marker: V): NSArray[V] = extern
  @inline def writeToFile(path: NSString, useAuxiliaryFile: BOOL): BOOL = extern
  @inline def writeToURL(url: NSURL, atomically: BOOL): BOOL = extern
  @inline def keysSortedByValueUsingSelector(comparator: SEL): NSArray[K] = extern
  @inline def getObjects(objects: V, keys: K, count: NSUInteger): Unit = extern
  @inline def objectForKeyedSubscript(key: K): V = extern
  @inline def enumerateKeysAndObjectsUsingBlock(block: Ptr[Byte]): Unit = extern
//  @inline def enumerateKeysAndObjectsWithOptions(opts: NSEnumerationOptions, block: Ptr[Byte]): Unit = extern
//  @inline def keysSortedByValueUsingComparator(cmptr: NSComparator): NSArray[K] = extern
//  @inline def keysSortedByValueWithOptions(opts: NSSortOptions, cmptr: NSComparator): NSArray[K] = extern
//  @inline def keysOfEntriesPassingTest(predicate: BOOL): NSSet[K] = extern
//  @inline def keysOfEntriesWithOptions(opts: NSEnumerationOptions, predicate: BOOL): NSSet[K] = extern
  @inline def allKeys(): NSArray[K] = extern
  @inline def allValues(): NSArray[V] = extern
  @inline def descriptionInStringsFileFormat(): NSString = extern
  @inline def getObjects(objects: V, keys: K): Unit = extern
  @inline def initWithObjectsAndKeys(firstObject: id): NSDictionary[K, V] = extern
  @inline def initWithDictionary(otherDictionary: V): NSDictionary[K, V] = extern
  @inline def initWithDictionary(otherDictionary: V, flag: BOOL): NSDictionary[K, V] = extern
  @inline def initWithObjects(objects: V, keys: K): NSDictionary[K, V] = extern
  @inline def initWithContentsOfFile(path: NSString): NSDictionary[K, V] = extern
  @inline def initWithContentsOfURL(url: NSURL): NSDictionary[K, V] = extern
}

@ObjCClass
abstract class NSDictionaryClass extends NSObjectClass {
  @inline def dictionary[K<:NSObject, V<:NSObject](): NSDictionary[K, V] = extern
  @inline def dictionaryWithObject[K<:NSObject, V<:NSObject](`object`: V, forKey: K): NSDictionary[K, V] = extern
  @inline def dictionaryWithObjects[K<:NSObject, V<:NSObject](objects: V, keys: K, cnt: NSUInteger): NSDictionary[K, V] = extern
//  @inline def dictionaryWithObjectsAndKeys[K<:NSObject, V<:NSObject](firstObject: id): NSDictionary[K, V] = extern
  @inline def dictionaryWithDictionary[K<:NSObject, V<:NSObject](dict: V): NSDictionary[K, V] = extern
//  @inline def dictionaryWithObjects[K<:NSObject, V<:NSObject](objects: V, keys: K): NSDictionary[K, V] = extern
  @inline def dictionaryWithContentsOfFile[K<:NSObject, V<:NSObject](path: NSString): NSDictionary[K, V] = extern
  @inline def dictionaryWithContentsOfURL[K<:NSObject, V<:NSObject](url: NSURL): NSDictionary[K, V] = extern
  //  @inline def sharedKeySetForKeys(keys: K): id = extern
}

object NSDictionary extends NSDictionaryClass {
  import objc.runtime._
  override type InstanceType = NSDictionary[_,_]
  private lazy val __sel_dictionaryWithObjects_forKeys_count = sel_registerName(c"dictionaryWithObjects:forKeys:count:")

  def apply[K<:NSObject, V<:NSObject](kv: (K,V)*): NSDictionary[K,V] = dictionaryWithObjects(kv)

  // TODO: use Iterable instead of Seq?
  def dictionaryWithObjects[K<:NSObject, V<:NSObject](objects: Seq[(K,V)]): NSDictionary[K,V] = Zone { implicit z =>
    val count = objects.size
    val objArray = stackalloc[id]( sizeof[id] * count)
    val keyArray = stackalloc[id]( sizeof[id] * count )
    for(i<-0 until count) {
      !(keyArray + i) = objects(i)._1
      !(objArray + i) = objects(i)._2
    }
    objc_msgSend(__cls,__sel_dictionaryWithObjects_forKeys_count,objArray,keyArray,count).cast[NSDictionary[K,V]]
  }


}