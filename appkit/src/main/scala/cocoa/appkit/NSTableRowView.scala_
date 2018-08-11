// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.appkit

import cocoa.foundation.{BOOL, NSInteger, NSObjectClass, NSRect, id}

import scala.language.experimental.macros
import scalanative.native._


@ObjC
class NSTableRowView extends NSView { //with NSAccessibilityRow {
  @inline def drawBackgroundInRect(dirtyRect: NSRect): Unit = extern
  @inline def drawSelectionInRect(dirtyRect: NSRect): Unit = extern
  @inline def drawSeparatorInRect(dirtyRect: NSRect): Unit = extern
  @inline def drawDraggingDestinationFeedbackInRect(dirtyRect: NSRect): Unit = extern
  @inline def viewAtColumn(column: NSInteger): id = extern
  @inline def selectionHighlightStyle(): NSTableViewSelectionHighlightStyle = extern
  @inline def setSelectionHighlightStyle(selectionHighlightStyle: NSTableViewSelectionHighlightStyle): Unit = extern
  @inline def isEmphasized(): BOOL = extern
  @inline def setEmphasized(emphasized: BOOL): Unit = extern
  @inline def isGroupRowStyle(): BOOL = extern
  @inline def setGroupRowStyle(groupRowStyle: BOOL): Unit = extern
  @inline def isSelected(): BOOL = extern
  @inline def setSelected(selected: BOOL): Unit = extern
  @inline def isPreviousRowSelected(): BOOL = extern
  @inline def setPreviousRowSelected(previousRowSelected: BOOL): Unit = extern
  @inline def isNextRowSelected(): BOOL = extern
  @inline def setNextRowSelected(nextRowSelected: BOOL): Unit = extern
  @inline def isFloating(): BOOL = extern
  @inline def setFloating(floating: BOOL): Unit = extern
  @inline def isTargetForDropOperation(): BOOL = extern
  @inline def setTargetForDropOperation(targetForDropOperation: BOOL): Unit = extern
  @inline def draggingDestinationFeedbackStyle(): NSTableViewDraggingDestinationFeedbackStyle = extern
  @inline def setDraggingDestinationFeedbackStyle(draggingDestinationFeedbackStyle: NSTableViewDraggingDestinationFeedbackStyle): Unit = extern
//  @inline def indentationForDropOperation(): CGFloat = extern
//  @inline def setIndentationForDropOperation(indentationForDropOperation: CGFloat): Unit = extern
//  @inline def interiorBackgroundStyle(): NSBackgroundStyle = extern
//  @inline def backgroundColor(): NSColor = extern
//  @inline def setBackgroundColor(backgroundColor: NSColor): Unit = extern
  @inline def numberOfColumns(): NSInteger = extern
}


@ObjCClass
abstract class NSTableRowViewClass extends NSObjectClass {
}

object NSTableRowView extends NSTableRowViewClass {
  override type InstanceType = NSTableRowView
}