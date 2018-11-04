// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.scenekit

import cocoa.appkit.CGFloat
import cocoa.foundation.{NSCopying, NSObject, NSSecureCoding}

import scala.language.experimental.macros
import scalanative.native._
import objc._
import scala.scalanative.native.objc.runtime.BOOL

@ObjC
class SCNGeometryTessellator extends NSObject with NSCopying with NSSecureCoding {
  @inline def tessellationFactorScale(): CGFloat = extern
  @inline def setTessellationFactorScale_(tessellationFactorScale: CGFloat): Unit = extern
//  @inline def tessellationPartitionMode(): MTLTessellationPartitionMode = extern
//  @inline def setTessellationPartitionMode_(tessellationPartitionMode: MTLTessellationPartitionMode): Unit = extern
  @inline def isAdaptive(): BOOL = extern
  @inline def setAdaptive_(adaptive: BOOL): Unit = extern
  @inline def isScreenSpace(): BOOL = extern
  @inline def setScreenSpace_(screenSpace: BOOL): Unit = extern
  @inline def edgeTessellationFactor(): CGFloat = extern
  @inline def setEdgeTessellationFactor_(edgeTessellationFactor: CGFloat): Unit = extern
  @inline def insideTessellationFactor(): CGFloat = extern
  @inline def setInsideTessellationFactor_(insideTessellationFactor: CGFloat): Unit = extern
  @inline def maximumEdgeLength(): CGFloat = extern
  @inline def setMaximumEdgeLength_(maximumEdgeLength: CGFloat): Unit = extern
//  @inline def smoothingMode(): SCNTessellationSmoothingMode = extern
//  @inline def setSmoothingMode_(smoothingMode: SCNTessellationSmoothingMode): Unit = extern
}

//@ObjCClass
//abstract class SCNGeometryTessellatorClass extends {
//}

//object SCNGeometryTessellator extends SCNGeometryTessellatorClass {
//  override type InstanceType = SCNGeometryTessellator
//}