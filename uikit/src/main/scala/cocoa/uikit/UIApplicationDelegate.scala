// Copyright (c) 2017. Distributed under the MIT License (see included LICENSE file).
package cocoa.uikit

import cocoa.foundation.{BOOL, NSArray, NSCoder, NSData, NSDictionary, NSError, NSObject, NSObjectClass, NSString, NSTimeInterval, NSURL}
import objc.runtime.id

import scala.language.experimental.macros
import objc.{ObjC, ObjCClass}

import scalanative.native._

@ObjC
trait UIApplicationDelegate extends NSObject {
  @inline def applicationDidFinishLaunching(application: UIApplication): Unit = extern
//  @inline def application(application: UIApplication, launchOptions: NSDictionary): BOOL = extern
  @inline def applicationDidBecomeActive(application: UIApplication): Unit = extern
  @inline def applicationWillResignActive(application: UIApplication): Unit = extern
  @inline def application(application: UIApplication, url: NSURL): BOOL = extern
  @inline def application(application: UIApplication, url: NSURL, sourceApplication: NSString, annotation: id): BOOL = extern
  @inline def application(app: UIApplication, url: NSURL, options: id): BOOL = extern
  @inline def application(application: UIApplication, didFinishLaunchingWithOptions: NSDictionary[NSObject,NSObject]): BOOL = extern
  @inline def applicationDidReceiveMemoryWarning(application: UIApplication): Unit = extern
  @inline def applicationWillTerminate(application: UIApplication): Unit = extern
  @inline def applicationSignificantTimeChange(application: UIApplication): Unit = extern
//  @inline def application(application: UIApplication, newStatusBarOrientation: UIInterfaceOrientation, duration: NSTimeInterval): Unit = extern
//  @inline def application(application: UIApplication, oldStatusBarOrientation: UIInterfaceOrientation): Unit = extern
//  @inline def application(application: UIApplication, newStatusBarFrame: CGRect): Unit = extern
//  @inline def application(application: UIApplication, oldStatusBarFrame: CGRect): Unit = extern
//  @inline def application(application: UIApplication, notificationSettings: UIUserNotificationSettings): Unit = extern
  @inline def application(application: UIApplication, deviceToken: NSData): Unit = extern
  @inline def application(application: UIApplication, error: NSError): Unit = extern
//  @inline def application(application: UIApplication, userInfo: NSDictionary): Unit = extern
//  @inline def application(application: UIApplication, notification: UILocalNotification): Unit = extern
//  @inline def application(application: UIApplication, identifier: NSString, notification: UILocalNotification, completionHandler: Ptr[Byte]): Unit = extern
//  @inline def application(application: UIApplication, identifier: NSString, userInfo: NSDictionary, responseInfo: NSDictionary, completionHandler: Ptr[Byte]): Unit = extern
//  @inline def application(application: UIApplication, identifier: NSString, userInfo: NSDictionary, completionHandler: Ptr[Byte]): Unit = extern
//  @inline def application(application: UIApplication, identifier: NSString, notification: UILocalNotification, responseInfo: NSDictionary, completionHandler: Ptr[Byte]): Unit = extern
//  @inline def application(application: UIApplication, userInfo: NSDictionary, completionHandler: Ptr[Byte]): Unit = extern
  @inline def application(application: UIApplication, completionHandler: Ptr[Byte]): Unit = extern
//  @inline def application(application: UIApplication, shortcutItem: UIApplicationShortcutItem, completionHandler: Ptr[Byte]): Unit = extern
  @inline def application(application: UIApplication, identifier: NSString, completionHandler: Ptr[Byte]): Unit = extern
//  @inline def application(application: UIApplication, userInfo: NSDictionary, reply: Ptr[Byte]): Unit = extern
  @inline def applicationShouldRequestHealthAuthorization(application: UIApplication): Unit = extern
  @inline def applicationDidEnterBackground(application: UIApplication): Unit = extern
  @inline def applicationWillEnterForeground(application: UIApplication): Unit = extern
  @inline def applicationProtectedDataWillBecomeUnavailable(application: UIApplication): Unit = extern
  @inline def applicationProtectedDataDidBecomeAvailable(application: UIApplication): Unit = extern
//  @inline def application(application: UIApplication, window: UIWindow): UIInterfaceOrientationMask = extern
//  @inline def application(application: UIApplication, extensionPointIdentifier: UIApplicationExtensionPointIdentifier): BOOL = extern
//  @inline def application(application: UIApplication, identifierComponents: NSArray, coder: NSCoder): UIViewController = extern
  @inline def application(application: UIApplication, coder: NSCoder): BOOL = extern
  @inline def application(application: UIApplication, userActivityType: NSString): BOOL = extern
//  @inline def application(application: UIApplication, userActivity: NSUserActivity, restorationHandler: Ptr[Byte]): BOOL = extern
  @inline def application(application: UIApplication, userActivityType: NSString, error: NSError): Unit = extern
//  @inline def application(application: UIApplication, userActivity: NSUserActivity): Unit = extern
//  @inline def application(application: UIApplication, cloudKitShareMetadata: CKShareMetadata): Unit = extern
//  @inline def window(): UIWindow = extern
//  @inline def setWindow(window: UIWindow): Unit = extern
}


@ObjCClass
abstract class UIApplicationDelegateClass extends NSObjectClass {
}

object UIApplicationDelegate extends UIApplicationDelegateClass {
  override type InstanceType = UIApplicationDelegate
}