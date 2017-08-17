//     Project: scalanative-cocoa
//      Module: 
// Description: 
// Copyright (c) 2017. Distributed under the MIT License (see included LICENSE file).
package cocoa.foundation.convert

import cocoa.foundation.{NSArray, NSObject}

import scala.collection.AbstractSeq

object Wrappers {
  case class NSArrayWrapper[T<:NSObject](ns: NSArray[T]) extends AbstractSeq[T] with IndexedSeq[T] {
    override def length: Int = ns.size
    override def apply(idx: Int): T = ns(idx)
  }
}

