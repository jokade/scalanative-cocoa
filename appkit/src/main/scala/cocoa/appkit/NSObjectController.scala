// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.appkit

import cocoa.foundation._

import scala.language.experimental.macros
import scala.scalanative.native._
import scala.scalanative.native.objc._

@ObjC
class NSObjectController[T<:NSObject] extends NSController {
  @inline def initWithContent_(content: id): NSObjectController[T] = extern
  @inline def prepareContent(): Unit = extern
  @inline def newObject(): id = extern
  @inline def addObject_(`object`: id): Unit = extern
  @inline def removeObject_(`object`: id): Unit = extern
  @inline def add_(sender: id): Unit = extern
  @inline def remove_(sender: id): Unit = extern
  @inline def validateUserInterfaceItem_(item: id): BOOL = extern
  @inline def content(): id = extern
  @inline def setContent_(content: id): Unit = extern
  @inline def selection(): id = extern
  @inline def selectedObjects(): NSArray[T] = extern
  @inline def automaticallyPreparesContent(): BOOL = extern
  @inline def setAutomaticallyPreparesContent_(automaticallyPreparesContent: BOOL): Unit = extern
  @inline def objectClass(): id = extern
  @inline def setObjectClass_(objectClass: id): Unit = extern
  @inline def isEditable(): BOOL = extern
  @inline def setEditable_(editable: BOOL): Unit = extern
  @inline def canAdd(): BOOL = extern
  @inline def canRemove(): BOOL = extern
//  @inline def fetchWithRequest_merge_error_(fetchRequest: NSFetchRequest, merge: BOOL, error: NSError): BOOL = extern
  @inline def fetch_(sender: id): Unit = extern
//  @inline def defaultFetchRequest(): NSFetchRequest = extern
//  @inline def managedObjectContext(): NSManagedObjectContext = extern
//  @inline def setManagedObjectContext_(managedObjectContext: NSManagedObjectContext): Unit = extern
  @inline def entityName(): NSString = extern
  @inline def setEntityName_(entityName: NSString): Unit = extern
//  @inline def fetchPredicate(): NSPredicate = extern
//  @inline def setFetchPredicate_(fetchPredicate: NSPredicate): Unit = extern
  @inline def usesLazyFetching(): BOOL = extern
  @inline def setUsesLazyFetching_(usesLazyFetching: BOOL): Unit = extern

}

@ObjCClass
abstract class NSObjectControllerClass extends NSControllerClass {
}

object NSObjectController extends NSObjectControllerClass {
  override type InstanceType = NSObjectController[_]
}