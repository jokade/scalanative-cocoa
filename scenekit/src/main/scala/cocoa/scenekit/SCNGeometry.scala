// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.scenekit

import cocoa.foundation.{NSArray, NSCopying, NSInteger, NSObject, NSObjectClass, NSSecureCoding, NSString, NSUInteger}

import scala.language.experimental.macros
import scalanative.native._
import objc._
import scala.scalanative.native.objc.runtime.BOOL

@ObjC
class SCNGeometry extends NSObject  with NSCopying with NSSecureCoding { //with SCNAnimatable with SCNBoundingVolume with SCNShadable
//  @inline def insertMaterial_index_(material: SCNMaterial, index: NSUInteger): Unit = extern
  @inline def removeMaterialAtIndex_(index: NSUInteger): Unit = extern
//  @inline def replaceMaterialAtIndex_material_(index: NSUInteger, material: SCNMaterial): Unit = extern
//  @inline def materialWithName_(name: NSString): SCNMaterial = extern
//  @inline def geometrySourcesForSemantic_(semantic: SCNGeometrySourceSemantic): NSArray[SCNGeometrySource] = extern
  @inline def geometryElementAtIndex_(elementIndex: NSInteger): SCNGeometryElement = extern
  @inline def name: NSString = extern
  @inline def setName_(name: NSString): Unit = extern
  @inline def materials: NSArray[SCNMaterial] = extern
  @inline def setMaterials_(materials: NSArray[SCNMaterial]): Unit = extern
  @inline def firstMaterial: SCNMaterial = extern
  @inline def setFirstMaterial_(firstMaterial: SCNMaterial): Unit = extern
  @inline def geometrySources: NSArray[SCNGeometrySource] = extern
  @inline def geometryElements: NSArray[SCNGeometryElement] = extern
  @inline def geometryElementCount: NSInteger = extern
//  @inline def levelsOfDetail(): NSArray[SCNLevelOfDetail] = extern
//  @inline def setLevelsOfDetail_(levelsOfDetail: NSArray[SCNLevelOfDetail]): Unit = extern
  @inline def tessellator: SCNGeometryTessellator = extern
  @inline def setTessellator_(tessellator: SCNGeometryTessellator): Unit = extern
  @inline def subdivisionLevel: NSUInteger = extern
  @inline def setSubdivisionLevel_(subdivisionLevel: NSUInteger): Unit = extern
  @inline def wantsAdaptiveSubdivision: BOOL = extern
  @inline def setWantsAdaptiveSubdivision_(wantsAdaptiveSubdivision: BOOL): Unit = extern
  @inline def edgeCreasesElement: SCNGeometryElement = extern
  @inline def setEdgeCreasesElement_(edgeCreasesElement: SCNGeometryElement): Unit = extern
  @inline def edgeCreasesSource: SCNGeometrySource = extern
  @inline def setEdgeCreasesSource_(edgeCreasesSource: SCNGeometrySource): Unit = extern
}

@ObjCClass
abstract class SCNGeometryClass extends NSObjectClass {
  def apply(vertices: VertexArray, normals: NormalsArray, indices: TriangleIndexArray): SCNGeometry = geometryWithSources_elements_(
    NSArray(vertices.geometrySource,normals.geometrySource),
    NSArray(indices.geometryElement)
  )
  @inline def geometry(): SCNGeometry = extern
  @inline def geometryWithSources_elements_(sources: NSArray[SCNGeometrySource], elements: NSArray[SCNGeometryElement]): SCNGeometry = extern
}

object SCNGeometry extends SCNGeometryClass {
  override type InstanceType = SCNGeometry
}

