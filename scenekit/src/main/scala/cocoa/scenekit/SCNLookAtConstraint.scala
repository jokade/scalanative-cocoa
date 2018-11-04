// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.scenekit

import cocoa.foundation.{BOOL, NSObjectClass}

import scala.language.experimental.macros
import scalanative.native._
import objc._

@ObjC
class SCNLookAtConstraint extends SCNConstraint {
  @inline def target(): SCNNode = extern
  @inline def setTarget_(target: SCNNode): Unit = extern
//  @inline def targetOffset(): SCNVector3 = extern
//  @inline def setTargetOffset_(targetOffset: SCNVector3): Unit = extern
//  @inline def localFront(): SCNVector3 = extern
//  @inline def setLocalFront_(localFront: SCNVector3): Unit = extern
//  @inline def worldUp(): SCNVector3 = extern
//  @inline def setWorldUp_(worldUp: SCNVector3): Unit = extern
  @inline def gimbalLockEnabled: BOOL = extern
  @inline def setGimbalLockEnabled_(gimbalLockEnabled: BOOL): Unit = extern
}

@ObjCClass
abstract class SCNLookAtConstraintClass extends NSObjectClass {
  @inline def lookAtConstraintWithTarget_(target: SCNNode): SCNLookAtConstraint = extern
}

object SCNLookAtConstraint extends SCNLookAtConstraintClass {
  override type InstanceType = SCNLookAtConstraint

  def apply(target: SCNNode): SCNLookAtConstraint = lookAtConstraintWithTarget_(target)
}