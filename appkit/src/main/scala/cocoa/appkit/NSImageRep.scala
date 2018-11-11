// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.appkit

import cocoa.foundation._

import scala.language.experimental.macros
import scala.scalanative.native._
import scala.scalanative.native.objc._


@ObjC
class NSImageRep extends NSObject with NSCopying with NSCoding {
  @inline def draw(): BOOL = extern
  @inline def drawAtPoint_(point: NSPoint): BOOL = extern
  @inline def drawInRect_(rect: NSRect): BOOL = extern
//  @inline def drawInRect_srcSpacePortionRect_op_requestedAlpha_respectContextIsFlipped_hints_(dstSpacePortionRect: NSRect, srcSpacePortionRect: NSRect, op: NSCompositingOperation, requestedAlpha: CGFloat, respectContextIsFlipped: BOOL, hints: id): BOOL = extern
//  @inline def CGImageForProposedRect_context_hints_(proposedDestRect: NSRect, context: NSGraphicsContext, hints: id): CGImageRef = extern
  @inline def size: NSSize = extern
  @inline def setSize_(size: NSSize): Unit = extern
  @inline def hasAlpha: BOOL = extern
  @inline def setAlpha_(alpha: BOOL): Unit = extern
  @inline def isOpaque: BOOL = extern
  @inline def setOpaque_(opaque: BOOL): Unit = extern
//  @inline def colorSpaceName(): NSColorSpaceName = extern
//  @inline def setColorSpaceName_(colorSpaceName: NSColorSpaceName): Unit = extern
  @inline def bitsPerSample: NSInteger = extern
  @inline def setBitsPerSample_(bitsPerSample: NSInteger): Unit = extern
  @inline def pixelsWide: NSInteger = extern
  @inline def setPixelsWide_(pixelsWide: NSInteger): Unit = extern
  @inline def pixelsHigh: NSInteger = extern
  @inline def setPixelsHigh_(pixelsHigh: NSInteger): Unit = extern
  @inline def layoutDirection: NSImageLayoutDirection = extern
  @inline def setLayoutDirection_(layoutDirection: NSImageLayoutDirection): Unit = extern
}

@ObjCClass
abstract class NSImageRepClass extends NSObjectClass {
  @inline def registerImageRepClass_(imageRepClass: id): Unit = extern
  @inline def unregisterImageRepClass_(imageRepClass: id): Unit = extern
  @inline def imageRepClassForFileType_(`type`: NSString): id = extern
//  @inline def imageRepClassForPasteboardType_(`type`: NSPasteboardType): id = extern
  @inline def imageRepClassForType_(`type`: NSString): id = extern
  @inline def imageRepClassForData_(data: NSData): id = extern
  @inline def canInitWithData_(data: NSData): BOOL = extern
  @inline def imageUnfilteredFileTypes(): NSArray[NSString] = extern
//  @inline def imageUnfilteredPasteboardTypes(): NSArray[NSPasteboardType] = extern
  @inline def imageFileTypes(): NSArray[NSString] = extern
//  @inline def imagePasteboardTypes(): NSArray[NSPasteboardType] = extern
//  @inline def canInitWithPasteboard_(pasteboard: NSPasteboard): BOOL = extern
  @inline def imageRepsWithContentsOfFile_(filename: NSString): NSArray[NSImageRep] = extern
  @inline def imageRepWithContentsOfFile_(filename: NSString): NSImageRep = extern
  @inline def imageRepsWithContentsOfURL_(url: NSURL): NSArray[NSImageRep] = extern
  @inline def imageRepWithContentsOfURL_(url: NSURL): NSImageRep = extern
//  @inline def imageRepsWithPasteboard_(pasteboard: NSPasteboard): NSArray[NSImageRep] = extern
//  @inline def imageRepWithPasteboard_(pasteboard: NSPasteboard): NSImageRep = extern
  @inline def registeredImageRepClasses(): NSArray[NSObject] = extern
  @inline def imageUnfilteredTypes(): NSArray[NSString] = extern
  @inline def imageTypes(): NSArray[NSString] = extern
}

object NSImageRep extends NSImageRepClass {
  override type InstanceType = NSImageRep
}