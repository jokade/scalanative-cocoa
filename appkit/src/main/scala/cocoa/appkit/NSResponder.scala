package cocoa.appkit

import cocoa.foundation.{BOOL, NSCoder, NSCoding, NSError, NSObject, NSString}
import objc.runtime.{SEL, id}

import scala.language.experimental.macros
import objc.{ObjC, ObjCClass}

import scalanative.native._

@ObjC
class NSResponder extends NSObject with NSCoding {
//  @inline def init(): NSResponder = extern
  @inline def initWithCoder(coder: NSCoder): NSResponder = extern
  @inline def tryToPerform(anAction: SEL, anObject: id): BOOL = extern
  @inline def performKeyEquivalent(theEvent: NSEvent): BOOL = extern
  @inline def validRequestorForSendType(sendType: NSString, returnType: NSString): id = extern
  @inline def mouseDown(theEvent: NSEvent): Unit = extern
  @inline def rightMouseDown(theEvent: NSEvent): Unit = extern
  @inline def otherMouseDown(theEvent: NSEvent): Unit = extern
  @inline def mouseUp(theEvent: NSEvent): Unit = extern
  @inline def rightMouseUp(theEvent: NSEvent): Unit = extern
  @inline def otherMouseUp(theEvent: NSEvent): Unit = extern
  @inline def mouseMoved(theEvent: NSEvent): Unit = extern
  @inline def mouseDragged(theEvent: NSEvent): Unit = extern
  @inline def scrollWheel(theEvent: NSEvent): Unit = extern
  @inline def rightMouseDragged(theEvent: NSEvent): Unit = extern
  @inline def otherMouseDragged(theEvent: NSEvent): Unit = extern
  @inline def mouseEntered(theEvent: NSEvent): Unit = extern
  @inline def mouseExited(theEvent: NSEvent): Unit = extern
  @inline def keyDown(theEvent: NSEvent): Unit = extern
  @inline def keyUp(theEvent: NSEvent): Unit = extern
  @inline def flagsChanged(theEvent: NSEvent): Unit = extern
  @inline def tabletPoint(theEvent: NSEvent): Unit = extern
  @inline def tabletProximity(theEvent: NSEvent): Unit = extern
  @inline def cursorUpdate(event: NSEvent): Unit = extern
  @inline def magnifyWithEvent(event: NSEvent): Unit = extern
  @inline def rotateWithEvent(event: NSEvent): Unit = extern
  @inline def swipeWithEvent(event: NSEvent): Unit = extern
  @inline def beginGestureWithEvent(event: NSEvent): Unit = extern
  @inline def endGestureWithEvent(event: NSEvent): Unit = extern
  @inline def smartMagnifyWithEvent(event: NSEvent): Unit = extern
  @inline def touchesBeganWithEvent(event: NSEvent): Unit = extern
  @inline def touchesMovedWithEvent(event: NSEvent): Unit = extern
  @inline def touchesEndedWithEvent(event: NSEvent): Unit = extern
  @inline def touchesCancelledWithEvent(event: NSEvent): Unit = extern
  @inline def quickLookWithEvent(event: NSEvent): Unit = extern
  @inline def pressureChangeWithEvent(event: NSEvent): Unit = extern
  @inline def noResponderFor(eventSelector: SEL): Unit = extern
  @inline def becomeFirstResponder(): BOOL = extern
  @inline def resignFirstResponder(): BOOL = extern
  @inline def interpretKeyEvents(eventArray: NSEvent): Unit = extern
  @inline def flushBufferedKeyEvents(): Unit = extern
  @inline def showContextHelp(sender: id): Unit = extern
  @inline def helpRequested(eventPtr: NSEvent): Unit = extern
  @inline def shouldBeTreatedAsInkEvent(theEvent: NSEvent): BOOL = extern
//  @inline def wantsScrollEventsForSwipeTrackingOnAxis(axis: NSEventGestureAxis): BOOL = extern
//  @inline def wantsForwardedScrollEventsForAxis(axis: NSEventGestureAxis): BOOL = extern
  @inline def supplementalTargetForAction(action: SEL, sender: id): id = extern
  @inline def nextResponder(): NSResponder = extern
  @inline def setNextResponder(nextResponder: NSResponder): Unit = extern
  @inline def acceptsFirstResponder(): BOOL = extern
//  @inline def menu(): NSMenu = extern
//  @inline def setMenu(menu: NSMenu): Unit = extern
  @inline def insertText(insertString: id): Unit = extern
  @inline def doCommandBySelector(aSelector: SEL): Unit = extern
  @inline def moveForward(sender: id): Unit = extern
  @inline def moveRight(sender: id): Unit = extern
  @inline def moveBackward(sender: id): Unit = extern
  @inline def moveLeft(sender: id): Unit = extern
  @inline def moveUp(sender: id): Unit = extern
  @inline def moveDown(sender: id): Unit = extern
  @inline def moveWordForward(sender: id): Unit = extern
  @inline def moveWordBackward(sender: id): Unit = extern
  @inline def moveToBeginningOfLine(sender: id): Unit = extern
  @inline def moveToEndOfLine(sender: id): Unit = extern
  @inline def moveToBeginningOfParagraph(sender: id): Unit = extern
  @inline def moveToEndOfParagraph(sender: id): Unit = extern
  @inline def moveToEndOfDocument(sender: id): Unit = extern
  @inline def moveToBeginningOfDocument(sender: id): Unit = extern
  @inline def pageDown(sender: id): Unit = extern
  @inline def pageUp(sender: id): Unit = extern
  @inline def centerSelectionInVisibleArea(sender: id): Unit = extern
  @inline def moveBackwardAndModifySelection(sender: id): Unit = extern
  @inline def moveForwardAndModifySelection(sender: id): Unit = extern
  @inline def moveWordForwardAndModifySelection(sender: id): Unit = extern
  @inline def moveWordBackwardAndModifySelection(sender: id): Unit = extern
  @inline def moveUpAndModifySelection(sender: id): Unit = extern
  @inline def moveDownAndModifySelection(sender: id): Unit = extern
  @inline def moveToBeginningOfLineAndModifySelection(sender: id): Unit = extern
  @inline def moveToEndOfLineAndModifySelection(sender: id): Unit = extern
  @inline def moveToBeginningOfParagraphAndModifySelection(sender: id): Unit = extern
  @inline def moveToEndOfParagraphAndModifySelection(sender: id): Unit = extern
  @inline def moveToEndOfDocumentAndModifySelection(sender: id): Unit = extern
  @inline def moveToBeginningOfDocumentAndModifySelection(sender: id): Unit = extern
  @inline def pageDownAndModifySelection(sender: id): Unit = extern
  @inline def pageUpAndModifySelection(sender: id): Unit = extern
  @inline def moveParagraphForwardAndModifySelection(sender: id): Unit = extern
  @inline def moveParagraphBackwardAndModifySelection(sender: id): Unit = extern
  @inline def moveWordRight(sender: id): Unit = extern
  @inline def moveWordLeft(sender: id): Unit = extern
  @inline def moveRightAndModifySelection(sender: id): Unit = extern
  @inline def moveLeftAndModifySelection(sender: id): Unit = extern
  @inline def moveWordRightAndModifySelection(sender: id): Unit = extern
  @inline def moveWordLeftAndModifySelection(sender: id): Unit = extern
  @inline def moveToLeftEndOfLine(sender: id): Unit = extern
  @inline def moveToRightEndOfLine(sender: id): Unit = extern
  @inline def moveToLeftEndOfLineAndModifySelection(sender: id): Unit = extern
  @inline def moveToRightEndOfLineAndModifySelection(sender: id): Unit = extern
  @inline def scrollPageUp(sender: id): Unit = extern
  @inline def scrollPageDown(sender: id): Unit = extern
  @inline def scrollLineUp(sender: id): Unit = extern
  @inline def scrollLineDown(sender: id): Unit = extern
  @inline def scrollToBeginningOfDocument(sender: id): Unit = extern
  @inline def scrollToEndOfDocument(sender: id): Unit = extern
  @inline def transpose(sender: id): Unit = extern
  @inline def transposeWords(sender: id): Unit = extern
  @inline def selectAll(sender: id): Unit = extern
  @inline def selectParagraph(sender: id): Unit = extern
  @inline def selectLine(sender: id): Unit = extern
  @inline def selectWord(sender: id): Unit = extern
  @inline def indent(sender: id): Unit = extern
  @inline def insertTab(sender: id): Unit = extern
  @inline def insertBacktab(sender: id): Unit = extern
  @inline def insertNewline(sender: id): Unit = extern
  @inline def insertParagraphSeparator(sender: id): Unit = extern
  @inline def insertNewlineIgnoringFieldEditor(sender: id): Unit = extern
  @inline def insertTabIgnoringFieldEditor(sender: id): Unit = extern
  @inline def insertLineBreak(sender: id): Unit = extern
  @inline def insertContainerBreak(sender: id): Unit = extern
  @inline def insertSingleQuoteIgnoringSubstitution(sender: id): Unit = extern
  @inline def insertDoubleQuoteIgnoringSubstitution(sender: id): Unit = extern
  @inline def changeCaseOfLetter(sender: id): Unit = extern
  @inline def uppercaseWord(sender: id): Unit = extern
  @inline def lowercaseWord(sender: id): Unit = extern
  @inline def capitalizeWord(sender: id): Unit = extern
  @inline def deleteForward(sender: id): Unit = extern
  @inline def deleteBackward(sender: id): Unit = extern
  @inline def deleteBackwardByDecomposingPreviousCharacter(sender: id): Unit = extern
  @inline def deleteWordForward(sender: id): Unit = extern
  @inline def deleteWordBackward(sender: id): Unit = extern
  @inline def deleteToBeginningOfLine(sender: id): Unit = extern
  @inline def deleteToEndOfLine(sender: id): Unit = extern
  @inline def deleteToBeginningOfParagraph(sender: id): Unit = extern
  @inline def deleteToEndOfParagraph(sender: id): Unit = extern
  @inline def yank(sender: id): Unit = extern
  @inline def complete(sender: id): Unit = extern
  @inline def setMark(sender: id): Unit = extern
  @inline def deleteToMark(sender: id): Unit = extern
  @inline def selectToMark(sender: id): Unit = extern
  @inline def swapWithMark(sender: id): Unit = extern
  @inline def cancelOperation(sender: id): Unit = extern
  @inline def makeBaseWritingDirectionNatural(sender: id): Unit = extern
  @inline def makeBaseWritingDirectionLeftToRight(sender: id): Unit = extern
  @inline def makeBaseWritingDirectionRightToLeft(sender: id): Unit = extern
  @inline def makeTextWritingDirectionNatural(sender: id): Unit = extern
  @inline def makeTextWritingDirectionLeftToRight(sender: id): Unit = extern
  @inline def makeTextWritingDirectionRightToLeft(sender: id): Unit = extern
  @inline def quickLookPreviewItems(sender: id): Unit = extern
//  @inline def undoManager(): NSUndoManager = extern
  @inline def validateProposedFirstResponder(responder: NSResponder, event: NSEvent): BOOL = extern
  @inline def presentError(error: NSError, window: NSWindow, delegate: id, didPresentSelector: SEL, contextInfo: Ptr[Byte]): Unit = extern
  @inline def presentError(error: NSError): BOOL = extern
  @inline def willPresentError(error: NSError): NSError = extern
  @inline def performTextFinderAction(sender: id): Unit = extern
  @inline def performMnemonic(theString: NSString): BOOL = extern
}


//@ObjCClass
//abstract class NSResponderClass extends {
//}
//
//object NSResponder extends NSResponderClass {
//  override type InstanceType = NSResponder
//}