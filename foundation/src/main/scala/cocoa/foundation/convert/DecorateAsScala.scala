//     Project: scalanative-cocoa
//      Module: Foundation / Scala converters
// Description:
// Copyright (c) 2017. Distributed under the MIT License (see included LICENSE file).
package cocoa.foundation.convert

import cocoa.foundation.{NSArray, NSObject}
import Decorators._
import WrapAsScala._

trait DecorateAsScala {

  implicit def nsArrayAsScalaConverter[T<:NSObject](ns: NSArray[T]): AsScala[Seq[T]] =
    new AsScala(nsArrayAsScalaSeq(ns))
}
