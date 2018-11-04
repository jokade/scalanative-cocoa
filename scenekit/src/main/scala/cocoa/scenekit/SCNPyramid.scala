// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.scenekit

import cocoa.appkit.CGFloat
import cocoa.foundation.{NSInteger, NSObjectClass}

import scala.language.experimental.macros
import scalanative.native._
import objc._

@ObjC
class SCNPyramid extends SCNGeometry {
  @inline def width(): CGFloat = extern
  @inline def setWidth_(width: CGFloat): Unit = extern
  @inline def height(): CGFloat = extern
  @inline def setHeight_(height: CGFloat): Unit = extern
  @inline def length(): CGFloat = extern
  @inline def setLength_(length: CGFloat): Unit = extern
  @inline def widthSegmentCount(): NSInteger = extern
  @inline def setWidthSegmentCount_(widthSegmentCount: NSInteger): Unit = extern
  @inline def heightSegmentCount(): NSInteger = extern
  @inline def setHeightSegmentCount_(heightSegmentCount: NSInteger): Unit = extern
  @inline def lengthSegmentCount(): NSInteger = extern
  @inline def setLengthSegmentCount_(lengthSegmentCount: NSInteger): Unit = extern
}

@ObjCClass
abstract class SCNPyramidClass extends NSObjectClass {
  @inline def pyramidWithWidth_height_length_(width: CGFloat, height: CGFloat, length: CGFloat): SCNPyramid = extern
}

object SCNPyramid extends SCNPyramidClass {
  override type InstanceType = SCNPyramid
}