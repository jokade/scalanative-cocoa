//     Project: scalanative-cocoa
//      Module:
// Description:
// Copyright (c) 2017. Distributed under the MIT License (see included LICENSE file).
package cocoa.foundation.convert

import cocoa.foundation.{NSArray, NSDictionary, NSObject}
import Wrappers._

object WrapAsScala {
  implicit def nsArrayAsScalaSeq[T<:NSObject](ns: NSArray[T]): Seq[T] = NSArrayWrapper(ns)
  implicit def nsDictionaryAsScalaMap[K<:NSObject, V<:NSObject](ns: NSDictionary[K,V]): Map[K,V] =
    NSDictionaryWrapper(ns)
}
