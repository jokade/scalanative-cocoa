//     Project: scalanative-cocoa
//      Module: Foundation
// Description: Generated with scala-obj-bindgen (with manual postprocessing) from:
//              Foundation/NSEnumerator.h
// Copyright (c) 2017. Distributed under the MIT License (see included LICENSE file).
package cocoa.foundation

import scala.language.experimental.macros
import scalanative.native._

@ObjC
abstract class NSEnumerator[T<:NSObject] {
  @inline def nextObject(): T = extern
}
