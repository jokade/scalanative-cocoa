package cocoa.appkit

import cocoa.foundation.{BOOL, NSCoder, NSData, NSError, NSObject, NSString}
import objc.runtime.id

import scala.language.experimental.macros
import objc.{ObjC, ObjCClass}

import scalanative.native._


@ObjC
trait NSApplicationDelegate extends NSObject {
//  @inline def applicationShouldTerminate(sender: NSApplication): NSApplicationTerminateReply = extern
  @inline def application(sender: NSApplication, filename: NSString): BOOL = extern
//  @inline def application(sender: NSApplication, filenames: NSString): Unit = extern
//  @inline def application(sender: NSApplication, filename: NSString): BOOL = extern
  @inline def applicationShouldOpenUntitledFile(sender: NSApplication): BOOL = extern
  @inline def applicationOpenUntitledFile(sender: NSApplication): BOOL = extern
  @inline def application(sender: id, filename: NSString): BOOL = extern
//  @inline def application(sender: NSApplication, filename: NSString): BOOL = extern
//  @inline def application(application: NSApplication, fileNames: NSString, printSettings: id, showPrintPanels: BOOL): NSApplicationPrintReply = extern
  @inline def applicationShouldTerminateAfterLastWindowClosed(sender: NSApplication): BOOL = extern
  @inline def applicationShouldHandleReopen(sender: NSApplication, flag: BOOL): BOOL = extern
//  @inline def applicationDockMenu(sender: NSApplication): NSMenu = extern
  @inline def application(application: NSApplication, error: NSError): NSError = extern
  @inline def application(application: NSApplication, deviceToken: NSData): Unit = extern
//  @inline def application(application: NSApplication, error: NSError): Unit = extern
  @inline def application(application: NSApplication, userInfo: id): Unit = extern
  @inline def application(app: NSApplication, coder: NSCoder): Unit = extern
//  @inline def application(app: NSApplication, coder: NSCoder): Unit = extern
//  @inline def application(application: NSApplication, userActivityType: NSString): BOOL = extern
//  @inline def application(application: NSApplication, userActivity: NSUserActivity, restorationHandler: Ptr[Byte]): BOOL = extern
  @inline def application(application: NSApplication, userActivityType: NSString, error: NSError): Unit = extern
//  @inline def application(application: NSApplication, userActivity: NSUserActivity): Unit = extern
//  @inline def applicationWillFinishLaunching(notification: NSNotification): Unit = extern
//  @inline def applicationDidFinishLaunching(notification: NSNotification): Unit = extern
//  @inline def applicationWillHide(notification: NSNotification): Unit = extern
//  @inline def applicationDidHide(notification: NSNotification): Unit = extern
//  @inline def applicationWillUnhide(notification: NSNotification): Unit = extern
//  @inline def applicationDidUnhide(notification: NSNotification): Unit = extern
//  @inline def applicationWillBecomeActive(notification: NSNotification): Unit = extern
//  @inline def applicationDidBecomeActive(notification: NSNotification): Unit = extern
//  @inline def applicationWillResignActive(notification: NSNotification): Unit = extern
//  @inline def applicationDidResignActive(notification: NSNotification): Unit = extern
//  @inline def applicationWillUpdate(notification: NSNotification): Unit = extern
//  @inline def applicationDidUpdate(notification: NSNotification): Unit = extern
//  @inline def applicationWillTerminate(notification: NSNotification): Unit = extern
//  @inline def applicationDidChangeScreenParameters(notification: NSNotification): Unit = extern
//  @inline def applicationDidChangeOcclusionState(notification: NSNotification): Unit = extern
}
