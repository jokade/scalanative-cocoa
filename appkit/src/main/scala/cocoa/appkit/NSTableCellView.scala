// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.appkit

import scalanative.native._

@ObjC
class NSTableCellView extends NSView {
  def textField: NSTextField = extern
}
