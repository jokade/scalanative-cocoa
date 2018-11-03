// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.coredata

import cocoa.foundation._

import scala.language.experimental.macros
import scalanative.native._
import objc._

@ObjC
class NSManagedObject extends NSObject {
//  @inline def initWithEntity_context_(entity: NSEntityDescription, context: NSManagedObjectContext): NSManagedObject = extern
  @inline def initWithContext_(moc: NSManagedObjectContext): NSManagedObject = extern
  @inline def hasFaultForRelationshipNamed_(key: NSString): BOOL = extern
  @inline def objectIDsForRelationshipNamed_(key: NSString): NSArray[NSManagedObjectID] = extern
  @inline def willAccessValueForKey_(key: NSString): Unit = extern
  @inline def didAccessValueForKey_(key: NSString): Unit = extern
  @inline def willChangeValueForKey_(key: NSString): Unit = extern
  @inline def didChangeValueForKey_(key: NSString): Unit = extern
//  @inline def willChangeValueForKey_inMutationKind_inObjects_(inKey: NSString, inMutationKind: NSKeyValueSetMutationKind, inObjects: NSSet): Unit = extern
//  @inline def didChangeValueForKey_inMutationKind_inObjects_(inKey: NSString, inMutationKind: NSKeyValueSetMutationKind, inObjects: NSSet): Unit = extern
  @inline def awakeFromFetch(): Unit = extern
  @inline def awakeFromInsert(): Unit = extern
  @inline def awakeFromSnapshotEvents_(flags: NSSnapshotEventType): Unit = extern
  @inline def prepareForDeletion(): Unit = extern
  @inline def willSave(): Unit = extern
  @inline def didSave(): Unit = extern
  @inline def willTurnIntoFault(): Unit = extern
  @inline def didTurnIntoFault(): Unit = extern
  @inline def valueForKey_(key: NSString): id = extern
  @inline def setValue_key_(value: id, key: NSString): Unit = extern
  @inline def primitiveValueForKey_(key: NSString): id = extern
  @inline def setPrimitiveValue_key_(value: id, key: NSString): Unit = extern
  @inline def committedValuesForKeys_(keys: NSString): NSDictionary[NSString, NSObject] = extern
  @inline def changedValues(): NSDictionary[NSString, NSObject] = extern
  @inline def changedValuesForCurrentEvent(): NSDictionary[NSString, NSObject] = extern
  @inline def validateValue_key_error_(value: id, key: NSString, error: NSError): BOOL = extern
  @inline def validateForDelete_(error: NSError): BOOL = extern
  @inline def validateForInsert_(error: NSError): BOOL = extern
  @inline def validateForUpdate_(error: NSError): BOOL = extern
  @inline def setObservationInfo_(inObservationInfo: Ptr[Byte]): Unit = extern
  @inline def observationInfo(): Ptr[Byte] = extern
  @inline def managedObjectContext(): NSManagedObjectContext = extern
//  @inline def entity(): NSEntityDescription = extern
  @inline def objectID(): NSManagedObjectID = extern
  @inline def isInserted(): BOOL = extern
  @inline def isUpdated(): BOOL = extern
  @inline def isDeleted(): BOOL = extern
  @inline def hasChanges(): BOOL = extern
  @inline def hasPersistentChangedValues(): BOOL = extern
  @inline def isFault(): BOOL = extern
  @inline def faultingState(): NSUInteger = extern
}


@ObjCClass
abstract class NSManagedObjectClass extends NSObjectClass {
//  @inline def entity(): NSEntityDescription = extern
//  @inline def fetchRequest(): NSFetchRequest = extern
  @inline def contextShouldIgnoreUnmodeledPropertyChanges(): BOOL = extern
}

object NSManagedObject extends NSManagedObjectClass {
  override type InstanceType = NSManagedObject
}