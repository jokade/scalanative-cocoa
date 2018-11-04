// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.scenekit

import cocoa.appkit.CGFloat
import cocoa.foundation.{NSCopying, NSObject, NSSecureCoding}

import scala.language.experimental.macros
import scalanative.native._
import objc._
import scala.scalanative.native.objc.runtime.BOOL

@ObjC
class SCNConstraint extends NSObject with NSCopying with NSSecureCoding { //with SCNAnimatable {
  @inline def isEnabled: BOOL = extern
  @inline def setEnabled_(enabled: BOOL): Unit = extern
  @inline def influenceFactor: CGFloat = extern
  @inline def setInfluenceFactor_(influenceFactor: CGFloat): Unit = extern
  @inline def isIncremental: BOOL = extern
  @inline def setIncremental_(incremental: BOOL): Unit = extern
}
