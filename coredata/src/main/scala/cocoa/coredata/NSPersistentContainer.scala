// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.coredata

import cocoa.foundation.{NSArray, NSError, NSObject, NSObjectClass, NSString, NSURL}

import scala.language.experimental.macros
import scalanative.native._
import objc._


@ObjC
class NSPersistentContainer extends NSObject {
  @inline def initWithName_(name: NSString): NSPersistentContainer = extern
  @inline def initWithName_model_(name: NSString, model: NSManagedObjectModel): NSPersistentContainer = extern
  @inline def loadPersistentStoresWithCompletionHandler_(block: Block2[NSPersistentStoreDescription,NSError,_]): Unit = extern
  @inline def newBackgroundContext(): NSManagedObjectContext = extern
  @inline def performBackgroundTask_(block: Ptr[Byte]): Unit = extern
  @inline def name(): NSString = extern
  @inline def viewContext(): NSManagedObjectContext = extern
  @inline def managedObjectModel(): NSManagedObjectModel = extern
//  @inline def persistentStoreCoordinator(): NSPersistentStoreCoordinator = extern
//  @inline def persistentStoreDescriptions(): NSArray[NSPersistentStoreDescription] = extern
//  @inline def setPersistentStoreDescriptions_(persistentStoreDescriptions: NSArray[NSPersistentStoreDescription]): Unit = extern
}

@ObjCClass
abstract class NSPersistentContainerClass extends NSObjectClass {
  @inline def persistentContainerWithName_(name: NSString): NSPersistentContainer = extern
  @inline def persistentContainerWithName_model_(name: NSString, model: NSManagedObjectModel): NSPersistentContainer = extern
  @inline def defaultDirectoryURL(): NSURL = extern
}

object NSPersistentContainer extends NSPersistentContainerClass {
  override type InstanceType = NSPersistentContainer

  /**
   * Creates a persistent container with the given name.
   *
   * @param name The name of the container.
   */
  def apply(name: String): NSPersistentContainer =
    NSPersistentContainer.alloc().initWithName_(NSString(name))

  /**
   * Creates a persistent container with the given name and model.
   *
   * @param name The name used by the persistent container
   * @param model The managed object model used by the persistent container.
   */
  def apply(name: String, model: NSManagedObjectModel): NSPersistentContainer =
    NSPersistentContainer.alloc().initWithName_model_(NSString(name),model)

//  implicit final class Wrapper(val c: NSPersistentContainer) extends AnyVal {
//    @inline def loadStores(onComplete: CFunctionPtr2[Unit]): Unit = {
//      c.loadPersistentStoresWithCompletionHandler_(onComplete)
//    }
//  }
}