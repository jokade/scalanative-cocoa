// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.scenekit

import cocoa.foundation.{NSData, NSInteger, NSObject, NSObjectClass, NSSecureCoding}

import scala.language.experimental.macros
import scalanative.native._
import objc._
import scala.scalanative.libc.stdlib
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
  @inline def geometrySourceWithData_semantic_vectorCount_floatComponents_componentsPerVector_bytesPerComponent_dataOffset_dataStride_(data: NSData, semantic: SCNGeometrySourceSemantic, vectorCount: NSInteger, floatComponents: BOOL, componentsPerVector: NSInteger, bytesPerComponent: NSInteger, offset: NSInteger, stride: NSInteger): SCNGeometrySource = extern
  @inline def geometrySourceWithVertices_count_(vertices: Ptr[SCNVector3], count: NSInteger): SCNGeometrySource = extern
  @inline def geometrySourceWithNormals_count_(normals: Ptr[SCNVector3], count: NSInteger): SCNGeometrySource = extern
//  @inline def geometrySourceWithTextureCoordinates_count_(texcoord: CGPoint, count: NSInteger): SCNGeometrySource = extern
//  @inline def geometrySourceWithBuffer_vertexFormat_semantic_vertexCount_offset_stride_(mtlBuffer: id, vertexFormat: MTLVertexFormat, semantic: SCNGeometrySourceSemantic, vertexCount: NSInteger, offset: NSInteger, stride: NSInteger): SCNGeometrySource = extern
}

object SCNGeometrySource extends SCNGeometrySourceClass {
  override type InstanceType = SCNGeometrySource
}


abstract class Vec3Array(val size: Int, val data: Ptr[SCNVector3]) extends AutoReleasable {
  import platform._
  protected var _geom: SCNGeometrySource = _

  override def free(): Unit = {
//    if(_geom!=null) {
//      _geom.release()
//    }
    stdlib.free(data.cast[Ptr[Byte]])
  }

  final def set(idx: Int, x: PFloat, y: PFloat, z: PFloat): Unit = {
    assert(idx>=0 && idx<size)
    val s = data + idx
    !s._1 = x
    !s._2 = y
    !s._3 = z
  }

  def geometrySource: SCNGeometrySource
}

class VertexArray(size: Int, data: Ptr[SCNVector3]) extends Vec3Array(size,data) {
  override def geometrySource: SCNGeometrySource =
    if(_geom == null) this.synchronized{
      _geom = SCNGeometrySource.geometrySourceWithVertices_count_(data,size)
      _geom
    }
    else _geom
}

object VertexArray {
  def apply(size: Int): VertexArray = new VertexArray(size, stdlib.malloc(sizeof[SCNVector3] * size).cast[Ptr[SCNVector3]])
}

class NormalsArray(size: Int, data: Ptr[SCNVector3]) extends Vec3Array(size,data) {
   override def geometrySource: SCNGeometrySource =
    if(_geom == null) this.synchronized{
      _geom = SCNGeometrySource.geometrySourceWithNormals_count_(data,size)
      _geom
    }
    else _geom
}

object NormalsArray {
  def apply(size: Int): NormalsArray = new NormalsArray(size, stdlib.malloc(sizeof[SCNVector3] * size).cast[Ptr[SCNVector3]])
}
