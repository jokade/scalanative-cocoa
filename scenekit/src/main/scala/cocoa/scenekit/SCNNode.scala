package cocoa.scenekit

import cocoa.appkit.CGFloat
import cocoa.foundation.{NSArray, NSCopying, NSInteger, NSObject, NSObjectClass, NSSecureCoding, NSString, NSUInteger}
import de.surfice.smacrotools.debug

import scala.language.experimental.macros
import scalanative.native._
import objc._
import scala.scalanative.native.objc.runtime.{BOOL, id}
import platform._

@ObjC
class SCNNode extends NSObject with NSCopying with NSSecureCoding with SCNActionable { //with SCNAnimatable  with SCNBoundingVolume {
  @inline def flattenedClone(): SCNNode = extern
//  @inline def setWorldTransform_(worldTransform: SCNMatrix4): Unit = extern
  @inline def addChildNode_(child: SCNNode): Unit = extern
  def addChild(geometry: SCNGeometry): SCNNode = {
    val n = SCNNode(geometry)
    addChildNode_(n)
    n
  }
  def addChild(name: String, geometry: SCNGeometry): SCNNode = {
    val n = SCNNode(name,geometry)
    addChildNode_(n)
    n
  }
  def addChild(name: String, camera: SCNCamera): SCNNode = {
    val n = SCNNode(name,camera)
    addChildNode_(n)
    n
  }
  def addChild(name: String, light: SCNLight): SCNNode = {
    val n = SCNNode(name,light)
    addChildNode_(n)
    n
  }
  @inline def insertChildNode_index_(child: SCNNode, index: NSUInteger): Unit = extern
  @inline def removeFromParentNode(): Unit = extern
  @inline def replaceChildNode_newChild_(oldChild: SCNNode, newChild: SCNNode): Unit = extern
  @inline def childNodeWithName_recursively_(name: NSString, recursively: BOOL): SCNNode = extern
  @inline def childNodesPassingTest_(predicate: BOOL): NSArray[SCNNode] = extern
  @inline def enumerateChildNodesUsingBlock_(block: Ptr[Byte]): Unit = extern
  @inline def enumerateHierarchyUsingBlock_(block: Ptr[Byte]): Unit = extern
//  @inline def convertPosition_node_(position: SCNVector3, node: SCNNode): SCNVector3 = extern
//  @inline def convertVector_node_(vector: SCNVector3, node: SCNNode): SCNVector3 = extern
//  @inline def convertTransform_node_(transform: SCNMatrix4, node: SCNNode): SCNMatrix4 = extern
//  @inline def convertTransform_node_(transform: SCNMatrix4, node: SCNNode): SCNMatrix4 = extern
//  @inline def hitTestWithSegmentFromPoint_pointB_options_(pointA: SCNVector3, pointB: SCNVector3, options: id): NSArray[SCNHitTestResult] = extern
  @inline def name: NSString = extern
  @inline def setName_(name: NSString): Unit = extern
  @inline def light: SCNLight = extern
  @inline def setLight_(light: SCNLight): Unit = extern
  @inline def camera: SCNCamera = extern
//  @inline def camera_=(camera: SCNCamera): Unit = setCamera_(camera)
  @inline def setCamera_(camera: SCNCamera): Unit = extern
  @inline def geometry: SCNGeometry = extern
  @inline def setGeometry_(geometry: SCNGeometry): Unit = extern
//  @inline def skinner(): SCNSkinner = extern
//  @inline def setSkinner_(skinner: SCNSkinner): Unit = extern
//  @inline def morpher(): SCNMorpher = extern
//  @inline def setMorpher_(morpher: SCNMorpher): Unit = extern
//  @inline def transform(): SCNMatrix4 = extern
//  @inline def setTransform_(transform: SCNMatrix4): Unit = extern
//  @inline def worldTransform(): SCNMatrix4 = extern
//  @inline def position(): SCNVector3 = extern
//  @inline def position_=(position: SCNVector3): Unit = setPosition_(position)
  @inline def setPosition(x: PFloat, y: PFloat, z: PFloat): Unit = SceneKit.SCNNode_setPosition(__ptr,x,y,z)
//  @inline def setPosition_(position: SCNVector3): Unit = extern
//  @inline def worldPosition(): SCNVector3 = extern
//  @inline def setWorldPosition_(worldPosition: SCNVector3): Unit = extern
//  @inline def rotation(): SCNVector4 = extern
//  @inline def setRotation_(rotation: SCNVector4): Unit = extern
  @inline def setRotation(x: PFloat, y: PFloat, z: PFloat, w: PFloat): Unit = SceneKit.SCNNode_setRotation(__ptr,x,y,z,w)
//  @inline def orientation(): SCNQuaternion = extern
//  @inline def setOrientation_(orientation: SCNQuaternion): Unit = extern
//  @inline def worldOrientation(): SCNQuaternion = extern
//  @inline def setWorldOrientation_(worldOrientation: SCNQuaternion): Unit = extern
//  @inline def eulerAngles(): SCNVector3 = extern
//  @inline def setEulerAngles_(eulerAngles: SCNVector3): Unit = extern
//  @inline def scale(): SCNVector3 = extern
//  @inline def setScale_(scale: SCNVector3): Unit = extern
//  @inline def pivot(): SCNMatrix4 = extern
//  @inline def setPivot_(pivot: SCNMatrix4): Unit = extern
  @inline def isHidden: BOOL = extern
  @inline def setHidden_(hidden: BOOL): Unit = extern
  @inline def opacity: CGFloat = extern
  @inline def setOpacity_(opacity: CGFloat): Unit = extern
  @inline def renderingOrder: NSInteger = extern
  @inline def setRenderingOrder_(renderingOrder: NSInteger): Unit = extern
  @inline def castsShadow: BOOL = extern
  @inline def setCastsShadow_(castsShadow: BOOL): Unit = extern
//  @inline def movabilityHint(): SCNMovabilityHint = extern
//  @inline def setMovabilityHint_(movabilityHint: SCNMovabilityHint): Unit = extern
  @inline def parentNode: SCNNode = extern
  @inline def childNodes: NSArray[SCNNode] = extern
//  @inline def physicsBody(): SCNPhysicsBody = extern
//  @inline def setPhysicsBody_(physicsBody: SCNPhysicsBody): Unit = extern
//  @inline def physicsField(): SCNPhysicsField = extern
//  @inline def setPhysicsField_(physicsField: SCNPhysicsField): Unit = extern
  @inline def constraints: NSArray[SCNConstraint] = extern
  @inline def setConstraints_(constraints: NSArray[SCNConstraint]): Unit = extern
  def setConstraints(constraints: SCNConstraint*): Unit = setConstraints_(NSArray(constraints:_*))
//  @inline def filters(): NSArray[CIFilter] = extern
//  @inline def setFilters_(filters: NSArray[CIFilter]): Unit = extern
  @inline def presentationNode: SCNNode = extern
  @inline def isPaused: BOOL = extern
  @inline def setPaused_(paused: BOOL): Unit = extern
//  @inline def rendererDelegate(): id[SCNNodeRendererDelegate] = extern
//  @inline def setRendererDelegate_(rendererDelegate: id[SCNNodeRendererDelegate]): Unit = extern
  @inline def categoryBitMask: NSUInteger = extern
  @inline def setCategoryBitMask_(categoryBitMask: NSUInteger): Unit = extern
//  @inline def focusBehavior(): SCNNodeFocusBehavior = extern
//  @inline def setFocusBehavior_(focusBehavior: SCNNodeFocusBehavior): Unit = extern
//  @inline def lookAt_(worldTarget: SCNVector3): Unit = extern
//  @inline def lookAt_worldUp_localFront_(worldTarget: SCNVector3, worldUp: SCNVector3, localFront: SCNVector3): Unit = extern
//  @inline def localTranslateBy_(translation: SCNVector3): Unit = extern
//  @inline def localRotateBy_(rotation: SCNQuaternion): Unit = extern
//  @inline def rotateBy_worldTarget_(worldRotation: SCNQuaternion, worldTarget: SCNVector3): Unit = extern
//  @inline def worldUp(): SCNVector3 = extern
//  @inline def worldRight(): SCNVector3 = extern
//  @inline def worldFront(): SCNVector3 = extern
//  @inline def simdConvertPosition_node_(position: simd_float3, node: SCNNode): simd_float3 = extern
//  @inline def simdConvertPosition_node_(position: simd_float3, node: SCNNode): simd_float3 = extern
//  @inline def simdConvertVector_node_(vector: simd_float3, node: SCNNode): simd_float3 = extern
//  @inline def simdConvertVector_node_(vector: simd_float3, node: SCNNode): simd_float3 = extern
//  @inline def simdConvertTransform_node_(transform: simd_float4x4, node: SCNNode): simd_float4x4 = extern
//  @inline def simdConvertTransform_node_(transform: simd_float4x4, node: SCNNode): simd_float4x4 = extern
//  @inline def simdLookAt_(worldTarget: vector_float3): Unit = extern
//  @inline def simdLookAt_worldUp_localFront_(worldTarget: vector_float3, worldUp: vector_float3, localFront: simd_float3): Unit = extern
//  @inline def simdLocalTranslateBy_(translation: simd_float3): Unit = extern
//  @inline def simdLocalRotateBy_(rotation: simd_quatf): Unit = extern
//  @inline def simdRotateBy_worldTarget_(worldRotation: simd_quatf, worldTarget: simd_float3): Unit = extern
//  @inline def simdTransform(): simd_float4x4 = extern
//  @inline def setSimdTransform_(simdTransform: simd_float4x4): Unit = extern
//  @inline def simdPosition(): simd_float3 = extern
//  @inline def setSimdPosition_(simdPosition: simd_float3): Unit = extern
//  @inline def simdRotation(): simd_float4 = extern
//  @inline def setSimdRotation_(simdRotation: simd_float4): Unit = extern
//  @inline def simdOrientation(): simd_quatf = extern
//  @inline def setSimdOrientation_(simdOrientation: simd_quatf): Unit = extern
//  @inline def simdEulerAngles(): simd_float3 = extern
//  @inline def setSimdEulerAngles_(simdEulerAngles: simd_float3): Unit = extern
//  @inline def simdScale(): simd_float3 = extern
//  @inline def setSimdScale_(simdScale: simd_float3): Unit = extern
//  @inline def simdPivot(): simd_float4x4 = extern
//  @inline def setSimdPivot_(simdPivot: simd_float4x4): Unit = extern
//  @inline def simdWorldPosition(): simd_float3 = extern
//  @inline def setSimdWorldPosition_(simdWorldPosition: simd_float3): Unit = extern
//  @inline def simdWorldOrientation(): simd_quatf = extern
//  @inline def setSimdWorldOrientation_(simdWorldOrientation: simd_quatf): Unit = extern
//  @inline def simdWorldTransform(): simd_float4x4 = extern
//  @inline def setSimdWorldTransform_(simdWorldTransform: simd_float4x4): Unit = extern
//  @inline def simdWorldUp(): simd_float3 = extern
//  @inline def simdWorldRight(): simd_float3 = extern
//  @inline def simdWorldFront(): simd_float3 = extern
}

