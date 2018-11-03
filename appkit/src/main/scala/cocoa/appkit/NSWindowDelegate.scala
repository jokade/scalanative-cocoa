// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.appkit

import scalanative.native._
import objc._
import cocoa.foundation._

@ObjC
trait NSWindowDelegate extends NSObject {
  @inline def windowShouldClose_(sender: NSWindow): BOOL = extern
  @inline def windowWillReturnFieldEditor_client_(sender: NSWindow, client: id): id = extern
  @inline def windowWillResize_frameSize_(sender: NSWindow, frameSize: NSSize): NSSize = extern
  @inline def windowWillUseStandardFrame_newFrame_(window: NSWindow, newFrame: NSRect): NSRect = extern
  @inline def windowShouldZoom_newFrame_(window: NSWindow, newFrame: NSRect): BOOL = extern
//  @inline def windowWillReturnUndoManager_(window: NSWindow): NSUndoManager = extern
  @inline def window_sheet_rect_(window: NSWindow, sheet: NSWindow, rect: NSRect): NSRect = extern
//  @inline def window_menu_(window: NSWindow, menu: NSMenu): BOOL = extern
//  @inline def window_event_dragImageLocation_pasteboard_(window: NSWindow, event: NSEvent, dragImageLocation: NSPoint, pasteboard: NSPasteboard): BOOL = extern
  @inline def window_proposedSize_(window: NSWindow, proposedSize: NSSize): NSSize = extern
  @inline def window_proposedOptions_(window: NSWindow, proposedOptions: NSApplicationPresentationOptions): NSApplicationPresentationOptions = extern
  @inline def customWindowsToEnterFullScreenForWindow_(window: NSWindow): NSArray[NSWindow] = extern
  @inline def windowDidFailToEnterFullScreen_(window: NSWindow): Unit = extern
  @inline def customWindowsToExitFullScreenForWindow_(window: NSWindow): NSArray[NSWindow] = extern
  @inline def window_duration_(window: NSWindow, duration: NSTimeInterval): Unit = extern
//  @inline def customWindowsToEnterFullScreenForWindow_screen_(window: NSWindow, screen: NSScreen): NSArray[NSWindow] = extern
//  @inline def window_screen_duration_(window: NSWindow, screen: NSScreen, duration: NSTimeInterval): Unit = extern
  @inline def windowDidFailToExitFullScreen_(window: NSWindow): Unit = extern
  @inline def window_maxPreferredFrameSize_maxAllowedFrameSize_(window: NSWindow, maxPreferredFrameSize: NSSize, maxAllowedFrameSize: NSSize): NSSize = extern
  @inline def window_state_(window: NSWindow, state: NSCoder): Unit = extern
  @inline def windowDidResize_(notification: NSNotification): Unit = extern
  @inline def windowDidExpose_(notification: NSNotification): Unit = extern
  @inline def windowWillMove_(notification: NSNotification): Unit = extern
  @inline def windowDidMove_(notification: NSNotification): Unit = extern
  @inline def windowDidBecomeKey_(notification: NSNotification): Unit = extern
  @inline def windowDidResignKey_(notification: NSNotification): Unit = extern
  @inline def windowDidBecomeMain_(notification: NSNotification): Unit = extern
  @inline def windowDidResignMain_(notification: NSNotification): Unit = extern
  @inline def windowWillClose_(notification: NSNotification): Unit = extern
  @inline def windowWillMiniaturize_(notification: NSNotification): Unit = extern
  @inline def windowDidMiniaturize_(notification: NSNotification): Unit = extern
  @inline def windowDidDeminiaturize_(notification: NSNotification): Unit = extern
  @inline def windowDidUpdate_(notification: NSNotification): Unit = extern
  @inline def windowDidChangeScreen_(notification: NSNotification): Unit = extern
  @inline def windowDidChangeScreenProfile_(notification: NSNotification): Unit = extern
  @inline def windowDidChangeBackingProperties_(notification: NSNotification): Unit = extern
  @inline def windowWillBeginSheet_(notification: NSNotification): Unit = extern
  @inline def windowDidEndSheet_(notification: NSNotification): Unit = extern
  @inline def windowWillStartLiveResize_(notification: NSNotification): Unit = extern
  @inline def windowDidEndLiveResize_(notification: NSNotification): Unit = extern
  @inline def windowWillEnterFullScreen_(notification: NSNotification): Unit = extern
  @inline def windowDidEnterFullScreen_(notification: NSNotification): Unit = extern
  @inline def windowWillExitFullScreen_(notification: NSNotification): Unit = extern
  @inline def windowDidExitFullScreen_(notification: NSNotification): Unit = extern
  @inline def windowWillEnterVersionBrowser_(notification: NSNotification): Unit = extern
  @inline def windowDidEnterVersionBrowser_(notification: NSNotification): Unit = extern
  @inline def windowWillExitVersionBrowser_(notification: NSNotification): Unit = extern
  @inline def windowDidExitVersionBrowser_(notification: NSNotification): Unit = extern
  @inline def windowDidChangeOcclusionState_(notification: NSNotification): Unit = extern
}
