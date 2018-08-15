// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.appkit

import cocoa.foundation._

import scala.language.experimental.macros
import scalanative.native._
import objc._


@ObjC
class NSImage extends NSObject with NSCopying with NSCoding with NSSecureCoding {//with NSPasteboardReading with NSPasteboardWriting {
  @inline def initWithSize_(size: NSSize): NSImage = extern
  @inline def initWithData_(data: NSData): NSImage = extern
  @inline def initWithContentsOfFile_(fileName: NSString): NSImage = extern
  @inline def initWithContentsOfURL_(url: NSURL): NSImage = extern
  @inline def initByReferencingFile_(fileName: NSString): NSImage = extern
  @inline def initByReferencingURL_(url: NSURL): NSImage = extern
//  @inline def initWithIconRef_(iconRef: IconRef): NSImage = extern
//  @inline def initWithPasteboard_(pasteboard: NSPasteboard): NSImage = extern
  @inline def initWithDataIgnoringOrientation_(data: NSData): NSImage = extern
  @inline def setName_(string: NSImageName): BOOL = extern
  @inline def name(): NSImageName = extern
//  @inline def drawAtPoint_fromRect_op_delta_(point: NSPoint, fromRect: NSRect, op: NSCompositingOperation, delta: CGFloat): Unit = extern
//  @inline def drawInRect_fromRect_op_delta_(rect: NSRect, fromRect: NSRect, op: NSCompositingOperation, delta: CGFloat): Unit = extern
//  @inline def drawInRect_srcSpacePortionRect_op_requestedAlpha_respectContextIsFlipped_hints_(dstSpacePortionRect: NSRect, srcSpacePortionRect: NSRect, op: NSCompositingOperation, requestedAlpha: CGFloat, respectContextIsFlipped: BOOL, hints: id): Unit = extern
  @inline def drawRepresentation_rect_(imageRep: NSImageRep, rect: NSRect): BOOL = extern
  @inline def drawInRect_(rect: NSRect): Unit = extern
  @inline def recache(): Unit = extern
//  @inline def TIFFRepresentationUsingCompression_factor_(comp: NSTIFFCompression, factor: Float): NSData = extern
  @inline def addRepresentations_(imageReps: NSImageRep): Unit = extern
  @inline def addRepresentation_(imageRep: NSImageRep): Unit = extern
  @inline def removeRepresentation_(imageRep: NSImageRep): Unit = extern
  @inline def lockFocus(): Unit = extern
  @inline def lockFocusFlipped_(flipped: BOOL): Unit = extern
  @inline def unlockFocus(): Unit = extern
  @inline def bestRepresentationForDevice_(deviceDescription: NSDictionary[NSObject,NSObject]): NSImageRep = extern
  @inline def cancelIncrementalLoad(): Unit = extern
//  @inline def initWithCGImage_size_(cgImage: CGImageRef, size: NSSize): NSImage = extern
//  @inline def CGImageForProposedRect_referenceContext_hints_(proposedDestRect: NSRect, referenceContext: NSGraphicsContext, hints: id): CGImageRef = extern
//  @inline def bestRepresentationForRect_referenceContext_hints_(rect: NSRect, referenceContext: NSGraphicsContext, hints: id): NSImageRep = extern
//  @inline def hitTestRect_imageRectDestSpace_context_hints_flipped_(testRectDestSpace: NSRect, imageRectDestSpace: NSRect, context: NSGraphicsContext, hints: id, flipped: BOOL): BOOL = extern
  @inline def recommendedLayerContentsScale_(preferredContentsScale: CGFloat): CGFloat = extern
  @inline def layerContentsForContentsScale_(layerContentsScale: CGFloat): id = extern
  @inline def size(): NSSize = extern
  @inline def setSize_(size: NSSize): Unit = extern
  @inline def backgroundColor(): NSColor = extern
  @inline def setBackgroundColor_(backgroundColor: NSColor): Unit = extern
  @inline def usesEPSOnResolutionMismatch(): BOOL = extern
  @inline def setUsesEPSOnResolutionMismatch_(usesEPSOnResolutionMismatch: BOOL): Unit = extern
  @inline def prefersColorMatch(): BOOL = extern
  @inline def setPrefersColorMatch_(prefersColorMatch: BOOL): Unit = extern
  @inline def matchesOnMultipleResolution(): BOOL = extern
  @inline def setMatchesOnMultipleResolution_(matchesOnMultipleResolution: BOOL): Unit = extern
  @inline def matchesOnlyOnBestFittingAxis(): BOOL = extern
  @inline def setMatchesOnlyOnBestFittingAxis_(matchesOnlyOnBestFittingAxis: BOOL): Unit = extern
  @inline def TIFFRepresentation(): NSData = extern
  @inline def representations(): NSArray[NSImageRep] = extern
  @inline def isValid(): BOOL = extern
  @inline def delegate(): NSImageDelegate = extern
  @inline def setDelegate_(delegate: NSImageDelegate): Unit = extern
  @inline def cacheMode(): NSImageCacheMode = extern
  @inline def setCacheMode_(cacheMode: NSImageCacheMode): Unit = extern
  @inline def alignmentRect(): NSRect = extern
  @inline def setAlignmentRect_(alignmentRect: NSRect): Unit = extern
  @inline def isTemplate(): BOOL = extern
  @inline def setTemplate_(template: BOOL): Unit = extern
  @inline def accessibilityDescription(): NSString = extern
  @inline def setAccessibilityDescription_(accessibilityDescription: NSString): Unit = extern
//  @inline def capInsets(): NSEdgeInsets = extern
//  @inline def setCapInsets_(capInsets: NSEdgeInsets): Unit = extern
  @inline def resizingMode(): NSImageResizingMode = extern
  @inline def setResizingMode_(resizingMode: NSImageResizingMode): Unit = extern
  @inline def setFlipped_(flag: BOOL): Unit = extern
  @inline def isFlipped(): BOOL = extern
  @inline def dissolveToPoint_fraction_(point: NSPoint, fraction: CGFloat): Unit = extern
  @inline def dissolveToPoint_rect_fraction_(point: NSPoint, rect: NSRect, fraction: CGFloat): Unit = extern
//  @inline def compositeToPoint_op_(point: NSPoint, op: NSCompositingOperation): Unit = extern
//  @inline def compositeToPoint_rect_op_(point: NSPoint, rect: NSRect, op: NSCompositingOperation): Unit = extern
//  @inline def compositeToPoint_op_delta_(point: NSPoint, op: NSCompositingOperation, delta: CGFloat): Unit = extern
//  @inline def compositeToPoint_rect_op_delta_(point: NSPoint, rect: NSRect, op: NSCompositingOperation, delta: CGFloat): Unit = extern
  @inline def lockFocusOnRepresentation_(imageRepresentation: NSImageRep): Unit = extern
  @inline def setScalesWhenResized_(flag: BOOL): Unit = extern
  @inline def scalesWhenResized(): BOOL = extern
  @inline def setDataRetained_(flag: BOOL): Unit = extern
  @inline def isDataRetained(): BOOL = extern
  @inline def setCachedSeparately_(flag: BOOL): Unit = extern
  @inline def isCachedSeparately(): BOOL = extern
  @inline def setCacheDepthMatchesImageDepth_(flag: BOOL): Unit = extern
  @inline def cacheDepthMatchesImageDepth(): BOOL = extern
}

@ObjCClass
abstract class NSImageClass extends NSObjectClass {
  @inline def imageNamed_(name: NSImageName): NSImage = extern
  @inline def imageWithSize_drawingHandlerShouldBeCalledWithFlippedContext_drawingHandler_(size: NSSize, drawingHandlerShouldBeCalledWithFlippedContext: BOOL, drawingHandler: BOOL): NSImage = extern
  @inline def imageUnfilteredFileTypes(): NSArray[NSString] = extern
//  @inline def imageUnfilteredPasteboardTypes(): NSArray[NSPasteboardType] = extern
  @inline def imageFileTypes(): NSArray[NSString] = extern
//  @inline def imagePasteboardTypes(): NSArray[NSPasteboardType] = extern
//  @inline def canInitWithPasteboard_(pasteboard: NSPasteboard): BOOL = extern
  @inline def imageTypes(): NSArray[NSString] = extern
  @inline def imageUnfilteredTypes(): NSArray[NSString] = extern
}

object NSImage extends NSImageClass {
  override type InstanceType = NSImage
}
