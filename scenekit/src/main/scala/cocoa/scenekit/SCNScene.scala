package cocoa.scenekit

import cocoa.appkit.CGFloat
import cocoa.foundation.{NSError, NSObject, NSObjectClass, NSSecureCoding, NSString, NSURL}

import scala.language.experimental.macros
import scalanative.native._
import objc._
import scala.scalanative.native.objc.runtime.{BOOL, id}

@ObjC
class SCNScene extends NSObject with NSSecureCoding {
  @inline def attributeForKey_(key: NSString): id = extern
  @inline def setAttribute_key_(attribute: id, key: NSString): Unit = extern
//  @inline def writeToURL_options_delegate_progressHandler_(url: NSURL, options: id, delegate: id, progressHandler: SCNSceneExportProgressHandler): BOOL = extern
  @inline def rootNode: SCNNode = extern
//  @inline def physicsWorld(): SCNPhysicsWorld = extern
  @inline def background: SCNMaterialProperty = extern
  @inline def lightingEnvironment: SCNMaterialProperty = extern
  @inline def fogStartDistance: CGFloat = extern
  @inline def setFogStartDistance_(fogStartDistance: CGFloat): Unit = extern
  @inline def fogEndDistance: CGFloat = extern
  @inline def setFogEndDistance_(fogEndDistance: CGFloat): Unit = extern
  @inline def fogDensityExponent: CGFloat = extern
  @inline def setFogDensityExponent_(fogDensityExponent: CGFloat): Unit = extern
  @inline def fogColor: id = extern
  @inline def setFogColor_(fogColor: id): Unit = extern
  @inline def isPaused: BOOL = extern
  @inline def setPaused_(paused: BOOL): Unit = extern
}

@ObjCClass
abstract class SCNSceneClass extends NSObjectClass {
  @inline def scene(): SCNScene = extern
  @inline def sceneNamed_(name: NSString): SCNScene = extern
  @inline def sceneNamed_directory_options_(name: NSString, directory: NSString, options: id): SCNScene = extern
  @inline def sceneWithURL_options_error_(url: NSURL, options: id, error: NSError): SCNScene = extern
}

object SCNScene extends SCNSceneClass {
  override type InstanceType = SCNScene

  def apply(): SCNScene = scene()
}