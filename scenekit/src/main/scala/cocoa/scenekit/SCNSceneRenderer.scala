// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.scenekit

import cocoa.foundation.{NSArray, NSObject, NSTimeInterval}

import scala.language.experimental.macros
import scalanative.native._
import objc._
import scala.scalanative.native.objc.runtime.{BOOL, id}

@ObjC
trait SCNSceneRenderer extends NSObject {
//  @inline def presentScene_transition_pointOfView_completionHandler_(scene: SCNScene, transition: SKTransition, pointOfView: SCNNode, completionHandler: Ptr[Byte]): Unit = extern
//  @inline def hitTest_options_(point: CGPoint, options: id): NSArray[SCNHitTestResult] = extern
  @inline def isNodeInsideFrustum_pointOfView_(node: SCNNode, pointOfView: SCNNode): BOOL = extern
  @inline def nodesInsideFrustumWithPointOfView_(pointOfView: SCNNode): NSArray[SCNNode] = extern
//  @inline def projectPoint_(point: SCNVector3): SCNVector3 = extern
//  @inline def unprojectPoint_(point: SCNVector3): SCNVector3 = extern
  @inline def prepareObject_block_(`object`: id, block: BOOL): BOOL = extern
  @inline def prepareObjects_completionHandler_(objects: NSArray[_], completionHandler: Ptr[Byte]): Unit = extern
  @inline def scene(): SCNScene = extern
  @inline def setScene_(scene: SCNScene): Unit = extern
  @inline def sceneTime(): NSTimeInterval = extern
  @inline def setSceneTime_(sceneTime: NSTimeInterval): Unit = extern
  @inline def delegate(): id = extern
  @inline def setDelegate_(delegate: SCNSceneRendererDelegate): Unit = extern
  @inline def isPlaying(): BOOL = extern
  @inline def setPlaying_(playing: BOOL): Unit = extern
  @inline def loops(): BOOL = extern
  @inline def setLoops_(loops: BOOL): Unit = extern
  @inline def pointOfView(): SCNNode = extern
  @inline def setPointOfView_(pointOfView: SCNNode): Unit = extern
  @inline def autoenablesDefaultLighting(): BOOL = extern
  @inline def setAutoenablesDefaultLighting_(autoenablesDefaultLighting: BOOL): Unit = extern
  @inline def isJitteringEnabled(): BOOL = extern
  @inline def setJitteringEnabled_(jitteringEnabled: BOOL): Unit = extern
  @inline def showsStatistics(): BOOL = extern
  @inline def setShowsStatistics_(showsStatistics: BOOL): Unit = extern
  @inline def debugOptions(): SCNDebugOptions = extern
  @inline def setDebugOptions_(debugOptions: SCNDebugOptions): Unit = extern
//  @inline def overlaySKScene(): SKScene = extern
//  @inline def setOverlaySKScene_(overlaySKScene: SKScene): Unit = extern
  @inline def renderingAPI(): SCNRenderingAPI = extern
  @inline def context(): Ptr[Byte] = extern
//  @inline def currentRenderCommandEncoder(): id[MTLRenderCommandEncoder] = extern
//  @inline def device(): id[MTLDevice] = extern
//  @inline def colorPixelFormat(): MTLPixelFormat = extern
//  @inline def depthPixelFormat(): MTLPixelFormat = extern
//  @inline def stencilPixelFormat(): MTLPixelFormat = extern
//  @inline def commandQueue(): id[MTLCommandQueue] = extern
//  @inline def audioEngine(): AVAudioEngine = extern
//  @inline def audioEnvironmentNode(): AVAudioEnvironmentNode = extern
  @inline def audioListener(): SCNNode = extern
  @inline def setAudioListener_(audioListener: SCNNode): Unit = extern
  @inline def currentTime(): NSTimeInterval = extern
  @inline def setCurrentTime_(currentTime: NSTimeInterval): Unit = extern
}

