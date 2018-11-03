// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.appkit

import cocoa.foundation.{BOOL, NSInteger, NSNotification, NSObjectClass, NSString, id}

import scala.scalanative.native._
import scala.scalanative.native.objc._

@ObjC
class NSTextField extends NSControl { //with NSUserInterfaceValidations with NSAccessibilityNavigableStaticText {
  @inline def selectText_(sender: id): Unit = extern
  @inline def textShouldBeginEditing_(textObject: NSText): BOOL = extern
  @inline def textShouldEndEditing_(textObject: NSText): BOOL = extern
  @inline def textDidBeginEditing_(notification: NSNotification): Unit = extern
  @inline def textDidEndEditing_(notification: NSNotification): Unit = extern
  @inline def textDidChange_(notification: NSNotification): Unit = extern
  @inline def placeholderString(): NSString = extern
  @inline def setPlaceholderString_(placeholderString: NSString): Unit = extern
//  @inline def placeholderAttributedString(): NSAttributedString = extern
//  @inline def setPlaceholderAttributedString_(placeholderAttributedString: NSAttributedString): Unit = extern
//  @inline def backgroundColor(): NSColor = extern
//  @inline def setBackgroundColor_(backgroundColor: NSColor): Unit = extern
  @inline def drawsBackground(): BOOL = extern
  @inline def setDrawsBackground_(drawsBackground: BOOL): Unit = extern
//  @inline def textColor(): NSColor = extern
//  @inline def setTextColor_(textColor: NSColor): Unit = extern
  @inline def isBordered(): BOOL = extern
  @inline def setBordered_(bordered: BOOL): Unit = extern
  @inline def isBezeled(): BOOL = extern
  @inline def setBezeled_(bezeled: BOOL): Unit = extern
  @inline def isEditable(): BOOL = extern
  @inline def setEditable_(editable: BOOL): Unit = extern
  @inline def isSelectable(): BOOL = extern
  @inline def setSelectable_(selectable: BOOL): Unit = extern
  @inline def delegate(): id = extern
  @inline def setDelegate_(delegate: NSTextFieldDelegate): Unit = extern
//  @inline def bezelStyle(): NSTextFieldBezelStyle = extern
//  @inline def setBezelStyle_(bezelStyle: NSTextFieldBezelStyle): Unit = extern
  @inline def preferredMaxLayoutWidth(): CGFloat = extern
  @inline def setPreferredMaxLayoutWidth_(preferredMaxLayoutWidth: CGFloat): Unit = extern
  @inline def maximumNumberOfLines(): NSInteger = extern
  @inline def setMaximumNumberOfLines_(maximumNumberOfLines: NSInteger): Unit = extern
  @inline def allowsDefaultTighteningForTruncation(): BOOL = extern
  @inline def setAllowsDefaultTighteningForTruncation_(allowsDefaultTighteningForTruncation: BOOL): Unit = extern
  @inline def isAutomaticTextCompletionEnabled(): BOOL = extern
  @inline def setAutomaticTextCompletionEnabled_(automaticTextCompletionEnabled: BOOL): Unit = extern
  @inline def allowsCharacterPickerTouchBarItem(): BOOL = extern
  @inline def setAllowsCharacterPickerTouchBarItem_(allowsCharacterPickerTouchBarItem: BOOL): Unit = extern
  @inline def allowsEditingTextAttributes(): BOOL = extern
  @inline def setAllowsEditingTextAttributes_(allowsEditingTextAttributes: BOOL): Unit = extern
  @inline def importsGraphics(): BOOL = extern
  @inline def setImportsGraphics_(importsGraphics: BOOL): Unit = extern
  @inline def setTitleWithMnemonic_(stringWithAmpersand: NSString): Unit = extern
}
@ObjCClass
abstract class NSTextFieldClass extends NSObjectClass {
  @inline def labelWithString_(stringValue: NSString): NSTextField = extern
  @inline def wrappingLabelWithString_(stringValue: NSString): NSTextField = extern
//  @inline def labelWithAttributedString_(attributedStringValue: NSAttributedString): NSTextField = extern
  @inline def textFieldWithString_(stringValue: NSString): NSTextField = extern
}

object NSTextField extends NSTextFieldClass {
  override type InstanceType = NSTextField
}