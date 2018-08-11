//     Project: scalanative-cocoa
//      Module: AppKit
// Description: Contains enum types defined in AppKit and Scala-specific utilities.

// Copyright (c) 2017. Distributed under the MIT License (see included LICENSE file).
package cocoa

import cocoa.foundation.{NSInteger, NSUInteger}

import scalanative.native._

package object appkit {

  type CGFloat = CDouble

  type NSEventType = NSUInteger
  object NSEventType {
    val LeftMouseDown             :NSEventType = 1.toULong
    val LeftMouseUp               :NSEventType = 2.toULong
    val RightMouseDown            :NSEventType = 3.toULong
    val RightMouseUp              :NSEventType = 4.toULong
    val MouseMoved                :NSEventType = 5.toULong
    val LeftMouseDragged          :NSEventType = 6.toULong
    val RightMouseDragged         :NSEventType = 7.toULong
    val MouseEntered              :NSEventType = 8.toULong
    val MouseExited               :NSEventType = 9.toULong
    val KeyDown                   :NSEventType = 10.toULong
    val KeyUp                     :NSEventType = 11.toULong
    val FlagsChanged              :NSEventType = 12.toULong
    val AppKitDefined             :NSEventType = 13.toULong
    val SystemDefined             :NSEventType = 14.toULong
    val ApplicationDefined        :NSEventType = 15.toULong
    val Periodic                  :NSEventType = 16.toULong
    val CursorUpdate              :NSEventType = 17.toULong
    val ScrollWheel               :NSEventType = 22.toULong
    val TabletPoint               :NSEventType = 23.toULong
    val TabletProximity           :NSEventType = 24.toULong
    val OtherMouseDown            :NSEventType = 25.toULong
    val OtherMouseUp              :NSEventType = 26.toULong
    val OtherMouseDragged         :NSEventType = 27.toULong
    /* The following event types are available on some hardware on 10.5.2 and later */
    val Gesture        :NSEventType = 29.toULong
    val Magnify        :NSEventType = 30.toULong
    val Swipe          :NSEventType = 31.toULong
    val Rotate         :NSEventType = 18.toULong
    val BeginGesture   :NSEventType = 19.toULong
    val EndGesture     :NSEventType = 20.toULong
    val SmartMagnify   :NSEventType = 32.toULong
    val QuickLook      :NSEventType = 33.toULong
    val Pressure       :NSEventType = 34.toULong
    val DirectTouch    :NSEventType = 37.toULong
  }

  type NSEventMask = CUnsignedLongLong
  object NSEventMask {
    val LeftMouseDown         :NSEventMask = 1.toULong << NSEventType.LeftMouseDown.toInt
    val LeftMouseUp           :NSEventMask = 1.toULong << NSEventType.LeftMouseUp.toInt
    val RightMouseDown        :NSEventMask = 1.toULong << NSEventType.RightMouseDown.toInt
    val RightMouseUp          :NSEventMask = 1.toULong << NSEventType.RightMouseUp.toInt
    val MouseMoved            :NSEventMask = 1.toULong << NSEventType.MouseMoved.toInt
    val LeftMouseDragged      :NSEventMask = 1.toULong << NSEventType.LeftMouseDragged.toInt
    val RightMouseDragged     :NSEventMask = 1.toULong << NSEventType.RightMouseDragged.toInt
    val MouseEntered          :NSEventMask = 1.toULong << NSEventType.MouseEntered.toInt
    val MouseExited           :NSEventMask = 1.toULong << NSEventType.MouseExited.toInt
    val KeyDown               :NSEventMask = 1.toULong << NSEventType.KeyDown.toInt
    val KeyUp                 :NSEventMask = 1.toULong << NSEventType.KeyUp.toInt
    val FlagsChanged          :NSEventMask = 1.toULong << NSEventType.FlagsChanged.toInt
    val AppKitDefined         :NSEventMask = 1.toULong << NSEventType.AppKitDefined.toInt
    val SystemDefined         :NSEventMask = 1.toULong << NSEventType.SystemDefined.toInt
    val ApplicationDefined    :NSEventMask = 1.toULong << NSEventType.ApplicationDefined.toInt
    val Periodic              :NSEventMask = 1.toULong << NSEventType.Periodic.toInt
    val CursorUpdate          :NSEventMask = 1.toULong << NSEventType.CursorUpdate.toInt
    val ScrollWheel           :NSEventMask = 1.toULong << NSEventType.ScrollWheel.toInt
    val TabletPoint           :NSEventMask = 1.toULong << NSEventType.TabletPoint.toInt
    val TabletProximity       :NSEventMask = 1.toULong << NSEventType.TabletProximity.toInt
    val OtherMouseDown        :NSEventMask = 1.toULong << NSEventType.OtherMouseDown.toInt
    val OtherMouseUp          :NSEventMask = 1.toULong << NSEventType.OtherMouseUp.toInt
    val OtherMouseDragged     :NSEventMask = 1.toULong << NSEventType.OtherMouseDragged.toInt
    /* The following event masks are available on some hardware on 10.5.2 and later */
    val Gesture               :NSEventMask = 1.toULong << NSEventType.Gesture.toInt
    val Magnify               :NSEventMask = 1.toULong << NSEventType.Magnify.toInt
    val Swipe                 :NSEventMask = 1.toULong << NSEventType.Swipe.toInt
    val Rotate                :NSEventMask = 1.toULong << NSEventType.Rotate.toInt
    val BeginGesture          :NSEventMask = 1.toULong << NSEventType.BeginGesture.toInt
    val EndGesture            :NSEventMask = 1.toULong << NSEventType.EndGesture.toInt

    /* Note: You can only use these event masks on 64 bit. In other words, you cannot setup a local, nor global, event monitor for these event types on 32 bit. Also, you cannot search the event queue for them (nextEventMatchingMask:...) on 32 bit.
     */
    val SmartMagnify :NSEventMask = 1.toULong << NSEventType.SmartMagnify.toInt
    val Pressure     :NSEventMask = 1.toULong << NSEventType.Pressure.toInt
    val DirectTouch  :NSEventMask = 1.toULong << NSEventType.DirectTouch.toInt
    val Any          :NSEventMask = 0xFFFFFFFF.toULong
  }

  type NSEventModifierFlags = NSUInteger
  object NSEvenModifierFlags {
    val CapsLock           :NSEventModifierFlags = 1.toULong << 16 // Set if Caps Lock key is pressed.
    val Shift              :NSEventModifierFlags = 1.toULong << 17 // Set if Shift key is pressed.
    val Control            :NSEventModifierFlags = 1.toULong << 18 // Set if Control key is pressed.
    val Option             :NSEventModifierFlags = 1.toULong << 19 // Set if Option or Alternate key is pressed.
    val Command            :NSEventModifierFlags = 1.toULong << 20 // Set if Command key is pressed.
    val NumericPad         :NSEventModifierFlags = 1.toULong << 21 // Set if any key in the numeric keypad is pressed.
    val Help               :NSEventModifierFlags = 1.toULong << 22 // Set if the Help key is pressed.
    val Function           :NSEventModifierFlags = 1.toULong << 23 // Set if any function key is pressed.

    // Used to retrieve only the device-independent modifier flags allowing applications to mask off the device-dependent modifier flags including event coalescing information.
    val NSEventModifierFlagDeviceIndependentFlagsMask    :NSEventModifierFlags = 0xffff0000.toULong
  }

  type NSAutoresizingMaskOptions = NSUInteger
  object NSAutoresizingMaskOptions {
    val NotSizable			:NSAutoresizingMaskOptions =  0.toULong
    val MinXMargin			:NSAutoresizingMaskOptions =  1.toULong
    val WidthSizable		:NSAutoresizingMaskOptions =  2.toULong
    val MaxXMargin			:NSAutoresizingMaskOptions =  4.toULong
    val MinYMargin			:NSAutoresizingMaskOptions =  8.toULong
    val HeightSizable		:NSAutoresizingMaskOptions = 16.toULong
    val MaxYMargin			:NSAutoresizingMaskOptions = 32.toULong
  }

  type NSPointingDeviceType = NSUInteger

  type NSEventPhase = NSUInteger
  object NSEventPhase {
    val None        :NSEventPhase = 0.toULong // event not associated with a phase.
    val Began       :NSEventPhase = 1.toULong << 0
    val Stationary  :NSEventPhase = 1.toULong << 1
    val Changed     :NSEventPhase = 1.toULong << 2
    val Ended       :NSEventPhase = 1.toULong << 3
    val Cancelled   :NSEventPhase = 1.toULong << 4
    val MayBegin    :NSEventPhase = 1.toULong << 5
  }

  type NSEventSubtype = CShort
  object NSEventSubtype {
    /* event subtypes for NSEventTypeAppKitDefined events */
    val WindowExposed            :NSEventSubtype = 0.toShort
    val ApplicationActivated     :NSEventSubtype = 1.toShort
    val ApplicationDeactivated   :NSEventSubtype = 2.toShort
    val WindowMoved              :NSEventSubtype = 4.toShort
    val ScreenChanged            :NSEventSubtype = 8.toShort

    /* event subtypes for NSEventTypeSystemDefined events */
    val PowerOff                 :NSEventSubtype = 1.toShort
  }

  type NSPressureBehavior = NSInteger
  object NSPressureBehavior {
    val Unknown            :NSPressureBehavior = -1
    val PrimaryDefault     :NSPressureBehavior = 0
    val PrimaryClick       :NSPressureBehavior = 1
    val PrimaryGeneric     :NSPressureBehavior = 2
    val PrimaryAccelerator :NSPressureBehavior = 3
    val PrimaryDeepClick   :NSPressureBehavior = 5
    val PrimaryDeepDrag    :NSPressureBehavior = 6
  }

  type NSBorderType = NSUInteger
  object NSBorderType {
    val NSNoBorder				:NSBezelStyle = 0.toULong
    val NSLineBorder			:NSBezelStyle = 1.toULong
    val NSBezelBorder			:NSBezelStyle = 2.toULong
    val NSGrooveBorder		:NSBezelStyle = 3.toULong
  }

  type NSViewLayerContentsRedrawPolicy = NSInteger
  object NSViewLayerContentsRedrawPolicy {
    // Leave the layer's contents alone. Never mark the layer as needing display or draw the view's contents to the layer
    val NSViewLayerContentsRedrawNever :NSViewLayerContentsRedrawPolicy = 0
    // Map view -setNeedsDisplay...: activity to the layer and redraw affected layer parts by invoking the view's -drawRect: but don't mark the view or layer as needing display when the view's size changes.
    val NSViewLayerContentsRedrawOnSetNeedsDisplay :NSViewLayerContentsRedrawPolicy = 1
    // Resize the layer and redraw the view to the layer when the view's size changes. If the resize is animated AppKit will drive the resize animation itself and will do this resize+redraw at each step of the animation. Affected parts of the layer will also be redrawn when the view is marked as needing display. (This mode is a superset of NSViewLayerContentsRedrawOnSetNeedsDisplay.)
    val NSViewLayerContentsRedrawDuringViewResize :NSViewLayerContentsRedrawPolicy = 2
    // Resize the layer and redraw the view to the layer when the view's size changes. This will be done just once at the beginning of a resize animation not at each frame of the animation. Affected parts of the layer will also be redrawn when the view is marked as needing display. (This mode is a superset of NSViewLayerContentsRedrawOnSetNeedsDisplay.)
    val NSViewLayerContentsRedrawBeforeViewResize :NSViewLayerContentsRedrawPolicy = 3
    // When a view is resized the layer contents will be redrawn once and the contents will crossfade from the old value to the new value. Use this in conjunction with the layerContentsPlacement to get a nice crossfade animation for complex layer-backed views that can't correctly update on each step of the animation
    val NSViewLayerContentsRedrawCrossfade :NSViewLayerContentsRedrawPolicy = 4
  }

  type NSViewLayerContentsPlacement = NSInteger
  object NSViewLayerContentsPlacement {
    val ScaleAxesIndependently      :NSViewLayerContentsPlacement =  0
    val ScaleProportionallyToFit    :NSViewLayerContentsPlacement =  1
    val ScaleProportionallyToFill   :NSViewLayerContentsPlacement =  2
    val Center                      :NSViewLayerContentsPlacement =  3
    val Top                         :NSViewLayerContentsPlacement =  4
    val TopRight                    :NSViewLayerContentsPlacement =  5
    val Right                       :NSViewLayerContentsPlacement =  6
    val BottomRight                 :NSViewLayerContentsPlacement =  7
    val Bottom                      :NSViewLayerContentsPlacement =  8
    val BottomLeft                  :NSViewLayerContentsPlacement =  9
    val Left                        :NSViewLayerContentsPlacement = 10
    val TopLeft                     :NSViewLayerContentsPlacement = 11
  }

  type NSApplicationPresentationOptions = NSUInteger
  object NSApplicationPresentationOptions {
    val Default                    :NSApplicationPresentationOptions = 0.toULong
    val AutoHideDock               :NSApplicationPresentationOptions = 1.toULong <<  0    // Dock appears when moused to
    val HideDock                   :NSApplicationPresentationOptions = 1.toULong <<  1    // Dock is entirely unavailable

    val AutoHideMenuBar            :NSApplicationPresentationOptions = 1.toULong <<  2    // Menu Bar appears when moused to
    val HideMenuBar                :NSApplicationPresentationOptions = 1.toULong <<  3    // Menu Bar is entirely unavailable

    val DisableAppleMenu           :NSApplicationPresentationOptions = 1.toULong <<  4    // all Apple menu items are disabled
    val DisableProcessSwitching    :NSApplicationPresentationOptions = 1.toULong <<  5    // Cmd+Tab UI is disabled
    val DisableForceQuit           :NSApplicationPresentationOptions = 1.toULong <<  6    // Cmd+Opt+Esc panel is disabled
    val DisableSessionTermination  :NSApplicationPresentationOptions = 1.toULong <<  7    // PowerKey panel and Restart/Shut Down/Log Out disabled
    val DisableHideApplication     :NSApplicationPresentationOptions = 1.toULong <<  8    // Application "Hide" menu item is disabled
    val DisableMenuBarTransparency :NSApplicationPresentationOptions = 1.toULong <<  9    // Menu Bar's transparent appearance is disabled

    val FullScreen                      :NSApplicationPresentationOptions = 1.toULong << 10         // Application is in fullscreen mode
    val AutoHideToolbar                 :NSApplicationPresentationOptions = 1.toULong << 11    // Fullscreen window toolbar is detached from window and hides/shows with autoHidden menuBar.  May be used only when both NSApplicationPresentationFullScreen and NSApplicationPresentationAutoHideMenuBar are also set
    val DisableCursorLocationAssistance :NSApplicationPresentationOptions = 1.toULong << 12    // "Shake mouse pointer to locate" is disabled for this application
  }

  type NSApplicationDelegateReply = NSUInteger
  object NSApplicationDelegateReply {
    val Success :NSApplicationDelegateReply = 0.toULong
    val Cancel  :NSApplicationDelegateReply = 1.toULong
    val Failure :NSApplicationDelegateReply = 2.toULong
  }

  type NSApplicationTerminateReply = NSUInteger
  object NSApplicationTerminateReply {
    val Cancel :NSApplicationTerminateReply = 0.toULong
    val Now    :NSApplicationTerminateReply = 1.toULong
    val Later  :NSApplicationTerminateReply = 2.toULong
  }

  type NSApplicationOcclusionState = NSUInteger
  object NSApplicationOcclusionState {
    val Visible :NSApplicationOcclusionState = 1.toULong << 1
  }

  type NSWindowStyleMask = NSUInteger
  object NSWindowStyleMask {
    val Borderless             :NSWindowStyleMask = 0.toULong
    val Titled                 :NSWindowStyleMask = 1.toULong << 0
    val Closable               :NSWindowStyleMask = 1.toULong << 1
    val Miniaturizable         :NSWindowStyleMask = 1.toULong << 2
    val Resizable	            :NSWindowStyleMask = 1.toULong << 3
    val TexturedBackground     :NSWindowStyleMask = 1.toULong << 8
    val UnifiedTitleAndToolbar :NSWindowStyleMask = 1.toULong << 12
    val FullScreen             :NSWindowStyleMask = 1.toULong << 14
    val FullSizeContentView    :NSWindowStyleMask = 1.toULong << 15
    val UtilityWindow			    :NSWindowStyleMask = 1.toULong << 4
    val DocModalWindow 		    :NSWindowStyleMask = 1.toULong << 6
    val NonactivatingPanel	    :NSWindowStyleMask = 1.toULong << 7 // Specifies that a panel that does not activate the owning application
    val HUDWindow              :NSWindowStyleMask = 1.toULong << 13 // Specifies a heads up display panel
  }

  type NSWindowSharingType = NSUInteger
  object NSWindowSharingType {
    val None      :NSWindowSharingType = 0.toULong                // Window contents may not be read by another process
    val ReadOnly  :NSWindowSharingType = 1.toULong            // Window contents may be read but not modified by another process
    val ReadWrite :NSWindowSharingType = 2.toULong            // Window contents may be read or modified by another process
  }

  type NSWindowBackingLocation = NSUInteger
  object NSWindowBackingLocation {
    val Default     :NSWindowBackingLocation = 0.toULong		// System determines if window backing store is in VRAM or main memory
    val VideoMemory :NSWindowBackingLocation = 1.toULong		// Window backing store is in VRAM
    val MainMemory  :NSWindowBackingLocation = 2.toULong		// Window backing store is in main memory
  }

  type NSWindowCollectionBehavior = NSUInteger
  object NSWindowCollectionBehavior {
    val Default                   :NSWindowCollectionBehavior = 0.toULong
    val CanJoinAllSpaces          :NSWindowCollectionBehavior = 1.toULong << 0
    val MoveToActiveSpace         :NSWindowCollectionBehavior = 1.toULong << 1
    val Managed                   :NSWindowCollectionBehavior = 1.toULong << 2         // participates in spaces exposé.  Default behavior if windowLevel == NSNormalWindowLevel
    val Transient                 :NSWindowCollectionBehavior = 1.toULong << 3       // floats in spaces hidden by exposé.  Default behavior if windowLevel != NSNormalWindowLevel
    val Stationary                :NSWindowCollectionBehavior = 1.toULong << 4      // unaffected by exposé.  Stays visible and stationary like desktop window
    val ParticipatesInCycle       :NSWindowCollectionBehavior = 1.toULong << 5     // default behavior if windowLevel == NSNormalWindowLevel
    val IgnoresCycle              :NSWindowCollectionBehavior = 1.toULong << 6            // default behavior if windowLevel != NSNormalWindowLevel
    val FullScreenPrimary         :NSWindowCollectionBehavior = 1.toULong << 7       // the frontmost window with this collection behavior will be the fullscreen window.
    val FullScreenAuxiliary       :NSWindowCollectionBehavior = 1.toULong << 8     // windows with this collection behavior can be shown with the fullscreen window.
    val FullScreenNone            :NSWindowCollectionBehavior = 1.toULong << 9 // The window can not be made fullscreen when this bit is set
    val FullScreenAllowsTiling    :NSWindowCollectionBehavior = 1.toULong << 11       // This window can be a full screen tile window. It does not have to have FullScreenPrimary set.
    val FullScreenDisallowsTiling :NSWindowCollectionBehavior = 1.toULong << 12      // This window can NOT be made a full screen tile window; it still may be allowed to be a regular FullScreenPrimary window.
  }

  type NSWindowAnimationBehavior = NSInteger
  object NSWindowAnimationBehavior {
    val Default        :NSWindowAnimationBehavior = 0       // let AppKit infer animation behavior for this window
    val None           :NSWindowAnimationBehavior = 2          // suppress inferred animations (don't animate)
    val DocumentWindow :NSWindowAnimationBehavior = 3
    val UtilityWindow  :NSWindowAnimationBehavior = 4
    val AlertPanel     :NSWindowAnimationBehavior = 5
  }

  type NSWindowNumberListOptions = NSUInteger
  object NSWindowNumberListOptions {
    val AllApplications :NSWindowNumberListOptions = 1.toULong << 0
    val AllSpaces       :NSWindowNumberListOptions = 1.toULong << 4
  }

  type NSSelectionDirection = NSUInteger
  object NSSelectionDirection {
    val NSDirectSelection   :NSSelectionDirection = 0.toULong
    val NSSelectingNext     :NSSelectionDirection = 1.toULong
    val NSSelectingPrevious :NSSelectionDirection = 2.toULong
  }

  type NSWindowButton = NSUInteger
  object NSWindowButton {
    val MiniaturizeButton      :NSWindowButton = 0.toULong
    val ZoomButton             :NSWindowButton = 1.toULong
    val ToolbarButton          :NSWindowButton = 2.toULong
    val DocumentIconButton     :NSWindowButton = 3.toULong
    val DocumentVersionsButton :NSWindowButton = 6.toULong
  }

  type NSWindowTitleVisibility = NSInteger
  object NSWindowTitleVisibility {
    val Visible :NSWindowTitleVisibility = 0
    val Hidden  :NSWindowTitleVisibility = 1
  }

  type NSWindowUserTabbingPreference = NSInteger
  object NSWindowUserTabbingPreference {
    val Manual       :NSWindowUserTabbingPreference = 0
    val Always       :NSWindowUserTabbingPreference = 1
    val InFullScreen :NSWindowUserTabbingPreference = 2
  }

  type NSWindowTabbingMode = NSInteger
  object NSWindowTabbingMode {
    val NSWindowTabbingModeAutomatic  :NSWindowTabbingMode = 0 // The system automatically prefers to tab this window when appropriate
    val NSWindowTabbingModePreferred  :NSWindowTabbingMode = 1  // The window explicitly should prefer to tab when shown
    val NSWindowTabbingModeDisallowed :NSWindowTabbingMode = 2 //The window explicitly should not prefer to tab when shown
  }

  type NSDatePickerStyle = NSUInteger
  object NSDatePickerStyle {
    val NSTextFieldAndStepperDatePickerStyle: NSDatePickerStyle = 0.toULong
    val NSClockAndCalendarDatePickerStyle: NSDatePickerStyle = 1.toULong
    val NSTextFieldDatePickerStyle: NSDatePickerStyle = 2.toULong
  }

  type NSDatePickerMode = NSUInteger
  object NSDatePickerMode {
    val NSSingleDateMode :NSDatePickerMode = 0.toULong
    val NSRangeDateMode  :NSDatePickerMode = 1.toULong
  }

  type NSDatePickerElementFlags = NSUInteger
  object NSDatePickerElementFlags {
    /* Time Elements */
    val NSHourMinuteDatePickerElementFlag       :NSDatePickerElementFlags = 0x000c.toULong
    val NSHourMinuteSecondDatePickerElementFlag :NSDatePickerElementFlags = 0x000e.toULong
    val NSTimeZoneDatePickerElementFlag         :NSDatePickerElementFlags = 0x0010.toULong

    /* Date Elements */
    val NSYearMonthDatePickerElementFlag        :NSDatePickerElementFlags = 0x00c0.toULong
    val NSYearMonthDayDatePickerElementFlag     :NSDatePickerElementFlags = 0x00e0.toULong
    val NSEraDatePickerElementFlag              :NSDatePickerElementFlags = 0x0100.toULong
  }

  type NSTextAlignment = NSUInteger
  object NSTextAlignment {
    val Left       :NSTextAlignment = 0.toULong   // Visually left aligned
    val Center_IOS :NSTextAlignment = 1.toULong   // Visually centered (IOS)
    val Right_IOS  :NSTextAlignment = 2.toULong   // Visually right aligned (IOS)
    val Right      :NSTextAlignment = 1.toULong   // Visually right aligned
    val Center     :NSTextAlignment = 2.toULong   // Visually centered
    val Justified  :NSTextAlignment = 3.toULong   // Fully-justified. The last line in a paragraph is natural-aligned.
    val Natural    :NSTextAlignment = 4.toULong   // Indicates the default alignment for script
  }

  type NSWritingDirection = NSInteger
  object NSWritingDirection {
    val Natural      :NSWritingDirection = -1   // Determines direction using the Unicode Bidi Algorithm rules P2 and P3
    val LeftToRight  :NSWritingDirection = 0    // Left to right writing direction
    val RightToLeft  :NSWritingDirection = 1    // Right to left writing direction
  }

  type NSButtonType = NSUInteger
  object NSButtonType {
    val NSMomentaryLightButton             :NSButtonType = 0.toULong    // was NSMomentaryPushButton
    val NSPushOnPushOffButton              :NSButtonType = 1.toULong
    val NSToggleButton                     :NSButtonType = 2.toULong
    val NSSwitchButton                     :NSButtonType = 3.toULong
    val NSRadioButton                      :NSButtonType = 4.toULong
    val NSMomentaryChangeButton            :NSButtonType = 5.toULong
    val NSOnOffButton                      :NSButtonType = 6.toULong
    val NSMomentaryPushInButton            :NSButtonType = 7.toULong    // was NSMomentaryLight
    val NSAcceleratorButton                :NSButtonType = 8.toULong
    val NSMultiLevelAcceleratorButton      :NSButtonType = 9.toULong
  }

  type NSBezelStyle = NSUInteger
  object NSBezelStyle {
    val NSRoundedBezelStyle           :NSBezelStyle = 1.toULong
    val NSRegularSquareBezelStyle     :NSBezelStyle = 2.toULong
    val NSThickSquareBezelStyle       :NSBezelStyle = 3.toULong
    val NSThickerSquareBezelStyle     :NSBezelStyle = 4.toULong
    val NSDisclosureBezelStyle        :NSBezelStyle = 5.toULong
    val NSShadowlessSquareBezelStyle  :NSBezelStyle = 6.toULong
    val NSCircularBezelStyle          :NSBezelStyle = 7.toULong
    val NSTexturedSquareBezelStyle    :NSBezelStyle = 8.toULong
    val NSHelpButtonBezelStyle        :NSBezelStyle = 9.toULong
    val NSSmallSquareBezelStyle       :NSBezelStyle = 10.toULong
    val NSTexturedRoundedBezelStyle   :NSBezelStyle = 11.toULong
    val NSRoundRectBezelStyle         :NSBezelStyle = 12.toULong
    val NSRecessedBezelStyle          :NSBezelStyle = 13.toULong
    val NSRoundedDisclosureBezelStyle :NSBezelStyle = 14.toULong
    // The inline bezel style contains a solid round-rect border background. It can be used to create an "unread" indicator in an outline view, or another inline button in a tableview, such as a stop progress button in a download panel. Use text for an unread indicator, and a template image for other buttons.
    val NSInlineBezelStyle            :NSBezelStyle = 15.toULong
  }

  type NSTableViewDropOperation = NSUInteger
  object NSTableViewDropOperation {
    val NSTableViewDropOn    :NSTableViewDropOperation = 0.toULong
    val NSTableViewDropAbove :NSTableViewDropOperation = 1.toULong
  }

  type NSTableViewColumnAutoresizingStyle = NSUInteger
  object NSTableViewColumnAutoresizingStyle {
    val NoColumnAutoresizing                     :NSTableViewColumnAutoresizingStyle = 0.toULong
    val UniformColumnAutoresizingStyle           :NSTableViewColumnAutoresizingStyle = 1.toULong
    val SequentialColumnAutoresizingStyl         :NSTableViewColumnAutoresizingStyle = 2.toULong // Start with the last autoresizable column, proceed to the first.
    val ReverseSequentialColumnAutoresizingStyle :NSTableViewColumnAutoresizingStyle = 3.toULong // Start with the first autoresizable column, proceed to the last.
    val LastColumnOnlyAutoresizingStyle          :NSTableViewColumnAutoresizingStyle = 4.toULong
    val FirstColumnOnlyAutoresizingStyle         :NSTableViewColumnAutoresizingStyle = 5.toULong
  }

  type NSTableViewGridLineStyle = NSUInteger
  object NSTableViewGridLineStyle {
    val GridNone                     : NSTableViewGridLineStyle = 0.toULong
    val SolidVerticalGridLineMask    : NSTableViewGridLineStyle = 1.toULong << 0
    val SolidHorizontalGridLineMask  : NSTableViewGridLineStyle = 1.toULong << 1
    val DashedHorizontalGridLineMask : NSTableViewGridLineStyle = 1.toULong << 3
  }

  type NSTableViewRowSizeStyle = NSInteger
  object NSTableViewRowSizeStyle {
    /* The table will use the system default layout size: small, medium or large. */
    val RowSizeStyleDefault :NSTableViewRowSizeStyle = -1

    /* The table will use the -rowHeight or ask the delegate for a variable row height (if implemented) and cell layout is not changed. */
    val RowSizeStyleCustom :NSTableViewRowSizeStyle = 0

    /* The table will use a row height specified for a small/medium or large table.
     It is required that all sizes be fully tested and supported if NSTableViewRowSizeStyleCustom is not used.
     Some standard Aqua metrics may be applied to cells based on the current size. */
    val RowSizeStyleSmall :NSTableViewRowSizeStyle = 1
    val RowSizeStyleMedium :NSTableViewRowSizeStyle = 2
    val RowSizeStyleLarge :NSTableViewRowSizeStyle = 3
  }

  type NSTableViewSelectionHighlightStyle = NSInteger
  object NSTableViewSelectionHighlightStyle {
    /* The highlight style to show no highlight at all. Available in MacOS 10.6 and higher.
     */
    val SelectionHighlightStyleNone :NSTableViewSelectionHighlightStyle = -1

    /* The regular highlight style of NSTableView. On the current OS, a light blue ([NSColor alternateSelectedControlColor]) or light gray color ([NSColor secondarySelectedControlColor]) is used to highlight selected rows.
     */
    val SelectionHighlightStyleRegular :NSTableViewSelectionHighlightStyle= 0

    /* The source list style of NSTableView. On 10.10 and higher, a blur selection is used to highlight rows. Prior to that, a light blue gradient was used. Note: Cells that have a drawsBackground property should have it set to NO. Otherwise, they will draw over the highlighting that NSTableView does. Setting this style will have the side effect of setting the background color to the "source list" background color. Additionally in NSOutlineView, the following properties are changed to get the standard "source list" look: indentationPerLevel, rowHeight and intercellSpacing. After calling setSelectionHighlightStyle: one can change any of the other properties as required. In 10.11, if the background color has been changed from the "source list" background color to something else, the table will no longer draw the selection as a source list blur style, and instead will do a normal blue highlight.
     */
    val SelectionHighlightStyleSourceList :NSTableViewSelectionHighlightStyle= 1
  }

  type NSTableViewDraggingDestinationFeedbackStyle = NSInteger
  object NSTableViewDraggingDestinationFeedbackStyle {
    /* Provides no feedback when the user drags over the table view. This option exists to allow subclasses to implement their dragging destination highlighting, or to make it not show anything all.
   */
    val None :NSTableViewDraggingDestinationFeedbackStyle = -1

    /* Draws a solid selection rectangle background on drop target rows, and an insertion marker between rows. This style should be used in most cases.
     */
    val Regular :NSTableViewDraggingDestinationFeedbackStyle = 0

    /* On Mac OS 10.0.2, this style is now identical to NSTableViewDraggingDestinationFeedbackStyleRegular. On previous released it draws an outline on drop target rows, and an insertion marker between rows. This style will automatically be set for source lists when [table setSelectionHighlightStyle:NSTableViewSelectionHighlightStyleSourceList] is called, as it is the standard look for Source Lists, but may be used in other areas as needed.
     */
    val SourceList :NSTableViewDraggingDestinationFeedbackStyle = 1

    /* Provides a gap insertion when dragging over the table. Note that this style is only officially supported for View Based TableViews, but may partially work in Cell Based TableViews. The decision to use the gap style (compared to another style) can be made in tableView:draggingSession:willBeginAtPoint:forRowIndexes:, or it can dynamically be changed.
     */
    val Gap :NSTableViewDraggingDestinationFeedbackStyle = 2
  }
}
