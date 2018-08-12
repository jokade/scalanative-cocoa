// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.appkit

import scalanative.native._
import objc._
import cocoa.foundation._


@ObjC
class NSArrayController[T<:NSObject] extends NSObjectController[T] {
  @inline def rearrangeObjects(): Unit = extern
  @inline def didChangeArrangementCriteria(): Unit = extern
  @inline def arrangeObjects_(objects: NSArray[T]): NSArray[T] = extern
  @inline def setSelectionIndexes_(indexes: NSIndexSet): BOOL = extern
  @inline def setSelectionIndex_(index: NSUInteger): BOOL = extern
  @inline def addSelectionIndexes_(indexes: NSIndexSet): BOOL = extern
  @inline def removeSelectionIndexes_(indexes: NSIndexSet): BOOL = extern
  @inline def setSelectedObjects_(objects: NSArray[T]): BOOL = extern
  @inline def addSelectedObjects_(objects: NSArray[T]): BOOL = extern
  @inline def removeSelectedObjects_(objects: NSArray[T]): BOOL = extern
  @inline def insert_(sender: id): Unit = extern
  @inline def selectNext_(sender: id): Unit = extern
  @inline def selectPrevious_(sender: id): Unit = extern
  @inline def addObjects_(objects: NSArray[T]): Unit = extern
  @inline def insertObject_index_(`object`: id, index: NSUInteger): Unit = extern
  @inline def insertObjects_indexes_(objects: NSArray[T], indexes: NSIndexSet): Unit = extern
  @inline def removeObjectAtArrangedObjectIndex_(index: NSUInteger): Unit = extern
  @inline def removeObjectsAtArrangedObjectIndexes_(indexes: NSIndexSet): Unit = extern
  @inline def removeObjects_(objects: NSArray[T]): Unit = extern
  @inline def automaticallyRearrangesObjects(): BOOL = extern
  @inline def setAutomaticallyRearrangesObjects_(automaticallyRearrangesObjects: BOOL): Unit = extern
  @inline def automaticRearrangementKeyPaths(): NSArray[T] = extern
//  @inline def sortDescriptors(): NSArray[T][NSSortDescriptor] = extern
//  @inline def setSortDescriptors_(sortDescriptors: NSArray[T][NSSortDescriptor]): Unit = extern
//  @inline def filterPredicate(): NSPredicate = extern
//  @inline def setFilterPredicate_(filterPredicate: NSPredicate): Unit = extern
  @inline def clearsFilterPredicateOnInsertion(): BOOL = extern
  @inline def setClearsFilterPredicateOnInsertion_(clearsFilterPredicateOnInsertion: BOOL): Unit = extern
  @inline def arrangedObjects(): id = extern
  @inline def avoidsEmptySelection(): BOOL = extern
  @inline def setAvoidsEmptySelection_(avoidsEmptySelection: BOOL): Unit = extern
  @inline def preservesSelection(): BOOL = extern
  @inline def setPreservesSelection_(preservesSelection: BOOL): Unit = extern
  @inline def selectsInsertedObjects(): BOOL = extern
  @inline def setSelectsInsertedObjects_(selectsInsertedObjects: BOOL): Unit = extern
  @inline def alwaysUsesMultipleValuesMarker(): BOOL = extern
  @inline def setAlwaysUsesMultipleValuesMarker_(alwaysUsesMultipleValuesMarker: BOOL): Unit = extern
  @inline def selectionIndexes(): NSIndexSet = extern
  @inline def selectionIndex(): NSUInteger = extern
  @inline def canInsert(): BOOL = extern
  @inline def canSelectNext(): BOOL = extern
  @inline def canSelectPrevious(): BOOL = extern
}

@ObjCClass
abstract class NSArrayControllerClass extends NSObjectControllerClass {
}

object NSArrayController extends NSArrayControllerClass {
  override type InstanceType = NSArrayController[_]
}