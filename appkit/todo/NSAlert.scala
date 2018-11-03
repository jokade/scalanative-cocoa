// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.appkit

import cocoa.foundation.{BOOL, NSArray, NSError, NSObject, NSObjectClass, NSString, SEL, id}

import scala.language.experimental.macros
import scalanative.native._
import objc._

@ObjC
trait NSAlertDelegate extends NSObject {
  @inline def alertShowHelp_(alert: NSAlert): BOOL = extern
}

@ObjC
class NSAlert extends NSObject {
  @inline def addButtonWithTitle_(title: NSString): NSButton = extern
  @inline def layout(): Unit = extern
  @inline def runModal(): NSModalResponse = extern
  @inline def beginSheetModalForWindow_handler_(sheetWindow: NSWindow, handler: Ptr[Byte]): Unit = extern
  @inline def messageText(): NSString = extern
  @inline def setMessageText_(messageText: NSString): Unit = extern
  @inline def informativeText(): NSString = extern
  @inline def setInformativeText_(informativeText: NSString): Unit = extern
  @inline def icon(): NSImage = extern
  @inline def setIcon_(icon: NSImage): Unit = extern
  @inline def buttons(): NSArray[NSButton] = extern
  @inline def showsHelp(): BOOL = extern
  @inline def setShowsHelp_(showsHelp: BOOL): Unit = extern
  @inline def helpAnchor(): NSHelpAnchorName = extern
  @inline def setHelpAnchor_(helpAnchor: NSHelpAnchorName): Unit = extern
  @inline def alertStyle(): NSAlertStyle = extern
  @inline def setAlertStyle_(alertStyle: NSAlertStyle): Unit = extern
  @inline def delegate(): NSAlertDelegate = extern
  @inline def setDelegate_(delegate: NSAlertDelegate): Unit = extern
  @inline def showsSuppressionButton(): BOOL = extern
  @inline def setShowsSuppressionButton_(showsSuppressionButton: BOOL): Unit = extern
  @inline def suppressionButton(): NSButton = extern
  @inline def accessoryView(): NSView = extern
  @inline def setAccessoryView_(accessoryView: NSView): Unit = extern
  @inline def window(): NSWindow = extern
  @inline def beginSheetModalForWindow_delegate_didEndSelector_contextInfo_(window: NSWindow, delegate: id, didEndSelector: SEL, contextInfo: Ptr[Byte]): Unit = extern
}

@ObjCClass
abstract class NSAlertClass extends NSObjectClass {
  @inline def alertWithError_(error: NSError): NSAlert = extern
}

object NSAlert extends NSAlertClass {
  override type InstanceType = NSAlert

  def apply(messageText: String,
            defaultButton: String,
            alternateButton: String = "",
            informativeText: String = "",
            otherButton: String = "",
            alertStyle: NSAlertStyle = NSAlertStyle.Informational): NSAlert = apply(
    NSString(messageText),
    NSString(defaultButton),
    if( alternateButton != "") NSString(alternateButton) else null,
    if( informativeText != "") NSString(informativeText) else null,
    if( otherButton != "") NSString(otherButton) else null,
    alertStyle)

  def apply(messageText: NSString,
            defaultButton: NSString,
            alternateButton: NSString,
            informativeText: NSString,
            otherButton: NSString,
            alertStyle: NSAlertStyle): NSAlert = {
    val alert = NSAlert.alloc().init()
    alert.setMessageText_(messageText)
    alert.addButtonWithTitle_(defaultButton)
    if( alternateButton != null )
      alert.addButtonWithTitle_(alternateButton)
    if( otherButton != null )
      alert.addButtonWithTitle_(otherButton)
    if( informativeText != null )
      alert.setInformativeText_(informativeText)
    alert.setAlertStyle_(alertStyle)
    alert
  }
}