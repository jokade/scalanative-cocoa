// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.foundation

import scalanative.native._
import objc._

@ObjC
trait NSSecureCoding extends NSCoding {
}

object NSSecureCoding {
  @inline def supportsSecureCoding(): BOOL = extern
}

