// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.scenekit

import cocoa.appkit.CGFloat
import cocoa.foundation.{NSData, NSInteger, NSObject, NSObjectClass, NSRange, NSSecureCoding}

import scala.language.experimental.macros
import scalanative.native._
import objc._

@ObjC
class SCNGeometryElement extends NSObject with NSSecureCoding {
  @inline def data(): NSData = extern
  @inline def primitiveType(): SCNGeometryPrimitiveType = extern
  @inline def primitiveCount(): NSInteger = extern
  @inline def primitiveRange(): NSRange = extern
  @inline def setPrimitiveRange_(primitiveRange: NSRange): Unit = extern
  @inline def bytesPerIndex(): NSInteger = extern
  @inline def pointSize(): CGFloat = extern
  @inline def setPointSize_(pointSize: CGFloat): Unit = extern
  @inline def minimumPointScreenSpaceRadius(): CGFloat = extern
  @inline def setMinimumPointScreenSpaceRadius_(minimumPointScreenSpaceRadius: CGFloat): Unit = extern
  @inline def maximumPointScreenSpaceRadius(): CGFloat = extern
  @inline def setMaximumPointScreenSpaceRadius_(maximumPointScreenSpaceRadius: CGFloat): Unit = extern
}

@ObjCClass
abstract class SCNGeometryElementClass extends NSObjectClass {
  @inline def geometryElementWithData_primitiveType_primitiveCount_bytesPerIndex_(data: NSData, primitiveType: SCNGeometryPrimitiveType, primitiveCount: NSInteger, bytesPerIndex: NSInteger): SCNGeometryElement = extern
}

object SCNGeometryElement extends SCNGeometryElementClass {
  override type InstanceType = SCNGeometryElement
}