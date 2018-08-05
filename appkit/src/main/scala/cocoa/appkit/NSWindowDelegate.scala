package cocoa.appkit

import scalanative.native._
import cocoa.foundation.{BOOL, NSArray, NSCoder, NSNotification, NSObject, NSPoint, NSRect, NSSize}
import objc.runtime.id

import scala.language.experimental.macros

@ObjC
trait NSWindowDelegate extends NSObject {
  @inline def windowShouldClose(sender: id): BOOL = extern
  @inline def windowWillReturnFieldEditor(sender: NSWindow, client: id): id = extern
  @inline def windowWillResize(sender: NSWindow, frameSize: NSSize): NSSize = extern
  @inline def windowWillUseStandardFrame(window: NSWindow, newFrame: NSRect): NSRect = extern
  @inline def windowShouldZoom(window: NSWindow, newFrame: NSRect): BOOL = extern
//  @inline def windowWillReturnUndoManager(window: NSWindow): NSUndoManager = extern
  @inline def window(window: NSWindow, sheet: NSWindow, rect: NSRect): NSRect = extern
//  @inline def window(window: NSWindow, menu: NSMenu): BOOL = extern
//  @inline def window(window: NSWindow, event: NSEvent, dragImageLocation: NSPoint, pasteboard: NSPasteboard): BOOL = extern
  @inline def window(window: NSWindow, proposedSize: NSSize): NSSize = extern
//  @inline def window(window: NSWindow, proposedOptions: NSApplicationPresentationOptions): NSApplicationPresentationOptions = extern
  @inline def customWindowsToEnterFullScreenForWindow(window: NSWindow): NSArray[NSWindow] = extern
//  @inline def window(window: NSWindow, duration: NSTimeInterval): Unit = extern
  @inline def windowDidFailToEnterFullScreen(window: NSWindow): Unit = extern
  @inline def customWindowsToExitFullScreenForWindow(window: NSWindow): NSArray[NSWindow] = extern
//  @inline def window(window: NSWindow, duration: NSTimeInterval): Unit = extern
//  @inline def customWindowsToEnterFullScreenForWindow(window: NSWindow, screen: NSScreen): NSArray[NSWindow] = extern
//  @inline def window(window: NSWindow, screen: NSScreen, duration: NSTimeInterval): Unit = extern
  @inline def windowDidFailToExitFullScreen(window: NSWindow): Unit = extern
  @inline def window(window: NSWindow, maxPreferredFrameSize: NSSize, maxAllowedFrameSize: NSSize): NSSize = extern
  @inline def window(window: NSWindow, state: NSCoder): Unit = extern
  @inline def windowDidResize(notification: NSNotification): Unit = extern
  @inline def windowDidExpose(notification: NSNotification): Unit = extern
  @inline def windowWillMove(notification: NSNotification): Unit = extern
  @inline def windowDidMove(notification: NSNotification): Unit = extern
  @inline def windowDidBecomeKey(notification: NSNotification): Unit = extern
  @inline def windowDidResignKey(notification: NSNotification): Unit = extern
  @inline def windowDidBecomeMain(notification: NSNotification): Unit = extern
  @inline def windowDidResignMain(notification: NSNotification): Unit = extern
  @inline def windowWillClose(notification: NSNotification): Unit = extern
  @inline def windowWillMiniaturize(notification: NSNotification): Unit = extern
  @inline def windowDidMiniaturize(notification: NSNotification): Unit = extern
  @inline def windowDidDeminiaturize(notification: NSNotification): Unit = extern
  @inline def windowDidUpdate(notification: NSNotification): Unit = extern
  @inline def windowDidChangeScreen(notification: NSNotification): Unit = extern
  @inline def windowDidChangeScreenProfile(notification: NSNotification): Unit = extern
  @inline def windowDidChangeBackingProperties(notification: NSNotification): Unit = extern
  @inline def windowWillBeginSheet(notification: NSNotification): Unit = extern
  @inline def windowDidEndSheet(notification: NSNotification): Unit = extern
  @inline def windowWillStartLiveResize(notification: NSNotification): Unit = extern
  @inline def windowDidEndLiveResize(notification: NSNotification): Unit = extern
  @inline def windowWillEnterFullScreen(notification: NSNotification): Unit = extern
  @inline def windowDidEnterFullScreen(notification: NSNotification): Unit = extern
  @inline def windowWillExitFullScreen(notification: NSNotification): Unit = extern
  @inline def windowDidExitFullScreen(notification: NSNotification): Unit = extern
  @inline def windowWillEnterVersionBrowser(notification: NSNotification): Unit = extern
  @inline def windowDidEnterVersionBrowser(notification: NSNotification): Unit = extern
  @inline def windowWillExitVersionBrowser(notification: NSNotification): Unit = extern
  @inline def windowDidExitVersionBrowser(notification: NSNotification): Unit = extern
  @inline def windowDidChangeOcclusionState(notification: NSNotification): Unit = extern
}
