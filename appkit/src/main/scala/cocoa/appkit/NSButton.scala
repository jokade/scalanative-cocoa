// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.appkit

import cocoa.foundation._

import scala.language.experimental.macros
import scala.scalanative.native._
import scala.scalanative.native.objc._

@ObjC
class NSButton extends NSControl { //with NSUserInterfaceValidations with NSAccessibilityButton with NSUserInterfaceCompression {
  @inline def setButtonType_(`type`: NSButtonType): Unit = extern
  @inline def setPeriodicDelay_interval_(delay: Float, interval: Float): Unit = extern
  @inline def getPeriodicDelay_interval_(delay: Ptr[Float], interval: Ptr[Float]): Unit = extern
  @inline def highlight_(flag: BOOL): Unit = extern
//  @inline def compressWithPrioritizedCompressionOptions_(prioritizedOptions: NSUserInterfaceCompressionOptions): Unit = extern
//  @inline def minimumSizeWithPrioritizedCompressionOptions_(prioritizedOptions: NSUserInterfaceCompressionOptions): NSSize = extern
  @inline def title(): NSString = extern
  @inline def setTitle_(title: NSString): Unit = extern
  @inline def alternateTitle(): NSString = extern
  @inline def setAlternateTitle_(alternateTitle: NSString): Unit = extern
  @inline def image(): NSImage = extern
  @inline def setImage_(image: NSImage): Unit = extern
  @inline def alternateImage(): NSImage = extern
  @inline def setAlternateImage_(alternateImage: NSImage): Unit = extern
//  @inline def imagePosition(): NSCellImagePosition = extern
//  @inline def setImagePosition_(imagePosition: NSCellImagePosition): Unit = extern
//  @inline def imageScaling(): NSImageScaling = extern
//  @inline def setImageScaling_(imageScaling: NSImageScaling): Unit = extern
  @inline def imageHugsTitle(): BOOL = extern
  @inline def setImageHugsTitle_(imageHugsTitle: BOOL): Unit = extern
//  @inline def state(): NSControlStateValue = extern
//  @inline def setState_(state: NSControlStateValue): Unit = extern
  @inline def isBordered(): BOOL = extern
  @inline def setBordered_(bordered: BOOL): Unit = extern
  @inline def isTransparent(): BOOL = extern
  @inline def setTransparent_(transparent: BOOL): Unit = extern
  @inline def keyEquivalent(): NSString = extern
  @inline def setKeyEquivalent_(keyEquivalent: NSString): Unit = extern
  @inline def keyEquivalentModifierMask(): NSEventModifierFlags = extern
  @inline def setKeyEquivalentModifierMask_(keyEquivalentModifierMask: NSEventModifierFlags): Unit = extern
  @inline def isSpringLoaded(): BOOL = extern
  @inline def setSpringLoaded_(springLoaded: BOOL): Unit = extern
  @inline def maxAcceleratorLevel(): NSInteger = extern
  @inline def setMaxAcceleratorLevel_(maxAcceleratorLevel: NSInteger): Unit = extern
  @inline def bezelColor(): NSColor = extern
  @inline def setBezelColor_(bezelColor: NSColor): Unit = extern
//  @inline def activeCompressionOptions(): NSUserInterfaceCompressionOptions = extern
//  @inline def attributedTitle(): NSAttributedString = extern
//  @inline def setAttributedTitle_(attributedTitle: NSAttributedString): Unit = extern
//  @inline def attributedAlternateTitle(): NSAttributedString = extern
//  @inline def setAttributedAlternateTitle_(attributedAlternateTitle: NSAttributedString): Unit = extern
  @inline def bezelStyle(): NSBezelStyle = extern
  @inline def setBezelStyle_(bezelStyle: NSBezelStyle): Unit = extern
  @inline def setNextState(): Unit = extern
  @inline def allowsMixedState(): BOOL = extern
  @inline def setAllowsMixedState_(allowsMixedState: BOOL): Unit = extern
  @inline def showsBorderOnlyWhileMouseInside(): BOOL = extern
  @inline def setShowsBorderOnlyWhileMouseInside_(showsBorderOnlyWhileMouseInside: BOOL): Unit = extern
//  @inline def sound(): NSSound = extern
//  @inline def setSound_(sound: NSSound): Unit = extern
  @inline def setTitleWithMnemonic_(stringWithAmpersand: NSString): Unit = extern
}

@ObjCClass
abstract class NSButtonClass extends NSObjectClass {
  @inline def buttonWithTitle_image_target_action_(title: NSString, image: NSImage, target: id, action: SEL): NSButton = extern
  @inline def buttonWithTitle_target_action_(title: NSString, target: id, action: SEL): NSButton = extern
  @inline def buttonWithImage_target_action_(image: NSImage, target: id, action: SEL): NSButton = extern
  @inline def checkboxWithTitle_target_action_(title: NSString, target: id, action: SEL): NSButton = extern
  @inline def radioButtonWithTitle_target_action_(title: NSString, target: id, action: SEL): NSButton = extern
}

object NSButton extends NSButtonClass {
  override type InstanceType = NSButton
}