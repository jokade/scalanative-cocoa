//     Project: scalanative-cocoa
//      Module: Foundation
// Description: Generated with scala-obj-bindgen (with manual postprocessing) from:
//              Foundation/NSData.h
package cocoa.foundation

import scala.language.experimental.macros
import scalanative.native._

@ObjC
class NSMutableData extends NSData {
  @inline def mutableBytes(): Ptr[Byte] = extern
  @inline def setLength(length: NSUInteger): Unit = extern
  @inline def appendBytes(bytes: Ptr[Byte], length: NSUInteger): Unit = extern
  @inline def appendData(other: NSData): Unit = extern
  @inline def increaseLengthBy(extraLength: NSUInteger): Unit = extern
  @inline def replaceBytesInRange(range: NSRange, bytes: Ptr[Byte]): Unit = extern
  @inline def resetBytesInRange(range: NSRange): Unit = extern
  @inline def setData(data: NSData): Unit = extern
  @inline def replaceBytesInRange(range: NSRange, replacementBytes: Ptr[Byte], replacementLength: NSUInteger): Unit = extern
  @inline def initWithCapacity(capacity: NSUInteger): NSMutableData = extern
  @inline def initWithLength(length: NSUInteger): NSMutableData = extern
}

@ObjCClass
abstract class NSMutableDataClass extends NSDataClass {
  @inline def dataWithCapacity(aNumItems: NSUInteger): NSMutableData = extern
  @inline def dataWithLength(length: NSUInteger): NSMutableData = extern
}

object NSMutableData extends NSMutableDataClass {
  override type InstanceType = NSMutableData
}