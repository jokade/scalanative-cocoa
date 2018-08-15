// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.coredata

import cocoa.foundation.{BOOL, NSArray, NSCoding, NSCopying, NSData, NSDictionary, NSFastEnumeration, NSObject, NSObjectClass, NSString}

import scala.language.experimental.macros
import scalanative.native._
import objc._


@ObjC
class NSEntityDescription extends NSObject with NSCoding with NSCopying with NSFastEnumeration {
//  @inline def relationshipsWithDestinationEntity_(entity: NSEntityDescription): NSArray[NSRelationshipDescription] = extern
  @inline def isKindOfEntity_(entity: NSEntityDescription): BOOL = extern
  @inline def managedObjectModel(): NSManagedObjectModel = extern
  @inline def managedObjectClassName(): NSString = extern
  @inline def setManagedObjectClassName_(managedObjectClassName: NSString): Unit = extern
  @inline def name(): NSString = extern
  @inline def setName_(name: NSString): Unit = extern
  @inline def isAbstract(): BOOL = extern
  @inline def setAbstract_(flag: BOOL): Unit = extern
  @inline def subentitiesByName(): NSDictionary[NSString, NSEntityDescription] = extern
  @inline def subentities(): NSArray[NSEntityDescription] = extern
  @inline def setSubentities_(subentities: NSArray[NSEntityDescription]): Unit = extern
  @inline def superentity(): NSEntityDescription = extern
//  @inline def propertiesByName(): NSDictionary[NSString, NSPropertyDescription] = extern
//  @inline def properties(): NSArray[NSPropertyDescription] = extern
//  @inline def setProperties_(properties: NSArray[NSPropertyDescription]): Unit = extern
  @inline def userInfo(): NSDictionary[NSObject,NSObject] = extern
  @inline def setUserInfo_(userInfo: NSDictionary[NSObject,NSObject]): Unit = extern
//  @inline def attributesByName(): NSDictionary[NSString, NSAttributeDescription] = extern
//  @inline def relationshipsByName(): NSDictionary[NSString, NSRelationshipDescription] = extern
  @inline def versionHash(): NSData = extern
  @inline def versionHashModifier(): NSString = extern
  @inline def setVersionHashModifier_(versionHashModifier: NSString): Unit = extern
  @inline def renamingIdentifier(): NSString = extern
  @inline def setRenamingIdentifier_(renamingIdentifier: NSString): Unit = extern
//  @inline def indexes(): NSArray[NSFetchIndexDescription] = extern
//  @inline def setIndexes_(indexes: NSArray[NSFetchIndexDescription]): Unit = extern
//  @inline def uniquenessConstraints(): NSArray[NSArray<id>] = extern
//  @inline def setUniquenessConstraints_(uniquenessConstraints: NSArray[NSArray<id>]): Unit = extern
//  @inline def compoundIndexes(): NSArray[NSArray<id>] = extern
//  @inline def setCompoundIndexes_(compoundIndexes: NSArray[NSArray<id>]): Unit = extern
//  @inline def coreSpotlightDisplayNameExpression(): NSExpression = extern
//  @inline def setCoreSpotlightDisplayNameExpression_(coreSpotlightDisplayNameExpression: NSExpression): Unit = extern
}

@ObjCClass
abstract class NSEntityDescriptionClass extends NSObjectClass  {
  @inline def entityForName_inManagedObjectContext_(entityName: NSString, context: NSManagedObjectContext): NSEntityDescription = extern
  @inline def insertNewObjectForEntityForName_inManagedObjectContext_(entityName: NSString, context: NSManagedObjectContext): NSManagedObject = extern
}

object NSEntityDescription extends NSEntityDescriptionClass {
  override type InstanceType = NSEntityDescription
}