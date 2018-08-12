// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.appkit

import scala.language.experimental.macros
import scalanative.native._
import objc._
import cocoa.foundation._


@ObjC
class NSController extends NSObject with NSCoding {
  @inline def objectDidBeginEditing_(editor: id): Unit = extern
  @inline def objectDidEndEditing_(editor: id): Unit = extern
  @inline def discardEditing(): Unit = extern
  @inline def commitEditing(): BOOL = extern
  @inline def commitEditingWithDelegate_didCommitSelector_contextInfo_(delegate: id, didCommitSelector: SEL, contextInfo: Ptr[Byte]): Unit = extern
  @inline def isEditing(): BOOL = extern
}

@ObjCClass
abstract class NSControllerClass extends NSObjectClass {
}

object NSController extends NSControllerClass {
  override type InstanceType = NSController
}