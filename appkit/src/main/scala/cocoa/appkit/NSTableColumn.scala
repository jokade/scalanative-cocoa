// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.appkit

import cocoa.foundation.{BOOL, NSCoding, NSInteger, NSObject, NSObjectClass, NSString, id}

import scala.language.experimental.macros
import scalanative.native._


@ObjC
class NSTableColumn extends NSObject with NSCoding { //with NSUserInterfaceItemIdentification {
  @inline def initWithIdentifier(identifier: NSString): NSTableColumn = extern
  @inline def sizeToFit(): Unit = extern
  @inline def identifier(): NSString = extern
  @inline def setIdentifier(identifier: NSString): Unit = extern
  @inline def tableView(): NSTableView = extern
  @inline def setTableView(tableView: NSTableView): Unit = extern
//  @inline def width(): CGFloat = extern
//  @inline def setWidth(width: CGFloat): Unit = extern
//  @inline def minWidth(): CGFloat = extern
//  @inline def setMinWidth(minWidth: CGFloat): Unit = extern
//  @inline def maxWidth(): CGFloat = extern
//  @inline def setMaxWidth(maxWidth: CGFloat): Unit = extern
  @inline def title(): NSString = extern
  @inline def setTitle(title: NSString): Unit = extern
//  @inline def headerCell(): NSTableHeaderCell = extern
//  @inline def setHeaderCell(headerCell: NSTableHeaderCell): Unit = extern
  @inline def isEditable(): BOOL = extern
  @inline def setEditable(editable: BOOL): Unit = extern
//  @inline def sortDescriptorPrototype(): NSSortDescriptor = extern
//  @inline def setSortDescriptorPrototype(sortDescriptorPrototype: NSSortDescriptor): Unit = extern
//  @inline def resizingMask(): NSTableColumnResizingOptions = extern
//  @inline def setResizingMask(resizingMask: NSTableColumnResizingOptions): Unit = extern
  @inline def headerToolTip(): NSString = extern
  @inline def setHeaderToolTip(headerToolTip: NSString): Unit = extern
  @inline def isHidden(): BOOL = extern
  @inline def setHidden(hidden: BOOL): Unit = extern
  @inline def setResizable(flag: BOOL): Unit = extern
  @inline def isResizable(): BOOL = extern
  @inline def dataCellForRow(row: NSInteger): id = extern
  @inline def dataCell(): id = extern
  @inline def setDataCell(dataCell: id): Unit = extern
}

@ObjCClass
abstract class NSTableColumnClass extends NSObjectClass {
}

object NSTableColumn extends NSTableColumnClass {
  override type InstanceType = NSTableColumn
}