// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.scenekit

import cocoa.appkit.CGFloat
import cocoa.foundation.{NSInteger, NSObjectClass}

import scala.language.experimental.macros
import scalanative.native._
import objc._


@ObjC
class SCNCylinder extends SCNGeometry {
  @inline def radius(): CGFloat = extern
  @inline def setRadius_(radius: CGFloat): Unit = extern
  @inline def height(): CGFloat = extern
  @inline def setHeight_(height: CGFloat): Unit = extern
  @inline def radialSegmentCount(): NSInteger = extern
  @inline def setRadialSegmentCount_(radialSegmentCount: NSInteger): Unit = extern
  @inline def heightSegmentCount(): NSInteger = extern
  @inline def setHeightSegmentCount_(heightSegmentCount: NSInteger): Unit = extern
}

@ObjCClass
abstract class SCNCylinderClass extends NSObjectClass {
  @inline def cylinderWithRadius_height_(radius: CGFloat, height: CGFloat): SCNCylinder = extern
}

object SCNCylinder extends SCNCylinderClass {
  override type InstanceType = SCNCylinder
}