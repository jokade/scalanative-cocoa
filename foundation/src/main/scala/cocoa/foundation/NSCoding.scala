//     Project: scalanative-cocoa
//      Module: Foundation
// Description: Generated with scala-obj-bindgen (with manual postprocessing) from:
//              objc/objc.h, objc/NSObject.h, objc/Protocol.h, Foundation/NSObject.h
package cocoa.foundation

import scalanative.native._
import objc._

import scala.scalanative.native.extern

@ObjC
trait NSCoding {
  @inline def encodeWithCoder_(aCoder: NSCoder): Unit = extern
  @inline def initWithCoder_(aDecoder: NSCoder): this.type = extern
}
