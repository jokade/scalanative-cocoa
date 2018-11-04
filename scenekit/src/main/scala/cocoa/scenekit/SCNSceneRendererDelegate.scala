// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.scenekit

import cocoa.foundation.{NSObject, NSTimeInterval}

import scala.language.experimental.macros
import scalanative.native._
import objc._
import scala.scalanative.native.objc.runtime.id

@ObjC
trait SCNSceneRendererDelegate extends NSObject {
  @inline def renderer_time_(renderer: id, time: NSTimeInterval): Unit = extern
  @inline def renderer_scene_time_(renderer: id, scene: SCNScene, time: NSTimeInterval): Unit = extern
}
