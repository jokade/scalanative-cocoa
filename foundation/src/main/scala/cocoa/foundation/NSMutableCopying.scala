package cocoa.foundation

import scalanative.native._
import objc._
import scala.scalanative.native.objc.runtime.ObjCObject

@ObjC
trait NSMutableCopying extends ObjCObject {
  @inline def mutableCopyWithZone_(zone: NSZone): id = extern
}
