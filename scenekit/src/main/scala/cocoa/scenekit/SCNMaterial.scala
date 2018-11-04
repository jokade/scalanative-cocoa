// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.scenekit

import cocoa.appkit.CGFloat
import cocoa.foundation.{NSCopying, NSObject, NSObjectClass, NSSecureCoding, NSString}

import scala.language.experimental.macros
import scalanative.native._
import objc._
import scala.scalanative.native.objc.runtime.BOOL

@ObjC
class SCNMaterial extends NSObject with NSCopying with NSSecureCoding { // with SCNAnimatable with SCNShadable
  @inline def name: NSString = extern
  @inline def setName_(name: NSString): Unit = extern
  @inline def diffuse: SCNMaterialProperty = extern
  @inline def ambient: SCNMaterialProperty = extern
  @inline def specular: SCNMaterialProperty = extern
  @inline def emission: SCNMaterialProperty = extern
  @inline def transparent: SCNMaterialProperty = extern
  @inline def reflective: SCNMaterialProperty = extern
  @inline def multiply: SCNMaterialProperty = extern
  @inline def normal: SCNMaterialProperty = extern
  @inline def displacement: SCNMaterialProperty = extern
  @inline def ambientOcclusion: SCNMaterialProperty = extern
  @inline def selfIllumination: SCNMaterialProperty = extern
  @inline def metalness: SCNMaterialProperty = extern
  @inline def roughness: SCNMaterialProperty = extern
  @inline def shininess: CGFloat = extern
  @inline def setShininess_(shininess: CGFloat): Unit = extern
  @inline def transparency: CGFloat = extern
  @inline def setTransparency_(transparency: CGFloat): Unit = extern
//  @inline def lightingModelName(): SCNLightingModel = extern
//  @inline def setLightingModelName_(lightingModelName: SCNLightingModel): Unit = extern
  @inline def isLitPerPixel: BOOL = extern
  @inline def setLitPerPixel_(litPerPixel: BOOL): Unit = extern
  @inline def isDoubleSided: BOOL = extern
  @inline def setDoubleSided_(doubleSided: BOOL): Unit = extern
  @inline def fillMode: SCNFillMode = extern
  @inline def setFillMode_(fillMode: SCNFillMode): Unit = extern
  @inline def cullMode: SCNCullMode = extern
  @inline def setCullMode_(cullMode: SCNCullMode): Unit = extern
  @inline def transparencyMode: SCNTransparencyMode = extern
  @inline def setTransparencyMode_(transparencyMode: SCNTransparencyMode): Unit = extern
  @inline def locksAmbientWithDiffuse: BOOL = extern
  @inline def setLocksAmbientWithDiffuse_(locksAmbientWithDiffuse: BOOL): Unit = extern
  @inline def writesToDepthBuffer: BOOL = extern
  @inline def setWritesToDepthBuffer_(writesToDepthBuffer: BOOL): Unit = extern
//  @inline def colorBufferWriteMask(): SCNColorMask = extern
//  @inline def setColorBufferWriteMask_(colorBufferWriteMask: SCNColorMask): Unit = extern
  @inline def readsFromDepthBuffer: BOOL = extern
  @inline def setReadsFromDepthBuffer_(readsFromDepthBuffer: BOOL): Unit = extern
  @inline def fresnelExponent: CGFloat = extern
  @inline def setFresnelExponent_(fresnelExponent: CGFloat): Unit = extern
  @inline def blendMode: SCNBlendMode = extern
  @inline def setBlendMode_(blendMode: SCNBlendMode): Unit = extern
}


@ObjCClass
abstract class SCNMaterialClass extends NSObjectClass {
  @inline def material(): SCNMaterial = extern
}

object SCNMaterial extends SCNMaterialClass {
  override type InstanceType = SCNMaterial

  def apply(): SCNMaterial = material()
}