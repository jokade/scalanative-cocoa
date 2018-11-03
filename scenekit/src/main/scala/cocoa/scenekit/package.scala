package cocoa

import cocoa.appkit.CGFloat
import cocoa.foundation.NSInteger

import scala.scalanative.libc.stdlib
import scala.scalanative.native._

package object scenekit {

  type SCNVector3Struct = CStruct3[CGFloat,CGFloat,CGFloat]
  type SCNVector3 = Ptr[SCNVector3Struct]

  def SCNVector3Make(x: CGFloat, y: CGFloat, z: CGFloat): SCNVector3 = {
    val vec = stdlib.malloc(sizeof[SCNVector3Struct]).cast[SCNVector3]
    !vec._1 = x
    !vec._2 = y
    !vec._3 = z
    vec
  }

  type SCNCameraProjectionDirection = NSInteger
  object SCNCameraProjectionDirection {
    val Vertical   :SCNCameraProjectionDirection = 0
    val Horizontal :SCNCameraProjectionDirection = 1
  }
}

