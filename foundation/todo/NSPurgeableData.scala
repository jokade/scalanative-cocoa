// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.foundation

import scala.language.experimental.macros
import scalanative.native._
import objc._

@ObjC
class NSPurgeableData extends NSMutableData with NSDiscardableContent {
}

@ObjCClass
abstract class NSPurgeableDataClass extends NSObjectClass {
}

object NSPurgeableData extends NSPurgeableDataClass {
  override type InstanceType = NSPurgeableData
}