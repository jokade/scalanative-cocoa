// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.scenekit

import cocoa.appkit.CGFloat
import cocoa.foundation.{NSInteger, NSObjectClass, NSString}

import scala.language.experimental.macros
import scalanative.native._
import objc._
import scala.scalanative.native.objc.runtime.{BOOL, id}

@ObjC
class SCNText extends SCNGeometry {
  @inline def extrusionDepth(): CGFloat = extern
  @inline def setExtrusionDepth_(extrusionDepth: CGFloat): Unit = extern
  @inline def string(): id = extern
  @inline def setString_(string: id): Unit = extern
//  @inline def font(): NSFont = extern
//  @inline def setFont_(font: NSFont): Unit = extern
  @inline def isWrapped(): BOOL = extern
  @inline def setWrapped_(wrapped: BOOL): Unit = extern
//  @inline def containerFrame(): CGRect = extern
//  @inline def setContainerFrame_(containerFrame: CGRect): Unit = extern
//  @inline def textSize(): CGSize = extern
  @inline def truncationMode(): NSString = extern
  @inline def setTruncationMode_(truncationMode: NSString): Unit = extern
  @inline def alignmentMode(): NSString = extern
  @inline def setAlignmentMode_(alignmentMode: NSString): Unit = extern
  @inline def chamferRadius(): CGFloat = extern
  @inline def setChamferRadius_(chamferRadius: CGFloat): Unit = extern
  @inline def chamferSegmentCount(): NSInteger = extern
  @inline def setChamferSegmentCount_(chamferSegmentCount: NSInteger): Unit = extern
//  @inline def chamferProfile(): NSBezierPath = extern
//  @inline def setChamferProfile_(chamferProfile: NSBezierPath): Unit = extern
  @inline def flatness(): CGFloat = extern
  @inline def setFlatness_(flatness: CGFloat): Unit = extern
}

@ObjCClass
abstract class SCNTextClass extends NSObjectClass {
  @inline def textWithString_extrusionDepth_(string: id, extrusionDepth: CGFloat): SCNText = extern
}

object SCNText extends SCNTextClass {
  override type InstanceType = SCNText
}