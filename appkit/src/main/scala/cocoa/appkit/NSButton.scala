// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.appkit

import cocoa.foundation.{BOOL, NSInteger, NSObjectClass, NSString, NSUInteger}

import scala.language.experimental.macros
import scalanative.native._

@ObjC
class NSButton extends NSControl { //with NSUserInterfaceValidations with NSAccessibilityButton {
  @inline def setButtonType(aType: NSButtonType): Unit = extern
  @inline def setPeriodicDelay(delay: Float, interval: Float): Unit = extern
  @inline def getPeriodicDelay(delay: Ptr[Float], interval: Ptr[Float]): Unit = extern
  @inline def highlight(flag: BOOL): Unit = extern
//  @inline def performKeyEquivalent(key: NSEvent): BOOL = extern
  @inline def title(): NSString = extern
  @inline def setTitle(title: NSString): Unit = extern
  @inline def alternateTitle(): NSString = extern
  @inline def setAlternateTitle(alternateTitle: NSString): Unit = extern
//  @inline def image(): NSImage = extern
//  @inline def setImage(image: NSImage): Unit = extern
//  @inline def alternateImage(): NSImage = extern
//  @inline def setAlternateImage(alternateImage: NSImage): Unit = extern
//  @inline def imagePosition(): NSCellImagePosition = extern
//  @inline def setImagePosition(imagePosition: NSCellImagePosition): Unit = extern
  @inline def state(): NSInteger = extern
  @inline def setState(state: NSInteger): Unit = extern
  @inline def isBordered(): BOOL = extern
  @inline def setBordered(bordered: BOOL): Unit = extern
  @inline def isTransparent(): BOOL = extern
  @inline def setTransparent(transparent: BOOL): Unit = extern
  @inline def keyEquivalent(): NSString = extern
  @inline def setKeyEquivalent(keyEquivalent: NSString): Unit = extern
  @inline def keyEquivalentModifierMask(): NSUInteger = extern
  @inline def setKeyEquivalentModifierMask(keyEquivalentModifierMask: NSUInteger): Unit = extern
  @inline def isSpringLoaded(): BOOL = extern
  @inline def setSpringLoaded(springLoaded: BOOL): Unit = extern
  @inline def maxAcceleratorLevel(): NSInteger = extern
  @inline def setMaxAcceleratorLevel(maxAcceleratorLevel: NSInteger): Unit = extern
//  @inline def attributedTitle(): NSAttributedString = extern
//  @inline def setAttributedTitle(attributedTitle: NSAttributedString): Unit = extern
//  @inline def attributedAlternateTitle(): NSAttributedString = extern
//  @inline def setAttributedAlternateTitle(attributedAlternateTitle: NSAttributedString): Unit = extern
  @inline def bezelStyle(): NSBezelStyle = extern
  @inline def setBezelStyle(bezelStyle: NSBezelStyle): Unit = extern
  @inline def setNextState(): Unit = extern
  @inline def allowsMixedState(): BOOL = extern
  @inline def setAllowsMixedState(allowsMixedState: BOOL): Unit = extern
  @inline def showsBorderOnlyWhileMouseInside(): BOOL = extern
  @inline def setShowsBorderOnlyWhileMouseInside(showsBorderOnlyWhileMouseInside: BOOL): Unit = extern
//  @inline def sound(): NSSound = extern
//  @inline def setSound(sound: NSSound): Unit = extern
  @inline def setTitleWithMnemonic(stringWithAmpersand: NSString): Unit = extern
}

@ObjCClass
abstract class NSButtonClass extends NSObjectClass {
}

object NSButton extends NSButtonClass {
  override type InstanceType = NSButton
}