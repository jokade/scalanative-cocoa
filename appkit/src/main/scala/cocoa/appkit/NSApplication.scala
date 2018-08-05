package cocoa.appkit

import scalanative.native._
import cocoa.foundation.{BOOL, NSArray, NSInteger, NSObject, NSObjectClass, NSString, NSUInteger}
import objc.runtime.{SEL, id}

import scala.language.experimental.macros



@ObjC
class NSApplication extends NSObject {//NSResponder with NSUserInterfaceValidations with NSAccessibilityElement with NSAccessibility {
  @inline def hide(sender: id): Unit = extern
  @inline def unhide(sender: id): Unit = extern
  @inline def unhideWithoutActivation(): Unit = extern
//  @inline def windowWithWindowNumber(windowNum: NSInteger): NSWindow = extern
  @inline def deactivate(): Unit = extern
  @inline def activateIgnoringOtherApps(flag: BOOL): Unit = extern
  @inline def hideOtherApplications(sender: id): Unit = extern
  @inline def unhideAllApplications(sender: id): Unit = extern
  @inline def finishLaunching(): Unit = extern
  @inline def run(): Unit = extern
//  @inline def runModalForWindow(theWindow: NSWindow): NSInteger = extern
  @inline def stop(sender: id): Unit = extern
  @inline def stopModal(): Unit = extern
  @inline def stopModalWithCode(returnCode: NSInteger): Unit = extern
  @inline def abortModal(): Unit = extern
//  @inline def beginModalSessionForWindow(theWindow: NSWindow): NSModalSession = extern
//  @inline def runModalSession(session: NSModalSession): NSInteger = extern
//  @inline def endModalSession(session: NSModalSession): Unit = extern
  @inline def terminate(sender: id): Unit = extern
//  @inline def requestUserAttention(requestType: NSRequestUserAttentionType): NSInteger = extern
  @inline def cancelUserAttentionRequest(request: NSInteger): Unit = extern
//  @inline def nextEventMatchingMask(mask: NSUInteger, expiration: NSDate, mode: NSString, deqFlag: BOOL): NSEvent = extern
//  @inline def discardEventsMatchingMask(mask: NSUInteger, lastEvent: NSEvent): Unit = extern
//  @inline def postEvent(event: NSEvent, flag: BOOL): Unit = extern
//  @inline def sendEvent(theEvent: NSEvent): Unit = extern
  @inline def preventWindowOrdering(): Unit = extern
//  @inline def makeWindowsPerform(aSelector: SEL, flag: BOOL): NSWindow = extern
  @inline def setWindowsNeedUpdate(needUpdate: BOOL): Unit = extern
  @inline def updateWindows(): Unit = extern
//  @inline def activationPolicy(): NSApplicationActivationPolicy = extern
//  @inline def setActivationPolicy(activationPolicy: NSApplicationActivationPolicy): BOOL = extern
  @inline def sendAction(theAction: SEL, theTarget: id, sender: id): BOOL = extern
  @inline def targetForAction(theAction: SEL): id = extern
  @inline def targetForAction(theAction: SEL, theTarget: id, sender: id): id = extern
  @inline def tryToPerform(anAction: SEL, anObject: id): BOOL = extern
  @inline def validRequestorForSendType(sendType: NSString, returnType: NSString): id = extern
//  @inline def reportException(theException: NSException): Unit = extern
  @inline def replyToApplicationShouldTerminate(shouldTerminate: BOOL): Unit = extern
//  @inline def replyToOpenOrPrint(reply: NSApplicationDelegateReply): Unit = extern
  @inline def orderFrontCharacterPalette(sender: id): Unit = extern
  @inline def delegate(): NSApplicationDelegate = extern
  @inline def setDelegate(delegate: NSApplicationDelegate): Unit = extern
//  @inline def context(): NSGraphicsContext = extern
//  @inline def mainWindow(): NSWindow = extern
//  @inline def keyWindow(): NSWindow = extern
  @inline def isActive(): BOOL = extern
  @inline def isHidden(): BOOL = extern
  @inline def isRunning(): BOOL = extern
//  @inline def modalWindow(): NSWindow = extern
//  @inline def currentEvent(): NSEvent = extern
//  @inline def windows(): NSArray[NSWindow] = extern
//  @inline def mainMenu(): NSMenu = extern
//  @inline def setMainMenu(mainMenu: NSMenu): Unit = extern
//  @inline def helpMenu(): NSMenu = extern
//  @inline def setHelpMenu(helpMenu: NSMenu): Unit = extern
//  @inline def applicationIconImage(): NSImage = extern
//  @inline def setApplicationIconImage(applicationIconImage: NSImage): Unit = extern
//  @inline def dockTile(): NSDockTile = extern
//  @inline def presentationOptions(): NSApplicationPresentationOptions = extern
//  @inline def setPresentationOptions(presentationOptions: NSApplicationPresentationOptions): Unit = extern
//  @inline def currentSystemPresentationOptions(): NSApplicationPresentationOptions = extern
//  @inline def occlusionState(): NSApplicationOcclusionState = extern
  @inline def arrangeInFront(sender: id): Unit = extern
//  @inline def removeWindowsItem(win: NSWindow): Unit = extern
//  @inline def addWindowsItem(win: NSWindow, aString: NSString, isFilename: BOOL): Unit = extern
//  @inline def changeWindowsItem(win: NSWindow, aString: NSString, isFilename: BOOL): Unit = extern
//  @inline def updateWindowsItem(win: NSWindow): Unit = extern
  @inline def miniaturizeAll(sender: id): Unit = extern
//  @inline def windowsMenu(): NSMenu = extern
//  @inline def setWindowsMenu(windowsMenu: NSMenu): Unit = extern
  @inline def isFullKeyboardAccessEnabled(): BOOL = extern
  @inline def registerServicesMenuSendTypes(sendTypes: NSString, returnTypes: NSString): Unit = extern
//  @inline def servicesMenu(): NSMenu = extern
//  @inline def setServicesMenu(servicesMenu: NSMenu): Unit = extern
  @inline def servicesProvider(): id = extern
  @inline def setServicesProvider(servicesProvider: id): Unit = extern
  @inline def orderFrontStandardAboutPanel(sender: id): Unit = extern
  @inline def orderFrontStandardAboutPanelWithOptions(optionsDictionary: id): Unit = extern
//  @inline def userInterfaceLayoutDirection(): NSUserInterfaceLayoutDirection = extern
  @inline def disableRelaunchOnLogin(): Unit = extern
  @inline def enableRelaunchOnLogin(): Unit = extern
//  @inline def registerForRemoteNotificationTypes(types: NSRemoteNotificationType): Unit = extern
  @inline def unregisterForRemoteNotifications(): Unit = extern
//  @inline def enabledRemoteNotificationTypes(): NSRemoteNotificationType = extern
//  @inline def runModalForWindow(theWindow: NSWindow, docWindow: NSWindow): NSInteger = extern
//  @inline def beginModalSessionForWindow(theWindow: NSWindow, docWindow: NSWindow): NSModalSession = extern
  @inline def application(sender: NSApplication, filenames: NSString): Unit = extern
//  @inline def beginSheet(sheet: NSWindow, docWindow: NSWindow, modalDelegate: id, didEndSelector: SEL, contextInfo: Ptr[Byte]): Unit = extern
//  @inline def endSheet(sheet: NSWindow): Unit = extern
//  @inline def endSheet(sheet: NSWindow, returnCode: NSInteger): Unit = extern
}


@ObjCClass
abstract class NSApplicationClass extends NSObjectClass {// NSResponderClass {
  @inline def sharedApplication(): NSApplication = extern
  @inline def detachDrawingThread(selector: SEL, target: id, argument: id): Unit = extern
}

object NSApplication extends NSApplicationClass {
  override type InstanceType = NSApplication
}