// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.scenekit

import cocoa.appkit.CGFloat
import cocoa.foundation.{NSData, NSInteger, NSObject, NSObjectClass, NSRange, NSSecureCoding, NSUInteger}
import cocoa.scenekit.TriangleIndexArray.TriangleIndexData

import scala.language.experimental.macros
import scalanative.native._
import objc._
import scala.scalanative.libc.stdlib

@ObjC
class SCNGeometryElement extends NSObject with NSSecureCoding {
  @inline def data(): NSData = extern
  @inline def primitiveType(): SCNGeometryPrimitiveType = extern
  @inline def primitiveCount(): NSInteger = extern
  @inline def primitiveRange(): NSRange = extern
  @inline def setPrimitiveRange_(primitiveRange: NSRange): Unit = extern
  @inline def bytesPerIndex(): NSInteger = extern
  @inline def pointSize(): CGFloat = extern
  @inline def setPointSize_(pointSize: CGFloat): Unit = extern
  @inline def minimumPointScreenSpaceRadius(): CGFloat = extern
  @inline def setMinimumPointScreenSpaceRadius_(minimumPointScreenSpaceRadius: CGFloat): Unit = extern
  @inline def maximumPointScreenSpaceRadius(): CGFloat = extern
  @inline def setMaximumPointScreenSpaceRadius_(maximumPointScreenSpaceRadius: CGFloat): Unit = extern
}

@ObjCClass
abstract class SCNGeometryElementClass extends NSObjectClass {
  @inline def geometryElementWithData_primitiveType_primitiveCount_bytesPerIndex_(data: NSData, primitiveType: SCNGeometryPrimitiveType, primitiveCount: NSInteger, bytesPerIndex: NSInteger): SCNGeometryElement = extern
}

object SCNGeometryElement extends SCNGeometryElementClass {
  override type InstanceType = SCNGeometryElement
}

class TriangleIndexArray(size: Int, data: Ptr[TriangleIndexData]) extends AutoReleasable {
  private var _elem: SCNGeometryElement = _

  override def free(): Unit = {
    stdlib.free(data.cast[Ptr[Byte]])
  }

  final def set(idx: Int, x: Int, y: Int, z: Int): Unit = {
    val s = data + idx
    !s._1 = x
    !s._2 = y
    !s._3 = z
  }

  def geometryElement: SCNGeometryElement =
    if(_elem==null) this.synchronized{
      _elem = SCNGeometryElement.geometryElementWithData_primitiveType_primitiveCount_bytesPerIndex_(
        data = NSData.dataWithBytes_length_(data.cast[Ptr[Byte]],bytes),
        primitiveType = SCNGeometryPrimitiveType.Triangles,
        primitiveCount = size,
        bytesPerIndex = sizeof[CInt]
      )
      _elem
    }
    else _elem

  private def bytes: NSUInteger = (3*sizeof[CInt]*size).toULong
}

object TriangleIndexArray {
  type TriangleIndexData = CStruct3[CInt,CInt,CInt]

  def apply(size: Int): TriangleIndexArray = new TriangleIndexArray(size, stdlib.malloc(sizeof[TriangleIndexData]*size).cast[Ptr[TriangleIndexData]])
}