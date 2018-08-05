package cocoa.uikit

import cocoa.foundation.{BOOL, NSArray, NSInteger, NSObject, NSObjectClass, NSString, NSTimeInterval, NSURL, id}

import scalanative.native._

@ObjC
class UIApplication extends NSObject { //extends UIResponder {
  @inline def beginIgnoringInteractionEvents(): Unit = extern
  @inline def endIgnoringInteractionEvents(): Unit = extern
  @inline def openURL(url: NSURL): BOOL = extern
  @inline def canOpenURL(url: NSURL): BOOL = extern
  @inline def openURL(url: NSURL, options: id, completion: Ptr[Byte]): Unit = extern
//  @inline def sendEvent(event: UIEvent): Unit = extern
//  @inline def sendAction(action: SEL, target: id, sender: id, event: UIEvent): BOOL = extern
//  @inline def supportedInterfaceOrientationsForWindow(window: UIWindow): UIInterfaceOrientationMask = extern
//  @inline def beginBackgroundTaskWithExpirationHandler(handler: Ptr[Byte]): UIBackgroundTaskIdentifier = extern
//  @inline def beginBackgroundTaskWithName(taskName: NSString, handler: Ptr[Byte]): UIBackgroundTaskIdentifier = extern
//  @inline def endBackgroundTask(identifier: UIBackgroundTaskIdentifier): Unit = extern
  @inline def setMinimumBackgroundFetchInterval(minimumBackgroundFetchInterval: NSTimeInterval): Unit = extern
//  @inline def delegate(): id[UIApplicationDelegate] = extern
//  @inline def setDelegate(delegate: id[UIApplicationDelegate]): Unit = extern
  @inline def isIgnoringInteractionEvents(): BOOL = extern
  @inline def isIdleTimerDisabled(): BOOL = extern
  @inline def setIdleTimerDisabled(idleTimerDisabled: BOOL): Unit = extern
//  @inline def keyWindow(): UIWindow = extern
//  @inline def windows(): NSArray[__kindof UIWindow] = extern
  @inline def isNetworkActivityIndicatorVisible(): BOOL = extern
  @inline def setNetworkActivityIndicatorVisible(networkActivityIndicatorVisible: BOOL): Unit = extern
//  @inline def statusBarStyle(): UIStatusBarStyle = extern
  @inline def isStatusBarHidden(): BOOL = extern
//  @inline def statusBarOrientation(): UIInterfaceOrientation = extern
  @inline def statusBarOrientationAnimationDuration(): NSTimeInterval = extern
//  @inline def statusBarFrame(): CGRect = extern
  @inline def applicationIconBadgeNumber(): NSInteger = extern
  @inline def setApplicationIconBadgeNumber(applicationIconBadgeNumber: NSInteger): Unit = extern
  @inline def applicationSupportsShakeToEdit(): BOOL = extern
  @inline def setApplicationSupportsShakeToEdit(applicationSupportsShakeToEdit: BOOL): Unit = extern
//  @inline def applicationState(): UIApplicationState = extern
  @inline def backgroundTimeRemaining(): NSTimeInterval = extern
//  @inline def backgroundRefreshStatus(): UIBackgroundRefreshStatus = extern
  @inline def isProtectedDataAvailable(): BOOL = extern
//  @inline def userInterfaceLayoutDirection(): UIUserInterfaceLayoutDirection = extern
//  @inline def preferredContentSizeCategory(): UIContentSizeCategory = extern
  @inline def registerForRemoteNotifications(): Unit = extern
  @inline def unregisterForRemoteNotifications(): Unit = extern
//  @inline def registerForRemoteNotificationTypes(types: UIRemoteNotificationType): Unit = extern
//  @inline def enabledRemoteNotificationTypes(): UIRemoteNotificationType = extern
  @inline def isRegisteredForRemoteNotifications(): BOOL = extern
//  @inline def presentLocalNotificationNow(notification: UILocalNotification): Unit = extern
//  @inline def scheduleLocalNotification(notification: UILocalNotification): Unit = extern
//  @inline def cancelLocalNotification(notification: UILocalNotification): Unit = extern
  @inline def cancelAllLocalNotifications(): Unit = extern
//  @inline def scheduledLocalNotifications(): NSArray[UILocalNotification] = extern
//  @inline def setScheduledLocalNotifications(scheduledLocalNotifications: NSArray[UILocalNotification]): Unit = extern
//  @inline def registerUserNotificationSettings(notificationSettings: UIUserNotificationSettings): Unit = extern
//  @inline def currentUserNotificationSettings(): UIUserNotificationSettings = extern
  @inline def beginReceivingRemoteControlEvents(): Unit = extern
  @inline def endReceivingRemoteControlEvents(): Unit = extern
//  @inline def setNewsstandIconImage(image: UIImage): Unit = extern
//  @inline def shortcutItems(): NSArray[UIApplicationShortcutItem] = extern
//  @inline def setShortcutItems(shortcutItems: NSArray[UIApplicationShortcutItem]): Unit = extern
  @inline def extendStateRestoration(): Unit = extern
  @inline def completeStateRestoration(): Unit = extern
  @inline def ignoreSnapshotOnNextApplicationLaunch(): Unit = extern
  @inline def setStatusBarHidden(hidden: BOOL, animated: BOOL): Unit = extern
//  @inline def setStatusBarOrientation(interfaceOrientation: UIInterfaceOrientation, animated: BOOL): Unit = extern
//  @inline def setStatusBarStyle(statusBarStyle: UIStatusBarStyle, animated: BOOL): Unit = extern
//  @inline def setStatusBarHidden(hidden: BOOL, animation: UIStatusBarAnimation): Unit = extern
  @inline def setKeepAliveTimeout(timeout: NSTimeInterval, keepAliveHandler: Ptr[Byte]): BOOL = extern
  @inline def clearKeepAliveTimeout(): Unit = extern
  @inline def isProximitySensingEnabled(): BOOL = extern
  @inline def setProximitySensingEnabled(proximitySensingEnabled: BOOL): Unit = extern
//  @inline def statusBarOrientation(): UIInterfaceOrientation = extern
//  @inline def setStatusBarOrientation(statusBarOrientation: UIInterfaceOrientation): Unit = extern
//  @inline def statusBarStyle(): UIStatusBarStyle = extern
//  @inline def setStatusBarStyle(statusBarStyle: UIStatusBarStyle): Unit = extern
  @inline def setStatusBarHidden(statusBarHidden: BOOL): Unit = extern
}

@ObjCClass
abstract class UIApplicationClass extends NSObjectClass { // extends UIResponderClass
  @inline def sharedApplication(): UIApplication = extern
  @inline def registerObjectForStateRestoration(`object`: id, restorationIdentifier: NSString): Unit = extern
}

object UIApplication extends UIApplicationClass {
  override type InstanceType = UIApplication
}
