package cocoa.uikit

import cocoa.foundation._
import scalanative.native._
import objc._
import de.surfice.smacrotools.debug

@ObjC
@debug
class UILabel extends NSObject {
  def setText(t: NSString): Unit = extern
}
