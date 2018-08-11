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
  @inline def setObject_key_(obj: V, key: K): Unit = extern
  @inline override def initWithContentsOfFile_(path: NSString): NSMutableDictionary[K, V] = extern
  @inline override def initWithContentsOfURL_(url: NSURL): NSMutableDictionary[K, V] = extern
}

@ObjCClass
abstract class NSMutableDictionaryClass extends NSDictionaryClass {
  @inline def dictionaryWithCapacity_[K<:NSObject,V<:NSObject](numItems: NSUInteger): NSMutableDictionary[K, V] = extern
  @inline override def dictionaryWithContentsOfFile_[K<:NSObject,V<:NSObject](path: NSString): NSMutableDictionary[K, V] = extern
  @inline override def dictionaryWithContentsOfURL_[K<:NSObject,V<:NSObject](url: NSURL): NSMutableDictionary[K, V] = extern
  @inline def dictionaryWithSharedKeySet_[K<:NSObject,V<:NSObject](keyset: id): NSMutableDictionary[K, V] = extern
}

object NSMutableDictionary extends NSMutableDictionaryClass {
  override type InstanceType = NSMutableDictionary[_,_]
}