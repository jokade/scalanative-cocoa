// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.scenekit

import cocoa.appkit.CGFloat
import cocoa.foundation.{NSInteger, NSObjectClass}

import scala.language.experimental.macros
import scalanative.native._
import objc._


@ObjC
class SCNTube extends SCNGeometry {
  @inline def innerRadius(): CGFloat = extern
  @inline def setInnerRadius_(innerRadius: CGFloat): Unit = extern
  @inline def outerRadius(): CGFloat = extern
  @inline def setOuterRadius_(outerRadius: CGFloat): Unit = extern
  @inline def height(): CGFloat = extern
  @inline def setHeight_(height: CGFloat): Unit = extern
  @inline def radialSegmentCount(): NSInteger = extern
  @inline def setRadialSegmentCount_(radialSegmentCount: NSInteger): Unit = extern
  @inline def heightSegmentCount(): NSInteger = extern
  @inline def setHeightSegmentCount_(heightSegmentCount: NSInteger): Unit = extern
}

@ObjCClass
abstract class SCNTubeClass extends NSObjectClass {
  @inline def tubeWithInnerRadius_outerRadius_height_(innerRadius: CGFloat, outerRadius: CGFloat, height: CGFloat): SCNTube = extern
}

object SCNTube extends SCNTubeClass {
  override type InstanceType = SCNTube
}