//     Project: scalanative-cocoa
//      Module: Foundation / Scala converters
// Description:
// Copyright (c) 2017. Distributed under the MIT License (see included LICENSE file).
package cocoa.foundation.convert

private[convert] trait Decorators {

  class AsScala[T](op: =>T) {
    /** Converts a Foundation collection to the corresponding Scala collection */
    def asScala: T = op
  }
}

private[convert] object Decorators extends Decorators
