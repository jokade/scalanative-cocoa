// Copyright (c) 2017. Distributed under the MIT License (see included LICENSE file).
package cocoa.appkit

import cocoa.foundation.{BOOL, NSArray, NSInteger, NSObject, NSRange, NSString}
import objc.runtime.{SEL, id}

import scala.language.experimental.macros
import objc.{ObjC, ObjCClass}

import scalanative.native._

@ObjC
trait NSControlTextEditingDelegate extends NSObject {
//  @inline def control(control: NSControl, fieldEditor: NSText): BOOL = extern
//  @inline def control(control: NSControl, fieldEditor: NSText): BOOL = extern
  @inline def control(control: NSControl, string: NSString, error: NSString): Unit = extern
  @inline def control(control: NSControl, obj: id): BOOL = extern
//  @inline def control(control: NSControl, textView: NSTextView, commandSelector: SEL): BOOL = extern
//  @inline def control(control: NSControl, textView: NSTextView, words: NSString, charRange: NSRange, index: NSInteger): NSArray[NSString] = extern
}
