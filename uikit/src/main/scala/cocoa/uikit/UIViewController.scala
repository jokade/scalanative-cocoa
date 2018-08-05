// Copyright (c) 2017. Distributed under the MIT License (see included LICENSE file).
package cocoa.uikit

import cocoa.foundation.{BOOL, NSArray, NSCoder, NSCoding, NSObject, NSObjectClass, NSString, NSTimeInterval, SEL, id}
import de.surfice.smacrotools.debug

import scala.language.experimental.macros
import scalanative.native._

@ObjC
@debug
class UIViewController extends NSObject { //UIResponder with NSCoding with UIAppearanceContainer with UITraitEnvironment with UIContentContainer with UIFocusEnvironment {
//  @inline def initWithNibName(nibNameOrNil: NSString, nibBundleOrNil: NSBundle): UIViewController = extern
  @inline def initWithCoder(aDecoder: NSCoder): UIViewController = extern
  @inline def loadView(): Unit = extern
  @inline def loadViewIfNeeded(): Unit = extern
  @inline def viewWillUnload(): Unit = extern
  @inline def viewDidUnload(): Unit = extern
  @inline def viewDidLoad(): Unit = extern
  @inline def performSegueWithIdentifier(identifier: NSString, sender: id): Unit = extern
  @inline def shouldPerformSegueWithIdentifier(identifier: NSString, sender: id): BOOL = extern
//  @inline def prepareForSegue(segue: UIStoryboardSegue, sender: id): Unit = extern
  @inline def canPerformUnwindSegueAction(action: SEL, fromViewController: UIViewController, sender: id): BOOL = extern
//  @inline def allowedChildViewControllersForUnwindingFromSource(source: UIStoryboardUnwindSegueSource): NSArray[UIViewController] = extern
//  @inline def childViewControllerContainingSegueSource(source: UIStoryboardUnwindSegueSource): UIViewController = extern
  @inline def viewControllerForUnwindSegueAction(action: SEL, fromViewController: UIViewController, sender: id): UIViewController = extern
//  @inline def unwindForSegue(unwindSegue: UIStoryboardSegue, subsequentVC: UIViewController): Unit = extern
//  @inline def segueForUnwindingToViewController(toViewController: UIViewController, fromViewController: UIViewController, identifier: NSString): UIStoryboardSegue = extern
  @inline def viewWillAppear(animated: BOOL): Unit = extern
  @inline def viewDidAppear(animated: BOOL): Unit = extern
  @inline def viewWillDisappear(animated: BOOL): Unit = extern
  @inline def viewDidDisappear(animated: BOOL): Unit = extern
  @inline def viewWillLayoutSubviews(): Unit = extern
  @inline def viewDidLayoutSubviews(): Unit = extern
  @inline def didReceiveMemoryWarning(): Unit = extern
  @inline def presentViewController(viewControllerToPresent: UIViewController, flag: BOOL, completion: Ptr[Byte]): Unit = extern
  @inline def dismissViewControllerAnimated(flag: BOOL, completion: Ptr[Byte]): Unit = extern
  @inline def presentModalViewController(modalViewController: UIViewController, animated: BOOL): Unit = extern
  @inline def dismissModalViewControllerAnimated(animated: BOOL): Unit = extern
  @inline def setNeedsStatusBarAppearanceUpdate(): Unit = extern
  @inline def targetViewControllerForAction(action: SEL, sender: id): UIViewController = extern
  @inline def showViewController(vc: UIViewController, sender: id): Unit = extern
  @inline def showDetailViewController(vc: UIViewController, sender: id): Unit = extern
//  @inline def view(): UIView = extern
//  @inline def setView(view: UIView): Unit = extern
//  @inline def viewIfLoaded(): UIView = extern
  @inline def isViewLoaded(): BOOL = extern
  @inline def nibName(): NSString = extern
//  @inline def nibBundle(): NSBundle = extern
//  @inline def storyboard(): UIStoryboard = extern
  @inline def title(): NSString = extern
  @inline def setTitle(title: NSString): Unit = extern
  @inline def parentViewController(): UIViewController = extern
  @inline def modalViewController(): UIViewController = extern
  @inline def presentedViewController(): UIViewController = extern
  @inline def presentingViewController(): UIViewController = extern
  @inline def definesPresentationContext(): BOOL = extern
  @inline def setDefinesPresentationContext(definesPresentationContext: BOOL): Unit = extern
  @inline def providesPresentationContextTransitionStyle(): BOOL = extern
  @inline def setProvidesPresentationContextTransitionStyle(providesPresentationContextTransitionStyle: BOOL): Unit = extern
  @inline def restoresFocusAfterTransition(): BOOL = extern
  @inline def setRestoresFocusAfterTransition(restoresFocusAfterTransition: BOOL): Unit = extern
  @inline def isBeingPresented(): BOOL = extern
  @inline def isBeingDismissed(): BOOL = extern
  @inline def isMovingToParentViewController(): BOOL = extern
  @inline def isMovingFromParentViewController(): BOOL = extern
//  @inline def modalTransitionStyle(): UIModalTransitionStyle = extern
//  @inline def setModalTransitionStyle(modalTransitionStyle: UIModalTransitionStyle): Unit = extern
//  @inline def modalPresentationStyle(): UIModalPresentationStyle = extern
//  @inline def setModalPresentationStyle(modalPresentationStyle: UIModalPresentationStyle): Unit = extern
  @inline def modalPresentationCapturesStatusBarAppearance(): BOOL = extern
  @inline def setModalPresentationCapturesStatusBarAppearance(modalPresentationCapturesStatusBarAppearance: BOOL): Unit = extern
  @inline def disablesAutomaticKeyboardDismissal(): BOOL = extern
  @inline def setDisablesAutomaticKeyboardDismissal(disablesAutomaticKeyboardDismissal: BOOL): Unit = extern
  @inline def wantsFullScreenLayout(): BOOL = extern
  @inline def setWantsFullScreenLayout(wantsFullScreenLayout: BOOL): Unit = extern
//  @inline def edgesForExtendedLayout(): UIRectEdge = extern
//  @inline def setEdgesForExtendedLayout(edgesForExtendedLayout: UIRectEdge): Unit = extern
  @inline def extendedLayoutIncludesOpaqueBars(): BOOL = extern
  @inline def setExtendedLayoutIncludesOpaqueBars(extendedLayoutIncludesOpaqueBars: BOOL): Unit = extern
  @inline def automaticallyAdjustsScrollViewInsets(): BOOL = extern
  @inline def setAutomaticallyAdjustsScrollViewInsets(automaticallyAdjustsScrollViewInsets: BOOL): Unit = extern
//  @inline def preferredContentSize(): CGSize = extern
//  @inline def setPreferredContentSize(preferredContentSize: CGSize): Unit = extern
//  @inline def preferredStatusBarStyle(): UIStatusBarStyle = extern
  @inline def prefersStatusBarHidden(): BOOL = extern
//  @inline def preferredStatusBarUpdateAnimation(): UIStatusBarAnimation = extern
//  @inline def shouldAutorotateToInterfaceOrientation(toInterfaceOrientation: UIInterfaceOrientation): BOOL = extern
//  @inline def rotatingHeaderView(): UIView = extern
//  @inline def rotatingFooterView(): UIView = extern
//  @inline def willRotateToInterfaceOrientation(toInterfaceOrientation: UIInterfaceOrientation, duration: NSTimeInterval): Unit = extern
//  @inline def didRotateFromInterfaceOrientation(fromInterfaceOrientation: UIInterfaceOrientation): Unit = extern
//  @inline def willAnimateRotationToInterfaceOrientation(toInterfaceOrientation: UIInterfaceOrientation, duration: NSTimeInterval): Unit = extern
//  @inline def willAnimateFirstHalfOfRotationToInterfaceOrientation(toInterfaceOrientation: UIInterfaceOrientation, duration: NSTimeInterval): Unit = extern
//  @inline def didAnimateFirstHalfOfRotationToInterfaceOrientation(toInterfaceOrientation: UIInterfaceOrientation): Unit = extern
//  @inline def willAnimateSecondHalfOfRotationFromInterfaceOrientation(fromInterfaceOrientation: UIInterfaceOrientation, duration: NSTimeInterval): Unit = extern
  @inline def shouldAutorotate(): BOOL = extern
//  @inline def supportedInterfaceOrientations(): UIInterfaceOrientationMask = extern
//  @inline def preferredInterfaceOrientationForPresentation(): UIInterfaceOrientation = extern
//  @inline def interfaceOrientation(): UIInterfaceOrientation = extern
  @inline def setEditing(editing: BOOL, animated: BOOL): Unit = extern
  @inline def isEditing(): BOOL = extern
  @inline def setEditing(editing: BOOL): Unit = extern
//  @inline def editButtonItem(): UIBarButtonItem = extern
//  @inline def searchDisplayController(): UISearchDisplayController = extern
  @inline def addChildViewController(childController: UIViewController): Unit = extern
  @inline def removeFromParentViewController(): Unit = extern
//  @inline def transitionFromViewController(fromViewController: UIViewController, toViewController: UIViewController, duration: NSTimeInterval, options: UIViewAnimationOptions, animations: Ptr[Byte], completion: Ptr[Byte]): Unit = extern
  @inline def beginAppearanceTransition(isAppearing: BOOL, animated: BOOL): Unit = extern
  @inline def endAppearanceTransition(): Unit = extern
//  @inline def setOverrideTraitCollection(collection: UITraitCollection, childViewController: UIViewController): Unit = extern
//  @inline def overrideTraitCollectionForChildViewController(childViewController: UIViewController): UITraitCollection = extern
//  @inline def childViewControllers(): NSArray[__kindof UIViewController] = extern
  @inline def childViewControllerForStatusBarStyle(): UIViewController = extern
  @inline def childViewControllerForStatusBarHidden(): UIViewController = extern
  @inline def automaticallyForwardAppearanceAndRotationMethodsToChildViewControllers(): BOOL = extern
  @inline def shouldAutomaticallyForwardRotationMethods(): BOOL = extern
  @inline def willMoveToParentViewController(parent: UIViewController): Unit = extern
  @inline def didMoveToParentViewController(parent: UIViewController): Unit = extern
  @inline def shouldAutomaticallyForwardAppearanceMethods(): BOOL = extern
  @inline def encodeRestorableStateWithCoder(coder: NSCoder): Unit = extern
  @inline def decodeRestorableStateWithCoder(coder: NSCoder): Unit = extern
  @inline def applicationFinishedRestoringState(): Unit = extern
  @inline def restorationIdentifier(): NSString = extern
  @inline def setRestorationIdentifier(restorationIdentifier: NSString): Unit = extern
//  @inline def restorationClass(): id[UIViewControllerRestoration] = extern
//  @inline def setRestorationClass(restorationClass: id[UIViewControllerRestoration]): Unit = extern
  @inline def updateViewConstraints(): Unit = extern
//  @inline def transitioningDelegate(): id[UIViewControllerTransitioningDelegate] = extern
//  @inline def setTransitioningDelegate(transitioningDelegate: id[UIViewControllerTransitioningDelegate]): Unit = extern
//  @inline def topLayoutGuide(): id[UILayoutSupport] = extern
//  @inline def bottomLayoutGuide(): id[UILayoutSupport] = extern
//  @inline def addKeyCommand(keyCommand: UIKeyCommand): Unit = extern
//  @inline def removeKeyCommand(keyCommand: UIKeyCommand): Unit = extern
//  @inline def extensionContext(): NSExtensionContext = extern
//  @inline def presentationController(): UIPresentationController = extern
//  @inline def popoverPresentationController(): UIPopoverPresentationController = extern
//  @inline def registerForPreviewingWithDelegate(delegate: id, sourceView: UIView): id[UIViewControllerPreviewing] = extern
  @inline def unregisterForPreviewingWithContext(previewing: id): Unit = extern
//  @inline def previewActionItems(): NSArray[id[UIPreviewActionItem]] = extern
}

@ObjCClass
abstract class UIViewControllerClass extends NSObjectClass { //extends UIResponder with NSCoding with UIAppearanceContainer with UITraitEnvironment with UIContentContainer with UIFocusEnvironment {
}

object UIViewController extends UIViewControllerClass {
  override type InstanceType = UIViewController
}