// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.scenekit

import cocoa.appkit.CGFloat
import cocoa.foundation.{NSInteger, NSObjectClass}

import scala.language.experimental.macros
import scalanative.native._
import objc._

@ObjC
class SCNCone extends SCNGeometry {
  @inline def topRadius(): CGFloat = extern
  @inline def setTopRadius_(topRadius: CGFloat): Unit = extern
  @inline def bottomRadius(): CGFloat = extern
  @inline def setBottomRadius_(bottomRadius: CGFloat): Unit = extern
  @inline def height(): CGFloat = extern
  @inline def setHeight_(height: CGFloat): Unit = extern
  @inline def radialSegmentCount(): NSInteger = extern
  @inline def setRadialSegmentCount_(radialSegmentCount: NSInteger): Unit = extern
  @inline def heightSegmentCount(): NSInteger = extern
  @inline def setHeightSegmentCount_(heightSegmentCount: NSInteger): Unit = extern
}


@ObjCClass
abstract class SCNConeClass extends NSObjectClass {
  @inline def coneWithTopRadius_bottomRadius_height_(topRadius: CGFloat, bottomRadius: CGFloat, height: CGFloat): SCNCone = extern
}

object SCNCone extends SCNConeClass {
  override type InstanceType = SCNCone
}