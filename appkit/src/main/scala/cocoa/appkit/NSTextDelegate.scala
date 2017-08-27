// Copyright (c) 2017. Distributed under the MIT License (see included LICENSE file).
package cocoa.appkit

import cocoa.foundation.{BOOL, NSNotification, NSObject}

import scala.language.experimental.macros
import objc.{ObjC, ObjCClass}

import scalanative.native._

@ObjC
trait NSTextDelegate extends NSObject {
  @inline def textShouldBeginEditing(textObject: NSText): BOOL = extern
  @inline def textShouldEndEditing(textObject: NSText): BOOL = extern
  @inline def textDidBeginEditing(notification: NSNotification): Unit = extern
  @inline def textDidEndEditing(notification: NSNotification): Unit = extern
  @inline def textDidChange(notification: NSNotification): Unit = extern
}
