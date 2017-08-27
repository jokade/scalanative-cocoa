package cocoa.appkit

import cocoa.foundation.{BOOL, NSCoder, NSData, NSObjectClass, NSRange, NSRect, NSSize, NSString}
import objc.runtime.id

import scala.language.experimental.macros
import objc.{ObjC, ObjCClass}

import scalanative.native._


@ObjC
class NSText extends NSView { //with NSChangeSpelling with NSIgnoreMisspelledWords {
  @inline def replaceCharactersInRange(range: NSRange, aString: NSString): Unit = extern
//  @inline def replaceCharactersInRange(range: NSRange, rtfData: NSData): Unit = extern
//  @inline def replaceCharactersInRange(range: NSRange, rtfdData: NSData): Unit = extern
  @inline def RTFFromRange(range: NSRange): NSData = extern
  @inline def RTFDFromRange(range: NSRange): NSData = extern
  @inline def writeRTFDToFile(path: NSString, flag: BOOL): BOOL = extern
  @inline def readRTFDFromFile(path: NSString): BOOL = extern
  @inline def scrollRangeToVisible(range: NSRange): Unit = extern
//  @inline def setTextColor(color: NSColor, range: NSRange): Unit = extern
//  @inline def setFont(font: NSFont, range: NSRange): Unit = extern
  @inline def sizeToFit(): Unit = extern
  @inline def copy(sender: id): Unit = extern
  @inline def copyFont(sender: id): Unit = extern
  @inline def copyRuler(sender: id): Unit = extern
  @inline def cut(sender: id): Unit = extern
  @inline def delete(sender: id): Unit = extern
  @inline def paste(sender: id): Unit = extern
  @inline def pasteFont(sender: id): Unit = extern
  @inline def pasteRuler(sender: id): Unit = extern
  @inline def changeFont(sender: id): Unit = extern
  @inline def alignLeft(sender: id): Unit = extern
  @inline def alignRight(sender: id): Unit = extern
  @inline def alignCenter(sender: id): Unit = extern
  @inline def subscript(sender: id): Unit = extern
  @inline def superscript(sender: id): Unit = extern
  @inline def underline(sender: id): Unit = extern
  @inline def unscript(sender: id): Unit = extern
  @inline def showGuessPanel(sender: id): Unit = extern
  @inline def checkSpelling(sender: id): Unit = extern
  @inline def toggleRuler(sender: id): Unit = extern
  @inline def string(): NSString = extern
  @inline def setString(string: NSString): Unit = extern
  @inline def delegate(): id = extern
  @inline def setDelegate(delegate: id): Unit = extern
  @inline def isEditable(): BOOL = extern
  @inline def setEditable(editable: BOOL): Unit = extern
  @inline def isSelectable(): BOOL = extern
  @inline def setSelectable(selectable: BOOL): Unit = extern
  @inline def isRichText(): BOOL = extern
  @inline def setRichText(richText: BOOL): Unit = extern
  @inline def importsGraphics(): BOOL = extern
  @inline def setImportsGraphics(importsGraphics: BOOL): Unit = extern
  @inline def isFieldEditor(): BOOL = extern
  @inline def setFieldEditor(fieldEditor: BOOL): Unit = extern
  @inline def usesFontPanel(): BOOL = extern
  @inline def setUsesFontPanel(usesFontPanel: BOOL): Unit = extern
  @inline def drawsBackground(): BOOL = extern
  @inline def setDrawsBackground(drawsBackground: BOOL): Unit = extern
//  @inline def backgroundColor(): NSColor = extern
//  @inline def setBackgroundColor(backgroundColor: NSColor): Unit = extern
  @inline def isRulerVisible(): BOOL = extern
  @inline def selectedRange(): NSRange = extern
  @inline def setSelectedRange(selectedRange: NSRange): Unit = extern
//  @inline def font(): NSFont = extern
//  @inline def setFont(font: NSFont): Unit = extern
//  @inline def textColor(): NSColor = extern
//  @inline def setTextColor(textColor: NSColor): Unit = extern
  @inline def alignment(): NSTextAlignment = extern
  @inline def setAlignment(alignment: NSTextAlignment): Unit = extern
  @inline def baseWritingDirection(): NSWritingDirection = extern
  @inline def setBaseWritingDirection(baseWritingDirection: NSWritingDirection): Unit = extern
  @inline def maxSize(): NSSize = extern
  @inline def setMaxSize(maxSize: NSSize): Unit = extern
  @inline def minSize(): NSSize = extern
  @inline def setMinSize(minSize: NSSize): Unit = extern
  @inline def isHorizontallyResizable(): BOOL = extern
  @inline def setHorizontallyResizable(horizontallyResizable: BOOL): Unit = extern
  @inline def isVerticallyResizable(): BOOL = extern
  @inline def setVerticallyResizable(verticallyResizable: BOOL): Unit = extern
}


@ObjCClass
abstract class NSTextClass extends NSObjectClass {
}

object NSText extends NSTextClass {
  override type InstanceType = NSText
}