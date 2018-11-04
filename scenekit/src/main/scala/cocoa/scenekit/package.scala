package cocoa

import cocoa.appkit.CGFloat
import cocoa.foundation._
import cocoa.scenekit.SCNGeometrySource

import scala.scalanative.libc.stdlib
import scala.scalanative.native._
import scala.scalanative.native.objc.runtime.id

package object scenekit {
  import platform._

  type SCNVector3 = CStruct3[PFloat,PFloat,PFloat]
/*
  type SCNVector3Struct = CStruct3[PFloat,PFloat,PFloat]
  type SCNVector3 = Ptr[SCNVector3Struct]

  def SCNVector3Make(x: PFloat, y: PFloat, z: PFloat): SCNVector3 = {
    val vec = stdlib.malloc(sizeof[SCNVector3Struct]).cast[SCNVector3]
    !vec._1 = x
    !vec._2 = y
    !vec._3 = z
    vec
  }

  type SCNVector4Struct = CStruct4[PFloat,PFloat,PFloat,PFloat]
  type SCNVector4 = Ptr[SCNVector4Struct]

  def SCNVector4Make(x: PFloat, y: PFloat, z: PFloat, w: PFloat): SCNVector4 = {
    val vec = stdlib.malloc(sizeof[SCNVector4Struct]).cast[SCNVector4]
    !vec._1 = x
    !vec._2 = y
    !vec._3 = z
    !vec._4 = w
    vec
  }
*/

  type SCNCameraProjectionDirection = NSInteger
  object SCNCameraProjectionDirection {
    val Vertical   :SCNCameraProjectionDirection = 0
    val Horizontal :SCNCameraProjectionDirection = 1
  }

  type SCNShadowMode = NSInteger
  object SCNShadowMode {
    val Forward   :NSInteger = 0
    val Deferred  :NSInteger = 1
    val Modulated :NSInteger = 2
  }

  type SCNLightType = NSString
  object SCNLightType {
    val Ambient     :SCNLightType = NSString("ambient")
    val Directional :SCNLightType = NSString("directional")
    val Omni        :SCNLightType = NSString("omni")
    val Spot        :SCNLightType = NSString("spot")
  }

  type SCNAntialiasingMode = NSUInteger
  object SCNAntialiasingMode {
    val None             :SCNAntialiasingMode = 0.toULong
    val Multisampling2X  :SCNAntialiasingMode = 1.toULong
    val Multisampling4X  :SCNAntialiasingMode = 2.toULong
    val Multisampling8X  :SCNAntialiasingMode = 3.toULong
    val Multisampling16X :SCNAntialiasingMode = 4.toULong
  }

  type SCNRenderingAPI = NSUInteger
  object SCNRenderingAPI {
    val Metal        :SCNRenderingAPI = 0.toULong
    val OpenGLLegacy :SCNRenderingAPI = 1.toULong
    val OpenGLCore32 :SCNRenderingAPI = 2.toULong
    val OpenGLCore41 :SCNRenderingAPI = 3.toULong
  }

  type SCNDebugOptions = NSUInteger
  object SCNDebugOptions {
    val None                :SCNDebugOptions = 0.toULong
    val ShowPhysicsShapes   :SCNDebugOptions = 1.toULong << 0 //show physics shape
    val ShowBoundingBoxes   :SCNDebugOptions = 1.toULong << 1 //show object bounding boxes
    val ShowLightInfluences :SCNDebugOptions = 1.toULong << 2 //show objects's light influences
    val ShowLightExtents    :SCNDebugOptions = 1.toULong << 3 //show light extents
    val ShowPhysicsFields   :SCNDebugOptions = 1.toULong << 4 //show SCNPhysicsFields forces and extents
    val ShowWireframe       :SCNDebugOptions = 1.toULong << 5 //show wireframe on top of objects
    val RenderAsWireframe   :SCNDebugOptions = 1.toULong << 6 //render objects as wireframe
    val ShowSkeletons       :SCNDebugOptions = 1.toULong << 7 //show skinning bones
    val ShowCreases         :SCNDebugOptions = 1.toULong << 8 //show subdivision creases
    val ShowConstraints     :SCNDebugOptions = 1.toULong << 9 //show slider constraint
    val ShowCameras         :SCNDebugOptions = 1.toULong << 10 //show cameras
  }

  type SCNGeometryPrimitiveType = NSInteger
  object SCNGeometryPrimitiveType {
    val Triangles     :SCNGeometryPrimitiveType = 0
    val TriangleStrip :SCNGeometryPrimitiveType = 1
    val Line          :SCNGeometryPrimitiveType = 2
    val Point         :SCNGeometryPrimitiveType = 3
    val Polygon       :SCNGeometryPrimitiveType = 4
  }

  type SCNFillMode = NSUInteger
  object SCNFillMode {
    val Fill : SCNFillMode = 0.toULong
    val Lines : SCNFillMode = 1.toULong
  }

  type SCNCullMode = NSInteger
  object SCNCullMode {
    val Back : SCNCullMode = 0
    val Front : SCNCullMode = 1
  }

  type SCNTransparencyMode = NSInteger
  object SCNTransparencyModeDefault {
    val AOne         :SCNTransparencyMode = 0 // Takes the transparency information from the alpha channel. The value 1.0 is opaque.
    val RGBZero      :SCNTransparencyMode = 1 // Ignores the alpha channel and takes the transparency information from the luminance of the red, green, and blue channels. The value 0.0 is opaque.
    val SingleLayer  :SCNTransparencyMode = 2 // Ensures that one layer of transparency is draw correctly.
    val DualLayer    :SCNTransparencyMode = 3 // Ensures that two layers of transparency are ordered and drawn correctly. This should be used for transparent convex objects like cubes and spheres, when you want to see both front and back faces.
    val Default      :SCNTransparencyMode = AOne
  }

  type SCNBlendMode = NSInteger
  object SCNBlendMode {
    val Alpha    :SCNBlendMode = 0 // Blends the source and destination colors by adding the source multiplied by source alpha and the destination multiplied by one minus source alpha.
    val Add      :SCNBlendMode = 1 // Blends the source and destination colors by adding them up.
    val Subtract :SCNBlendMode = 2 // Blends the source and destination colors by subtracting the source from the destination.
    val Multiply :SCNBlendMode = 3 // Blends the source and destination colors by multiplying them.
    val Screen   :SCNBlendMode = 4 // Blends the source and destination colors by multiplying one minus the source with the destination and adding the source.
    val Replace  :SCNBlendMode = 5 // Replaces the destination with the source (ignores alpha).
    val Max      :SCNBlendMode = 6 // Max the destination with the source (ignores alpha).
  }

  type SCNFilterMode = NSInteger
  object SCNFilterMode {
    val None    :SCNFilterMode = 0
    val Nearest :SCNFilterMode = 1
    val Linear  :SCNFilterMode = 2
  }

  type SCNWrapMode = NSInteger
  object SCNWrapModeClamp {
    val Clamp         = 1
    val Repeat        = 2
    val ClampToBorder = 3
    val Mirror        = 4
  }

  type SCNGeometrySourceSemantic = NSString
  object SCNGeometrySourceSemantic {
    val Vertex : NSString = NSString("kGeometrySourceSemanticVertex")
    val Normal : NSString = NSString("kGeometrySourceSemanticNormal")
    val Texcoord : NSString = NSString("kGeometrySourceSemanticTexcoord")
  }
}

