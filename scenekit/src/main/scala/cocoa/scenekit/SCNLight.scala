// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.scenekit

import cocoa.appkit.{CGFloat, NSColor}
import cocoa.foundation.{NSCopying, NSData, NSNumber, NSObject, NSObjectClass, NSSecureCoding, NSString, NSUInteger, NSURL}

import scala.language.experimental.macros
import scalanative.native._
import objc._
import scala.scalanative.native.objc.runtime.{BOOL, id}

@ObjC
class SCNLight extends NSObject with NSCopying with NSSecureCoding { //} with SCNAnimatable with SCNTechniqueSupport  {
  @inline def attributeForKey_(key: NSString): id = extern
  @inline def setAttribute_key_(attribute: NSObject, key: NSString): Unit = extern
  @inline def `type`(): SCNLightType = extern
  @inline def setType_(tpe: SCNLightType): Unit = extern
  @inline def color(): NSColor = extern
  @inline def setColor_(color: NSColor): Unit = extern
  @inline def temperature(): CGFloat = extern
  @inline def setTemperature_(temperature: CGFloat): Unit = extern
  @inline def intensity(): CGFloat = extern
  @inline def setIntensity_(intensity: CGFloat): Unit = extern
  @inline def name(): NSString = extern
  @inline def setName_(name: NSString): Unit = extern
  @inline def castsShadow(): BOOL = extern
  @inline def setCastsShadow_(castsShadow: BOOL): Unit = extern
  @inline def shadowColor(): id = extern
  @inline def setShadowColor_(shadowColor: id): Unit = extern
  @inline def shadowRadius(): CGFloat = extern
  @inline def setShadowRadius_(shadowRadius: CGFloat): Unit = extern
//  @inline def shadowMapSize(): CGSize = extern
//  @inline def setShadowMapSize_(shadowMapSize: CGSize): Unit = extern
  @inline def shadowSampleCount(): NSUInteger = extern
  @inline def setShadowSampleCount_(shadowSampleCount: NSUInteger): Unit = extern
  @inline def shadowMode(): SCNShadowMode = extern
  @inline def setShadowMode_(shadowMode: SCNShadowMode): Unit = extern
  @inline def shadowBias(): CGFloat = extern
  @inline def setShadowBias_(shadowBias: CGFloat): Unit = extern
  @inline def automaticallyAdjustsShadowProjection(): BOOL = extern
  @inline def setAutomaticallyAdjustsShadowProjection_(automaticallyAdjustsShadowProjection: BOOL): Unit = extern
  @inline def maximumShadowDistance(): CGFloat = extern
  @inline def setMaximumShadowDistance_(maximumShadowDistance: CGFloat): Unit = extern
  @inline def forcesBackFaceCasters(): BOOL = extern
  @inline def setForcesBackFaceCasters_(forcesBackFaceCasters: BOOL): Unit = extern
  @inline def sampleDistributedShadowMaps(): BOOL = extern
  @inline def setSampleDistributedShadowMaps_(sampleDistributedShadowMaps: BOOL): Unit = extern
  @inline def shadowCascadeCount(): NSUInteger = extern
  @inline def setShadowCascadeCount_(shadowCascadeCount: NSUInteger): Unit = extern
  @inline def shadowCascadeSplittingFactor(): CGFloat = extern
  @inline def setShadowCascadeSplittingFactor_(shadowCascadeSplittingFactor: CGFloat): Unit = extern
  @inline def orthographicScale(): CGFloat = extern
  @inline def setOrthographicScale_(orthographicScale: CGFloat): Unit = extern
  @inline def zNear(): CGFloat = extern
  @inline def setZNear_(zNear: CGFloat): Unit = extern
  @inline def zFar(): CGFloat = extern
  @inline def setZFar_(zFar: CGFloat): Unit = extern
  @inline def attenuationStartDistance(): CGFloat = extern
  @inline def setAttenuationStartDistance_(attenuationStartDistance: CGFloat): Unit = extern
  @inline def attenuationEndDistance(): CGFloat = extern
  @inline def setAttenuationEndDistance_(attenuationEndDistance: CGFloat): Unit = extern
  @inline def attenuationFalloffExponent(): CGFloat = extern
  @inline def setAttenuationFalloffExponent_(attenuationFalloffExponent: CGFloat): Unit = extern
  @inline def spotInnerAngle(): CGFloat = extern
  @inline def setSpotInnerAngle_(spotInnerAngle: CGFloat): Unit = extern
  @inline def spotOuterAngle(): CGFloat = extern
  @inline def setSpotOuterAngle_(spotOuterAngle: CGFloat): Unit = extern
//  @inline def gobo(): SCNMaterialProperty = extern
  @inline def IESProfileURL(): NSURL = extern
  @inline def setIESProfileURL_(IESProfileURL: NSURL): Unit = extern
  @inline def categoryBitMask(): NSUInteger = extern
  @inline def setCategoryBitMask_(categoryBitMask: NSUInteger): Unit = extern
  @inline def sphericalHarmonicsCoefficients(): NSData = extern
//  @inline def update(attribute: String, value: Int): Unit = setAttribute_key_(NSNumber(value),NSString(attribute))
//  @inline def update(attribute: String, value: Double): Unit = setAttribute_key_(NSNumber(value),NSString(attribute))
}

@ObjCClass
abstract class SCNLightClass extends NSObjectClass {
  @inline def light(): SCNLight = extern
}

object SCNLight extends SCNLightClass {
  override type InstanceType = SCNLight

  def apply(): SCNLight = light()
  def apply(tpe: SCNLightType, color: NSColor): SCNLight = {
    val l = light()
    l.setType_(tpe)
    l.setColor_(color)
    l
  }
}