// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.coredata

import cocoa.foundation.{BOOL, NSCoding, NSDictionary, NSError, NSMutableDictionary, NSNotification, NSObject, NSObjectClass, NSString, NSTimeInterval, id}

import scala.language.experimental.macros
import scalanative.native._
import objc._


@ObjC
class NSManagedObjectContext extends NSObject with NSCoding {// with NSLocking {
  @inline def initWithConcurrencyType_(ct: NSManagedObjectContextConcurrencyType): NSManagedObjectContext = extern
  @inline def performBlock_(block: Ptr[Byte]): Unit = extern
  @inline def performBlockAndWait_(block: Ptr[Byte]): Unit = extern
  @inline def objectRegisteredForID_(objectID: NSManagedObjectID): NSManagedObject = extern
  @inline def objectWithID_(objectID: NSManagedObjectID): NSManagedObject = extern
  @inline def existingObjectWithID_error_(objectID: NSManagedObjectID, error: NSError): NSManagedObject = extern
//  @inline def executeFetchRequest_error_(request: NSFetchRequest, error: NSError): NSArray = extern
//  @inline def countForFetchRequest_error_(request: NSFetchRequest, error: NSError): NSUInteger = extern
//  @inline def executeRequest_error_(request: NSPersistentStoreRequest, error: NSError): NSPersistentStoreResult = extern
  @inline def insertObject_(`object`: NSManagedObject): Unit = extern
  @inline def deleteObject_(`object`: NSManagedObject): Unit = extern
  @inline def refreshObject_flag_(`object`: NSManagedObject, flag: BOOL): Unit = extern
  @inline def detectConflictsForObject_(`object`: NSManagedObject): Unit = extern
  @inline def observeValueForKeyPath_object_change_context_(keyPath: NSString, `object`: id, change: id, context: Ptr[Byte]): Unit = extern
  @inline def processPendingChanges(): Unit = extern
//  @inline def assignObject_store_(`object`: id, store: NSPersistentStore): Unit = extern
  @inline def undo(): Unit = extern
  @inline def redo(): Unit = extern
  @inline def reset(): Unit = extern
  @inline def rollback(): Unit = extern
  @inline def save_(error: Ptr[NSError]): BOOL = extern
  @inline def refreshAllObjects(): Unit = extern
  @inline def lock(): Unit = extern
  @inline def unlock(): Unit = extern
  @inline def tryLock(): BOOL = extern
//  @inline def shouldHandleInaccessibleFault_oid_property_(fault: NSManagedObject, oid: NSManagedObjectID, property: NSPropertyDescription): BOOL = extern
  @inline def obtainPermanentIDsForObjects_error_(objects: NSManagedObject, error: NSError): BOOL = extern
  @inline def mergeChangesFromContextDidSaveNotification_(notification: NSNotification): Unit = extern
//  @inline def setQueryGenerationFromToken_error_(generation: NSQueryGenerationToken, error: NSError): BOOL = extern
//  @inline def persistentStoreCoordinator(): NSPersistentStoreCoordinator = extern
//  @inline def setPersistentStoreCoordinator_(persistentStoreCoordinator: NSPersistentStoreCoordinator): Unit = extern
  @inline def parentContext(): NSManagedObjectContext = extern
  @inline def setParentContext_(parentContext: NSManagedObjectContext): Unit = extern
  @inline def name(): NSString = extern
  @inline def setName_(name: NSString): Unit = extern
//  @inline def undoManager(): NSUndoManager = extern
//  @inline def setUndoManager_(undoManager: NSUndoManager): Unit = extern
  @inline def hasChanges(): BOOL = extern
  @inline def userInfo(): NSMutableDictionary[NSObject,NSObject] = extern
  @inline def concurrencyType(): NSManagedObjectContextConcurrencyType = extern
//  @inline def insertedObjects(): NSSet[__kindof NSManagedObject] = extern
//  @inline def updatedObjects(): NSSet[__kindof NSManagedObject] = extern
//  @inline def deletedObjects(): NSSet[__kindof NSManagedObject] = extern
//  @inline def registeredObjects(): NSSet[__kindof NSManagedObject] = extern
  @inline def propagatesDeletesAtEndOfEvent(): BOOL = extern
  @inline def setPropagatesDeletesAtEndOfEvent_(propagatesDeletesAtEndOfEvent: BOOL): Unit = extern
  @inline def retainsRegisteredObjects(): BOOL = extern
  @inline def setRetainsRegisteredObjects_(retainsRegisteredObjects: BOOL): Unit = extern
  @inline def shouldDeleteInaccessibleFaults(): BOOL = extern
  @inline def setShouldDeleteInaccessibleFaults_(shouldDeleteInaccessibleFaults: BOOL): Unit = extern
  @inline def stalenessInterval(): NSTimeInterval = extern
  @inline def setStalenessInterval_(stalenessInterval: NSTimeInterval): Unit = extern
  @inline def mergePolicy(): id = extern
  @inline def setMergePolicy_(mergePolicy: id): Unit = extern
//  @inline def queryGenerationToken(): NSQueryGenerationToken = extern
  @inline def automaticallyMergesChangesFromParent(): BOOL = extern
  @inline def setAutomaticallyMergesChangesFromParent_(automaticallyMergesChangesFromParent: BOOL): Unit = extern
  @inline def transactionAuthor(): NSString = extern
  @inline def setTransactionAuthor_(transactionAuthor: NSString): Unit = extern
}

@ObjCClass
abstract class NSManagedObjectContextClass extends NSObjectClass {
//  @inline def `new`(): NSManagedObjectContext = extern
  @inline def mergeChangesFromRemoteContextSave_contexts_(changeNotificationData: NSDictionary[NSObject,NSObject], contexts: NSManagedObjectContext): Unit = extern
}

object NSManagedObjectContext extends NSManagedObjectContextClass {
  override type InstanceType = NSManagedObjectContext
}