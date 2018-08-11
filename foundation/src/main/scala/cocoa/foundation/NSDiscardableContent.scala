// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.foundation

import scalanative.native._
import objc._

@ObjC
trait NSDiscardableContent {
  @inline def beginContentAccess(): BOOL = extern
  @inline def endContentAccess(): Unit = extern
  @inline def discardContentIfPossible(): Unit = extern
  @inline def isContentDiscarded(): BOOL = extern
}
