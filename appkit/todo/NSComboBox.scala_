// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.appkit

import cocoa.foundation.{BOOL, NSArray, NSInteger, NSObject, NSObjectClass, NSSize, id}

import scala.language.experimental.macros
import scalanative.native._

@ObjC
class NSComboBox extends NSTextField {
  @inline def reloadData(): Unit = extern
  @inline def noteNumberOfItemsChanged(): Unit = extern
  @inline def scrollItemAtIndexToTop(index: NSInteger): Unit = extern
  @inline def scrollItemAtIndexToVisible(index: NSInteger): Unit = extern
  @inline def selectItemAtIndex(index: NSInteger): Unit = extern
  @inline def deselectItemAtIndex(index: NSInteger): Unit = extern
  @inline def addItemWithObjectValue(`object`: id): Unit = extern
  @inline def addItemsWithObjectValues[T<:NSObject](objects: NSArray[T]): Unit = extern
  @inline def insertItemWithObjectValue(`object`: id, index: NSInteger): Unit = extern
  @inline def removeItemWithObjectValue(`object`: id): Unit = extern
  @inline def removeItemAtIndex(index: NSInteger): Unit = extern
  @inline def removeAllItems(): Unit = extern
  @inline def selectItemWithObjectValue(`object`: id): Unit = extern
  @inline def itemObjectValueAtIndex(index: NSInteger): id = extern
  @inline def indexOfItemWithObjectValue(`object`: id): NSInteger = extern
  @inline def hasVerticalScroller(): BOOL = extern
  @inline def setHasVerticalScroller(hasVerticalScroller: BOOL): Unit = extern
  @inline def intercellSpacing(): NSSize = extern
  @inline def setIntercellSpacing(intercellSpacing: NSSize): Unit = extern
//  @inline def itemHeight(): CGFloat = extern
//  @inline def setItemHeight(itemHeight: CGFloat): Unit = extern
  @inline def numberOfVisibleItems(): NSInteger = extern
  @inline def setNumberOfVisibleItems(numberOfVisibleItems: NSInteger): Unit = extern
  @inline def isButtonBordered(): BOOL = extern
  @inline def setButtonBordered(buttonBordered: BOOL): Unit = extern
  @inline def usesDataSource(): BOOL = extern
  @inline def setUsesDataSource(usesDataSource: BOOL): Unit = extern
  @inline def indexOfSelectedItem(): NSInteger = extern
  @inline def numberOfItems(): NSInteger = extern
  @inline def completes(): BOOL = extern
  @inline def setCompletes(completes: BOOL): Unit = extern
  @inline def dataSource(): NSComboBoxDataSource = extern
  @inline def setDataSource(dataSource: NSComboBoxDataSource): Unit = extern
  @inline def objectValueOfSelectedItem(): id = extern
  @inline def objectValues[T<:NSObject](): NSArray[T] = extern
}

@ObjCClass
abstract class NSComboBoxClass extends NSObjectClass {
}

object NSComboBox extends NSComboBoxClass {
  override type InstanceType = NSComboBox
}