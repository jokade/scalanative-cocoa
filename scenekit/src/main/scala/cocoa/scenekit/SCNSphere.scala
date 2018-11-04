// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.scenekit

import cocoa.appkit.CGFloat
import cocoa.foundation.{NSInteger, NSObjectClass}

import scala.language.experimental.macros
import scalanative.native._
import objc._
import scala.scalanative.native.objc.runtime.BOOL

@ObjC
class SCNSphere extends SCNGeometry {
  @inline def radius(): CGFloat = extern
  @inline def setRadius_(radius: CGFloat): Unit = extern
  @inline def isGeodesic(): BOOL = extern
  @inline def setGeodesic_(geodesic: BOOL): Unit = extern
  @inline def segmentCount(): NSInteger = extern
  @inline def setSegmentCount_(segmentCount: NSInteger): Unit = extern
}


@ObjCClass
abstract class SCNSphereClass extends NSObjectClass {
  @inline def sphereWithRadius_(radius: CGFloat): SCNSphere = extern
}

object SCNSphere extends SCNSphereClass {
  override type InstanceType = SCNSphere
}