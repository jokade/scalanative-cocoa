package cocoa.appkit

import cocoa.foundation.{BOOL, NSCoding, NSCopying, NSInteger, NSObject, NSObjectClass, NSPoint, NSString, NSUInteger}
import objc.runtime.id

import scala.language.experimental.macros
import objc.{ObjC, ObjCClass}

import scalanative.native._


@ObjC
class NSEvent extends NSObject with NSCopying with NSCoding {
//  @inline def touchesMatchingPhase(phase: NSTouchPhase, view: NSView): NSSet[NSTouch] = extern
//  @inline def trackSwipeEventWithOptions(options: NSEventSwipeTrackingOptions, minDampenThreshold: CGFloat, maxDampenThreshold: CGFloat, trackingHandler: Ptr[Byte]): Unit = extern
//  @inline def `type`(): NSEventType = extern
//  @inline def modifierFlags(): NSEventModifierFlags = extern
//  @inline def timestamp(): NSTimeInterval = extern
  @inline def window(): NSWindow = extern
  @inline def windowNumber(): NSInteger = extern
//  @inline def context(): NSGraphicsContext = extern
  @inline def clickCount(): NSInteger = extern
  @inline def buttonNumber(): NSInteger = extern
  @inline def eventNumber(): NSInteger = extern
  @inline def pressure(): Float = extern
  @inline def locationInWindow(): NSPoint = extern
//  @inline def deltaX(): CGFloat = extern
//  @inline def deltaY(): CGFloat = extern
//  @inline def deltaZ(): CGFloat = extern
  @inline def hasPreciseScrollingDeltas(): BOOL = extern
//  @inline def scrollingDeltaX(): CGFloat = extern
//  @inline def scrollingDeltaY(): CGFloat = extern
//  @inline def momentumPhase(): NSEventPhase = extern
  @inline def isDirectionInvertedFromDevice(): BOOL = extern
  @inline def characters(): NSString = extern
  @inline def charactersIgnoringModifiers(): NSString = extern
  @inline def isARepeat(): BOOL = extern
  @inline def keyCode(): CUnsignedShort = extern
  @inline def trackingNumber(): NSInteger = extern
  @inline def userData(): Ptr[Byte] = extern
//  @inline def trackingArea(): NSTrackingArea = extern
//  @inline def subtype(): NSEventSubtype = extern
  @inline def data1(): NSInteger = extern
  @inline def data2(): NSInteger = extern
  @inline def eventRef(): Ptr[Byte] = extern
//  @inline def CGEvent(): CGEventRef = extern
//  @inline def magnification(): CGFloat = extern
  @inline def deviceID(): NSUInteger = extern
  @inline def rotation(): Float = extern
  @inline def absoluteX(): NSInteger = extern
  @inline def absoluteY(): NSInteger = extern
  @inline def absoluteZ(): NSInteger = extern
//  @inline def buttonMask(): NSEventButtonMask = extern
  @inline def tilt(): NSPoint = extern
  @inline def tangentialPressure(): Float = extern
  @inline def vendorDefined(): id = extern
  @inline def vendorID(): NSUInteger = extern
  @inline def tabletID(): NSUInteger = extern
  @inline def pointingDeviceID(): NSUInteger = extern
  @inline def systemTabletID(): NSUInteger = extern
  @inline def vendorPointingDeviceType(): NSUInteger = extern
  @inline def pointingDeviceSerialNumber(): NSUInteger = extern
  @inline def uniqueID(): CUnsignedLongLong = extern
  @inline def capabilityMask(): NSUInteger = extern
//  @inline def pointingDeviceType(): NSPointingDeviceType = extern
  @inline def isEnteringProximity(): BOOL = extern
//  @inline def phase(): NSEventPhase = extern
  @inline def stage(): NSInteger = extern
//  @inline def stageTransition(): CGFloat = extern
//  @inline def associatedEventsMask(): NSEventMask = extern
//  @inline def pressureBehavior(): NSPressureBehavior = extern
}

@ObjCClass
abstract class NSEventClass extends NSObjectClass {
  @inline def eventWithEventRef(eventRef: Ptr[Byte]): NSEvent = extern
//  @inline def eventWithCGEvent(cgEvent: CGEventRef): NSEvent = extern
  @inline def setMouseCoalescingEnabled(flag: BOOL): Unit = extern
  @inline def isMouseCoalescingEnabled(): BOOL = extern
  @inline def isSwipeTrackingFromScrollEventsEnabled(): BOOL = extern
//  @inline def startPeriodicEventsAfterDelay(delay: NSTimeInterval, period: NSTimeInterval): Unit = extern
  @inline def stopPeriodicEvents(): Unit = extern
//  @inline def mouseEventWithType(`type`: NSEventType, location: NSPoint, flags: NSEventModifierFlags, time: NSTimeInterval, wNum: NSInteger, context: NSGraphicsContext, eNum: NSInteger, cNum: NSInteger, pressure: Float): NSEvent = extern
//  @inline def keyEventWithType(`type`: NSEventType, location: NSPoint, flags: NSEventModifierFlags, time: NSTimeInterval, wNum: NSInteger, context: NSGraphicsContext, keys: NSString, ukeys: NSString, flag: BOOL, code: CUnsignedShort): NSEvent = extern
//  @inline def enterExitEventWithType(`type`: NSEventType, location: NSPoint, flags: NSEventModifierFlags, time: NSTimeInterval, wNum: NSInteger, context: NSGraphicsContext, eNum: NSInteger, tNum: NSInteger, data: Ptr[Byte]): NSEvent = extern
//  @inline def otherEventWithType(`type`: NSEventType, location: NSPoint, flags: NSEventModifierFlags, time: NSTimeInterval, wNum: NSInteger, context: NSGraphicsContext, subtype: CShort, d1: NSInteger, d2: NSInteger): NSEvent = extern
  @inline def mouseLocation(): NSPoint = extern
//  @inline def modifierFlags(): NSEventModifierFlags = extern
  @inline def pressedMouseButtons(): NSUInteger = extern
//  @inline def doubleClickInterval(): NSTimeInterval = extern
//  @inline def keyRepeatDelay(): NSTimeInterval = extern
//  @inline def keyRepeatInterval(): NSTimeInterval = extern
//  @inline def addGlobalMonitorForEventsMatchingMask(mask: NSEventMask, block: Ptr[Byte]): id = extern
//  @inline def addLocalMonitorForEventsMatchingMask(mask: NSEventMask, block: NSEvent): id = extern
  @inline def removeMonitor(eventMonitor: id): Unit = extern
}

object NSEvent extends NSEventClass {
  override type InstanceType = NSEvent
}