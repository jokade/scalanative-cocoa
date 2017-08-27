package cocoa.appkit

import cocoa.foundation.{BOOL, NSArray, NSDictionary, NSInteger, NSNotification, NSObject, NSRange, NSRect, NSString, NSUInteger, NSURL, NSValue}
import objc.runtime.{SEL, id}

import scala.language.experimental.macros
import objc.{ObjC, ObjCClass}

import scalanative.native._

@ObjC
trait NSTextViewDelegate { //extends NSTextDelegate {
  @inline def textView(textView: NSTextView, link: id, charIndex: NSUInteger): BOOL = extern
//  @inline def textView(textView: NSTextView, cell: id, cellFrame: NSRect, charIndex: NSUInteger): Unit = extern
//  @inline def textView(textView: NSTextView, cell: id, cellFrame: NSRect, charIndex: NSUInteger): Unit = extern
//  @inline def textView(view: NSTextView, cell: id, rect: NSRect, event: NSEvent, charIndex: NSUInteger): Unit = extern
//  @inline def textView(view: NSTextView, cell: id, charIndex: NSUInteger): NSArray[NSString] = extern
//  @inline def textView(view: NSTextView, cell: id, charIndex: NSUInteger, pboard: NSPasteboard, `type`: NSString): BOOL = extern
  @inline def textView(textView: NSTextView, oldSelectedCharRange: NSRange, newSelectedCharRange: NSRange): NSRange = extern
  @inline def textView(textView: NSTextView, oldSelectedCharRanges: NSValue, newSelectedCharRanges: NSValue): NSArray[NSValue] = extern
  @inline def textView(textView: NSTextView, affectedRanges: NSValue, replacementStrings: NSString): BOOL = extern
  @inline def textView(textView: NSTextView, oldTypingAttributes: id, newTypingAttributes: id): NSDictionary[NSString, NSObject] = extern
  @inline def textViewDidChangeSelection(notification: NSNotification): Unit = extern
  @inline def textViewDidChangeTypingAttributes(notification: NSNotification): Unit = extern
  @inline def textView(textView: NSTextView, tooltip: NSString, characterIndex: NSUInteger): NSString = extern
  @inline def textView(textView: NSTextView, words: NSString, charRange: NSRange, index: NSInteger): NSArray[NSString] = extern
  @inline def textView(textView: NSTextView, affectedCharRange: NSRange, replacementString: NSString): BOOL = extern
  @inline def textView(textView: NSTextView, commandSelector: SEL): BOOL = extern
  @inline def textView(textView: NSTextView, value: NSInteger, affectedCharRange: NSRange): NSInteger = extern
//  @inline def textView(view: NSTextView, menu: NSMenu, event: NSEvent, charIndex: NSUInteger): NSMenu = extern
//  @inline def textView(view: NSTextView, range: NSRange, options: id, checkingTypes: NSTextCheckingTypes): NSDictionary[NSString, id] = extern
//  @inline def textView(view: NSTextView, range: NSRange, checkingTypes: NSTextCheckingTypes, options: id, results: NSTextCheckingResult, orthography: NSOrthography, wordCount: NSInteger): NSArray[NSTextCheckingResult] = extern
//  @inline def textView(textView: NSTextView, textAttachment: NSTextAttachment, charIndex: NSUInteger): NSURL = extern
//  @inline def textView(textView: NSTextView, servicePicker: NSSharingServicePicker, items: NSArray): NSSharingServicePicker = extern
//  @inline def undoManagerForTextView(view: NSTextView): NSUndoManager = extern
//  @inline def textView(textView: NSTextView, link: id): BOOL = extern
  @inline def textView(textView: NSTextView, cell: id, cellFrame: NSRect): Unit = extern
  @inline def textView(view: NSTextView, cell: id, rect: NSRect, event: NSEvent): Unit = extern
}
