// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.scenekit

import cocoa.appkit._
import cocoa.foundation.{NSInteger, NSObject, NSObjectClass, NSRect}

import scala.language.experimental.macros
import scalanative.native._
import objc._
import scala.scalanative.native.objc.runtime.{BOOL, id}

@ObjC
class SCNView extends NSView with SCNSceneRenderer { //with SCNTechniqueSupport {
  @inline def initWithFrame_options_(frame: NSRect, options: id): SCNView = extern
  @inline def snapshot(): NSImage = extern
  @inline def play_(sender: id): Unit = extern
  @inline def pause_(sender: id): Unit = extern
  @inline def stop_(sender: id): Unit = extern
  @inline def rendersContinuously(): BOOL = extern
  @inline def setRendersContinuously_(rendersContinuously: BOOL): Unit = extern
  @inline def backgroundColor(): NSColor = extern
  @inline def setBackgroundColor_(backgroundColor: NSColor): Unit = extern
  @inline def allowsCameraControl(): BOOL = extern
  @inline def setAllowsCameraControl_(allowsCameraControl: BOOL): Unit = extern
  @inline def cameraControlConfiguration(): id = extern
//  @inline def defaultCameraController(): SCNCameraController = extern
  @inline def preferredFramesPerSecond(): NSInteger = extern
  @inline def setPreferredFramesPerSecond_(preferredFramesPerSecond: NSInteger): Unit = extern
//  @inline def openGLContext(): NSOpenGLContext = extern
//  @inline def setOpenGLContext_(openGLContext: NSOpenGLContext): Unit = extern
//  @inline def antialiasingMode(): SCNAntialiasingMode = extern
//  @inline def setAntialiasingMode_(antialiasingMode: SCNAntialiasingMode): Unit = extern
//  @inline def pixelFormat(): NSOpenGLPixelFormat = extern
//  @inline def setPixelFormat_(pixelFormat: NSOpenGLPixelFormat): Unit = extern
}

@ObjCClass
abstract class SCNViewClass extends NSObjectClass {
}

object SCNView extends SCNViewClass {
  override type InstanceType = SCNView
}

@ObjC
trait SCNCameraControlConfiguration extends NSObject {
  @inline def autoSwitchToFreeCamera(): BOOL = extern
  @inline def setAutoSwitchToFreeCamera_(autoSwitchToFreeCamera: BOOL): Unit = extern
  @inline def allowsTranslation(): BOOL = extern
  @inline def setAllowsTranslation_(allowsTranslation: BOOL): Unit = extern
  @inline def flyModeVelocity(): CGFloat = extern
  @inline def setFlyModeVelocity_(flyModeVelocity: CGFloat): Unit = extern
  @inline def panSensitivity(): CGFloat = extern
  @inline def setPanSensitivity_(panSensitivity: CGFloat): Unit = extern
  @inline def truckSensitivity(): CGFloat = extern
  @inline def setTruckSensitivity_(truckSensitivity: CGFloat): Unit = extern
  @inline def rotationSensitivity(): CGFloat = extern
  @inline def setRotationSensitivity_(rotationSensitivity: CGFloat): Unit = extern
}
