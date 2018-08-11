// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.appkit

import scalanative.native._
import cocoa.foundation.{BOOL, NSCoder, NSData, NSObjectClass, NSRange, NSRect, NSSize, NSString, id}

import objc._
import scala.language.experimental.macros

@ObjC
abstract class NSText extends NSView { //with NSChangeSpelling with NSIgnoreMisspelledWords {
  @inline def replaceCharactersInRange_string_(range: NSRange, string: NSString): Unit = extern
  @inline def replaceCharactersInRange_rtfData_(range: NSRange, rtfData: NSData): Unit = extern
  @inline def replaceCharactersInRange_rtfdData_(range: NSRange, rtfdData: NSData): Unit = extern
  @inline def RTFFromRange_(range: NSRange): NSData = extern
  @inline def RTFDFromRange_(range: NSRange): NSData = extern
  @inline def writeRTFDToFile_flag_(path: NSString, flag: BOOL): BOOL = extern
  @inline def readRTFDFromFile_(path: NSString): BOOL = extern
  @inline def scrollRangeToVisible_(range: NSRange): Unit = extern
//  @inline def setTextColor_range_(color: NSColor, range: NSRange): Unit = extern
//  @inline def setFont_range_(font: NSFont, range: NSRange): Unit = extern
  @inline def sizeToFit(): Unit = extern
  @inline def copy_(sender: id): Unit = extern
  @inline def copyFont_(sender: id): Unit = extern
  @inline def copyRuler_(sender: id): Unit = extern
  @inline def cut_(sender: id): Unit = extern
  @inline def delete_(sender: id): Unit = extern
  @inline def paste_(sender: id): Unit = extern
  @inline def pasteFont_(sender: id): Unit = extern
  @inline def pasteRuler_(sender: id): Unit = extern
  @inline def changeFont_(sender: id): Unit = extern
  @inline def alignLeft_(sender: id): Unit = extern
  @inline def alignRight_(sender: id): Unit = extern
  @inline def alignCenter_(sender: id): Unit = extern
  @inline def subscript_(sender: id): Unit = extern
  @inline def superscript_(sender: id): Unit = extern
  @inline def underline_(sender: id): Unit = extern
  @inline def unscript_(sender: id): Unit = extern
  @inline def showGuessPanel_(sender: id): Unit = extern
  @inline def checkSpelling_(sender: id): Unit = extern
  @inline def toggleRuler_(sender: id): Unit = extern
  @inline def string(): NSString = extern
  @inline def setString_(string: NSString): Unit = extern
  @inline def delegate(): NSTextDelegate = extern
  @inline def setDelegate_(delegate: NSTextDelegate): Unit = extern
  @inline def isEditable(): BOOL = extern
  @inline def setEditable_(editable: BOOL): Unit = extern
  @inline def isSelectable(): BOOL = extern
  @inline def setSelectable_(selectable: BOOL): Unit = extern
  @inline def isRichText(): BOOL = extern
  @inline def setRichText_(richText: BOOL): Unit = extern
  @inline def importsGraphics(): BOOL = extern
  @inline def setImportsGraphics_(importsGraphics: BOOL): Unit = extern
  @inline def isFieldEditor(): BOOL = extern
  @inline def setFieldEditor_(fieldEditor: BOOL): Unit = extern
  @inline def usesFontPanel(): BOOL = extern
  @inline def setUsesFontPanel_(usesFontPanel: BOOL): Unit = extern
  @inline def drawsBackground(): BOOL = extern
  @inline def setDrawsBackground_(drawsBackground: BOOL): Unit = extern
//  @inline def backgroundColor(): NSColor = extern
//  @inline def setBackgroundColor_(backgroundColor: NSColor): Unit = extern
  @inline def isRulerVisible(): BOOL = extern
  @inline def selectedRange(): NSRange = extern
  @inline def setSelectedRange_(selectedRange: NSRange): Unit = extern
//  @inline def font(): NSFont = extern
//  @inline def setFont_(font: NSFont): Unit = extern
//  @inline def textColor(): NSColor = extern
//  @inline def setTextColor_(textColor: NSColor): Unit = extern
  @inline def alignment(): NSTextAlignment = extern
  @inline def setAlignment_(alignment: NSTextAlignment): Unit = extern
  @inline def baseWritingDirection(): NSWritingDirection = extern
  @inline def setBaseWritingDirection_(baseWritingDirection: NSWritingDirection): Unit = extern
  @inline def maxSize(): NSSize = extern
  @inline def setMaxSize_(maxSize: NSSize): Unit = extern
  @inline def minSize(): NSSize = extern
  @inline def setMinSize_(minSize: NSSize): Unit = extern
  @inline def isHorizontallyResizable(): BOOL = extern
  @inline def setHorizontallyResizable_(horizontallyResizable: BOOL): Unit = extern
  @inline def isVerticallyResizable(): BOOL = extern
  @inline def setVerticallyResizable_(verticallyResizable: BOOL): Unit = extern
}


//@ObjCClass
//abstract class NSTextClass extends NSObjectClass {
//}
//
//object NSText extends NSTextClass {
//  override type InstanceType = NSText
//}