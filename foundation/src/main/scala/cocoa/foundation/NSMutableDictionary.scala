// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.foundation

import scalanative.native._
import objc._

@ObjC
class NSMutableDictionary[K<:NSObject,V<:NSObject] extends NSDictionary[K,V] {
  @inline def removeObjectForKey_(aKey: K): Unit = extern
  @inline def setObject_aKey_(anObject: V, aKey: K): Unit = extern
  @inline def initWithCapacity_(numItems: NSUInteger): NSMutableDictionary[K, V] = extern
  @inline def addEntriesFromDictionary_(otherDictionary: V): Unit = extern
  @inline def removeAllObjects(): Unit = extern
  @inline def removeObjectsForKeys_(keyArray: K): Unit = extern
  @inline def setDictionary_(otherDictionary: V): Unit = extern
  @inline def setObject_forKey_(obj: V, key: K): Unit = extern
  @inline override def initWithContentsOfFile_(path: NSString): NSMutableDictionary[K, V] = extern
  @inline override def initWithContentsOfURL_(url: NSURL): NSMutableDictionary[K, V] = extern
}

@ObjCClass
abstract class NSMutableDictionaryClass extends NSDictionaryClass {
  @inline def dictionaryWithCapacity_[K<:NSObject,V<:NSObject](numItems: NSUInteger): NSMutableDictionary[K, V] = extern
  @inline override def dictionaryWithContentsOfFile_[K<:NSObject,V<:NSObject](path: NSString): NSMutableDictionary[K, V] = extern
  @inline override def dictionaryWithContentsOfURL_[K<:NSObject,V<:NSObject](url: NSURL): NSMutableDictionary[K, V] = extern
  @inline def dictionaryWithSharedKeySet_[K<:NSObject,V<:NSObject](keyset: id): NSMutableDictionary[K, V] = extern

  @inline override def dictionary[K<:NSObject,V<:NSObject](): NSMutableDictionary[K, V] = extern
  @inline override def dictionaryWithObject_key_[K<:NSObject,V<:NSObject](`object`: V, key: K): NSMutableDictionary[K, V] = extern
  @inline override def dictionaryWithObjects_forKeys_count_[K<:NSObject,V<:NSObject](objects: Ptr[id], keys: Ptr[id], cnt: NSUInteger): NSMutableDictionary[K, V] = extern
  @inline override def dictionaryWithObjectsAndKeys_[K<:NSObject,V<:NSObject](firstObject: id): NSMutableDictionary[K, V] = extern
  @inline override def dictionaryWithDictionary_[K<:NSObject,V<:NSObject](dict: V): NSMutableDictionary[K, V] = extern
  @inline override def dictionaryWithObjects_forKeys_[K<:NSObject,V<:NSObject](objects: Ptr[id], keys: Ptr[id]): NSMutableDictionary[K, V] = extern
  @inline override def sharedKeySetForKeys_[K<:NSObject](keys: K): id = extern
}

object NSMutableDictionary extends NSMutableDictionaryClass {
  override type InstanceType = NSMutableDictionary[_,_]
    def apply[K<:NSObject, V<:NSObject](kv: (K,V)*): NSDictionary[K,V] = dictionaryWithObjects(kv)

  // TODO: use Iterable instead of Seq?
  def dictionaryWithObjects[K<:NSObject, V<:NSObject](objects: Seq[(K,V)]): NSMutableDictionary[K,V] = Zone { implicit z =>
    val count = objects.size
    val objArray = stackalloc[id]( sizeof[id] * count)
    val keyArray = stackalloc[id]( sizeof[id] * count )
    for(i<-0 until count) {
      !(keyArray + i) = objects(i)._1.toPtr
      !(objArray + i) = objects(i)._2.toPtr
    }
    dictionaryWithObjects_forKeys_count_(objArray,keyArray,count.toULong)
    //objc_msgSend(__cls,__sel_dictionaryWithObjects_forKeys_count,objArray,keyArray,count).cast[NSDictionary[K,V]]
  }

}