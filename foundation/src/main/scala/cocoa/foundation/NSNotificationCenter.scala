// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.foundation

import scalanative.native._
import scalanative.unsafe._
import objc._


@ObjC
class NSNotificationCenter extends NSObject {
  @inline def addObserver_aSelector_aName_anObject_(observer: id, aSelector: SEL, aName: NSNotificationName, anObject: id): Unit = extern
  @inline def postNotification_(notification: NSNotification): Unit = extern
  @inline def postNotificationName_anObject_(aName: NSNotificationName, anObject: id): Unit = extern
  @inline def postNotificationName_anObject_aUserInfo_(aName: NSNotificationName, anObject: id, aUserInfo: NSDictionary[NSObject,NSObject]): Unit = extern
  @inline def removeObserver_(observer: id): Unit = extern
  @inline def removeObserver_aName_anObject_(observer: id, aName: NSNotificationName, anObject: id): Unit = extern
//  @inline def addObserverForName_obj_queue_block_(name: NSNotificationName, obj: id, queue: NSOperationQueue, block: Ptr[Byte]): id[NSObject] = extern
}

@ObjCClass
abstract class NSNotificationCenterClass extends NSObjectClass {
  @inline def defaultCenter(): NSNotificationCenter = extern
}

object NSNotificationCenter extends NSNotificationCenterClass {
  override type InstanceType = NSNotificationCenter
}
