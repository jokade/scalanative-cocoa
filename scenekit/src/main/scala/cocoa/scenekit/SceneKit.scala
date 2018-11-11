package cocoa.scenekit

import cocoa.appkit.CGFloat
import cocoa.foundation.id

import scalanative.native._

@extern
object SceneKit {
  import platform._

  def SCNNode_setPosition(ptr: id, x: PFloat, y: PFloat, z: PFloat): Unit = extern
  def SCNNode_setRotation(ptr: id, x: PFloat, y: PFloat, z: PFloat, w: PFloat): Unit = extern
  def SCNNode_setScale(ptr: id, x: PFloat, y: PFloat, z: PFloat): Unit = extern
}
