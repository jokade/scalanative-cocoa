// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.foundation

import scala.scalanative.native._
import objc._


@ObjC
class NSDictionary[K<:NSObject,V<:NSObject] extends NSObject with NSCopying with NSMutableCopying with NSSecureCoding with NSFastEnumeration {
  @inline def objectForKey_(aKey: K): V = extern
  @inline def keyEnumerator(): NSEnumerator[K] = extern
  @inline def initWithObjects_keys_cnt_(objects: V, keys: K, cnt: NSUInteger): NSDictionary[K, V] = extern
  @inline def count(): NSUInteger = extern
  @inline def allKeysForObject_(anObject: V): NSArray[K] = extern
  @inline def descriptionWithLocale_(locale: id): NSString = extern
  @inline def descriptionWithLocale_level_(locale: id, level: NSUInteger): NSString = extern
  @inline def isEqualToDictionary_(otherDictionary: V): BOOL = extern
  @inline def objectEnumerator(): NSEnumerator[V] = extern
  @inline def objectsForKeys_marker_(keys: K, marker: V): NSArray[V] = extern
  @inline def writeToFile_useAuxiliaryFile_(path: NSString, useAuxiliaryFile: BOOL): BOOL = extern
  @inline def writeToURL_atomically_(url: NSURL, atomically: BOOL): BOOL = extern
  @inline def keysSortedByValueUsingSelector_(comparator: SEL): NSArray[K] = extern
  @inline def getObjects_keys_count_(objects: V, keys: K, count: NSUInteger): Unit = extern
  @inline def objectForKeyedSubscript_(key: K): V = extern
  @inline def enumerateKeysAndObjectsUsingBlock_(block: Ptr[Byte]): Unit = extern
  @inline def enumerateKeysAndObjectsWithOptions_block_(opts: NSEnumerationOptions, block: Ptr[Byte]): Unit = extern
//  @inline def keysSortedByValueUsingComparator_(cmptr: NSComparator): NSArray[K] = extern
//  @inline def keysSortedByValueWithOptions_cmptr_(opts: NSSortOptions, cmptr: NSComparator): NSArray[K] = extern
//  @inline def keysOfEntriesPassingTest_(predicate: BOOL): NSSet[K] = extern
//  @inline def keysOfEntriesWithOptions_predicate_(opts: NSEnumerationOptions, predicate: BOOL): NSSet[K] = extern
  @inline def allKeys(): NSArray[K] = extern
  @inline def allValues(): NSArray[V] = extern
  @inline def descriptionInStringsFileFormat(): NSString = extern
  @inline def getObjects_keys_(objects: V, keys: K): Unit = extern
  @inline def initWithObjectsAndKeys_(firstObject: id): NSDictionary[K, V] = extern
  @inline def initWithDictionary_(otherDictionary: V): NSDictionary[K, V] = extern
  @inline def initWithDictionary_flag_(otherDictionary: V, flag: BOOL): NSDictionary[K, V] = extern
  @inline def initWithObjects_keys_(objects: V, keys: K): NSDictionary[K, V] = extern
  @inline def initWithContentsOfFile_(path: NSString): NSDictionary[K, V] = extern
  @inline def initWithContentsOfURL_(url: NSURL): NSDictionary[K, V] = extern
}

@ObjCClass
abstract class NSDictionaryClass extends NSObjectClass {
  @inline def dictionary[K<:NSObject,V<:NSObject](): NSDictionary[K, V] = extern
  @inline def dictionaryWithObject_key_[K<:NSObject,V<:NSObject](`object`: V, key: K): NSDictionary[K, V] = extern
  @inline def dictionaryWithObjects_keys_cnt_[K<:NSObject,V<:NSObject](objects: V, keys: K, cnt: NSUInteger): NSDictionary[K, V] = extern
  @inline def dictionaryWithObjectsAndKeys_[K<:NSObject,V<:NSObject](firstObject: id): NSDictionary[K, V] = extern
  @inline def dictionaryWithDictionary_[K<:NSObject,V<:NSObject](dict: V): NSDictionary[K, V] = extern
  @inline def dictionaryWithObjects_keys_[K<:NSObject,V<:NSObject](objects: V, keys: K): NSDictionary[K, V] = extern
  @inline def dictionaryWithContentsOfFile_[K<:NSObject,V<:NSObject](path: NSString): NSDictionary[K, V] = extern
  @inline def dictionaryWithContentsOfURL_[K<:NSObject,V<:NSObject](url: NSURL): NSDictionary[K, V] = extern
  @inline def sharedKeySetForKeys_[K<:NSObject](keys: K): id = extern
}

object NSDictionary extends NSDictionaryClass {
  import runtime._
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