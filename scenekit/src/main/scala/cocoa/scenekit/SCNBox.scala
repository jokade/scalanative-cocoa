// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.scenekit

import cocoa.appkit.CGFloat
import cocoa.foundation.{NSInteger, NSObjectClass}

import scala.language.experimental.macros
import scalanative.native._
import objc._

@ObjC
class SCNBox extends SCNGeometry {
  @inline def width(): CGFloat = extern
  @inline def setWidth_(width: CGFloat): Unit = extern
  @inline def height(): CGFloat = extern
  @inline def setHeight_(height: CGFloat): Unit = extern
  @inline def length(): CGFloat = extern
  @inline def setLength_(length: CGFloat): Unit = extern
  @inline def chamferRadius(): CGFloat = extern
  @inline def setChamferRadius_(chamferRadius: CGFloat): Unit = extern
  @inline def widthSegmentCount(): NSInteger = extern
  @inline def setWidthSegmentCount_(widthSegmentCount: NSInteger): Unit = extern
  @inline def heightSegmentCount(): NSInteger = extern
  @inline def setHeightSegmentCount_(heightSegmentCount: NSInteger): Unit = extern
  @inline def lengthSegmentCount(): NSInteger = extern
  @inline def setLengthSegmentCount_(lengthSegmentCount: NSInteger): Unit = extern
  @inline def chamferSegmentCount(): NSInteger = extern
  @inline def setChamferSegmentCount_(chamferSegmentCount: NSInteger): Unit = extern
}

@ObjCClass
abstract class SCNBoxClass extends NSObjectClass {
  @inline def boxWithWidth_height_length_chamferRadius_(width: CGFloat, height: CGFloat, length: CGFloat, chamferRadius: CGFloat): SCNBox = extern
}

object SCNBox extends SCNBoxClass {
  override type InstanceType = SCNBox

  @inline def apply(sideLength: CGFloat): SCNBox = boxWithWidth_height_length_chamferRadius_(sideLength,sideLength,sideLength,0)
  @inline def apply(width: CGFloat, height: CGFloat, length: CGFloat, chamferRadius: CGFloat = 0.0): SCNBox =
    boxWithWidth_height_length_chamferRadius_(width,height,length,chamferRadius)
}