package cocoa.foundation

import scalanative.native._
import objc._
import scala.scalanative.native.objc.runtime.ObjCObject

@ObjC
trait NSCopying extends ObjCObject {
  @inline def copyWithZone_(zone: NSZone): id = extern
}
