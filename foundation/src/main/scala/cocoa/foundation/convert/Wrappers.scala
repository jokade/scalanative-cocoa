//     Project: scalanative-cocoa
//      Module: 
// Description: 
// Copyright (c) 2017. Distributed under the MIT License (see included LICENSE file).
package cocoa.foundation.convert

import cocoa.foundation.{NSArray, NSDictionary, NSEnumerator, NSObject, Foundation, NSQuote}
import Foundation.NSLog
import objc.runtime._

import scala.collection.immutable.AbstractMap
import scala.collection.{AbstractIterator, AbstractSeq}
import scala.scalanative.native._

object Wrappers {

  case class NSArrayWrapper[T<:NSObject](ns: NSArray[T]) extends AbstractSeq[T] with IndexedSeq[T] {
    override def length: Int = ns.count().toInt
    override def apply(idx: Int): T = ns.objectAtIndex(idx.toUInt)
  }

  case class NSDictionaryWrapper[K<:NSObject, V<:NSObject](ns: NSDictionary[K,V]) extends AbstractMap[K,V] {
    private def keyIterator = NSEnumeratorWrapper(ns.keyEnumerator())

    override def +[B1 >: V](kv: (K, B1)): Map[K, B1] = ???

    override def get(key: K): Option[V] = ns.objectForKey(key) match {
      case null => None
      case x => Some(x)
    }

    // TODO: more efficient implementation
    override def iterator: Iterator[(K, V)] = KeyValueIterator(keyIterator,ns)

    override def -(key: K): Map[K, V] = ???

    override def size: CInt = ns.count().toInt
  }

  private case class KeyValueIterator[K<:NSObject, V<:NSObject](keyIterator: Iterator[K], dict: NSDictionary[K,V])
    extends AbstractIterator[(K,V)] {
    override def hasNext: CBool = {
      keyIterator.hasNext
    }
    override def next(): (K, V) = {
      val key = keyIterator.next()
      (key,dict.objectForKey(key))
    }
  }

  case class NSEnumeratorWrapper[T<:NSObject](ns: NSEnumerator[T]) extends AbstractIterator[T] {
    private var _next: id = _
    private var _consumed = true

    private def loadNext(): Unit =
      if(_consumed) {
//        _next = ns.nextObject()
        _consumed = false
      }

    override def hasNext: CBool = {
      loadNext()
      _next != null
    }

    override def next(): T = {
      loadNext()
      _consumed = true
      _next.cast[NSObject].asInstanceOf[T]
    }
  }
}

