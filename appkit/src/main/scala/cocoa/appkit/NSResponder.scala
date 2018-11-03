// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.appkit

import cocoa.foundation.{BOOL, NSCoding, NSError, NSObject, NSString, SEL, id}

import scala.scalanative.native._
import scala.scalanative.native.objc._


@ObjC
class NSResponder extends NSObject with NSCoding {
  @inline def tryToPerform_object_(action: SEL, `object`: id): BOOL = extern
  @inline def performKeyEquivalent_(event: NSEvent): BOOL = extern
//  @inline def validRequestorForSendType_returnType_(sendType: NSPasteboardType, returnType: NSPasteboardType): id = extern
  @inline def mouseDown_(event: NSEvent): Unit = extern
  @inline def rightMouseDown_(event: NSEvent): Unit = extern
  @inline def otherMouseDown_(event: NSEvent): Unit = extern
  @inline def mouseUp_(event: NSEvent): Unit = extern
  @inline def rightMouseUp_(event: NSEvent): Unit = extern
  @inline def otherMouseUp_(event: NSEvent): Unit = extern
  @inline def mouseMoved_(event: NSEvent): Unit = extern
  @inline def mouseDragged_(event: NSEvent): Unit = extern
  @inline def scrollWheel_(event: NSEvent): Unit = extern
  @inline def rightMouseDragged_(event: NSEvent): Unit = extern
  @inline def otherMouseDragged_(event: NSEvent): Unit = extern
  @inline def mouseEntered_(event: NSEvent): Unit = extern
  @inline def mouseExited_(event: NSEvent): Unit = extern
  @inline def keyDown_(event: NSEvent): Unit = extern
  @inline def keyUp_(event: NSEvent): Unit = extern
  @inline def flagsChanged_(event: NSEvent): Unit = extern
  @inline def tabletPoint_(event: NSEvent): Unit = extern
  @inline def tabletProximity_(event: NSEvent): Unit = extern
  @inline def cursorUpdate_(event: NSEvent): Unit = extern
  @inline def magnifyWithEvent_(event: NSEvent): Unit = extern
  @inline def rotateWithEvent_(event: NSEvent): Unit = extern
  @inline def swipeWithEvent_(event: NSEvent): Unit = extern
  @inline def beginGestureWithEvent_(event: NSEvent): Unit = extern
  @inline def endGestureWithEvent_(event: NSEvent): Unit = extern
  @inline def smartMagnifyWithEvent_(event: NSEvent): Unit = extern
  @inline def touchesBeganWithEvent_(event: NSEvent): Unit = extern
  @inline def touchesMovedWithEvent_(event: NSEvent): Unit = extern
  @inline def touchesEndedWithEvent_(event: NSEvent): Unit = extern
  @inline def touchesCancelledWithEvent_(event: NSEvent): Unit = extern
  @inline def quickLookWithEvent_(event: NSEvent): Unit = extern
  @inline def pressureChangeWithEvent_(event: NSEvent): Unit = extern
  @inline def noResponderFor_(eventSelector: SEL): Unit = extern
  @inline def becomeFirstResponder(): BOOL = extern
  @inline def resignFirstResponder(): BOOL = extern
  @inline def interpretKeyEvents_(eventArray: NSEvent): Unit = extern
  @inline def flushBufferedKeyEvents(): Unit = extern
  @inline def showContextHelp_(sender: id): Unit = extern
  @inline def helpRequested_(eventPtr: NSEvent): Unit = extern
  @inline def shouldBeTreatedAsInkEvent_(event: NSEvent): BOOL = extern
//  @inline def wantsScrollEventsForSwipeTrackingOnAxis_(axis: NSEventGestureAxis): BOOL = extern
//  @inline def wantsForwardedScrollEventsForAxis_(axis: NSEventGestureAxis): BOOL = extern
  @inline def supplementalTargetForAction_sender_(action: SEL, sender: id): id = extern
  @inline def nextResponder(): NSResponder = extern
  @inline def setNextResponder_(nextResponder: NSResponder): Unit = extern
  @inline def acceptsFirstResponder(): BOOL = extern
//  @inline def menu(): NSMenu = extern
//  @inline def setMenu_(menu: NSMenu): Unit = extern
  @inline def insertText_(insertString: id): Unit = extern
  @inline def doCommandBySelector_(selector: SEL): Unit = extern
  @inline def moveForward_(sender: id): Unit = extern
  @inline def moveRight_(sender: id): Unit = extern
  @inline def moveBackward_(sender: id): Unit = extern
  @inline def moveLeft_(sender: id): Unit = extern
  @inline def moveUp_(sender: id): Unit = extern
  @inline def moveDown_(sender: id): Unit = extern
  @inline def moveWordForward_(sender: id): Unit = extern
  @inline def moveWordBackward_(sender: id): Unit = extern
  @inline def moveToBeginningOfLine_(sender: id): Unit = extern
  @inline def moveToEndOfLine_(sender: id): Unit = extern
  @inline def moveToBeginningOfParagraph_(sender: id): Unit = extern
  @inline def moveToEndOfParagraph_(sender: id): Unit = extern
  @inline def moveToEndOfDocument_(sender: id): Unit = extern
  @inline def moveToBeginningOfDocument_(sender: id): Unit = extern
  @inline def pageDown_(sender: id): Unit = extern
  @inline def pageUp_(sender: id): Unit = extern
  @inline def centerSelectionInVisibleArea_(sender: id): Unit = extern
  @inline def moveBackwardAndModifySelection_(sender: id): Unit = extern
  @inline def moveForwardAndModifySelection_(sender: id): Unit = extern
  @inline def moveWordForwardAndModifySelection_(sender: id): Unit = extern
  @inline def moveWordBackwardAndModifySelection_(sender: id): Unit = extern
  @inline def moveUpAndModifySelection_(sender: id): Unit = extern
  @inline def moveDownAndModifySelection_(sender: id): Unit = extern
  @inline def moveToBeginningOfLineAndModifySelection_(sender: id): Unit = extern
  @inline def moveToEndOfLineAndModifySelection_(sender: id): Unit = extern
  @inline def moveToBeginningOfParagraphAndModifySelection_(sender: id): Unit = extern
  @inline def moveToEndOfParagraphAndModifySelection_(sender: id): Unit = extern
  @inline def moveToEndOfDocumentAndModifySelection_(sender: id): Unit = extern
  @inline def moveToBeginningOfDocumentAndModifySelection_(sender: id): Unit = extern
  @inline def pageDownAndModifySelection_(sender: id): Unit = extern
  @inline def pageUpAndModifySelection_(sender: id): Unit = extern
  @inline def moveParagraphForwardAndModifySelection_(sender: id): Unit = extern
  @inline def moveParagraphBackwardAndModifySelection_(sender: id): Unit = extern
  @inline def moveWordRight_(sender: id): Unit = extern
  @inline def moveWordLeft_(sender: id): Unit = extern
  @inline def moveRightAndModifySelection_(sender: id): Unit = extern
  @inline def moveLeftAndModifySelection_(sender: id): Unit = extern
  @inline def moveWordRightAndModifySelection_(sender: id): Unit = extern
  @inline def moveWordLeftAndModifySelection_(sender: id): Unit = extern
  @inline def moveToLeftEndOfLine_(sender: id): Unit = extern
  @inline def moveToRightEndOfLine_(sender: id): Unit = extern
  @inline def moveToLeftEndOfLineAndModifySelection_(sender: id): Unit = extern
  @inline def moveToRightEndOfLineAndModifySelection_(sender: id): Unit = extern
  @inline def scrollPageUp_(sender: id): Unit = extern
  @inline def scrollPageDown_(sender: id): Unit = extern
  @inline def scrollLineUp_(sender: id): Unit = extern
  @inline def scrollLineDown_(sender: id): Unit = extern
  @inline def scrollToBeginningOfDocument_(sender: id): Unit = extern
  @inline def scrollToEndOfDocument_(sender: id): Unit = extern
  @inline def transpose_(sender: id): Unit = extern
  @inline def transposeWords_(sender: id): Unit = extern
  @inline def selectAll_(sender: id): Unit = extern
  @inline def selectParagraph_(sender: id): Unit = extern
  @inline def selectLine_(sender: id): Unit = extern
  @inline def selectWord_(sender: id): Unit = extern
  @inline def indent_(sender: id): Unit = extern
  @inline def insertTab_(sender: id): Unit = extern
  @inline def insertBacktab_(sender: id): Unit = extern
  @inline def insertNewline_(sender: id): Unit = extern
  @inline def insertParagraphSeparator_(sender: id): Unit = extern
  @inline def insertNewlineIgnoringFieldEditor_(sender: id): Unit = extern
  @inline def insertTabIgnoringFieldEditor_(sender: id): Unit = extern
  @inline def insertLineBreak_(sender: id): Unit = extern
  @inline def insertContainerBreak_(sender: id): Unit = extern
  @inline def insertSingleQuoteIgnoringSubstitution_(sender: id): Unit = extern
  @inline def insertDoubleQuoteIgnoringSubstitution_(sender: id): Unit = extern
  @inline def changeCaseOfLetter_(sender: id): Unit = extern
  @inline def uppercaseWord_(sender: id): Unit = extern
  @inline def lowercaseWord_(sender: id): Unit = extern
  @inline def capitalizeWord_(sender: id): Unit = extern
  @inline def deleteForward_(sender: id): Unit = extern
  @inline def deleteBackward_(sender: id): Unit = extern
  @inline def deleteBackwardByDecomposingPreviousCharacter_(sender: id): Unit = extern
  @inline def deleteWordForward_(sender: id): Unit = extern
  @inline def deleteWordBackward_(sender: id): Unit = extern
  @inline def deleteToBeginningOfLine_(sender: id): Unit = extern
  @inline def deleteToEndOfLine_(sender: id): Unit = extern
  @inline def deleteToBeginningOfParagraph_(sender: id): Unit = extern
  @inline def deleteToEndOfParagraph_(sender: id): Unit = extern
  @inline def yank_(sender: id): Unit = extern
  @inline def complete_(sender: id): Unit = extern
  @inline def setMark_(sender: id): Unit = extern
  @inline def deleteToMark_(sender: id): Unit = extern
  @inline def selectToMark_(sender: id): Unit = extern
  @inline def swapWithMark_(sender: id): Unit = extern
  @inline def cancelOperation_(sender: id): Unit = extern
  @inline def makeBaseWritingDirectionNatural_(sender: id): Unit = extern
  @inline def makeBaseWritingDirectionLeftToRight_(sender: id): Unit = extern
  @inline def makeBaseWritingDirectionRightToLeft_(sender: id): Unit = extern
  @inline def makeTextWritingDirectionNatural_(sender: id): Unit = extern
  @inline def makeTextWritingDirectionLeftToRight_(sender: id): Unit = extern
  @inline def makeTextWritingDirectionRightToLeft_(sender: id): Unit = extern
  @inline def quickLookPreviewItems_(sender: id): Unit = extern
//  @inline def undoManager(): NSUndoManager = extern
  @inline def validateProposedFirstResponder_event_(responder: NSResponder, event: NSEvent): BOOL = extern
//  @inline def presentError_window_delegate_didPresentSelector_contextInfo_(error: NSError, window: NSWindow, delegate: id, didPresentSelector: SEL, contextInfo: Ptr[Byte]): Unit = extern
  @inline def presentError_(error: NSError): BOOL = extern
  @inline def willPresentError_(error: NSError): NSError = extern
  @inline def performTextFinderAction_(sender: id): Unit = extern
  @inline def newWindowForTab_(sender: id): Unit = extern
  @inline def performMnemonic_(string: NSString): BOOL = extern
}



//@ObjCClass
//abstract class NSResponderClass extends {
//}
//
//object NSResponder extends NSResponderClass {
//  override type InstanceType = NSResponder
//}