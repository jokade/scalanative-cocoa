package cocoa.foundation

import scalanative.native._

import scala.language.experimental.macros


@ObjC
class NSNotificationCenter extends NSObject {
  @inline def addObserver(observer: id, aSelector: SEL, aName: NSString, anObject: id): Unit = extern
  @inline def postNotification(notification: NSNotification): Unit = extern
  @inline def postNotificationName(aName: NSString, anObject: id): Unit = extern
  @inline def postNotificationName(aName: NSString, anObject: id, aUserInfo: id): Unit = extern
  @inline def removeObserver(observer: id): Unit = extern
  @inline def removeObserver(observer: id, aName: NSString, anObject: id): Unit = extern
//  @inline def addObserverForName(name: NSString, obj: id, queue: NSOperationQueue, block: Ptr[Byte]): id[NSObject] = extern
}

@ObjCClass
abstract class NSNotificationCenterClass extends NSObjectClass {
  @inline def defaultCenter(): NSNotificationCenter = extern
}

object NSNotificationCenter extends NSNotificationCenterClass {
  override type InstanceType = NSNotificationCenter
}