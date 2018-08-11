// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.appkit

import scalanative.native._
import objc._
import cocoa.foundation.{BOOL, NSArray, NSInteger, NSObject, NSObjectClass, NSString, NSUInteger, SEL, id}


@ObjC
class NSApplication extends NSResponder { //with NSUserInterfaceValidations with NSAccessibilityElement with NSAccessibility {
  @inline def hide_(sender: id): Unit = extern
  @inline def unhide_(sender: id): Unit = extern
  @inline def unhideWithoutActivation(): Unit = extern
  @inline def windowWithWindowNumber_(windowNum: NSInteger): NSWindow = extern
  @inline def deactivate(): Unit = extern
  @inline def activateIgnoringOtherApps_(flag: BOOL): Unit = extern
  @inline def hideOtherApplications_(sender: id): Unit = extern
  @inline def unhideAllApplications_(sender: id): Unit = extern
  @inline def finishLaunching(): Unit = extern
  @inline def run(): Unit = extern
//  @inline def runModalForWindow_(window: NSWindow): NSModalResponse = extern
  @inline def stop_(sender: id): Unit = extern
  @inline def stopModal(): Unit = extern
//  @inline def stopModalWithCode_(returnCode: NSModalResponse): Unit = extern
  @inline def abortModal(): Unit = extern
//  @inline def beginModalSessionForWindow_(window: NSWindow): NSModalSession = extern
//  @inline def runModalSession_(session: NSModalSession): NSModalResponse = extern
//  @inline def endModalSession_(session: NSModalSession): Unit = extern
  @inline def terminate_(sender: id): Unit = extern
//  @inline def requestUserAttention_(requestType: NSRequestUserAttentionType): NSInteger = extern
  @inline def cancelUserAttentionRequest_(request: NSInteger): Unit = extern
//  @inline def enumerateWindowsWithOptions_block_(options: NSWindowListOptions, block: Ptr[Byte]): Unit = extern
  @inline def preventWindowOrdering(): Unit = extern
  @inline def setWindowsNeedUpdate_(needUpdate: BOOL): Unit = extern
  @inline def updateWindows(): Unit = extern
//  @inline def activationPolicy(): NSApplicationActivationPolicy = extern
//  @inline def setActivationPolicy_(activationPolicy: NSApplicationActivationPolicy): BOOL = extern
//  @inline def reportException_(exception: NSException): Unit = extern
  @inline def replyToApplicationShouldTerminate_(shouldTerminate: BOOL): Unit = extern
  @inline def replyToOpenOrPrint_(reply: NSApplicationDelegateReply): Unit = extern
  @inline def orderFrontCharacterPalette_(sender: id): Unit = extern
  @inline def delegate(): NSApplicationDelegate = extern
  @inline def setDelegate_(delegate: NSApplicationDelegate): Unit = extern
  @inline def mainWindow(): NSWindow = extern
  @inline def keyWindow(): NSWindow = extern
  @inline def isActive(): BOOL = extern
  @inline def isHidden(): BOOL = extern
  @inline def isRunning(): BOOL = extern
  @inline def modalWindow(): NSWindow = extern
  @inline def windows(): NSArray[NSWindow] = extern
//  @inline def mainMenu(): NSMenu = extern
//  @inline def setMainMenu_(mainMenu: NSMenu): Unit = extern
//  @inline def helpMenu(): NSMenu = extern
//  @inline def setHelpMenu_(helpMenu: NSMenu): Unit = extern
//  @inline def applicationIconImage(): NSImage = extern
//  @inline def setApplicationIconImage_(applicationIconImage: NSImage): Unit = extern
//  @inline def dockTile(): NSDockTile = extern
  @inline def presentationOptions(): NSApplicationPresentationOptions = extern
  @inline def setPresentationOptions_(presentationOptions: NSApplicationPresentationOptions): Unit = extern
  @inline def currentSystemPresentationOptions(): NSApplicationPresentationOptions = extern
  @inline def occlusionState(): NSApplicationOcclusionState = extern
  @inline def sendEvent_(event: NSEvent): Unit = extern
  @inline def postEvent_flag_(event: NSEvent, flag: BOOL): Unit = extern
//  @inline def nextEventMatchingMask_expiration_mode_deqFlag_(mask: NSEventMask, expiration: NSDate, mode: NSRunLoopMode, deqFlag: BOOL): NSEvent = extern
  @inline def discardEventsMatchingMask_lastEvent_(mask: NSEventMask, lastEvent: NSEvent): Unit = extern
  @inline def currentEvent(): NSEvent = extern
  @inline def sendAction_target_sender_(action: SEL, target: id, sender: id): BOOL = extern
  @inline def targetForAction_(action: SEL): id = extern
  @inline def targetForAction_target_sender_(action: SEL, target: id, sender: id): id = extern
//  @inline def validRequestorForSendType_returnType_(sendType: NSPasteboardType, returnType: NSPasteboardType): id = extern
  @inline def arrangeInFront_(sender: id): Unit = extern
  @inline def removeWindowsItem_(win: NSWindow): Unit = extern
  @inline def addWindowsItem_string_isFilename_(win: NSWindow, string: NSString, isFilename: BOOL): Unit = extern
  @inline def changeWindowsItem_string_isFilename_(win: NSWindow, string: NSString, isFilename: BOOL): Unit = extern
  @inline def updateWindowsItem_(win: NSWindow): Unit = extern
  @inline def miniaturizeAll_(sender: id): Unit = extern
//  @inline def windowsMenu(): NSMenu = extern
//  @inline def setWindowsMenu_(windowsMenu: NSMenu): Unit = extern
  @inline def isFullKeyboardAccessEnabled(): BOOL = extern
//  @inline def registerServicesMenuSendTypes_returnTypes_(sendTypes: NSPasteboardType, returnTypes: NSPasteboardType): Unit = extern
//  @inline def servicesMenu(): NSMenu = extern
//  @inline def setServicesMenu_(servicesMenu: NSMenu): Unit = extern
  @inline def servicesProvider(): id = extern
  @inline def setServicesProvider_(servicesProvider: id): Unit = extern
  @inline def orderFrontStandardAboutPanel_(sender: id): Unit = extern
  @inline def orderFrontStandardAboutPanelWithOptions_(optionsDictionary: id): Unit = extern
//  @inline def userInterfaceLayoutDirection(): NSUserInterfaceLayoutDirection = extern
  @inline def disableRelaunchOnLogin(): Unit = extern
  @inline def enableRelaunchOnLogin(): Unit = extern
//  @inline def registerForRemoteNotificationTypes_(types: NSRemoteNotificationType): Unit = extern
  @inline def unregisterForRemoteNotifications(): Unit = extern
//  @inline def enabledRemoteNotificationTypes(): NSRemoteNotificationType = extern
  @inline def runModalForWindow_docWindow_(window: NSWindow, docWindow: NSWindow): NSInteger = extern
//  @inline def beginModalSessionForWindow_docWindow_(window: NSWindow, docWindow: NSWindow): NSModalSession = extern
  @inline def application_filenames_(sender: NSApplication, filenames: NSString): Unit = extern
//  @inline def beginSheet_docWindow_modalDelegate_didEndSelector_contextInfo_(sheet: NSWindow, docWindow: NSWindow, modalDelegate: id, didEndSelector: SEL, contextInfo: Ptr[Byte]): Unit = extern
  @inline def endSheet_(sheet: NSWindow): Unit = extern
  @inline def endSheet_returnCode_(sheet: NSWindow, returnCode: NSInteger): Unit = extern
  @inline def makeWindowsPerform_flag_(selector: SEL, flag: BOOL): NSWindow = extern
//  @inline def context(): NSGraphicsContext = extern
}

@ObjCClass
abstract class NSApplicationClass extends NSObjectClass {// NSResponderClass {
  @inline def detachDrawingThread_target_argument_(selector: SEL, target: id, argument: id): Unit = extern
  @inline def sharedApplication(): NSApplication = extern
}

object NSApplication extends NSApplicationClass {
  override type InstanceType = NSApplication
}