package cocoa.appkit

import scalanative.native._

@extern
object global {

  def NSApplicationMain(argc: Int, argv: Ptr[CString]): CInt = extern
}
