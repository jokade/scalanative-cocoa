// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.coredata

import cocoa.foundation.{BOOL, NSCopying, NSObject, NSURL}

import scala.language.experimental.macros
import scalanative.native._
import objc._

@ObjC
class NSManagedObjectID extends NSObject with NSCopying {
  @inline def URIRepresentation(): NSURL = extern
//  @inline def entity(): NSEntityDescription = extern
//  @inline def persistentStore(): NSPersistentStore = extern
  @inline def isTemporaryID(): BOOL = extern
}
