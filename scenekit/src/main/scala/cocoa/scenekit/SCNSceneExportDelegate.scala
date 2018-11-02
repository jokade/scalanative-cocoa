//     Project: sncocoa
//      Module:
// Description:

// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.scenekit

import cocoa.appkit.NSImage
import cocoa.foundation.{NSObject, NSURL}

import scalanative.native._
import objc._

@ObjC
trait SCNSceneExportDelegate extends NSObject {
  @inline def writeImage_documentURL_originalImageURL_(image: NSImage, documentURL: NSURL, originalImageURL: NSURL): NSURL = extern
}
