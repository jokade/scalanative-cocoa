// Copyright (c) 2017. Distributed under the MIT License (see included LICENSE file).
package cocoa.uikit

import cocoa.foundation.{BOOL, NSArray, NSObject, NSObjectClass, NSString}
import objc.runtime.{SEL, id}

import scala.language.experimental.macros
import objc.{ObjC, ObjCClass}
import org.w3c.dom.events.UIEvent

import scalanative.native._

@ObjC
class UIResponder extends NSObject { //with UIResponderStandardEditActions {
  @inline def becomeFirstResponder(): BOOL = extern
  @inline def resignFirstResponder(): BOOL = extern
//  @inline def touchesBegan(touches: UITouch, event: UIEvent): Unit = extern
//  @inline def touchesMoved(touches: UITouch, event: UIEvent): Unit = extern
//  @inline def touchesEnded(touches: UITouch, event: UIEvent): Unit = extern
//  @inline def touchesCancelled(touches: UITouch, event: UIEvent): Unit = extern
//  @inline def touchesEstimatedPropertiesUpdated(touches: UITouch): Unit = extern
//  @inline def pressesBegan(presses: UIPress, event: UIPressesEvent): Unit = extern
//  @inline def pressesChanged(presses: UIPress, event: UIPressesEvent): Unit = extern
//  @inline def pressesEnded(presses: UIPress, event: UIPressesEvent): Unit = extern
//  @inline def pressesCancelled(presses: UIPress, event: UIPressesEvent): Unit = extern
//  @inline def motionBegan(motion: UIEventSubtype, event: UIEvent): Unit = extern
//  @inline def motionEnded(motion: UIEventSubtype, event: UIEvent): Unit = extern
//  @inline def motionCancelled(motion: UIEventSubtype, event: UIEvent): Unit = extern
  @inline def remoteControlReceivedWithEvent(event: UIEvent): Unit = extern
  @inline def canPerformAction(action: SEL, sender: id): BOOL = extern
  @inline def targetForAction(action: SEL, sender: id): id = extern
  @inline def nextResponder(): UIResponder = extern
  @inline def canBecomeFirstResponder(): BOOL = extern
  @inline def canResignFirstResponder(): BOOL = extern
  @inline def isFirstResponder(): BOOL = extern
//  @inline def undoManager(): NSUndoManager = extern
//  @inline def keyCommands(): NSArray[UIKeyCommand] = extern
  @inline def reloadInputViews(): Unit = extern
//  @inline def inputView(): UIView = extern
//  @inline def inputAccessoryView(): UIView = extern
//  @inline def inputAssistantItem(): UITextInputAssistantItem = extern
//  @inline def inputViewController(): UIInputViewController = extern
//  @inline def inputAccessoryViewController(): UIInputViewController = extern
//  @inline def textInputMode(): UITextInputMode = extern
  @inline def textInputContextIdentifier(): NSString = extern
//  @inline def updateUserActivityState(activity: NSUserActivity): Unit = extern
//  @inline def restoreUserActivityState(activity: NSUserActivity): Unit = extern
//  @inline def userActivity(): NSUserActivity = extern
//  @inline def setUserActivity(userActivity: NSUserActivity): Unit = extern
}


@ObjCClass
abstract class UIResponderClass extends NSObjectClass {
  @inline def clearTextInputContextIdentifier(identifier: NSString): Unit = extern
}

object UIResponder extends UIResponderClass {
  override type InstanceType = UIResponder
}