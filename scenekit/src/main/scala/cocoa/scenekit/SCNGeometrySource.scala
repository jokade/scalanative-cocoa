// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.scenekit

import cocoa.foundation.{NSData, NSInteger, NSObject, NSObjectClass, NSSecureCoding}

import scala.language.experimental.macros
import scalanative.native._
import objc._
import scala.scalanative.native.objc.runtime.BOOL

@ObjC
class SCNGeometrySource extends NSObject with NSSecureCoding {
  @inline def data(): NSData = extern
//  @inline def semantic(): SCNGeometrySourceSemantic = extern
  @inline def vectorCount(): NSInteger = extern
  @inline def floatComponents(): BOOL = extern
  @inline def componentsPerVector(): NSInteger = extern
  @inline def bytesPerComponent(): NSInteger = extern
  @inline def dataOffset(): NSInteger = extern
  @inline def dataStride(): NSInteger = extern
}

@ObjCClass
abstract class SCNGeometrySourceClass extends NSObjectClass {
//  @inline def geometrySourceWithData_semantic_vectorCount_floatComponents_componentsPerVector_bytesPerComponent_offset_stride_(data: NSData, semantic: SCNGeometrySourceSemantic, vectorCount: NSInteger, floatComponents: BOOL, componentsPerVector: NSInteger, bytesPerComponent: NSInteger, offset: NSInteger, stride: NSInteger): SCNGeometrySource = extern
//  @inline def geometrySourceWithVertices_count_(vertices: SCNVector3, count: NSInteger): SCNGeometrySource = extern
//  @inline def geometrySourceWithNormals_count_(normals: SCNVector3, count: NSInteger): SCNGeometrySource = extern
//  @inline def geometrySourceWithTextureCoordinates_count_(texcoord: CGPoint, count: NSInteger): SCNGeometrySource = extern
//  @inline def geometrySourceWithBuffer_vertexFormat_semantic_vertexCount_offset_stride_(mtlBuffer: id, vertexFormat: MTLVertexFormat, semantic: SCNGeometrySourceSemantic, vertexCount: NSInteger, offset: NSInteger, stride: NSInteger): SCNGeometrySource = extern
}

object SCNGeometrySource extends SCNGeometrySourceClass {
  override type InstanceType = SCNGeometrySource
}