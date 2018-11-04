// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.scenekit

import cocoa.appkit.CGFloat
import cocoa.foundation.{NSCopying, NSObject, NSObjectClass, NSSecureCoding, NSString, NSTimeInterval, NSUInteger}

import scala.language.experimental.macros
import scalanative.native._
import objc._
import scala.scalanative.native.objc.runtime.BOOL


@ObjC
class SCNAction extends NSObject with NSCopying with NSSecureCoding {
  @inline def reversedAction(): SCNAction = extern
  @inline def duration(): NSTimeInterval = extern
  @inline def setDuration_(duration: NSTimeInterval): Unit = extern
//  @inline def timingMode(): SCNActionTimingMode = extern
//  @inline def setTimingMode_(timingMode: SCNActionTimingMode): Unit = extern
//  @inline def timingFunction(): SCNActionTimingFunction = extern
//  @inline def setTimingFunction_(timingFunction: SCNActionTimingFunction): Unit = extern
  @inline def speed(): CGFloat = extern
  @inline def setSpeed_(speed: CGFloat): Unit = extern
}

@ObjCClass
abstract class SCNActionClass extends NSObjectClass {
  @inline def moveByX_deltaY_deltaZ_duration_(deltaX: CGFloat, deltaY: CGFloat, deltaZ: CGFloat, duration: NSTimeInterval): SCNAction = extern
//  @inline def moveBy_duration_(delta: SCNVector3, duration: NSTimeInterval): SCNAction = extern
//  @inline def moveTo_duration_(location: SCNVector3, duration: NSTimeInterval): SCNAction = extern
  @inline def rotateByX_y_z_duration_(xAngle: CGFloat, yAngle: CGFloat, zAngle: CGFloat, duration: NSTimeInterval): SCNAction = extern
  @inline def rotateToX_y_z_duration_(xAngle: CGFloat, yAngle: CGFloat, zAngle: CGFloat, duration: NSTimeInterval): SCNAction = extern
  @inline def rotateToX_y_z_duration_shortestUnitArc_(xAngle: CGFloat, yAngle: CGFloat, zAngle: CGFloat, duration: NSTimeInterval, shortestUnitArc: BOOL): SCNAction = extern
//  @inline def rotateByAngle_axis_duration_(angle: CGFloat, axis: SCNVector3, duration: NSTimeInterval): SCNAction = extern
//  @inline def rotateToAxisAngle_duration_(axisAngle: SCNVector4, duration: NSTimeInterval): SCNAction = extern
  @inline def scaleBy_sec_(scale: CGFloat, sec: NSTimeInterval): SCNAction = extern
  @inline def scaleTo_sec_(scale: CGFloat, sec: NSTimeInterval): SCNAction = extern
  @inline def sequence_(actions: SCNAction): SCNAction = extern
  @inline def group_(actions: SCNAction): SCNAction = extern
  @inline def repeatAction_count_(action: SCNAction, count: NSUInteger): SCNAction = extern
  @inline def repeatActionForever_(action: SCNAction): SCNAction = extern
  @inline def fadeInWithDuration_(sec: NSTimeInterval): SCNAction = extern
  @inline def fadeOutWithDuration_(sec: NSTimeInterval): SCNAction = extern
  @inline def fadeOpacityBy_sec_(factor: CGFloat, sec: NSTimeInterval): SCNAction = extern
  @inline def fadeOpacityTo_sec_(opacity: CGFloat, sec: NSTimeInterval): SCNAction = extern
  @inline def hide(): SCNAction = extern
  @inline def unhide(): SCNAction = extern
  @inline def waitForDuration_(sec: NSTimeInterval): SCNAction = extern
  @inline def waitForDuration_durationRange_(sec: NSTimeInterval, durationRange: NSTimeInterval): SCNAction = extern
  @inline def removeFromParentNode(): SCNAction = extern
  @inline def runBlock_(block: Ptr[Byte]): SCNAction = extern
//  @inline def runBlock_queue_(block: Ptr[Byte], queue: dispatch_queue_t): SCNAction = extern
  @inline def javaScriptActionWithScript_seconds_(script: NSString, seconds: NSTimeInterval): SCNAction = extern
  @inline def customActionWithDuration_block_(seconds: NSTimeInterval, block: Ptr[Byte]): SCNAction = extern
//  @inline def playAudioSource_wait_(source: SCNAudioSource, wait: BOOL): SCNAction = extern
}

object SCNAction extends SCNActionClass {
  override type InstanceType = SCNAction
}