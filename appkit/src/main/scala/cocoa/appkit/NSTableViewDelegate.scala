// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.appkit

import cocoa.foundation.{BOOL, NSArray, NSInteger, NSNotification, NSString, id}

import scalanative.native._

@ObjC
trait NSTableViewDelegate extends NSControlTextEditingDelegate {
  @inline def tableView_viewForTableColumn_row_(tableView: NSTableView, column: NSTableColumn, row: NSInteger): NSView = extern
//  @inline def tableView(tableView: NSTableView, tableColumn: NSTableColumn, row: NSInteger): NSView = extern
//  @inline def tableView(tableView: NSTableView, row: NSInteger): NSTableRowView = extern
//  @inline def tableView(tableView: NSTableView, rowView: NSTableRowView, row: NSInteger): Unit = extern
//  @inline def tableView(tableView: NSTableView, rowView: NSTableRowView, row: NSInteger): Unit = extern
//  @inline def tableView(tableView: NSTableView, cell: id, tableColumn: NSTableColumn, row: NSInteger): Unit = extern
//  @inline def tableView(tableView: NSTableView, tableColumn: NSTableColumn, row: NSInteger): BOOL = extern
//  @inline def tableView(tableView: NSTableView, cell: NSCell, rect: NSRectPointer, tableColumn: NSTableColumn, row: NSInteger, mouseLocation: NSPoint): NSString = extern
//  @inline def tableView(tableView: NSTableView, tableColumn: NSTableColumn, row: NSInteger): BOOL = extern
//  @inline def tableView(tableView: NSTableView, cell: NSCell, tableColumn: NSTableColumn, row: NSInteger): BOOL = extern
//  @inline def tableView(tableView: NSTableView, tableColumn: NSTableColumn, row: NSInteger): NSCell = extern
//  @inline def selectionShouldChangeInTableView(tableView: NSTableView): BOOL = extern
//  @inline def tableView(tableView: NSTableView, row: NSInteger): BOOL = extern
//  @inline def tableView(tableView: NSTableView, proposedSelectionIndexes: NSIndexSet): NSIndexSet = extern
//  @inline def tableView(tableView: NSTableView, tableColumn: NSTableColumn): BOOL = extern
//  @inline def tableView(tableView: NSTableView, tableColumn: NSTableColumn): Unit = extern
//  @inline def tableView(tableView: NSTableView, tableColumn: NSTableColumn): Unit = extern
//  @inline def tableView(tableView: NSTableView, tableColumn: NSTableColumn): Unit = extern
//  @inline def tableView(tableView: NSTableView, row: NSInteger): CGFloat = extern
//  @inline def tableView(tableView: NSTableView, tableColumn: NSTableColumn, row: NSInteger): NSString = extern
//  @inline def tableView(tableView: NSTableView, startRow: NSInteger, endRow: NSInteger, searchString: NSString): NSInteger = extern
//  @inline def tableView(tableView: NSTableView, event: NSEvent, searchString: NSString): BOOL = extern
//  @inline def tableView(tableView: NSTableView, row: NSInteger): BOOL = extern
//  @inline def tableView(tableView: NSTableView, column: NSInteger): CGFloat = extern
//  @inline def tableView(tableView: NSTableView, columnIndex: NSInteger, newColumnIndex: NSInteger): BOOL = extern
//  @inline def tableView(tableView: NSTableView, row: NSInteger, edge: NSTableRowActionEdge): NSArray[NSTableViewRowAction] = extern
  @inline def tableViewSelectionDidChange(notification: NSNotification): Unit = extern
//  @inline def tableViewColumnDidMove(notification: NSNotification): Unit = extern
//  @inline def tableViewColumnDidResize(notification: NSNotification): Unit = extern
//  @inline def tableViewSelectionIsChanging(notification: NSNotification): Unit = extern
}
