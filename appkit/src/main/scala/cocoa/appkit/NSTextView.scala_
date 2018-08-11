// Copyright (c) 2017. Distributed under the MIT License (see included LICENSE file).
package cocoa.appkit

import scalanative.native._
import cocoa.foundation.{BOOL, NSArray, NSCoder, NSDictionary, NSInteger, NSObject, NSObjectClass, NSPoint, NSRange, NSRect, NSSize, NSString, NSUInteger, NSValue}
import objc.runtime.id

import scala.language.experimental.macros

@ObjC
class NSTextView extends NSText { //with NSUserInterfaceValidations with NSTextInputClient with NSTextLayoutOrientationProvider with NSDraggingSource with NSTextInput with NSAccessibilityNavigableStaticText {
//  @inline def initWithFrame(frameRect: NSRect, container: NSTextContainer): NSTextView = extern
//  @inline def replaceTextContainer(newContainer: NSTextContainer): Unit = extern
  @inline def invalidateTextContainerOrigin(): Unit = extern
  @inline def setConstrainedFrameSize(desiredSize: NSSize): Unit = extern
  @inline def setAlignment(alignment: NSTextAlignment, range: NSRange): Unit = extern
  @inline def setBaseWritingDirection(writingDirection: NSWritingDirection, range: NSRange): Unit = extern
  @inline def turnOffKerning(sender: id): Unit = extern
  @inline def tightenKerning(sender: id): Unit = extern
  @inline def loosenKerning(sender: id): Unit = extern
  @inline def useStandardKerning(sender: id): Unit = extern
  @inline def turnOffLigatures(sender: id): Unit = extern
  @inline def useStandardLigatures(sender: id): Unit = extern
  @inline def useAllLigatures(sender: id): Unit = extern
  @inline def raiseBaseline(sender: id): Unit = extern
  @inline def lowerBaseline(sender: id): Unit = extern
  @inline def toggleTraditionalCharacterShape(sender: id): Unit = extern
  @inline def outline(sender: id): Unit = extern
  @inline def performFindPanelAction(sender: id): Unit = extern
  @inline def alignJustified(sender: id): Unit = extern
  @inline def changeColor(sender: id): Unit = extern
  @inline def changeAttributes(sender: id): Unit = extern
  @inline def changeDocumentBackgroundColor(sender: id): Unit = extern
  @inline def orderFrontSpacingPanel(sender: id): Unit = extern
  @inline def orderFrontLinkPanel(sender: id): Unit = extern
  @inline def orderFrontListPanel(sender: id): Unit = extern
  @inline def orderFrontTablePanel(sender: id): Unit = extern
//  @inline def rulerView(ruler: NSRulerView, marker: NSRulerMarker): Unit = extern
//  @inline def rulerView(ruler: NSRulerView, marker: NSRulerMarker): Unit = extern
//  @inline def rulerView(ruler: NSRulerView, marker: NSRulerMarker): Unit = extern
//  @inline def rulerView(ruler: NSRulerView, marker: NSRulerMarker): BOOL = extern
//  @inline def rulerView(ruler: NSRulerView, marker: NSRulerMarker): BOOL = extern
//  @inline def rulerView(ruler: NSRulerView, marker: NSRulerMarker, location: CGFloat): CGFloat = extern
//  @inline def rulerView(ruler: NSRulerView, marker: NSRulerMarker): BOOL = extern
//  @inline def rulerView(ruler: NSRulerView, marker: NSRulerMarker, location: CGFloat): CGFloat = extern
//  @inline def rulerView(ruler: NSRulerView, event: NSEvent): Unit = extern
  @inline def setNeedsDisplayInRect(rect: NSRect, flag: BOOL): Unit = extern
//  @inline def drawInsertionPointInRect(rect: NSRect, color: NSColor, flag: BOOL): Unit = extern
  @inline def drawViewBackgroundInRect(rect: NSRect): Unit = extern
  @inline def updateRuler(): Unit = extern
  @inline def updateFontPanel(): Unit = extern
  @inline def updateDragTypeRegistration(): Unit = extern
//  @inline def selectionRangeForProposedRange(proposedCharRange: NSRange, granularity: NSSelectionGranularity): NSRange = extern
  @inline def clickedOnLink(link: id, charIndex: NSUInteger): Unit = extern
  @inline def startSpeaking(sender: id): Unit = extern
  @inline def stopSpeaking(sender: id): Unit = extern
//  @inline def setLayoutOrientation(theOrientation: NSTextLayoutOrientation): Unit = extern
  @inline def changeLayoutOrientation(sender: id): Unit = extern
  @inline def characterIndexForInsertionAtPoint(point: NSPoint): NSUInteger = extern
//  @inline def textContainer(): NSTextContainer = extern
//  @inline def setTextContainer(textContainer: NSTextContainer): Unit = extern
  @inline def textContainerInset(): NSSize = extern
  @inline def setTextContainerInset(textContainerInset: NSSize): Unit = extern
  @inline def textContainerOrigin(): NSPoint = extern
//  @inline def layoutManager(): NSLayoutManager = extern
//  @inline def textStorage(): NSTextStorage = extern
  @inline def shouldDrawInsertionPoint(): BOOL = extern
  @inline def completionsForPartialWordRange(charRange: NSRange, index: NSInteger): NSArray[NSString] = extern
  @inline def insertCompletion(word: NSString, charRange: NSRange, movement: NSInteger, flag: BOOL): Unit = extern
  @inline def rangeForUserCompletion(): NSRange = extern
//  @inline def writeSelectionToPasteboard(pboard: NSPasteboard, `type`: NSString): BOOL = extern
//  @inline def writeSelectionToPasteboard(pboard: NSPasteboard, types: NSString): BOOL = extern
  @inline def preferredPasteboardTypeFromArray(availableTypes: NSString, allowedTypes: NSString): NSString = extern
//  @inline def readSelectionFromPasteboard(pboard: NSPasteboard, `type`: NSString): BOOL = extern
//  @inline def readSelectionFromPasteboard(pboard: NSPasteboard): BOOL = extern
  @inline def pasteAsPlainText(sender: id): Unit = extern
  @inline def pasteAsRichText(sender: id): Unit = extern
  @inline def writablePasteboardTypes(): NSArray[NSString] = extern
  @inline def readablePasteboardTypes(): NSArray[NSString] = extern
  @inline def dragSelectionWithEvent(event: NSEvent, mouseOffset: NSSize, slideBack: BOOL): BOOL = extern
//  @inline def dragImageForSelectionWithEvent(event: NSEvent, origin: NSPointPointer): NSImage = extern
//  @inline def dragOperationForDraggingInfo(dragInfo: id, `type`: NSString): NSDragOperation = extern
  @inline def cleanUpAfterDragOperation(): Unit = extern
  @inline def acceptableDragTypes(): NSArray[NSString] = extern
//  @inline def setSelectedRanges(ranges: NSValue, affinity: NSSelectionAffinity, stillSelectingFlag: BOOL): Unit = extern
//  @inline def setSelectedRange(charRange: NSRange, affinity: NSSelectionAffinity, stillSelectingFlag: BOOL): Unit = extern
  @inline def updateInsertionPointStateAndRestartTimer(restartFlag: BOOL): Unit = extern
  @inline def toggleContinuousSpellChecking(sender: id): Unit = extern
  @inline def toggleGrammarChecking(sender: id): Unit = extern
  @inline def setSpellingState(value: NSInteger, charRange: NSRange): Unit = extern
  @inline def shouldChangeTextInRanges(affectedRanges: NSValue, replacementStrings: NSString): BOOL = extern
  @inline def shouldChangeTextInRange(affectedCharRange: NSRange, replacementString: NSString): BOOL = extern
  @inline def didChangeText(): Unit = extern
  @inline def breakUndoCoalescing(): Unit = extern
  @inline def showFindIndicatorForRange(charRange: NSRange): Unit = extern
  @inline def selectedRanges(): NSArray[NSValue] = extern
  @inline def setSelectedRanges(selectedRanges: NSArray[NSValue]): Unit = extern
//  @inline def selectionAffinity(): NSSelectionAffinity = extern
//  @inline def selectionGranularity(): NSSelectionGranularity = extern
//  @inline def setSelectionGranularity(selectionGranularity: NSSelectionGranularity): Unit = extern
  @inline def selectedTextAttributes(): NSDictionary[NSString, NSObject] = extern
  @inline def setSelectedTextAttributes(selectedTextAttributes: NSDictionary[NSString, NSObject]): Unit = extern
//  @inline def insertionPointColor(): NSColor = extern
//  @inline def setInsertionPointColor(insertionPointColor: NSColor): Unit = extern
  @inline def markedTextAttributes(): NSDictionary[NSString, NSObject] = extern
  @inline def setMarkedTextAttributes(markedTextAttributes: NSDictionary[NSString, NSObject]): Unit = extern
  @inline def linkTextAttributes(): NSDictionary[NSString, NSObject] = extern
  @inline def setLinkTextAttributes(linkTextAttributes: NSDictionary[NSString, NSObject]): Unit = extern
  @inline def displaysLinkToolTips(): BOOL = extern
  @inline def setDisplaysLinkToolTips(displaysLinkToolTips: BOOL): Unit = extern
  @inline def acceptsGlyphInfo(): BOOL = extern
  @inline def setAcceptsGlyphInfo(acceptsGlyphInfo: BOOL): Unit = extern
  @inline def usesRuler(): BOOL = extern
  @inline def setUsesRuler(usesRuler: BOOL): Unit = extern
  @inline def usesInspectorBar(): BOOL = extern
  @inline def setUsesInspectorBar(usesInspectorBar: BOOL): Unit = extern
  @inline def isContinuousSpellCheckingEnabled(): BOOL = extern
  @inline def setContinuousSpellCheckingEnabled(continuousSpellCheckingEnabled: BOOL): Unit = extern
  @inline def spellCheckerDocumentTag(): NSInteger = extern
  @inline def isGrammarCheckingEnabled(): BOOL = extern
  @inline def setGrammarCheckingEnabled(grammarCheckingEnabled: BOOL): Unit = extern
  @inline def typingAttributes(): NSDictionary[NSString, NSObject] = extern
  @inline def setTypingAttributes(typingAttributes: NSDictionary[NSString, NSObject]): Unit = extern
  @inline def rangesForUserTextChange(): NSArray[NSValue] = extern
  @inline def rangesForUserCharacterAttributeChange(): NSArray[NSValue] = extern
  @inline def rangesForUserParagraphAttributeChange(): NSArray[NSValue] = extern
  @inline def rangeForUserTextChange(): NSRange = extern
  @inline def rangeForUserCharacterAttributeChange(): NSRange = extern
  @inline def rangeForUserParagraphAttributeChange(): NSRange = extern
  @inline def allowsDocumentBackgroundColorChange(): BOOL = extern
  @inline def setAllowsDocumentBackgroundColorChange(allowsDocumentBackgroundColorChange: BOOL): Unit = extern
//  @inline def defaultParagraphStyle(): NSParagraphStyle = extern
//  @inline def setDefaultParagraphStyle(defaultParagraphStyle: NSParagraphStyle): Unit = extern
  @inline def allowsUndo(): BOOL = extern
  @inline def setAllowsUndo(allowsUndo: BOOL): Unit = extern
  @inline def isCoalescingUndo(): BOOL = extern
  @inline def allowsImageEditing(): BOOL = extern
  @inline def setAllowsImageEditing(allowsImageEditing: BOOL): Unit = extern
  @inline def usesRolloverButtonForSelection(): BOOL = extern
  @inline def setUsesRolloverButtonForSelection(usesRolloverButtonForSelection: BOOL): Unit = extern
//  @inline def setBackgroundColor(backgroundColor: NSColor): Unit = extern
  @inline def setRulerVisible(rulerVisible: BOOL): Unit = extern
  @inline def allowedInputSourceLocales(): NSArray[NSString] = extern
  @inline def setAllowedInputSourceLocales(allowedInputSourceLocales: NSArray[NSString]): Unit = extern
  @inline def smartDeleteRangeForProposedRange(proposedCharRange: NSRange): NSRange = extern
  @inline def toggleSmartInsertDelete(sender: id): Unit = extern
  @inline def smartInsertForString(pasteString: NSString, charRangeToReplace: NSRange, beforeString: NSString, afterString: NSString): Unit = extern
  @inline def smartInsertBeforeStringForString(pasteString: NSString, charRangeToReplace: NSRange): NSString = extern
  @inline def smartInsertAfterStringForString(pasteString: NSString, charRangeToReplace: NSRange): NSString = extern
  @inline def toggleAutomaticQuoteSubstitution(sender: id): Unit = extern
  @inline def toggleAutomaticLinkDetection(sender: id): Unit = extern
  @inline def toggleAutomaticDataDetection(sender: id): Unit = extern
  @inline def toggleAutomaticDashSubstitution(sender: id): Unit = extern
  @inline def toggleAutomaticTextReplacement(sender: id): Unit = extern
  @inline def toggleAutomaticSpellingCorrection(sender: id): Unit = extern
//  @inline def checkTextInRange(range: NSRange, checkingTypes: NSTextCheckingTypes, options: id): Unit = extern
//  @inline def handleTextCheckingResults(results: NSTextCheckingResult, range: NSRange, checkingTypes: NSTextCheckingTypes, options: id, orthography: NSOrthography, wordCount: NSInteger): Unit = extern
  @inline def orderFrontSubstitutionsPanel(sender: id): Unit = extern
  @inline def checkTextInSelection(sender: id): Unit = extern
  @inline def checkTextInDocument(sender: id): Unit = extern
  @inline def smartInsertDeleteEnabled(): BOOL = extern
  @inline def setSmartInsertDeleteEnabled(smartInsertDeleteEnabled: BOOL): Unit = extern
  @inline def isAutomaticQuoteSubstitutionEnabled(): BOOL = extern
  @inline def setAutomaticQuoteSubstitutionEnabled(automaticQuoteSubstitutionEnabled: BOOL): Unit = extern
  @inline def isAutomaticLinkDetectionEnabled(): BOOL = extern
  @inline def setAutomaticLinkDetectionEnabled(automaticLinkDetectionEnabled: BOOL): Unit = extern
  @inline def isAutomaticDataDetectionEnabled(): BOOL = extern
  @inline def setAutomaticDataDetectionEnabled(automaticDataDetectionEnabled: BOOL): Unit = extern
  @inline def isAutomaticDashSubstitutionEnabled(): BOOL = extern
  @inline def setAutomaticDashSubstitutionEnabled(automaticDashSubstitutionEnabled: BOOL): Unit = extern
  @inline def isAutomaticTextReplacementEnabled(): BOOL = extern
  @inline def setAutomaticTextReplacementEnabled(automaticTextReplacementEnabled: BOOL): Unit = extern
  @inline def isAutomaticSpellingCorrectionEnabled(): BOOL = extern
  @inline def setAutomaticSpellingCorrectionEnabled(automaticSpellingCorrectionEnabled: BOOL): Unit = extern
//  @inline def enabledTextCheckingTypes(): NSTextCheckingTypes = extern
//  @inline def setEnabledTextCheckingTypes(enabledTextCheckingTypes: NSTextCheckingTypes): Unit = extern
  @inline def usesFindPanel(): BOOL = extern
  @inline def setUsesFindPanel(usesFindPanel: BOOL): Unit = extern
  @inline def usesFindBar(): BOOL = extern
  @inline def setUsesFindBar(usesFindBar: BOOL): Unit = extern
  @inline def isIncrementalSearchingEnabled(): BOOL = extern
  @inline def setIncrementalSearchingEnabled(incrementalSearchingEnabled: BOOL): Unit = extern
  @inline def toggleQuickLookPreviewPanel(sender: id): Unit = extern
  @inline def quickLookPreviewableItemsInRanges(ranges: NSValue): NSArray[NSObject] = extern
  @inline def updateQuickLookPreviewPanel(): Unit = extern
  @inline def orderFrontSharingServicePicker(sender: id): Unit = extern
  @inline def toggleBaseWritingDirection(sender: id): Unit = extern
}

@ObjCClass
abstract class NSTextViewClass extends NSObjectClass {
  @inline def registerForServices(): Unit = extern
}

object NSTextView extends NSTextViewClass {
  override type InstanceType = NSTextView
}