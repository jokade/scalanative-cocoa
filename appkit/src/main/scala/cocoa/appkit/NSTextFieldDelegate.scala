// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.appkit

import cocoa.foundation.{BOOL, NSUInteger}

import scala.language.experimental.macros
import scalanative.native._
import objc._


@ObjC
trait NSTextFieldDelegate extends NSControlTextEditingDelegate {
//  @inline def textField_textView_selectedRange_(textField: NSTextField, textView: NSTextView, selectedRange: NSRange): NSArray = extern
//  @inline def textField_textView_candidates_selectedRange_(textField: NSTextField, textView: NSTextView, candidates: NSTextCheckingResult, selectedRange: NSRange): NSArray[NSTextCheckingResult] = extern
//  @inline def textField_textView_index_(textField: NSTextField, textView: NSTextView, index: NSUInteger): BOOL = extern
}
