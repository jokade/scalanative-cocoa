// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.scenekit

import cocoa.appkit.CGFloat
import cocoa.foundation.{NSInteger, NSObjectClass}

import scala.language.experimental.macros
import scalanative.native._
import objc._

@ObjC
class SCNPlane extends SCNGeometry {
  @inline def width: CGFloat = extern
  @inline def setWidth_(width: CGFloat): Unit = extern
  @inline def height: CGFloat = extern
  @inline def setHeight_(height: CGFloat): Unit = extern
  @inline def widthSegmentCount: NSInteger = extern
  @inline def setWidthSegmentCount_(widthSegmentCount: NSInteger): Unit = extern
  @inline def heightSegmentCount: NSInteger = extern
  @inline def setHeightSegmentCount_(heightSegmentCount: NSInteger): Unit = extern
  @inline def cornerRadius: CGFloat = extern
  @inline def setCornerRadius_(cornerRadius: CGFloat): Unit = extern
  @inline def cornerSegmentCount: NSInteger = extern
  @inline def setCornerSegmentCount_(cornerSegmentCount: NSInteger): Unit = extern
}

@ObjCClass
abstract class SCNPlaneClass extends NSObjectClass {
  @inline def planeWithWidth_height_(width: CGFloat, height: CGFloat): SCNPlane = extern
}

object SCNPlane extends SCNPlaneClass {
  override type InstanceType = SCNPlane
}