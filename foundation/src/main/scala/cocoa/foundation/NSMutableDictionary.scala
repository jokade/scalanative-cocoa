// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.foundation

import scala.language.experimental.macros
import scalanative.native._

@ObjC
class NSMutableDictionary[K<:NSObject,V<:NSObject] extends NSDictionary[K,V] {
  @inline def removeObjectForKey(aKey: K): Unit = extern
//  @inline def setObject(anObject: V, aKey: K): Unit = extern
//  @inline def init(): NSMutableDictionary[KeyType, ObjectType] = extern
  @inline def initWithCapacity(numItems: NSUInteger): NSMutableDictionary[K, V] = extern
//  @inline def initWithCoder(aDecoder: NSCoder): NSMutableDictionary[KeyType, ObjectType] = extern
  @inline def addEntriesFromDictionary(otherDictionary: V): Unit = extern
  @inline def removeAllObjects(): Unit = extern
  @inline def removeObjectsForKeys(keyArray: K): Unit = extern
  @inline def setDictionary(otherDictionary: V): Unit = extern
  @inline def setObject(obj: V, key: K): Unit = extern
//  @inline def initWithContentsOfFile(path: NSString): NSMutableDictionary[KeyType, ObjectType] = extern
//  @inline def initWithContentsOfURL(url: NSURL): NSMutableDictionary[KeyType, ObjectType] = extern
}

@ObjCClass
abstract class NSMutableDictionaryClass extends NSDictionaryClass {
//  @inline def dictionaryWithCapacity[K<:NSObject,V<:NSObject](numItems: NSUInteger): NSMutableDictionary[K, V] = extern
//  @inline def dictionaryWithContentsOfFile[K<:NSObject,V<:NSObject](path: NSString): NSMutableDictionary[K, V] = extern
//  @inline def dictionaryWithContentsOfURL[K<:NSObject,V<:NSObject](url: NSURL): NSMutableDictionary[K, V] = extern
//  @inline def dictionaryWithSharedKeySet[K<:NSObject,V<:NSObject](keyset: id): NSMutableDictionary[K, V] = extern
}

object NSMutableDictionary extends NSMutableDictionaryClass {
  override type InstanceType = NSMutableDictionary[_,_]
}