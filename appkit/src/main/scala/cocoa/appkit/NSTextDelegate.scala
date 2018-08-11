// Copyright (c) 2017. Distributed under the MIT License (see included LICENSE file).
package cocoa.appkit

import scalanative.native._
import objc._
import cocoa.foundation.{BOOL, NSNotification, NSObject}


@ObjC
trait NSTextDelegate extends NSObject {
  @inline def textShouldBeginEditing_(textObject: NSText): BOOL = extern
  @inline def textShouldEndEditing_(textObject: NSText): BOOL = extern
  @inline def textDidBeginEditing_(notification: NSNotification): Unit = extern
  @inline def textDidEndEditing_(notification: NSNotification): Unit = extern
  @inline def textDidChange_(notification: NSNotification): Unit = extern
}

