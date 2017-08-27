//     Project: scalanative-cocoa
//      Module: AppKit
// Description: Contains enum types defined in AppKit and Scala-specific utilities.

// Copyright (c) 2017. Distributed under the MIT License (see included LICENSE file).
package cocoa

import cocoa.foundation.NSUInteger
import scalanative.native._

package object appkit {

  type NSDatePickerStyle = NSUInteger
  object NSDatePickerStyle {
    val NSTextFieldAndStepperDatePickerStyle: NSDatePickerStyle = 0.toUInt
    val NSClockAndCalendarDatePickerStyle: NSDatePickerStyle = 1.toUInt
    val NSTextFieldDatePickerStyle: NSDatePickerStyle = 2.toUInt
  }

  type NSDatePickerMode = NSUInteger
  object NSDatePickerMode {
    val NSSingleDateMode = 0.toUInt
    val NSRangeDateMode = 1.toUInt
  }

  type NSDatePickerElementFlags = NSUInteger
  object NSDatePickerElementFlags {
    /* Time Elements */
    val NSHourMinuteDatePickerElementFlag       = 0x000c.toUInt
    val NSHourMinuteSecondDatePickerElementFlag = 0x000e.toUInt
    val NSTimeZoneDatePickerElementFlag         = 0x0010.toUInt

    /* Date Elements */
    val NSYearMonthDatePickerElementFlag        = 0x00c0.toUInt
    val NSYearMonthDayDatePickerElementFlag     = 0x00e0.toUInt
    val NSEraDatePickerElementFlag              = 0x0100.toUInt
  }
}
