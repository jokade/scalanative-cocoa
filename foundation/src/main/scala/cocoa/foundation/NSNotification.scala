package cocoa.foundation

import objc.runtime.id

import scala.language.experimental.macros
import objc.{ObjC, ObjCClass}

import scalanative.native._

@ObjC
class NSNotification extends NSObject with NSCopying with NSCoding {
  @inline def initWithName(name: NSString, `object`: id, userInfo: id): NSNotification = extern
  @inline def initWithCoder(aDecoder: NSCoder): NSNotification = extern
  @inline def name(): NSString = extern
  @inline def `object`(): id = extern
  @inline def userInfo(): id = extern
}

@ObjCClass
abstract class NSNotificationClass extends NSObjectClass {
  @inline def notificationWithName(aName: NSString, anObject: id): NSNotification = extern
  @inline def notificationWithName(aName: NSString, anObject: id, aUserInfo: id): NSNotification = extern
}

object NSNotification extends NSNotificationClass {
  override type InstanceType = NSNotification
}