// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.scenekit

import cocoa.appkit.CGFloat
import cocoa.foundation.{NSInteger, NSObjectClass}

import scala.language.experimental.macros
import scalanative.native._
import objc._

@ObjC
class SCNTorus extends SCNGeometry {
  @inline def ringRadius: CGFloat = extern
  @inline def setRingRadius_(ringRadius: CGFloat): Unit = extern
  @inline def pipeRadius: CGFloat = extern
  @inline def setPipeRadius_(pipeRadius: CGFloat): Unit = extern
  @inline def ringSegmentCount: NSInteger = extern
  @inline def setRingSegmentCount_(ringSegmentCount: NSInteger): Unit = extern
  @inline def pipeSegmentCount: NSInteger = extern
  @inline def setPipeSegmentCount_(pipeSegmentCount: NSInteger): Unit = extern
}

@ObjCClass
abstract class SCNTorusClass extends NSObjectClass {
  @inline def torusWithRingRadius_pipeRadius_(ringRadius: CGFloat, pipeRadius: CGFloat): SCNTorus = extern
}

object SCNTorus extends SCNTorusClass {
  override type InstanceType = SCNTorus
}