@ObjCClass
abstract class SCNNodeClass extends NSObjectClass {
  @inline def node(): SCNNode = extern
  @inline def nodeWithGeometry_(geometry: SCNGeometry): SCNNode = extern
//  @inline def localUp(): SCNVector3 = extern
//  @inline def localRight(): SCNVector3 = extern
//  @inline def localFront(): SCNVector3 = extern
//  @inline def simdLocalUp(): simd_float3 = extern
//  @inline def simdLocalRight(): simd_float3 = extern
//  @inline def simdLocalFront(): simd_float3 = extern
}

object SCNNode extends SCNNodeClass {
  override type InstanceType = SCNNode

  def apply(name: String): SCNNode = {
    val n = node()
    n.setName_(NSString(name))
    n
  }

  @inline def apply(geometry: SCNGeometry): SCNNode = nodeWithGeometry_(geometry)

  def apply(name: String, geometry: SCNGeometry): SCNNode = {
    val n = nodeWithGeometry_(geometry)
    n.setName_(NSString(name))
    n
  }

  def apply(name: String, camera: SCNCamera): SCNNode = {
    val n = node()
    n.setName_(NSString(name))
    n.setCamera_(camera)
    n
  }

  def apply(name: String, light: SCNLight): SCNNode = {
    val n = node()
    n.setName_(NSString(name))
    n.setLight_(light)
    n
  }
}

@ObjC
trait SCNNodeRendererDelegate extends NSObject {
//  @inline def renderNode_renderer_arguments_(node: SCNNode, renderer: SCNRenderer, arguments: id): Unit = extern
}
