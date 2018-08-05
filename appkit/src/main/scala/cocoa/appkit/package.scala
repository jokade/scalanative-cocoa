//     Project: scalanative-cocoa
//      Module: AppKit
// Description: Contains enum types defined in AppKit and Scala-specific utilities.

// Copyright (c) 2017. Distributed under the MIT License (see included LICENSE file).
package cocoa

import cocoa.foundation.{NSInteger, NSUInteger}

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

  type NSTextAlignment = NSUInteger
  object NSTextAlignment {
    val NSTextAlignmentLeft       = 0.toUInt   // Visually left aligned
    val NSTextAlignmentCenter_IOS = 1.toUInt   // Visually centered (IOS)
    val NSTextAlignmentRight_IOS  = 2.toUInt   // Visually right aligned (IOS)
    val NSTextAlignmentRight      = 1.toUInt   // Visually right aligned
    val NSTextAlignmentCenter     = 2.toUInt   // Visually centered
    val NSTextAlignmentJustified  = 3.toUInt   // Fully-justified. The last line in a paragraph is natural-aligned.
    val NSTextAlignmentNatural    = 4.toUInt   // Indicates the default alignment for script
  }

  type NSWritingDirection = NSUInteger
  object NSWritingDirection {
    val NSWritingDirectionNatural       = -1   // Determines direction using the Unicode Bidi Algorithm rules P2 and P3
    val NSWritingDirectionLeftToRight   = 0    // Left to right writing direction
    val NSWritingDirectionRightToLeft   = 1    // Right to left writing direction
  }

  type NSButtonType = NSUInteger
  object NSButtonType {
    val NSMomentaryLightButton              = 0.toUInt    // was NSMomentaryPushButton
    val NSPushOnPushOffButton               = 1.toUInt
    val NSToggleButton                      = 2.toUInt
    val NSSwitchButton                      = 3.toUInt
    val NSRadioButton                       = 4.toUInt
    val NSMomentaryChangeButton             = 5.toUInt
    val NSOnOffButton                       = 6.toUInt
    val NSMomentaryPushInButton             = 7.toUInt    // was NSMomentaryLight
    val NSAcceleratorButton                 = 8.toUInt
    val NSMultiLevelAcceleratorButton       = 9.toUInt
  }

  type NSBezelStyle = NSUInteger
  object NSBezelStyle {
    val NSRoundedBezelStyle          = 1.toUInt
    val NSRegularSquareBezelStyle    = 2.toUInt
    val NSThickSquareBezelStyle      = 3.toUInt
    val NSThickerSquareBezelStyle    = 4.toUInt
    val NSDisclosureBezelStyle       = 5.toUInt
    val NSShadowlessSquareBezelStyle = 6.toUInt
    val NSCircularBezelStyle         = 7.toUInt
    val NSTexturedSquareBezelStyle   = 8.toUInt
    val NSHelpButtonBezelStyle       = 9.toUInt
    val NSSmallSquareBezelStyle       = 10.toUInt
    val NSTexturedRoundedBezelStyle   = 11.toUInt
    val NSRoundRectBezelStyle         = 12.toUInt
    val NSRecessedBezelStyle          = 13.toUInt
    val NSRoundedDisclosureBezelStyle = 14.toUInt
    // The inline bezel style contains a solid round-rect border background. It can be used to create an "unread" indicator in an outline view, or another inline button in a tableview, such as a stop progress button in a download panel. Use text for an unread indicator, and a template image for other buttons.
    val NSInlineBezelStyle            = 15.toUInt
  }

  type NSTableViewDropOperation = NSUInteger
  object NSTableViewDropOperation {
    val NSTableViewDropOn = 0.toUInt
    val NSTableViewDropAbove = 1.toUInt
  }

  type NSTableViewColumnAutoresizingStyle = NSUInteger
  object NSTableViewAutoResizingStyle {
    val NSTableViewNoColumnAutoresizing = 0.toUInt
    val NSTableViewUniformColumnAutoresizingStyle = 1.toUInt
    val NSTableViewSequentialColumnAutoresizingStyl = 2.toUInt        // Start with the last autoresizable column, proceed to the first.
    val NSTableViewReverseSequentialColumnAutoresizingStyle = 3.toUInt // Start with the first autoresizable column, proceed to the last.
    val NSTableViewLastColumnOnlyAutoresizingStyle = 4.toUInt
    val NSTableViewFirstColumnOnlyAutoresizingStyle = 5.toUInt
  }

  type NSTableViewGridLineStyle = NSUInteger
  object NSTableViewGridLineStyle {
    val NSTableViewGridNone                    = 0.toUInt
    val NSTableViewSolidVerticalGridLineMask   = 1.toUInt << 0
    val NSTableViewSolidHorizontalGridLineMask = 1.toUInt << 1
    val NSTableViewDashedHorizontalGridLineMask = 1.toUInt << 3
  }

  type NSTableViewRowSizeStyle = NSInteger
  object NSTableViewRowSizeStyle {
    /* The table will use the system default layout size: small, medium or large. */
    val NSTableViewRowSizeStyleDefault = -1

    /* The table will use the -rowHeight or ask the delegate for a variable row height (if implemented) and cell layout is not changed. */
    val NSTableViewRowSizeStyleCustom = 0

    /* The table will use a row height specified for a small/medium or large table.
     It is required that all sizes be fully tested and supported if NSTableViewRowSizeStyleCustom is not used.
     Some standard Aqua metrics may be applied to cells based on the current size. */
    val NSTableViewRowSizeStyleSmall = 1
    val NSTableViewRowSizeStyleMedium = 2
    val NSTableViewRowSizeStyleLarge = 3
  }

  type NSTableViewSelectionHighlightStyle = NSInteger
  object NSTableViewSelectionHighlightStyle {
    /* The highlight style to show no highlight at all. Available in MacOS 10.6 and higher.
     */
    val NSTableViewSelectionHighlightStyleNone = -1

    /* The regular highlight style of NSTableView. On the current OS, a light blue ([NSColor alternateSelectedControlColor]) or light gray color ([NSColor secondarySelectedControlColor]) is used to highlight selected rows.
     */
    val NSTableViewSelectionHighlightStyleRegular = 0

    /* The source list style of NSTableView. On 10.10 and higher, a blur selection is used to highlight rows. Prior to that, a light blue gradient was used. Note: Cells that have a drawsBackground property should have it set to NO. Otherwise, they will draw over the highlighting that NSTableView does. Setting this style will have the side effect of setting the background color to the "source list" background color. Additionally in NSOutlineView, the following properties are changed to get the standard "source list" look: indentationPerLevel, rowHeight and intercellSpacing. After calling setSelectionHighlightStyle: one can change any of the other properties as required. In 10.11, if the background color has been changed from the "source list" background color to something else, the table will no longer draw the selection as a source list blur style, and instead will do a normal blue highlight.
     */
    val NSTableViewSelectionHighlightStyleSourceList = 1
  }

  type NSTableViewDraggingDestinationFeedbackStyle = NSInteger
  object NSTableViewDraggingDestinationFeedbackStyle {
    /* Provides no feedback when the user drags over the table view. This option exists to allow subclasses to implement their dragging destination highlighting, or to make it not show anything all.
   */
    val NSTableViewDraggingDestinationFeedbackStyleNone = -1

    /* Draws a solid selection rectangle background on drop target rows, and an insertion marker between rows. This style should be used in most cases.
     */
    val NSTableViewDraggingDestinationFeedbackStyleRegular = 0

    /* On Mac OS 10.0.2, this style is now identical to NSTableViewDraggingDestinationFeedbackStyleRegular. On previous released it draws an outline on drop target rows, and an insertion marker between rows. This style will automatically be set for source lists when [table setSelectionHighlightStyle:NSTableViewSelectionHighlightStyleSourceList] is called, as it is the standard look for Source Lists, but may be used in other areas as needed.
     */
    val NSTableViewDraggingDestinationFeedbackStyleSourceList = 1

    /* Provides a gap insertion when dragging over the table. Note that this style is only officially supported for View Based TableViews, but may partially work in Cell Based TableViews. The decision to use the gap style (compared to another style) can be made in tableView:draggingSession:willBeginAtPoint:forRowIndexes:, or it can dynamically be changed.
     */
    val NSTableViewDraggingDestinationFeedbackStyleGap = 2
  }
}
