// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.appkit

import scala.language.experimental.macros
import scalanative.native._
import objc._
import cocoa.foundation._


@ObjC
trait NSImageDelegate extends NSObject {
  @inline def imageDidNotDraw_rect_(sender: NSImage, rect: NSRect): NSImage = extern
  @inline def image_rep_(image: NSImage, rep: NSImageRep): Unit = extern
  @inline def image_rep_rows_(image: NSImage, rep: NSImageRep, rows: NSInteger): Unit = extern
  @inline def image_rep_status_(image: NSImage, rep: NSImageRep, status: NSImageLoadStatus): Unit = extern
}