//     Project: scalanative-cocoa
//      Module: Foundation
// Description: Generated with scala-obj-bindgen (with manual postprocessing) from:
//              objc/objc.h, objc/NSObject.h, objc/Protocol.h, Foundation/NSObject.h
package cocoa.foundation

import objc.ObjC
import scalanative.native._

@ObjC
trait NSDiscardableContent {
  @inline def beginContentAccess(): BOOL = extern
  @inline def endContentAccess(): Unit = extern
  @inline def discardContentIfPossible(): Unit = extern
  @inline def isContentDiscarded(): BOOL = extern
}
