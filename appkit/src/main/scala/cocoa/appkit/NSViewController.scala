package cocoa.appkit

import cocoa.foundation.{NSArray, NSBundle, NSCoder, NSCoding, NSInteger, NSPoint, NSRect, NSSize, NSString}

import scalanative.native._
import objc._
import runtime._

@ObjC
class NSViewController extends NSResponder with NSCoding {
  @inline def initWithNibName_nibBundleOrNil_(nibNameOrNil: NSNibName, nibBundleOrNil: NSBundle): NSViewController = extern
  @inline def loadView(): Unit = extern
  @inline def commitEditingWithDelegate_didCommitSelector_contextInfo_(delegate: id, didCommitSelector: SEL, contextInfo: Ptr[Byte]): Unit = extern
  @inline def commitEditing(): BOOL = extern
  @inline def discardEditing(): Unit = extern
  @inline def viewDidLoad(): Unit = extern
  @inline def viewWillAppear(): Unit = extern
  @inline def viewDidAppear(): Unit = extern
  @inline def viewWillDisappear(): Unit = extern
  @inline def viewDidDisappear(): Unit = extern
  @inline def updateViewConstraints(): Unit = extern
  @inline def viewWillLayout(): Unit = extern
  @inline def viewDidLayout(): Unit = extern
  @inline def nibName(): NSNibName = extern
  @inline def nibBundle(): NSBundle = extern
  @inline def representedObject(): id = extern
  @inline def setRepresentedObject_(representedObject: id): Unit = extern
  @inline def title(): NSString = extern
  @inline def setTitle_(title: NSString): Unit = extern
  @inline def view(): NSView = extern
  @inline def setView_(view: NSView): Unit = extern
  @inline def isViewLoaded(): BOOL = extern
  @inline def preferredContentSize(): NSSize = extern
  @inline def setPreferredContentSize_(preferredContentSize: NSSize): Unit = extern
  @inline def presentViewController_animator_(viewController: NSViewController, animator: id): Unit = extern
  @inline def dismissViewController_(viewController: NSViewController): Unit = extern
  @inline def dismissController_(sender: id): Unit = extern
  @inline def presentedViewControllers(): NSArray[NSViewController] = extern
  @inline def presentingViewController(): NSViewController = extern
  @inline def presentViewControllerAsSheet_(viewController: NSViewController): Unit = extern
  @inline def presentViewControllerAsModalWindow_(viewController: NSViewController): Unit = extern
//  @inline def presentViewController_positioningRect_positioningView_preferredEdge_behavior_(viewController: NSViewController, positioningRect: NSRect, positioningView: NSView, preferredEdge: NSRectEdge, behavior: NSPopoverBehavior): Unit = extern
  @inline def transitionFromViewController_toViewController_options_completion_(fromViewController: NSViewController, toViewController: NSViewController, options: NSViewControllerTransitionOptions, completion: Ptr[Byte]): Unit = extern
  @inline def addChildViewController_(childViewController: NSViewController): Unit = extern
  @inline def removeFromParentViewController(): Unit = extern
  @inline def insertChildViewController_index_(childViewController: NSViewController, index: NSInteger): Unit = extern
  @inline def removeChildViewControllerAtIndex_(index: NSInteger): Unit = extern
  @inline def preferredContentSizeDidChangeForViewController_(viewController: NSViewController): Unit = extern
  @inline def viewWillTransitionToSize_(newSize: NSSize): Unit = extern
  @inline def parentViewController(): NSViewController = extern
  @inline def childViewControllers(): NSArray[NSViewController] = extern
  @inline def setChildViewControllers_(childViewControllers: NSArray[NSViewController]): Unit = extern
//  @inline def storyboard(): NSStoryboard = extern
//  @inline def extensionContext(): NSExtensionContext = extern
  @inline def sourceItemView(): NSView = extern
  @inline def setSourceItemView_(sourceItemView: NSView): Unit = extern
  @inline def preferredScreenOrigin(): NSPoint = extern
  @inline def setPreferredScreenOrigin_(preferredScreenOrigin: NSPoint): Unit = extern
  @inline def preferredMinimumSize(): NSSize = extern
  @inline def preferredMaximumSize(): NSSize = extern
}
