// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.foundation

import scala.language.experimental.macros
import scalanative.native._
import scalanative.unsafe._
import objc._

@ObjC
class NSMutableData extends NSData {
  @inline def mutableBytes(): Ptr[Byte] = extern
  @inline def setLength_(length: NSUInteger): Unit = extern
  @inline def appendBytes_length_(bytes: Ptr[Byte], length: NSUInteger): Unit = extern
  @inline def appendData_(other: NSData): Unit = extern
  @inline def increaseLengthBy_(extraLength: NSUInteger): Unit = extern
  @inline def replaceBytesInRange_bytes_(range: NSRange, bytes: Ptr[Byte]): Unit = extern
  @inline def resetBytesInRange_(range: NSRange): Unit = extern
  @inline def setData_(data: NSData): Unit = extern
  @inline def replaceBytesInRange_replacementBytes_replacementLength_(range: NSRange, replacementBytes: Ptr[Byte], replacementLength: NSUInteger): Unit = extern
  @inline def initWithCapacity_(capacity: NSUInteger): NSMutableData = extern
  @inline def initWithLength_(length: NSUInteger): NSMutableData = extern
}

@ObjCClass
abstract class NSMutableDataClass extends NSDataClass {
  @inline def dataWithCapacity_(aNumItems: NSUInteger): NSMutableData = extern
  @inline def dataWithLength_(length: NSUInteger): NSMutableData = extern
}

object NSMutableData extends NSMutableDataClass {
  override type InstanceType = NSMutableData
}
