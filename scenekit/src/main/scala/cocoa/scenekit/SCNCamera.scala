package cocoa.scenekit

import cocoa.appkit.CGFloat
import cocoa.foundation.{NSCopying, NSInteger, NSObject, NSObjectClass, NSSecureCoding, NSString, NSUInteger}

import scala.language.experimental.macros
import scalanative.native._
import objc._
import scala.scalanative.native.objc.runtime.BOOL

@ObjC
class SCNCamera extends NSObject with NSCopying with NSSecureCoding { //with SCNAnimatable with SCNTechniqueSupport {
//  @inline def projectionTransform(): SCNMatrix4 = extern
//  @inline def setProjectionTransform_(projectionTransform: SCNMatrix4): Unit = extern
  @inline def name: NSString = extern
  @inline def setName_(name: NSString): Unit = extern
  @inline def fieldOfView: CGFloat = extern
  @inline def setFieldOfView_(fieldOfView: CGFloat): Unit = extern
  @inline def projectionDirection: SCNCameraProjectionDirection = extern
  @inline def setProjectionDirection_(projectionDirection: SCNCameraProjectionDirection): Unit = extern
  @inline def focalLength: CGFloat = extern
  @inline def setFocalLength_(focalLength: CGFloat): Unit = extern
  @inline def sensorHeight: CGFloat = extern
  @inline def setSensorHeight_(sensorHeight: CGFloat): Unit = extern
  @inline def zNear: Double = extern
  @inline def setZNear_(zNear: Double): Unit = extern
  @inline def zFar: Double = extern
  @inline def setZFar_(zFar: Double): Unit = extern
  @inline def automaticallyAdjustsZRange: BOOL = extern
  @inline def setAutomaticallyAdjustsZRange_(automaticallyAdjustsZRange: BOOL): Unit = extern
  @inline def usesOrthographicProjection: BOOL = extern
  @inline def setUsesOrthographicProjection_(usesOrthographicProjection: BOOL): Unit = extern
  @inline def orthographicScale: Double = extern
  @inline def setOrthographicScale_(orthographicScale: Double): Unit = extern
  @inline def wantsDepthOfField: BOOL = extern
  @inline def setWantsDepthOfField_(wantsDepthOfField: BOOL): Unit = extern
  @inline def focusDistance: CGFloat = extern
  @inline def setFocusDistance_(focusDistance: CGFloat): Unit = extern
  @inline def focalBlurSampleCount: NSInteger = extern
  @inline def setFocalBlurSampleCount_(focalBlurSampleCount: NSInteger): Unit = extern
  @inline def fStop: CGFloat = extern
  @inline def setFStop_(fStop: CGFloat): Unit = extern
  @inline def apertureBladeCount: NSInteger = extern
  @inline def setApertureBladeCount_(apertureBladeCount: NSInteger): Unit = extern
  @inline def motionBlurIntensity: CGFloat = extern
  @inline def setMotionBlurIntensity_(motionBlurIntensity: CGFloat): Unit = extern
  @inline def screenSpaceAmbientOcclusionIntensity: CGFloat = extern
  @inline def setScreenSpaceAmbientOcclusionIntensity_(screenSpaceAmbientOcclusionIntensity: CGFloat): Unit = extern
  @inline def screenSpaceAmbientOcclusionRadius: CGFloat = extern
  @inline def setScreenSpaceAmbientOcclusionRadius_(screenSpaceAmbientOcclusionRadius: CGFloat): Unit = extern
  @inline def screenSpaceAmbientOcclusionBias: CGFloat = extern
  @inline def setScreenSpaceAmbientOcclusionBias_(screenSpaceAmbientOcclusionBias: CGFloat): Unit = extern
  @inline def screenSpaceAmbientOcclusionDepthThreshold: CGFloat = extern
  @inline def setScreenSpaceAmbientOcclusionDepthThreshold_(screenSpaceAmbientOcclusionDepthThreshold: CGFloat): Unit = extern
  @inline def screenSpaceAmbientOcclusionNormalThreshold: CGFloat = extern
  @inline def setScreenSpaceAmbientOcclusionNormalThreshold_(screenSpaceAmbientOcclusionNormalThreshold: CGFloat): Unit = extern
  @inline def wantsHDR: BOOL = extern
  @inline def setWantsHDR_(wantsHDR: BOOL): Unit = extern
  @inline def exposureOffset: CGFloat = extern
  @inline def setExposureOffset_(exposureOffset: CGFloat): Unit = extern
  @inline def averageGray: CGFloat = extern
  @inline def setAverageGray_(averageGray: CGFloat): Unit = extern
  @inline def whitePoint: CGFloat = extern
  @inline def setWhitePoint_(whitePoint: CGFloat): Unit = extern
  @inline def wantsExposureAdaptation: BOOL = extern
  @inline def setWantsExposureAdaptation_(wantsExposureAdaptation: BOOL): Unit = extern
  @inline def exposureAdaptationBrighteningSpeedFactor: CGFloat = extern
  @inline def setExposureAdaptationBrighteningSpeedFactor_(exposureAdaptationBrighteningSpeedFactor: CGFloat): Unit = extern
  @inline def exposureAdaptationDarkeningSpeedFactor: CGFloat = extern
  @inline def setExposureAdaptationDarkeningSpeedFactor_(exposureAdaptationDarkeningSpeedFactor: CGFloat): Unit = extern
  @inline def minimumExposure: CGFloat = extern
  @inline def setMinimumExposure_(minimumExposure: CGFloat): Unit = extern
  @inline def maximumExposure: CGFloat = extern
  @inline def setMaximumExposure_(maximumExposure: CGFloat): Unit = extern
  @inline def bloomThreshold: CGFloat = extern
  @inline def setBloomThreshold_(bloomThreshold: CGFloat): Unit = extern
  @inline def bloomIntensity: CGFloat = extern
  @inline def setBloomIntensity_(bloomIntensity: CGFloat): Unit = extern
  @inline def bloomBlurRadius: CGFloat = extern
  @inline def setBloomBlurRadius_(bloomBlurRadius: CGFloat): Unit = extern
  @inline def vignettingPower: CGFloat = extern
  @inline def setVignettingPower_(vignettingPower: CGFloat): Unit = extern
  @inline def vignettingIntensity: CGFloat = extern
  @inline def setVignettingIntensity_(vignettingIntensity: CGFloat): Unit = extern
  @inline def colorFringeStrength: CGFloat = extern
  @inline def setColorFringeStrength_(colorFringeStrength: CGFloat): Unit = extern
  @inline def colorFringeIntensity: CGFloat = extern
  @inline def setColorFringeIntensity_(colorFringeIntensity: CGFloat): Unit = extern
  @inline def saturation: CGFloat = extern
  @inline def setSaturation_(saturation: CGFloat): Unit = extern
  @inline def contrast: CGFloat = extern
  @inline def setContrast_(contrast: CGFloat): Unit = extern
//  @inline def colorGrading(): SCNMaterialProperty = extern
  @inline def categoryBitMask: NSUInteger = extern
  @inline def setCategoryBitMask_(categoryBitMask: NSUInteger): Unit = extern
  @inline def focalBlurRadius: CGFloat = extern
  @inline def setFocalBlurRadius_(focalBlurRadius: CGFloat): Unit = extern
  @inline def xFov: Double = extern
  @inline def setXFov_(xFov: Double): Unit = extern
  @inline def yFov: Double = extern
  @inline def setYFov_(yFov: Double): Unit = extern
  @inline def aperture: CGFloat = extern
  @inline def setAperture_(aperture: CGFloat): Unit = extern
  @inline def focalSize: CGFloat = extern
  @inline def setFocalSize_(focalSize: CGFloat): Unit = extern
  @inline def focalDistance: CGFloat = extern
  @inline def setFocalDistance_(focalDistance: CGFloat): Unit = extern
}

@ObjCClass
abstract class SCNCameraClass extends NSObjectClass {
  @inline def camera(): SCNCamera = extern

  @inline def apply(): SCNCamera = camera()
}

object SCNCamera extends SCNCameraClass {
  override type InstanceType = SCNCamera
}