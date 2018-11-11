// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.appkit

import cocoa.foundation.{NSArray, NSData, NSInteger, NSObjectClass, NSRect, NSSecureCoding, NSString, NSUInteger}

import scala.language.experimental.macros
import scalanative.native._
import objc._
import scala.scalanative.native.objc.runtime.{BOOL, id}


@ObjC
class NSBitmapImageRep extends NSImageRep with NSSecureCoding {
  @inline def initWithFocusedViewRect_(rect: NSRect): NSBitmapImageRep = extern
  @inline def initWithBitmapDataPlanes_width_height_bps_spp_alpha_isPlanar_colorSpaceName_rBytes_pBits_(planes: Ptr[Ptr[CUnsignedChar]], width: NSInteger, height: NSInteger, bps: NSInteger, spp: NSInteger, alpha: BOOL, isPlanar: BOOL, colorSpaceName: NSColorSpaceName, rBytes: NSInteger, pBits: NSInteger): NSBitmapImageRep = extern
  @inline def initWithBitmapDataPlanes_width_height_bps_spp_alpha_isPlanar_colorSpaceName_bitmapFormat_rBytes_pBits_(planes: Ptr[Ptr[CUnsignedChar]], width: NSInteger, height: NSInteger, bps: NSInteger, spp: NSInteger, alpha: BOOL, isPlanar: BOOL, colorSpaceName: NSColorSpaceName, bitmapFormat: NSBitmapFormat, rBytes: NSInteger, pBits: NSInteger): NSBitmapImageRep = extern
//  @inline def initWithCGImage_(cgImage: CGImageRef): NSBitmapImageRep = extern
//  @inline def initWithCIImage_(ciImage: CIImage): NSBitmapImageRep = extern
  @inline def initWithData_(data: NSData): NSBitmapImageRep = extern
  @inline def getBitmapDataPlanes_(data: Ptr[Ptr[CUnsignedChar]]): Unit = extern
  @inline def getCompression_factor_(compression: NSTIFFCompression, factor: Ptr[Float]): Unit = extern
  @inline def setCompression_factor_(compression: NSTIFFCompression, factor: Float): Unit = extern
  @inline def TIFFRepresentationUsingCompression_factor_(comp: NSTIFFCompression, factor: Float): NSData = extern
  @inline def canBeCompressedUsing_(compression: NSTIFFCompression): BOOL = extern
  @inline def colorizeByMappingGray_midPointColor_shadowColor_lightColor_(midPoint: CGFloat, midPointColor: NSColor, shadowColor: NSColor, lightColor: NSColor): Unit = extern
  @inline def initForIncrementalLoad(): NSBitmapImageRep = extern
  @inline def incrementalLoadFromData_complete_(data: NSData, complete: BOOL): NSInteger = extern
  @inline def setColor_x_y_(color: NSColor, x: NSInteger, y: NSInteger): Unit = extern
  @inline def colorAtX_y_(x: NSInteger, y: NSInteger): NSColor = extern
  @inline def getPixel_atX_y_(p: Ptr[NSUInteger], x: NSInteger, y: NSInteger): Unit = extern
  @inline def setPixel_atX_y_(p: NSUInteger, x: NSInteger, y: NSInteger): Unit = extern
//  @inline def bitmapImageRepByConvertingToColorSpace_renderingIntent_(targetSpace: NSColorSpace, renderingIntent: NSColorRenderingIntent): NSBitmapImageRep = extern
//  @inline def bitmapImageRepByRetaggingWithColorSpace_(newSpace: NSColorSpace): NSBitmapImageRep = extern
  @inline def bitmapData: Ptr[CUnsignedChar] = extern
  @inline def isPlanar: BOOL = extern
  @inline def samplesPerPixel: NSInteger = extern
  @inline def bitsPerPixel: NSInteger = extern
  @inline def bytesPerRow: NSInteger = extern
  @inline def bytesPerPlane: NSInteger = extern
  @inline def numberOfPlanes: NSInteger = extern
  @inline def bitmapFormat: NSBitmapFormat = extern
  @inline def TIFFRepresentation: NSData = extern
//  @inline def CGImage(): CGImageRef = extern
//  @inline def colorSpace(): NSColorSpace = extern
  @inline def representationUsingType_properties_(storageType: NSBitmapImageFileType, properties: id): NSData = extern
//  @inline def setProperty_value_(property: NSBitmapImageRepPropertyKey, value: id): Unit = extern
//  @inline def valueForProperty_(property: NSBitmapImageRepPropertyKey): id = extern
}

@ObjCClass
abstract class NSBitmapImageRepClass extends NSObjectClass {
  @inline def imageRepsWithData_(data: NSData): NSArray[NSImageRep] = extern
  @inline def imageRepWithData_(data: NSData): NSBitmapImageRep = extern
  @inline def TIFFRepresentationOfImageRepsInArray_(array: NSImageRep): NSData = extern
  @inline def TIFFRepresentationOfImageRepsInArray_comp_factor_(array: NSImageRep, comp: NSTIFFCompression, factor: Float): NSData = extern
  @inline def getTIFFCompressionTypes_numTypes_(list: NSTIFFCompression, numTypes: NSInteger): Unit = extern
  @inline def localizedNameForTIFFCompressionType_(compression: NSTIFFCompression): NSString = extern
  @inline def representationOfImageRepsInArray_storageType_properties_(imageReps: NSImageRep, storageType: NSBitmapImageFileType, properties: id): NSData = extern
}

object NSBitmapImageRep extends NSBitmapImageRepClass {
  override type InstanceType = NSBitmapImageRep
}