//     Project: scalanative-cocoa
//      Module: Foundation
// Description: Generated with scala-obj-bindgen (with manual postprocessing) from:
//              objc/objc.h, objc/NSObject.h, objc/Protocol.h, Foundation/NSObject.h
package cocoa.foundation

import objc.ObjC
import scalanative.native._

@ObjC
trait NSSecureCoding extends NSCoding {
}

object NSSecureCoding {
  @inline def supportsSecureCoding(): BOOL = extern
}

