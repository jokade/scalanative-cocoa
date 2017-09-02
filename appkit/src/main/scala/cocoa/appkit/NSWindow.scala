package cocoa.appkit

import cocoa.foundation.{BOOL, NSArray, NSData, NSDictionary, NSInteger, NSNumber, NSObject, NSObjectClass, NSPoint, NSRect, NSSize, NSString, NSUInteger, NSURL}
import objc.runtime.{SEL, id}

import scala.language.experimental.macros
import objc.{ObjC, ObjCClass}

import scalanative.native._


@ObjC
class NSWindow extends NSResponder { // with NSAnimatablePropertyContainer with NSUserInterfaceValidations with NSUserInterfaceItemIdentification with NSAppearanceCustomization with NSAccessibilityElement with NSAccessibility {
  @inline def frameRectForContentRect(contentRect: NSRect): NSRect = extern
  @inline def contentRectForFrameRect(frameRect: NSRect): NSRect = extern
//  @inline def initWithContentRect(contentRect: NSRect, aStyle: NSUInteger, bufferingType: NSBackingStoreType, flag: BOOL): NSWindow = extern
//  @inline def initWithContentRect(contentRect: NSRect, aStyle: NSUInteger, bufferingType: NSBackingStoreType, flag: BOOL, screen: NSScreen): NSWindow = extern
//  @inline def addTitlebarAccessoryViewController(childViewController: NSTitlebarAccessoryViewController): Unit = extern
//  @inline def insertTitlebarAccessoryViewController(childViewController: NSTitlebarAccessoryViewController, index: NSInteger): Unit = extern
  @inline def removeTitlebarAccessoryViewControllerAtIndex(index: NSInteger): Unit = extern
  @inline def setTitleWithRepresentedFilename(filename: NSString): Unit = extern
  @inline def setStyleMask(styleMask: NSUInteger): Unit = extern
//  @inline def fieldEditor(createFlag: BOOL, anObject: id): NSText = extern
  @inline def endEditingFor(anObject: id): Unit = extern
//  @inline def constrainFrameRect(frameRect: NSRect, screen: NSScreen): NSRect = extern
  @inline def setFrame(frameRect: NSRect, flag: BOOL): Unit = extern
  @inline def setContentSize(aSize: NSSize): Unit = extern
  @inline def setFrameOrigin(aPoint: NSPoint): Unit = extern
  @inline def setFrameTopLeftPoint(aPoint: NSPoint): Unit = extern
  @inline def cascadeTopLeftFromPoint(topLeftPoint: NSPoint): NSPoint = extern
//  @inline def animationResizeTime(newFrame: NSRect): NSTimeInterval = extern
  @inline def setFrame(frameRect: NSRect, displayFlag: BOOL, animateFlag: BOOL): Unit = extern
  @inline def disableFlushWindow(): Unit = extern
  @inline def enableFlushWindow(): Unit = extern
  @inline def flushWindow(): Unit = extern
  @inline def flushWindowIfNeeded(): Unit = extern
  @inline def displayIfNeeded(): Unit = extern
  @inline def display(): Unit = extern
  @inline def update(): Unit = extern
  @inline def makeFirstResponder(aResponder: NSResponder): BOOL = extern
  @inline def close(): Unit = extern
  @inline def miniaturize(sender: id): Unit = extern
  @inline def deminiaturize(sender: id): Unit = extern
  @inline def zoom(sender: id): Unit = extern
//  @inline def tryToPerform(anAction: SEL, anObject: id): BOOL = extern
//  @inline def validRequestorForSendType(sendType: NSString, returnType: NSString): id = extern
//  @inline def setContentBorderThickness(thickness: CGFloat, edge: NSRectEdge): Unit = extern
//  @inline def contentBorderThicknessForEdge(edge: NSRectEdge): CGFloat = extern
//  @inline def setAutorecalculatesContentBorderThickness(flag: BOOL, edge: NSRectEdge): Unit = extern
//  @inline def autorecalculatesContentBorderThicknessForEdge(edge: NSRectEdge): BOOL = extern
  @inline def center(): Unit = extern
  @inline def makeKeyAndOrderFront(sender: id): Unit = extern
  @inline def orderFront(sender: id): Unit = extern
  @inline def orderBack(sender: id): Unit = extern
  @inline def orderOut(sender: id): Unit = extern
//  @inline def orderWindow(place: NSWindowOrderingMode, otherWin: NSInteger): Unit = extern
  @inline def orderFrontRegardless(): Unit = extern
  @inline def makeKeyWindow(): Unit = extern
  @inline def makeMainWindow(): Unit = extern
  @inline def becomeKeyWindow(): Unit = extern
  @inline def resignKeyWindow(): Unit = extern
  @inline def becomeMainWindow(): Unit = extern
  @inline def resignMainWindow(): Unit = extern
  @inline def convertRectToScreen(aRect: NSRect): NSRect = extern
  @inline def convertRectFromScreen(aRect: NSRect): NSRect = extern
  @inline def convertRectToBacking(aRect: NSRect): NSRect = extern
  @inline def convertRectFromBacking(aRect: NSRect): NSRect = extern
//  @inline def backingAlignedRect(aRect: NSRect, options: NSAlignmentOptions): NSRect = extern
  @inline def performClose(sender: id): Unit = extern
  @inline def performMiniaturize(sender: id): Unit = extern
  @inline def performZoom(sender: id): Unit = extern
  @inline def dataWithEPSInsideRect(rect: NSRect): NSData = extern
  @inline def dataWithPDFInsideRect(rect: NSRect): NSData = extern
  @inline def print(sender: id): Unit = extern
  @inline def disableCursorRects(): Unit = extern
  @inline def enableCursorRects(): Unit = extern
  @inline def discardCursorRects(): Unit = extern
  @inline def invalidateCursorRectsForView(aView: NSView): Unit = extern
  @inline def resetCursorRects(): Unit = extern
  @inline def setDynamicDepthLimit(flag: BOOL): Unit = extern
  @inline def invalidateShadow(): Unit = extern
  @inline def disableScreenUpdatesUntilFlush(): Unit = extern
  @inline def toggleFullScreen(sender: id): Unit = extern
  @inline def setFrameFromString(string: NSString): Unit = extern
  @inline def saveFrameUsingName(name: NSString): Unit = extern
  @inline def setFrameUsingName(name: NSString, force: BOOL): BOOL = extern
  @inline def setFrameUsingName(name: NSString): BOOL = extern
  @inline def setFrameAutosaveName(name: NSString): BOOL = extern
  @inline def cacheImageInRect(aRect: NSRect): Unit = extern
  @inline def restoreCachedImage(): Unit = extern
  @inline def discardCachedImage(): Unit = extern
//  @inline def trackEventsMatchingMask(mask: NSEventMask, timeout: NSTimeInterval, mode: NSString, trackingHandler: Ptr[Byte]): Unit = extern
  @inline def nextEventMatchingMask(mask: NSUInteger): NSEvent = extern
//  @inline def nextEventMatchingMask(mask: NSUInteger, expiration: NSDate, mode: NSString, deqFlag: BOOL): NSEvent = extern
  @inline def discardEventsMatchingMask(mask: NSUInteger, lastEvent: NSEvent): Unit = extern
  @inline def postEvent(event: NSEvent, flag: BOOL): Unit = extern
  @inline def sendEvent(theEvent: NSEvent): Unit = extern
  @inline def beginSheet(sheetWindow: NSWindow, handler: Ptr[Byte]): Unit = extern
  @inline def beginCriticalSheet(sheetWindow: NSWindow, handler: Ptr[Byte]): Unit = extern
  @inline def endSheet(sheetWindow: NSWindow): Unit = extern
//  @inline def endSheet(sheetWindow: NSWindow, returnCode: NSModalResponse): Unit = extern
//  @inline def standardWindowButton(b: NSWindowButton): NSButton = extern
//  @inline def addChildWindow(childWin: NSWindow, place: NSWindowOrderingMode): Unit = extern
  @inline def removeChildWindow(childWin: NSWindow): Unit = extern
  @inline def performWindowDragWithEvent(event: NSEvent): Unit = extern
  @inline def title(): NSString = extern
  @inline def setTitle(title: NSString): Unit = extern
//  @inline def titleVisibility(): NSWindowTitleVisibility = extern
//  @inline def setTitleVisibility(titleVisibility: NSWindowTitleVisibility): Unit = extern
  @inline def titlebarAppearsTransparent(): BOOL = extern
  @inline def setTitlebarAppearsTransparent(titlebarAppearsTransparent: BOOL): Unit = extern
  @inline def contentLayoutRect(): NSRect = extern
  @inline def contentLayoutGuide(): id = extern
//  @inline def titlebarAccessoryViewControllers(): NSArray[__kindof NSTitlebarAccessoryViewController] = extern
//  @inline def setTitlebarAccessoryViewControllers(titlebarAccessoryViewControllers: NSArray[__kindof NSTitlebarAccessoryViewController]): Unit = extern
  @inline def representedURL(): NSURL = extern
  @inline def setRepresentedURL(representedURL: NSURL): Unit = extern
  @inline def representedFilename(): NSString = extern
  @inline def setRepresentedFilename(representedFilename: NSString): Unit = extern
  @inline def isExcludedFromWindowsMenu(): BOOL = extern
  @inline def setExcludedFromWindowsMenu(excludedFromWindowsMenu: BOOL): Unit = extern
  @inline def contentView(): NSView = extern
  @inline def setContentView(contentView: NSView): Unit = extern
  @inline def delegate(): id = extern
  @inline def setDelegate(delegate: id): Unit = extern
  @inline def windowNumber(): NSInteger = extern
  @inline def styleMask(): NSUInteger = extern
  @inline def frame(): NSRect = extern
  @inline def inLiveResize(): BOOL = extern
  @inline def showsResizeIndicator(): BOOL = extern
  @inline def setShowsResizeIndicator(showsResizeIndicator: BOOL): Unit = extern
  @inline def resizeIncrements(): NSSize = extern
  @inline def setResizeIncrements(resizeIncrements: NSSize): Unit = extern
  @inline def aspectRatio(): NSSize = extern
  @inline def setAspectRatio(aspectRatio: NSSize): Unit = extern
  @inline def contentResizeIncrements(): NSSize = extern
  @inline def setContentResizeIncrements(contentResizeIncrements: NSSize): Unit = extern
  @inline def contentAspectRatio(): NSSize = extern
  @inline def setContentAspectRatio(contentAspectRatio: NSSize): Unit = extern
  @inline def isFlushWindowDisabled(): BOOL = extern
  @inline def viewsNeedDisplay(): BOOL = extern
  @inline def setViewsNeedDisplay(viewsNeedDisplay: BOOL): Unit = extern
  @inline def isAutodisplay(): BOOL = extern
  @inline def setAutodisplay(autodisplay: BOOL): Unit = extern
  @inline def preservesContentDuringLiveResize(): BOOL = extern
  @inline def setPreservesContentDuringLiveResize(preservesContentDuringLiveResize: BOOL): Unit = extern
  @inline def firstResponder(): NSResponder = extern
  @inline def resizeFlags(): NSInteger = extern
  @inline def isReleasedWhenClosed(): BOOL = extern
  @inline def setReleasedWhenClosed(releasedWhenClosed: BOOL): Unit = extern
  @inline def isZoomed(): BOOL = extern
  @inline def isMiniaturized(): BOOL = extern
//  @inline def backgroundColor(): NSColor = extern
//  @inline def setBackgroundColor(backgroundColor: NSColor): Unit = extern
  @inline def isMovable(): BOOL = extern
  @inline def setMovable(movable: BOOL): Unit = extern
  @inline def isMovableByWindowBackground(): BOOL = extern
  @inline def setMovableByWindowBackground(movableByWindowBackground: BOOL): Unit = extern
  @inline def hidesOnDeactivate(): BOOL = extern
  @inline def setHidesOnDeactivate(hidesOnDeactivate: BOOL): Unit = extern
  @inline def canHide(): BOOL = extern
  @inline def setCanHide(canHide: BOOL): Unit = extern
//  @inline def miniwindowImage(): NSImage = extern
//  @inline def setMiniwindowImage(miniwindowImage: NSImage): Unit = extern
  @inline def miniwindowTitle(): NSString = extern
  @inline def setMiniwindowTitle(miniwindowTitle: NSString): Unit = extern
//  @inline def dockTile(): NSDockTile = extern
  @inline def isDocumentEdited(): BOOL = extern
  @inline def setDocumentEdited(documentEdited: BOOL): Unit = extern
  @inline def isVisible(): BOOL = extern
  @inline def isKeyWindow(): BOOL = extern
  @inline def isMainWindow(): BOOL = extern
  @inline def canBecomeKeyWindow(): BOOL = extern
  @inline def canBecomeMainWindow(): BOOL = extern
  @inline def worksWhenModal(): BOOL = extern
  @inline def preventsApplicationTerminationWhenModal(): BOOL = extern
  @inline def setPreventsApplicationTerminationWhenModal(preventsApplicationTerminationWhenModal: BOOL): Unit = extern
//  @inline def backingScaleFactor(): CGFloat = extern
  @inline def isOneShot(): BOOL = extern
  @inline def setOneShot(oneShot: BOOL): Unit = extern
  @inline def areCursorRectsEnabled(): BOOL = extern
  @inline def allowsToolTipsWhenApplicationIsInactive(): BOOL = extern
  @inline def setAllowsToolTipsWhenApplicationIsInactive(allowsToolTipsWhenApplicationIsInactive: BOOL): Unit = extern
//  @inline def backingType(): NSBackingStoreType = extern
//  @inline def setBackingType(backingType: NSBackingStoreType): Unit = extern
  @inline def level(): NSInteger = extern
  @inline def setLevel(level: NSInteger): Unit = extern
//  @inline def depthLimit(): NSWindowDepth = extern
//  @inline def setDepthLimit(depthLimit: NSWindowDepth): Unit = extern
  @inline def hasDynamicDepthLimit(): BOOL = extern
//  @inline def screen(): NSScreen = extern
//  @inline def deepestScreen(): NSScreen = extern
  @inline def hasShadow(): BOOL = extern
  @inline def setHasShadow(hasShadow: BOOL): Unit = extern
//  @inline def alphaValue(): CGFloat = extern
//  @inline def setAlphaValue(alphaValue: CGFloat): Unit = extern
  @inline def isOpaque(): BOOL = extern
  @inline def setOpaque(opaque: BOOL): Unit = extern
//  @inline def sharingType(): NSWindowSharingType = extern
//  @inline def setSharingType(sharingType: NSWindowSharingType): Unit = extern
//  @inline def preferredBackingLocation(): NSWindowBackingLocation = extern
//  @inline def setPreferredBackingLocation(preferredBackingLocation: NSWindowBackingLocation): Unit = extern
//  @inline def backingLocation(): NSWindowBackingLocation = extern
  @inline def allowsConcurrentViewDrawing(): BOOL = extern
  @inline def setAllowsConcurrentViewDrawing(allowsConcurrentViewDrawing: BOOL): Unit = extern
  @inline def displaysWhenScreenProfileChanges(): BOOL = extern
  @inline def setDisplaysWhenScreenProfileChanges(displaysWhenScreenProfileChanges: BOOL): Unit = extern
  @inline def canBecomeVisibleWithoutLogin(): BOOL = extern
  @inline def setCanBecomeVisibleWithoutLogin(canBecomeVisibleWithoutLogin: BOOL): Unit = extern
//  @inline def collectionBehavior(): NSWindowCollectionBehavior = extern
//  @inline def setCollectionBehavior(collectionBehavior: NSWindowCollectionBehavior): Unit = extern
//  @inline def animationBehavior(): NSWindowAnimationBehavior = extern
//  @inline def setAnimationBehavior(animationBehavior: NSWindowAnimationBehavior): Unit = extern
  @inline def isOnActiveSpace(): BOOL = extern
  @inline def stringWithSavedFrame(): NSString = extern
  @inline def frameAutosaveName(): NSString = extern
  @inline def minSize(): NSSize = extern
  @inline def setMinSize(minSize: NSSize): Unit = extern
  @inline def maxSize(): NSSize = extern
  @inline def setMaxSize(maxSize: NSSize): Unit = extern
  @inline def contentMinSize(): NSSize = extern
  @inline def setContentMinSize(contentMinSize: NSSize): Unit = extern
  @inline def contentMaxSize(): NSSize = extern
  @inline def setContentMaxSize(contentMaxSize: NSSize): Unit = extern
  @inline def minFullScreenContentSize(): NSSize = extern
  @inline def setMinFullScreenContentSize(minFullScreenContentSize: NSSize): Unit = extern
  @inline def maxFullScreenContentSize(): NSSize = extern
  @inline def setMaxFullScreenContentSize(maxFullScreenContentSize: NSSize): Unit = extern
  @inline def currentEvent(): NSEvent = extern
  @inline def acceptsMouseMovedEvents(): BOOL = extern
  @inline def setAcceptsMouseMovedEvents(acceptsMouseMovedEvents: BOOL): Unit = extern
  @inline def ignoresMouseEvents(): BOOL = extern
  @inline def setIgnoresMouseEvents(ignoresMouseEvents: BOOL): Unit = extern
  @inline def deviceDescription(): NSDictionary[NSString, NSObject] = extern
  @inline def mouseLocationOutsideOfEventStream(): NSPoint = extern
//  @inline def windowController(): NSWindowController = extern
//  @inline def setWindowController(windowController: NSWindowController): Unit = extern
  @inline def sheets(): NSArray[NSWindow] = extern
  @inline def attachedSheet(): NSWindow = extern
  @inline def isSheet(): BOOL = extern
  @inline def sheetParent(): NSWindow = extern
  @inline def childWindows(): NSArray[NSWindow] = extern
  @inline def parentWindow(): NSWindow = extern
  @inline def setParentWindow(parentWindow: NSWindow): Unit = extern
//  @inline def graphicsContext(): NSGraphicsContext = extern
//  @inline def colorSpace(): NSColorSpace = extern
//  @inline def setColorSpace(colorSpace: NSColorSpace): Unit = extern
//  @inline def occlusionState(): NSWindowOcclusionState = extern
//  @inline def contentViewController(): NSViewController = extern
//  @inline def setContentViewController(contentViewController: NSViewController): Unit = extern
  @inline def selectNextKeyView(sender: id): Unit = extern
  @inline def selectPreviousKeyView(sender: id): Unit = extern
  @inline def selectKeyViewFollowingView(aView: NSView): Unit = extern
  @inline def selectKeyViewPrecedingView(aView: NSView): Unit = extern
  @inline def disableKeyEquivalentForDefaultButtonCell(): Unit = extern
  @inline def enableKeyEquivalentForDefaultButtonCell(): Unit = extern
  @inline def recalculateKeyViewLoop(): Unit = extern
  @inline def initialFirstResponder(): NSView = extern
  @inline def setInitialFirstResponder(initialFirstResponder: NSView): Unit = extern
//  @inline def keyViewSelectionDirection(): NSSelectionDirection = extern
//  @inline def defaultButtonCell(): NSButtonCell = extern
//  @inline def setDefaultButtonCell(defaultButtonCell: NSButtonCell): Unit = extern
  @inline def autorecalculatesKeyViewLoop(): BOOL = extern
  @inline def setAutorecalculatesKeyViewLoop(autorecalculatesKeyViewLoop: BOOL): Unit = extern
  @inline def toggleToolbarShown(sender: id): Unit = extern
  @inline def runToolbarCustomizationPalette(sender: id): Unit = extern
//  @inline def toolbar(): NSToolbar = extern
//  @inline def setToolbar(toolbar: NSToolbar): Unit = extern
  @inline def showsToolbarButton(): BOOL = extern
  @inline def setShowsToolbarButton(showsToolbarButton: BOOL): Unit = extern
//  @inline def dragImage(anImage: NSImage, baseLocation: NSPoint, initialOffset: NSSize, event: NSEvent, pboard: NSPasteboard, sourceObj: id, slideFlag: BOOL): Unit = extern
  @inline def registerForDraggedTypes(newTypes: NSString): Unit = extern
  @inline def unregisterDraggedTypes(): Unit = extern
  @inline def initWithWindowRef(windowRef: Ptr[Byte]): NSWindow = extern
  @inline def windowRef(): Ptr[Byte] = extern
  @inline def gState(): NSInteger = extern
  @inline def convertBaseToScreen(aPoint: NSPoint): NSPoint = extern
  @inline def convertScreenToBase(aPoint: NSPoint): NSPoint = extern
  @inline def canBeVisibleOnAllSpaces(): BOOL = extern
  @inline def setCanBeVisibleOnAllSpaces(flag: BOOL): Unit = extern
//  @inline def userSpaceScaleFactor(): CGFloat = extern
  @inline def useOptimizedDrawing(flag: BOOL): Unit = extern
  @inline def canStoreColor(): BOOL = extern
}


@ObjCClass
abstract class NSWindowClass extends NSObjectClass {
  @inline def frameRectForContentRect(cRect: NSRect, aStyle: NSUInteger): NSRect = extern
  @inline def contentRectForFrameRect(fRect: NSRect, aStyle: NSUInteger): NSRect = extern
//  @inline def minFrameWidthWithTitle(aTitle: NSString, aStyle: NSUInteger): CGFloat = extern
//  @inline def defaultDepthLimit(): NSWindowDepth = extern
  @inline def removeFrameUsingName(name: NSString): Unit = extern
//  @inline def standardWindowButton(b: NSWindowButton, styleMask: NSUInteger): NSButton = extern
//  @inline def windowNumbersWithOptions(options: NSWindowNumberListOptions): NSArray[NSNumber] = extern
  @inline def windowNumberAtPoint(point: NSPoint, windowNumber: NSInteger): NSInteger = extern
//  @inline def windowWithContentViewController(contentViewController: NSViewController): NSWindow = extern
//  @inline def menuChanged(menu: NSMenu): Unit = extern
}

object NSWindow extends NSWindowClass {
  override type InstanceType = NSWindow
}