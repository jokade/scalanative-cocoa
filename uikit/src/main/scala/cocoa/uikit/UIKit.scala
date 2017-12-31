// Copyright (c) 2017. Distributed under the MIT License (see included LICENSE file).
package cocoa.uikit

import scalanative.native._
import cocoa.foundation.{BOOL, NSString}

@extern
object UIKit {

//  def UIInterfaceOrientationIsPortrait(orientation: UIInterfaceOrientation): BOOL = extern
//  def UIInterfaceOrientationIsLandscape(orientation: UIInterfaceOrientation): BOOL = extern
  def UIApplicationMain(argc: CInt, argv: Ptr[CString], principalClassName: NSString, delegateClassName: NSString): CInt = extern
}
