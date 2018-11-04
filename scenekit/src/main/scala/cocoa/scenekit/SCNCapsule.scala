// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.scenekit

import cocoa.appkit.CGFloat
import cocoa.foundation.{NSInteger, NSObjectClass}

import scala.language.experimental.macros
import scalanative.native._
import objc._


@ObjC
class SCNCapsule extends SCNGeometry {
  @inline def capRadius(): CGFloat = extern
  @inline def setCapRadius_(capRadius: CGFloat): Unit = extern
  @inline def height(): CGFloat = extern
  @inline def setHeight_(height: CGFloat): Unit = extern
  @inline def radialSegmentCount(): NSInteger = extern
  @inline def setRadialSegmentCount_(radialSegmentCount: NSInteger): Unit = extern
  @inline def heightSegmentCount(): NSInteger = extern
  @inline def setHeightSegmentCount_(heightSegmentCount: NSInteger): Unit = extern
  @inline def capSegmentCount(): NSInteger = extern
  @inline def setCapSegmentCount_(capSegmentCount: NSInteger): Unit = extern
}


@ObjCClass
abstract class SCNCapsuleClass extends NSObjectClass {
  @inline def capsuleWithCapRadius_height_(capRadius: CGFloat, height: CGFloat): SCNCapsule = extern
}

object SCNCapsule extends SCNCapsuleClass {
  override type InstanceType = SCNCapsule
}