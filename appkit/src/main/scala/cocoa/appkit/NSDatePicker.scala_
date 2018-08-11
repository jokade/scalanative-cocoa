package cocoa.appkit

import scalanative.native._
import cocoa.foundation.{BOOL, NSDate, NSLocale, NSTimeInterval, NSTimeZone}
import objc.runtime.id

import scala.language.experimental.macros


@ObjC
class NSDatePicker extends NSControl {
  @inline def datePickerStyle(): NSDatePickerStyle = extern
  @inline def setDatePickerStyle(datePickerStyle: NSDatePickerStyle): Unit = extern
  @inline def isBezeled(): BOOL = extern
  @inline def setBezeled(bezeled: BOOL): Unit = extern
  @inline def isBordered(): BOOL = extern
  @inline def setBordered(bordered: BOOL): Unit = extern
  @inline def drawsBackground(): BOOL = extern
  @inline def setDrawsBackground(drawsBackground: BOOL): Unit = extern
//  @inline def backgroundColor(): NSColor = extern
//  @inline def setBackgroundColor(backgroundColor: NSColor): Unit = extern
//  @inline def textColor(): NSColor = extern
//  @inline def setTextColor(textColor: NSColor): Unit = extern
  @inline def datePickerMode(): NSDatePickerMode = extern
  @inline def setDatePickerMode(datePickerMode: NSDatePickerMode): Unit = extern
  @inline def datePickerElements(): NSDatePickerElementFlags = extern
  @inline def setDatePickerElements(datePickerElements: NSDatePickerElementFlags): Unit = extern
//  @inline def calendar(): NSCalendar = extern
//  @inline def setCalendar(calendar: NSCalendar): Unit = extern
  @inline def locale(): NSLocale = extern
  @inline def setLocale(locale: NSLocale): Unit = extern
  @inline def timeZone(): NSTimeZone = extern
  @inline def setTimeZone(timeZone: NSTimeZone): Unit = extern
  @inline def dateValue(): NSDate = extern
  @inline def setDateValue(dateValue: NSDate): Unit = extern
  @inline def timeInterval(): NSTimeInterval = extern
  @inline def setTimeInterval(timeInterval: NSTimeInterval): Unit = extern
  @inline def minDate(): NSDate = extern
  @inline def setMinDate(minDate: NSDate): Unit = extern
  @inline def maxDate(): NSDate = extern
  @inline def setMaxDate(maxDate: NSDate): Unit = extern
  @inline def delegate(): id = extern
  @inline def setDelegate(delegate: id): Unit = extern
}


@ObjCClass
abstract class NSDatePickerClass extends NSControlClass {
}

object NSDatePicker extends NSDatePickerClass {
  override type InstanceType = NSDatePicker
}