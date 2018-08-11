// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.appkit

import scalanative.native._
import cocoa.foundation.{BOOL, NSCoder, NSInteger, NSRect, NSSize, NSString, NSUInteger, SEL, id}

import objc._
import scala.language.experimental.macros


@ObjC
class NSControl extends NSView {
  @inline def sizeThatFits_(size: NSSize): NSSize = extern
  @inline def sizeToFit(): Unit = extern
  @inline def sendActionOn_(mask: NSEventMask): NSInteger = extern
  @inline def sendAction_target_(action: SEL, target: id): BOOL = extern
  @inline def takeIntValueFrom_(sender: id): Unit = extern
  @inline def takeFloatValueFrom_(sender: id): Unit = extern
  @inline def takeDoubleValueFrom_(sender: id): Unit = extern
  @inline def takeStringValueFrom_(sender: id): Unit = extern
  @inline def takeObjectValueFrom_(sender: id): Unit = extern
  @inline def takeIntegerValueFrom_(sender: id): Unit = extern
  @inline def target(): id = extern
  @inline def setTarget_(target: id): Unit = extern
  @inline def action(): SEL = extern
  @inline def setAction_(action: SEL): Unit = extern
  @inline def setTag_(tag: NSInteger): Unit = extern
  @inline def ignoresMultiClick(): BOOL = extern
  @inline def setIgnoresMultiClick_(ignoresMultiClick: BOOL): Unit = extern
  @inline def isContinuous(): BOOL = extern
  @inline def setContinuous_(continuous: BOOL): Unit = extern
  @inline def isEnabled(): BOOL = extern
  @inline def setEnabled_(enabled: BOOL): Unit = extern
  @inline def refusesFirstResponder(): BOOL = extern
  @inline def setRefusesFirstResponder_(refusesFirstResponder: BOOL): Unit = extern
  @inline def isHighlighted(): BOOL = extern
  @inline def setHighlighted_(highlighted: BOOL): Unit = extern
//  @inline def controlSize(): NSControlSize = extern
//  @inline def setControlSize_(controlSize: NSControlSize): Unit = extern
//  @inline def formatter(): NSFormatter = extern
//  @inline def setFormatter_(formatter: NSFormatter): Unit = extern
  @inline def stringValue(): NSString = extern
  @inline def setStringValue_(stringValue: NSString): Unit = extern
//  @inline def attributedStringValue(): NSAttributedString = extern
//  @inline def setAttributedStringValue_(attributedStringValue: NSAttributedString): Unit = extern
  @inline def objectValue(): id = extern
  @inline def setObjectValue_(objectValue: id): Unit = extern
  @inline def intValue(): CInt = extern
  @inline def setIntValue_(intValue: CInt): Unit = extern
  @inline def integerValue(): NSInteger = extern
  @inline def setIntegerValue_(integerValue: NSInteger): Unit = extern
  @inline def floatValue(): Float = extern
  @inline def setFloatValue_(floatValue: Float): Unit = extern
  @inline def doubleValue(): Double = extern
  @inline def setDoubleValue_(doubleValue: Double): Unit = extern
  @inline def performClick_(sender: id): Unit = extern
  @inline def expansionFrameWithFrame_(contentFrame: NSRect): NSRect = extern
  @inline def drawWithExpansionFrame_view_(contentFrame: NSRect, view: NSView): Unit = extern
  @inline def alignment(): NSTextAlignment = extern
  @inline def setAlignment_(alignment: NSTextAlignment): Unit = extern
//  @inline def font(): NSFont = extern
//  @inline def setFont_(font: NSFont): Unit = extern
//  @inline def lineBreakMode(): NSLineBreakMode = extern
//  @inline def setLineBreakMode_(lineBreakMode: NSLineBreakMode): Unit = extern
  @inline def usesSingleLineMode(): BOOL = extern
  @inline def setUsesSingleLineMode_(usesSingleLineMode: BOOL): Unit = extern
  @inline def baseWritingDirection(): NSWritingDirection = extern
  @inline def setBaseWritingDirection_(baseWritingDirection: NSWritingDirection): Unit = extern
  @inline def allowsExpansionToolTips(): BOOL = extern
  @inline def setAllowsExpansionToolTips_(allowsExpansionToolTips: BOOL): Unit = extern
  @inline def currentEditor(): NSText = extern
  @inline def abortEditing(): BOOL = extern
  @inline def validateEditing(): Unit = extern
  @inline def editWithFrame_textObj_delegate_event_(rect: NSRect, textObj: NSText, delegate: id, event: NSEvent): Unit = extern
  @inline def selectWithFrame_textObj_delegate_selStart_selLength_(rect: NSRect, textObj: NSText, delegate: id, selStart: NSInteger, selLength: NSInteger): Unit = extern
  @inline def endEditing_(textObj: NSText): Unit = extern
  @inline def setFloatingPointFormat_leftDigits_rightDigits_(autoRange: BOOL, leftDigits: NSUInteger, rightDigits: NSUInteger): Unit = extern
//  @inline def selectedCell(): NSCell = extern
  @inline def selectedTag(): NSInteger = extern
  @inline def setNeedsDisplay(): Unit = extern
  @inline def calcSize(): Unit = extern
//  @inline def updateCell_(cell: NSCell): Unit = extern
//  @inline def updateCellInside_(cell: NSCell): Unit = extern
//  @inline def drawCellInside_(cell: NSCell): Unit = extern
//  @inline def drawCell_(cell: NSCell): Unit = extern
//  @inline def selectCell_(cell: NSCell): Unit = extern
//  @inline def cell(): NSCell = extern
//  @inline def setCell_(cell: NSCell): Unit = extern
}

@ObjCClass
abstract class NSControlClass extends NSViewClass {
  @inline def cellClass(): id = extern
  @inline def setCellClass_(cellClass: id): Unit = extern
}

object NSControl extends NSControlClass {
  override type InstanceType = NSControl
}