// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.scenekit

import cocoa.foundation.{NSArray, NSObject, NSString}
import de.surfice.smacrotools.debug

import scala.language.experimental.macros
import scalanative.native._
import objc._
import scala.scalanative.native.objc.runtime.BOOL

@ObjC
trait SCNActionable extends NSObject {
  @inline def runAction_(action: SCNAction): Unit = extern
  @inline def runAction_block_(action: SCNAction, block: Ptr[Byte]): Unit = extern
  @inline def runAction_key_(action: SCNAction, key: NSString): Unit = extern
  @inline def runAction_key_block_(action: SCNAction, key: NSString, block: Ptr[Byte]): Unit = extern
  @inline def actionForKey_(key: NSString): SCNAction = extern
  @inline def removeActionForKey_(key: NSString): Unit = extern
  @inline def removeAllActions(): Unit = extern
  @inline def hasActions(): BOOL = extern
  @inline def actionKeys(): NSArray[NSString] = extern
}


