// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.appkit

import cocoa.foundation.{BOOL, NSArray, NSCoder, NSInteger, NSNotification, NSObjectClass, NSPoint, NSRange, NSRect, NSSize, NSString, SEL, id}

import scala.language.experimental.macros
import scalanative.native._


@ObjC
class NSTableView extends NSControl with NSTextViewDelegate { //with NSUserInterfaceValidations with NSTextViewDelegate with NSDraggingSource with NSAccessibilityTable {
  @inline override def initWithFrame(frameRect: NSRect): NSTableView = extern
  @inline override def initWithCoder(coder: NSCoder): NSTableView = extern
  @inline def setDataSource(aSource: id): Unit = extern
//  @inline def dataSource(): NSTableViewDataSource = extern
  @inline def setDelegate(delegate: id): Unit = extern
  @inline def delegate(): NSTableViewDelegate = extern
//  @inline def noteHeightOfRowsWithIndexesChanged(indexSet: NSIndexSet): Unit = extern
  @inline def addTableColumn(tableColumn: NSTableColumn): Unit = extern
  @inline def removeTableColumn(tableColumn: NSTableColumn): Unit = extern
  @inline def moveColumn(oldIndex: NSInteger, newIndex: NSInteger): Unit = extern
  @inline def columnWithIdentifier(identifier: NSString): NSInteger = extern
  @inline def tableColumnWithIdentifier(identifier: NSString): NSTableColumn = extern
  @inline def tile(): Unit = extern
  @inline def sizeLastColumnToFit(): Unit = extern
  @inline def scrollRowToVisible(row: NSInteger): Unit = extern
  @inline def scrollColumnToVisible(column: NSInteger): Unit = extern
  @inline def reloadData(): Unit = extern
  @inline def noteNumberOfRowsChanged(): Unit = extern
//  @inline def reloadDataForRowIndexes(rowIndexes: NSIndexSet, columnIndexes: NSIndexSet): Unit = extern
//  @inline def setIndicatorImage(anImage: NSImage, tableColumn: NSTableColumn): Unit = extern
//  @inline def indicatorImageInTableColumn(tableColumn: NSTableColumn): NSImage = extern
//  @inline def canDragRowsWithIndexes(rowIndexes: NSIndexSet, mouseDownPoint: NSPoint): BOOL = extern
//  @inline def dragImageForRowsWithIndexes(dragRows: NSIndexSet, tableColumns: NSTableColumn, dragEvent: NSEvent, dragImageOffset: NSPointPointer): NSImage = extern
//  @inline def setDraggingSourceOperationMask(mask: NSDragOperation, isLocal: BOOL): Unit = extern
//  @inline def setDropRow(row: NSInteger, dropOperation: NSTableViewDropOperation): Unit = extern
  @inline def deselectAll(sender: id): Unit = extern
//  @inline def selectColumnIndexes(indexes: NSIndexSet, extend: BOOL): Unit = extern
//  @inline def selectRowIndexes(indexes: NSIndexSet, extend: BOOL): Unit = extern
  @inline def deselectColumn(column: NSInteger): Unit = extern
  @inline def deselectRow(row: NSInteger): Unit = extern
  @inline def isColumnSelected(column: NSInteger): BOOL = extern
  @inline def isRowSelected(row: NSInteger): BOOL = extern
  @inline def rectOfColumn(column: NSInteger): NSRect = extern
  @inline def rectOfRow(row: NSInteger): NSRect = extern
//  @inline def columnIndexesInRect(rect: NSRect): NSIndexSet = extern
//  @inline def rowsInRect(rect: NSRect): NSRange = extern
  @inline def columnAtPoint(point: NSPoint): NSInteger = extern
  @inline def rowAtPoint(point: NSPoint): NSInteger = extern
  @inline def frameOfCellAtColumn(column: NSInteger, row: NSInteger): NSRect = extern
  @inline def editColumn(column: NSInteger, row: NSInteger, theEvent: NSEvent, select: BOOL): Unit = extern
  @inline def drawRow(row: NSInteger, clipRect: NSRect): Unit = extern
  @inline def highlightSelectionInClipRect(clipRect: NSRect): Unit = extern
  @inline def drawGridInClipRect(clipRect: NSRect): Unit = extern
  @inline def drawBackgroundInClipRect(clipRect: NSRect): Unit = extern
  @inline def viewAtColumn(column: NSInteger, row: NSInteger, makeIfNecessary: BOOL): NSView = extern
  @inline def rowViewAtRow(row: NSInteger, makeIfNecessary: BOOL): NSTableRowView = extern
  @inline def rowForView(view: NSView): NSInteger = extern
  @inline def columnForView(view: NSView): NSInteger = extern
  @inline def makeViewWithIdentifier(identifier: NSString, owner: id): NSView = extern
  @inline def enumerateAvailableRowViewsUsingBlock(handler: Ptr[Byte]): Unit = extern
  @inline def beginUpdates(): Unit = extern
  @inline def endUpdates(): Unit = extern
//  @inline def insertRowsAtIndexes(indexes: NSIndexSet, animationOptions: NSTableViewAnimationOptions): Unit = extern
//  @inline def removeRowsAtIndexes(indexes: NSIndexSet, animationOptions: NSTableViewAnimationOptions): Unit = extern
  @inline def moveRowAtIndex(oldIndex: NSInteger, newIndex: NSInteger): Unit = extern
//  @inline def hideRowsAtIndexes(indexes: NSIndexSet, rowAnimation: NSTableViewAnimationOptions): Unit = extern
//  @inline def unhideRowsAtIndexes(indexes: NSIndexSet, rowAnimation: NSTableViewAnimationOptions): Unit = extern
//  @inline def registerNib(nib: NSNib, identifier: NSString): Unit = extern
  @inline def didAddRowView(rowView: NSTableRowView, row: NSInteger): Unit = extern
  @inline def didRemoveRowView(rowView: NSTableRowView, row: NSInteger): Unit = extern
//  @inline def headerView(): NSTableHeaderView = extern
//  @inline def setHeaderView(headerView: NSTableHeaderView): Unit = extern
  @inline def cornerView(): NSView = extern
  @inline def setCornerView(cornerView: NSView): Unit = extern
  @inline def allowsColumnReordering(): BOOL = extern
  @inline def setAllowsColumnReordering(allowsColumnReordering: BOOL): Unit = extern
  @inline def allowsColumnResizing(): BOOL = extern
  @inline def setAllowsColumnResizing(allowsColumnResizing: BOOL): Unit = extern
  @inline def columnAutoresizingStyle(): NSTableViewColumnAutoresizingStyle = extern
  @inline def setColumnAutoresizingStyle(columnAutoresizingStyle: NSTableViewColumnAutoresizingStyle): Unit = extern
  @inline def gridStyleMask(): NSTableViewGridLineStyle = extern
  @inline def setGridStyleMask(gridStyleMask: NSTableViewGridLineStyle): Unit = extern
  @inline def intercellSpacing(): NSSize = extern
  @inline def setIntercellSpacing(intercellSpacing: NSSize): Unit = extern
  @inline def usesAlternatingRowBackgroundColors(): BOOL = extern
  @inline def setUsesAlternatingRowBackgroundColors(usesAlternatingRowBackgroundColors: BOOL): Unit = extern
//  @inline def backgroundColor(): NSColor = extern
//  @inline def setBackgroundColor(backgroundColor: NSColor): Unit = extern
//  @inline def gridColor(): NSColor = extern
//  @inline def setGridColor(gridColor: NSColor): Unit = extern
  @inline def rowSizeStyle(): NSTableViewRowSizeStyle = extern
  @inline def setRowSizeStyle(rowSizeStyle: NSTableViewRowSizeStyle): Unit = extern
  @inline def effectiveRowSizeStyle(): NSTableViewRowSizeStyle = extern
//  @inline def rowHeight(): CGFloat = extern
//  @inline def setRowHeight(rowHeight: CGFloat): Unit = extern
//  @inline def tableColumns(): NSArray[NSTableColumn] = extern
  @inline def numberOfColumns(): NSInteger = extern
  @inline def numberOfRows(): NSInteger = extern
  @inline def editedColumn(): NSInteger = extern
  @inline def editedRow(): NSInteger = extern
  @inline def clickedColumn(): NSInteger = extern
  @inline def clickedRow(): NSInteger = extern
  @inline def doubleAction(): SEL = extern
  @inline def setDoubleAction(doubleAction: SEL): Unit = extern
//  @inline def sortDescriptors(): NSArray[NSSortDescriptor] = extern
//  @inline def setSortDescriptors(sortDescriptors: NSArray[NSSortDescriptor]): Unit = extern
//  @inline def highlightedTableColumn(): NSTableColumn = extern
//  @inline def setHighlightedTableColumn(highlightedTableColumn: NSTableColumn): Unit = extern
  @inline def verticalMotionCanBeginDrag(): BOOL = extern
  @inline def setVerticalMotionCanBeginDrag(verticalMotionCanBeginDrag: BOOL): Unit = extern
  @inline def allowsMultipleSelection(): BOOL = extern
  @inline def setAllowsMultipleSelection(allowsMultipleSelection: BOOL): Unit = extern
  @inline def allowsEmptySelection(): BOOL = extern
  @inline def setAllowsEmptySelection(allowsEmptySelection: BOOL): Unit = extern
  @inline def allowsColumnSelection(): BOOL = extern
  @inline def setAllowsColumnSelection(allowsColumnSelection: BOOL): Unit = extern
//  @inline def selectedColumnIndexes(): NSIndexSet = extern
//  @inline def selectedRowIndexes(): NSIndexSet = extern
  @inline def selectedColumn(): NSInteger = extern
  @inline def selectedRow(): NSInteger = extern
  @inline def numberOfSelectedColumns(): NSInteger = extern
  @inline def numberOfSelectedRows(): NSInteger = extern
  @inline def allowsTypeSelect(): BOOL = extern
  @inline def setAllowsTypeSelect(allowsTypeSelect: BOOL): Unit = extern
  @inline def selectionHighlightStyle(): NSTableViewSelectionHighlightStyle = extern
  @inline def setSelectionHighlightStyle(selectionHighlightStyle: NSTableViewSelectionHighlightStyle): Unit = extern
  @inline def draggingDestinationFeedbackStyle(): NSTableViewDraggingDestinationFeedbackStyle = extern
  @inline def setDraggingDestinationFeedbackStyle(draggingDestinationFeedbackStyle: NSTableViewDraggingDestinationFeedbackStyle): Unit = extern
  @inline def autosaveName(): NSString = extern
  @inline def setAutosaveName(autosaveName: NSString): Unit = extern
  @inline def autosaveTableColumns(): BOOL = extern
  @inline def setAutosaveTableColumns(autosaveTableColumns: BOOL): Unit = extern
  @inline def floatsGroupRows(): BOOL = extern
  @inline def setFloatsGroupRows(floatsGroupRows: BOOL): Unit = extern
  @inline def rowActionsVisible(): BOOL = extern
  @inline def setRowActionsVisible(rowActionsVisible: BOOL): Unit = extern
//  @inline def hiddenRowIndexes(): NSIndexSet = extern
//  @inline def registeredNibsByIdentifier(): NSDictionary[NSString, NSNib] = extern
  @inline def usesStaticContents(): BOOL = extern
  @inline def setUsesStaticContents(usesStaticContents: BOOL): Unit = extern
  @inline def setDrawsGrid(flag: BOOL): Unit = extern
  @inline def drawsGrid(): BOOL = extern
  @inline def selectColumn(column: NSInteger, extend: BOOL): Unit = extern
  @inline def selectRow(row: NSInteger, extend: BOOL): Unit = extern
//  @inline def selectedColumnEnumerator(): NSEnumerator = extern
//  @inline def selectedRowEnumerator(): NSEnumerator = extern
//  @inline def dragImageForRows(dragRows: NSArray, dragEvent: NSEvent, dragImageOffset: NSPointPointer): NSImage = extern
  @inline def setAutoresizesAllColumnsToFit(flag: BOOL): Unit = extern
  @inline def autoresizesAllColumnsToFit(): BOOL = extern
  @inline def columnsInRect(rect: NSRect): NSRange = extern
//  @inline def preparedCellAtColumn(column: NSInteger, row: NSInteger): NSCell = extern
  @inline def textShouldBeginEditing(textObject: NSText): BOOL = extern
  @inline def textShouldEndEditing(textObject: NSText): BOOL = extern
  @inline def textDidBeginEditing(notification: NSNotification): Unit = extern
  @inline def textDidEndEditing(notification: NSNotification): Unit = extern
  @inline def textDidChange(notification: NSNotification): Unit = extern
//  @inline def shouldFocusCell(cell: NSCell, column: NSInteger, row: NSInteger): BOOL = extern
  @inline def focusedColumn(): NSInteger = extern
  @inline def setFocusedColumn(focusedColumn: NSInteger): Unit = extern
  @inline def performClickOnCellAtColumn(column: NSInteger, row: NSInteger): Unit = extern
}

@ObjCClass
abstract class NSTableViewClass extends NSObjectClass {
}

object NSTableView extends NSTableViewClass {
  override type InstanceType = NSTableView
}