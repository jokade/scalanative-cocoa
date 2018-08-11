//     Project: scalanative-cocoa
//      Module: 
// Description: 
// Copyright (c) $today.year. Distributed under the MIT License (see included LICENSE file). package cocoa.foundation 
package cocoa.foundation

import scala.reflect.macros.blackbox
import scala.language.experimental.macros
import scalanative.native._

//TODO: these decorators don't work  - segmentation fault during execution
//object NSDecorators {
//
//  trait NSIterable[T] extends NSObject {
//    def count(): NSUInteger
//  }
//  object NSIterable {
//    implicit final class RichNSIterable[T](val ns: NSIterable[T]) extends AnyVal {
//      /**
//       * Return the number of elements in this collection.
//       */
//      def size: Int = ns.count().toInt
//    }
//
//    def sizeImpl(c: blackbox.Context) = {
//      import c.universe._
//      q"${c.prefix}.ns.count().toInt"
//    }
//  }
//
//  trait NSSeqLike[T] extends NSIterable[T] {
//    def objectAtIndex(idx: NSUInteger): T
//  }
//
//  object NSSeqLike {
//    implicit final class RichNSSeqLike[T](val ns: NSSeqLike[T]) extends AnyVal {
//      /**
//       * Returns the element at the specified index.
//       *
//       * @param idx
//       */
//      @inline def apply(idx: Int): T = ns.objectAtIndex(idx.toUInt)
//    }
//  }
//
//  trait NSMapLike[K,V] extends NSIterable[(K,V)] {
//    def objectForKey(key: K): V
//  }
//  object NSMapLike {
//    implicit final class RichNSMapLike[K,V](val ns: NSMapLike[K,V]) extends AnyVal {
//      /**
//       * Returns the object with the specified key.
//       * @param key
//       */
//      @inline def apply(key: K): V = ns.objectForKey(key)
//    }
//  }
//}

