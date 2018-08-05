package cocoa.appkit

import scalanative.native._
import cocoa.foundation.{BOOL, NSCoder, NSInteger, NSRect, NSSize, NSString, NSUInteger}
import objc.runtime.{SEL, id}

import scala.language.experimental.macros


@ObjC
class NSControl extends NSView {
  @inline def sizeThatFits(size: NSSize): NSSize = extern
//  @inline def initWithFrame(frameRect: NSRect): NSControl = extern
//  @inline def initWithCoder(coder: NSCoder): NSControl = extern
  @inline def sizeToFit(): Unit = extern
  @inline def sendActionOn(mask: NSInteger): NSInteger = extern
  @inline def sendAction(theAction: SEL, theTarget: id): BOOL = extern
  @inline def takeIntValueFrom(sender: id): Unit = extern
  @inline def takeFloatValueFrom(sender: id): Unit = extern
  @inline def takeDoubleValueFrom(sender: id): Unit = extern
  @inline def takeStringValueFrom(sender: id): Unit = extern
  @inline def takeObjectValueFrom(sender: id): Unit = extern
  @inline def takeIntegerValueFrom(sender: id): Unit = extern
//  @inline def mouseDown(theEvent: NSEvent): Unit = extern
  @inline def target(): id = extern
  @inline def setTarget(target: id): Unit = extern
  @inline def action(): SEL = extern
  @inline def setAction(action: SEL): Unit = extern
//  @inline def tag(): NSInteger = extern
  @inline def setTag(tag: NSInteger): Unit = extern
  @inline def ignoresMultiClick(): BOOL = extern
  @inline def setIgnoresMultiClick(ignoresMultiClick: BOOL): Unit = extern
  @inline def isContinuous(): BOOL = extern
  @inline def setContinuous(continuous: BOOL): Unit = extern
  @inline def isEnabled(): BOOL = extern
  @inline def setEnabled(enabled: BOOL): Unit = extern
  @inline def refusesFirstResponder(): BOOL = extern
  @inline def setRefusesFirstResponder(refusesFirstResponder: BOOL): Unit = extern
  @inline def isHighlighted(): BOOL = extern
  @inline def setHighlighted(highlighted: BOOL): Unit = extern
//  @inline def controlSize(): NSControlSize = extern
//  @inline def setControlSize(controlSize: NSControlSize): Unit = extern
//  @inline def formatter(): NSFormatter = extern
//  @inline def setFormatter(formatter: NSFormatter): Unit = extern
  @inline def stringValue(): NSString = extern
  @inline def setStringValue(stringValue: NSString): Unit = extern
//  @inline def attributedStringValue(): NSAttributedString = extern
//  @inline def setAttributedStringValue(attributedStringValue: NSAttributedString): Unit = extern
  @inline def objectValue(): id = extern
  @inline def setObjectValue(objectValue: id): Unit = extern
  @inline def intValue(): CInt = extern
  @inline def setIntValue(intValue: CInt): Unit = extern
  @inline def integerValue(): NSInteger = extern
  @inline def setIntegerValue(integerValue: NSInteger): Unit = extern
  @inline def floatValue(): Float = extern
  @inline def setFloatValue(floatValue: Float): Unit = extern
  @inline def doubleValue(): Double = extern
  @inline def setDoubleValue(doubleValue: Double): Unit = extern
  @inline def performClick(sender: id): Unit = extern
  @inline def expansionFrameWithFrame(contentFrame: NSRect): NSRect = extern
  @inline def drawWithExpansionFrame(contentFrame: NSRect, view: NSView): Unit = extern
//  @inline def alignment(): NSTextAlignment = extern
//  @inline def setAlignment(alignment: NSTextAlignment): Unit = extern
//  @inline def font(): NSFont = extern
//  @inline def setFont(font: NSFont): Unit = extern
//  @inline def lineBreakMode(): NSLineBreakMode = extern
//  @inline def setLineBreakMode(lineBreakMode: NSLineBreakMode): Unit = extern
  @inline def usesSingleLineMode(): BOOL = extern
  @inline def setUsesSingleLineMode(usesSingleLineMode: BOOL): Unit = extern
//  @inline def baseWritingDirection(): NSWritingDirection = extern
//  @inline def setBaseWritingDirection(baseWritingDirection: NSWritingDirection): Unit = extern
  @inline def allowsExpansionToolTips(): BOOL = extern
  @inline def setAllowsExpansionToolTips(allowsExpansionToolTips: BOOL): Unit = extern
//  @inline def currentEditor(): NSText = extern
  @inline def abortEditing(): BOOL = extern
  @inline def validateEditing(): Unit = extern
//  @inline def editWithFrame(aRect: NSRect, textObj: NSText, anObject: id, theEvent: NSEvent): Unit = extern
//  @inline def selectWithFrame(aRect: NSRect, textObj: NSText, anObject: id, selStart: NSInteger, selLength: NSInteger): Unit = extern
//  @inline def endEditing(textObj: NSText): Unit = extern
  @inline def setFloatingPointFormat(autoRange: BOOL, leftDigits: NSUInteger, rightDigits: NSUInteger): Unit = extern
//  @inline def selectedCell(): NSCell = extern
  @inline def selectedTag(): NSInteger = extern
  @inline def setNeedsDisplay(): Unit = extern
  @inline def calcSize(): Unit = extern
//  @inline def updateCell(aCell: NSCell): Unit = extern
//  @inline def updateCellInside(aCell: NSCell): Unit = extern
//  @inline def drawCellInside(aCell: NSCell): Unit = extern
//  @inline def drawCell(aCell: NSCell): Unit = extern
//  @inline def selectCell(aCell: NSCell): Unit = extern
//  @inline def cell(): NSCell = extern
//  @inline def setCell(cell: NSCell): Unit = extern
}
@ObjCClass
abstract class NSControlClass extends NSViewClass {
  @inline def setCellClass(factoryId: id): Unit = extern
  @inline def cellClass(): id = extern
}

object NSControl extends NSControlClass {
  override type InstanceType = NSControl
}