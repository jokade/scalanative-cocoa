// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.appkit

import cocoa.foundation.{NSInteger, NSObjectClass, NSRect}

import scala.language.experimental.macros
import scalanative.native._


@ObjC
class NSLevelIndicator extends NSControl {
  @inline def tickMarkValueAtIndex(index: NSInteger): Double = extern
  @inline def rectOfTickMarkAtIndex(index: NSInteger): NSRect = extern
//  @inline def levelIndicatorStyle(): NSLevelIndicatorStyle = extern
//  @inline def setLevelIndicatorStyle(levelIndicatorStyle: NSLevelIndicatorStyle): Unit = extern
  @inline def minValue(): Double = extern
  @inline def setMinValue(minValue: Double): Unit = extern
  @inline def maxValue(): Double = extern
  @inline def setMaxValue(maxValue: Double): Unit = extern
  @inline def warningValue(): Double = extern
  @inline def setWarningValue(warningValue: Double): Unit = extern
  @inline def criticalValue(): Double = extern
  @inline def setCriticalValue(criticalValue: Double): Unit = extern
//  @inline def tickMarkPosition(): NSTickMarkPosition = extern
//  @inline def setTickMarkPosition(tickMarkPosition: NSTickMarkPosition): Unit = extern
  @inline def numberOfTickMarks(): NSInteger = extern
  @inline def setNumberOfTickMarks(numberOfTickMarks: NSInteger): Unit = extern
  @inline def numberOfMajorTickMarks(): NSInteger = extern
  @inline def setNumberOfMajorTickMarks(numberOfMajorTickMarks: NSInteger): Unit = extern
}


@ObjCClass
abstract class NSLevelIndicatorClass extends NSObjectClass {
}

object NSLevelIndicator extends NSLevelIndicatorClass {
  override type InstanceType = NSLevelIndicator
}