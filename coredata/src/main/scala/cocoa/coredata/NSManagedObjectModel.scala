// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.coredata

import cocoa.foundation.{BOOL, NSArray, NSCoding, NSCopying, NSDictionary, NSFastEnumeration, NSObject, NSObjectClass, NSString, NSURL, id}

import scala.language.experimental.macros
import scalanative.native._
import objc._


@ObjC
class NSManagedObjectModel extends NSObject with NSCoding with NSCopying with NSFastEnumeration {
  @inline def initWithContentsOfURL_(url: NSURL): NSManagedObjectModel = extern
//  @inline def entitiesForConfiguration_(configuration: NSString): NSArray[NSEntityDescription] = extern
//  @inline def setEntities_configuration_(entities: NSEntityDescription, configuration: NSString): Unit = extern
//  @inline def setFetchRequestTemplate_name_(fetchRequestTemplate: NSFetchRequest, name: NSString): Unit = extern
//  @inline def fetchRequestTemplateForName_(name: NSString): NSFetchRequest = extern
//  @inline def fetchRequestFromTemplateWithName_variables_(name: NSString, variables: id): NSFetchRequest = extern
  @inline def isConfiguration_metadata_(configuration: NSString, metadata: id): BOOL = extern
//  @inline def entitiesByName(): NSDictionary[NSString, NSEntityDescription] = extern
//  @inline def entities(): NSArray[NSEntityDescription] = extern
//  @inline def setEntities_(entities: NSArray[NSEntityDescription]): Unit = extern
  @inline def configurations(): NSArray[NSString] = extern
  @inline def localizationDictionary(): NSDictionary[NSString, NSString] = extern
  @inline def setLocalizationDictionary_(localizationDictionary: NSDictionary[NSString, NSString]): Unit = extern
//  @inline def fetchRequestTemplatesByName(): NSDictionary[NSString, NSFetchRequest] = extern
//  @inline def versionIdentifiers(): NSSet = extern
//  @inline def setVersionIdentifiers_(versionIdentifiers: NSSet): Unit = extern
//  @inline def entityVersionHashesByName(): NSDictionary[NSString, NSData] = extern
}

@ObjCClass
abstract class NSManagedObjectModelClass extends NSObjectClass {
//  @inline def mergedModelFromBundles_(bundles: NSBundle): NSManagedObjectModel = extern
  @inline def modelByMergingModels_(models: NSManagedObjectModel): NSManagedObjectModel = extern
//  @inline def mergedModelFromBundles_metadata_(bundles: NSBundle, metadata: id): NSManagedObjectModel = extern
  @inline def modelByMergingModels_metadata_(models: NSManagedObjectModel, metadata: id): NSManagedObjectModel = extern
}

object NSManagedObjectModel extends NSManagedObjectModelClass {
  override type InstanceType = NSManagedObjectModel
}