// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.appkit

import scalanative.native._
import cocoa.foundation.{BOOL, NSCoder, NSData, NSError, NSNotification, NSObject, NSString, NSURL, id}

import objc._


@ObjC
trait NSApplicationDelegate extends NSObject {
  @inline def applicationShouldTerminate_(sender: NSApplication): NSApplicationTerminateReply = extern
  @inline def application_urls_(application: NSApplication, urls: NSURL): Unit = extern
  @inline def application_filename_(sender: NSApplication, filename: NSString): BOOL = extern
  @inline def application_filenames_(sender: NSApplication, filenames: NSString): Unit = extern
  @inline def applicationShouldOpenUntitledFile_(sender: NSApplication): BOOL = extern
  @inline def applicationOpenUntitledFile_(sender: NSApplication): BOOL = extern
  @inline def application_filename_(sender: id, filename: NSString): BOOL = extern
//  @inline def application_fileNames_printSettings_showPrintPanels_(application: NSApplication, fileNames: NSString, printSettings: id, showPrintPanels: BOOL): NSApplicationPrintReply = extern
  @inline def applicationShouldTerminateAfterLastWindowClosed_(sender: NSApplication): BOOL = extern
  @inline def applicationShouldHandleReopen_flag_(sender: NSApplication, flag: BOOL): BOOL = extern
//  @inline def applicationDockMenu_(sender: NSApplication): NSMenu = extern
  @inline def application_error_(application: NSApplication, error: NSError): NSError = extern
  @inline def application_deviceToken_(application: NSApplication, deviceToken: NSData): Unit = extern
  @inline def application_userInfo_(application: NSApplication, userInfo: id): Unit = extern
  @inline def application_coder_(app: NSApplication, coder: NSCoder): Unit = extern
  @inline def application_userActivityType_(application: NSApplication, userActivityType: NSString): BOOL = extern
//  @inline def application_userActivity_restorationHandler_(application: NSApplication, userActivity: NSUserActivity, restorationHandler: Ptr[Byte]): BOOL = extern
  @inline def application_userActivityType_error_(application: NSApplication, userActivityType: NSString, error: NSError): Unit = extern
//  @inline def application_userActivity_(application: NSApplication, userActivity: NSUserActivity): Unit = extern
//  @inline def application_metadata_(application: NSApplication, metadata: CKShareMetadata): Unit = extern
  @inline def applicationWillFinishLaunching_(notification: NSNotification): Unit = extern
  @inline def applicationDidFinishLaunching_(notification: NSNotification): Unit = extern
  @inline def applicationWillHide_(notification: NSNotification): Unit = extern
  @inline def applicationDidHide_(notification: NSNotification): Unit = extern
  @inline def applicationWillUnhide_(notification: NSNotification): Unit = extern
  @inline def applicationDidUnhide_(notification: NSNotification): Unit = extern
  @inline def applicationWillBecomeActive_(notification: NSNotification): Unit = extern
  @inline def applicationDidBecomeActive_(notification: NSNotification): Unit = extern
  @inline def applicationWillResignActive_(notification: NSNotification): Unit = extern
  @inline def applicationDidResignActive_(notification: NSNotification): Unit = extern
  @inline def applicationWillUpdate_(notification: NSNotification): Unit = extern
  @inline def applicationDidUpdate_(notification: NSNotification): Unit = extern
  @inline def applicationWillTerminate_(notification: NSNotification): Unit = extern
  @inline def applicationDidChangeScreenParameters_(notification: NSNotification): Unit = extern
  @inline def applicationDidChangeOcclusionState_(notification: NSNotification): Unit = extern
}

