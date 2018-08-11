// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.foundation

import scalanative.native._
import objc._

@ObjC
class NSNotification extends NSObject with NSCopying with NSCoding {
  @inline def initWithName_object_userInfo_(name: NSNotificationName, `object`: id, userInfo: NSDictionary[NSObject,NSObject]): NSNotification = extern
  @inline def name(): NSNotificationName = extern
  @inline def `object`(): id = extern
  @inline def userInfo(): NSDictionary[NSObject,NSObject] = extern
}


@ObjCClass
abstract class NSNotificationClass extends NSObjectClass {
  @inline def notificationWithName_anObject_(aName: NSNotificationName, anObject: id): NSNotification = extern
  @inline def notificationWithName_anObject_aUserInfo_(aName: NSNotificationName, anObject: id, aUserInfo: NSDictionary[NSObject,NSObject]): NSNotification = extern
}

object NSNotification extends NSNotificationClass {
  override type InstanceType = NSNotification
}