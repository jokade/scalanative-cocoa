// Copyright (c) 2017. Distributed under the MIT License (see included LICENSE file).
package cocoa.appkit

import scalanative.native._
import cocoa.foundation.{BOOL, NSArray, NSInteger, NSObject, NSRange, NSString, SEL, id}

import objc._

@ObjC
trait NSControlTextEditingDelegate extends NSObject {
  @inline def control_fieldEditor_(control: NSControl, fieldEditor: NSText): BOOL = extern
  @inline def control_string_error_(control: NSControl, string: NSString, error: NSString): BOOL = extern
  @inline def control_obj_(control: NSControl, obj: id): BOOL = extern
//  @inline def control_textView_commandSelector_(control: NSControl, textView: NSTextView, commandSelector: SEL): BOOL = extern
//  @inline def control_textView_words_charRange_index_(control: NSControl, textView: NSTextView, words: NSString, charRange: NSRange, index: NSInteger): NSArray[NSString] = extern
}

