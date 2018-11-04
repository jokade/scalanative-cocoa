// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.scenekit

import cocoa.appkit.CGFloat
import cocoa.foundation.NSObjectClass

import scala.language.experimental.macros
import scalanative.native._
import objc._

@ObjC
class SCNShape extends SCNGeometry {
//  @inline def path(): NSBezierPath = extern
//  @inline def setPath_(path: NSBezierPath): Unit = extern
  @inline def extrusionDepth(): CGFloat = extern
  @inline def setExtrusionDepth_(extrusionDepth: CGFloat): Unit = extern
//  @inline def chamferMode(): SCNChamferMode = extern
//  @inline def setChamferMode_(chamferMode: SCNChamferMode): Unit = extern
  @inline def chamferRadius(): CGFloat = extern
  @inline def setChamferRadius_(chamferRadius: CGFloat): Unit = extern
//  @inline def chamferProfile(): NSBezierPath = extern
//  @inline def setChamferProfile_(chamferProfile: NSBezierPath): Unit = extern
}

@ObjCClass
abstract class SCNShapeClass extends NSObjectClass {
//  @inline def shapeWithPath_extrusionDepth_(path: NSBezierPath, extrusionDepth: CGFloat): SCNShape = extern
}

object SCNShape extends SCNShapeClass {
  override type InstanceType = SCNShape
}