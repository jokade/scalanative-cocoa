package cocoa.appkit

import cocoa.foundation.{BOOL, NSInteger, NSNotification, NSObjectClass, NSString}
import objc.runtime.id

import scala.language.experimental.macros
import objc.{ObjC, ObjCClass}

import scalanative.native._


@ObjC
class NSTextField extends NSControl { //with NSUserInterfaceValidations with NSAccessibilityNavigableStaticText {
  @inline def selectText(sender: id): Unit = extern
//  @inline def textShouldBeginEditing(textObject: NSText): BOOL = extern
//  @inline def textShouldEndEditing(textObject: NSText): BOOL = extern
  @inline def textDidBeginEditing(notification: NSNotification): Unit = extern
  @inline def textDidEndEditing(notification: NSNotification): Unit = extern
  @inline def textDidChange(notification: NSNotification): Unit = extern
  @inline def placeholderString(): NSString = extern
  @inline def setPlaceholderString(placeholderString: NSString): Unit = extern
//  @inline def placeholderAttributedString(): NSAttributedString = extern
//  @inline def setPlaceholderAttributedString(placeholderAttributedString: NSAttributedString): Unit = extern
//  @inline def backgroundColor(): NSColor = extern
//  @inline def setBackgroundColor(backgroundColor: NSColor): Unit = extern
  @inline def drawsBackground(): BOOL = extern
  @inline def setDrawsBackground(drawsBackground: BOOL): Unit = extern
//  @inline def textColor(): NSColor = extern
//  @inline def setTextColor(textColor: NSColor): Unit = extern
  @inline def isBordered(): BOOL = extern
  @inline def setBordered(bordered: BOOL): Unit = extern
  @inline def isBezeled(): BOOL = extern
  @inline def setBezeled(bezeled: BOOL): Unit = extern
  @inline def isEditable(): BOOL = extern
  @inline def setEditable(editable: BOOL): Unit = extern
  @inline def isSelectable(): BOOL = extern
  @inline def setSelectable(selectable: BOOL): Unit = extern
  @inline def delegate(): id = extern
  @inline def setDelegate(delegate: id): Unit = extern
//  @inline def bezelStyle(): NSTextFieldBezelStyle = extern
//  @inline def setBezelStyle(bezelStyle: NSTextFieldBezelStyle): Unit = extern
//  @inline def preferredMaxLayoutWidth(): CGFloat = extern
//  @inline def setPreferredMaxLayoutWidth(preferredMaxLayoutWidth: CGFloat): Unit = extern
  @inline def maximumNumberOfLines(): NSInteger = extern
  @inline def setMaximumNumberOfLines(maximumNumberOfLines: NSInteger): Unit = extern
  @inline def allowsDefaultTighteningForTruncation(): BOOL = extern
  @inline def setAllowsDefaultTighteningForTruncation(allowsDefaultTighteningForTruncation: BOOL): Unit = extern
  @inline def allowsEditingTextAttributes(): BOOL = extern
  @inline def setAllowsEditingTextAttributes(allowsEditingTextAttributes: BOOL): Unit = extern
  @inline def importsGraphics(): BOOL = extern
  @inline def setImportsGraphics(importsGraphics: BOOL): Unit = extern
  @inline def setTitleWithMnemonic(stringWithAmpersand: NSString): Unit = extern
}

@ObjCClass
abstract class NSTextFieldClass extends NSObjectClass {
}

object NSTextField extends NSTextFieldClass {
  override type InstanceType = NSTextField
}