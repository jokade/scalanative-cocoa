// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.appkit

import cocoa.foundation.{NSInteger, NSObject, NSString, NSUInteger, id}

import scalanative.native._


@ObjC
trait NSComboBoxDataSource extends NSObject {
  @inline def numberOfItemsInComboBox(aComboBox: NSComboBox): NSInteger = extern
  @inline def comboBox(aComboBox: NSComboBox, index: NSInteger): id = extern
  @inline def comboBox(aComboBox: NSComboBox, string: NSString): NSUInteger = extern
//  @inline def comboBox(aComboBox: NSComboBox, string: NSString): NSString = extern
}
