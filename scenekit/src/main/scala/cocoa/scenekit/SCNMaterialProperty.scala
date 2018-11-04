// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.scenekit

import cocoa.appkit.CGFloat
import cocoa.foundation.{NSInteger, NSObject, NSObjectClass, NSSecureCoding}

import scala.language.experimental.macros
import scalanative.native._
import objc._
import scala.scalanative.native.objc.runtime.id

@ObjC
class SCNMaterialProperty extends NSObject with NSSecureCoding {//with SCNAnimatable
  @inline def contents(): id = extern
  @inline def setContents_(contents: id): Unit = extern
  @inline def intensity(): CGFloat = extern
  @inline def setIntensity_(intensity: CGFloat): Unit = extern
  @inline def minificationFilter(): SCNFilterMode = extern
  @inline def setMinificationFilter_(minificationFilter: SCNFilterMode): Unit = extern
  @inline def magnificationFilter(): SCNFilterMode = extern
  @inline def setMagnificationFilter_(magnificationFilter: SCNFilterMode): Unit = extern
  @inline def mipFilter(): SCNFilterMode = extern
  @inline def setMipFilter_(mipFilter: SCNFilterMode): Unit = extern
//  @inline def contentsTransform(): SCNMatrix4 = extern
//  @inline def setContentsTransform_(contentsTransform: SCNMatrix4): Unit = extern
  @inline def wrapS(): SCNWrapMode = extern
  @inline def setWrapS_(wrapS: SCNWrapMode): Unit = extern
  @inline def wrapT(): SCNWrapMode = extern
  @inline def setWrapT_(wrapT: SCNWrapMode): Unit = extern
  @inline def borderColor(): id = extern
  @inline def setBorderColor_(borderColor: id): Unit = extern
  @inline def mappingChannel(): NSInteger = extern
  @inline def setMappingChannel_(mappingChannel: NSInteger): Unit = extern
//  @inline def textureComponents(): SCNColorMask = extern
//  @inline def setTextureComponents_(textureComponents: SCNColorMask): Unit = extern
  @inline def maxAnisotropy(): CGFloat = extern
  @inline def setMaxAnisotropy_(maxAnisotropy: CGFloat): Unit = extern
}

@ObjCClass
abstract class SCNMaterialPropertyClass extends NSObjectClass {
  @inline def materialPropertyWithContents_(contents: id): SCNMaterialProperty = extern
}

object SCNMaterialProperty extends SCNMaterialPropertyClass {
  override type InstanceType = SCNMaterialProperty
}