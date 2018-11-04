// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.scenekit

import cocoa.appkit.CGFloat
import cocoa.foundation.{NSObjectClass, NSUInteger}

import scala.language.experimental.macros
import scalanative.native._
import objc._

@ObjC
class SCNFloor extends SCNGeometry {
  @inline def reflectivity(): CGFloat = extern
  @inline def setReflectivity_(reflectivity: CGFloat): Unit = extern
  @inline def reflectionFalloffStart(): CGFloat = extern
  @inline def setReflectionFalloffStart_(reflectionFalloffStart: CGFloat): Unit = extern
  @inline def reflectionFalloffEnd(): CGFloat = extern
  @inline def setReflectionFalloffEnd_(reflectionFalloffEnd: CGFloat): Unit = extern
  @inline def reflectionCategoryBitMask(): NSUInteger = extern
  @inline def setReflectionCategoryBitMask_(reflectionCategoryBitMask: NSUInteger): Unit = extern
  @inline def width(): CGFloat = extern
  @inline def setWidth_(width: CGFloat): Unit = extern
  @inline def length(): CGFloat = extern
  @inline def setLength_(length: CGFloat): Unit = extern
  @inline def reflectionResolutionScaleFactor(): CGFloat = extern
  @inline def setReflectionResolutionScaleFactor_(reflectionResolutionScaleFactor: CGFloat): Unit = extern
}

@ObjCClass
abstract class SCNFloorClass extends NSObjectClass {
  @inline def floor(): SCNFloor = extern
}

object SCNFloor extends SCNFloorClass {
  override type InstanceType = SCNFloor
}