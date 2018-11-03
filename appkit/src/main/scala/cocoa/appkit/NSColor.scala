// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.appkit

import cocoa.foundation._

import scala.language.experimental.macros
import scala.scalanative.native._
import scala.scalanative.native.objc._

@ObjC
class NSColor extends NSObject with NSCopying with NSSecureCoding { //with NSPasteboardReading with NSPasteboardWriting {
  @inline def colorUsingType_(tpe: NSColorType): NSColor = extern
//  @inline def colorUsingColorSpace_(space: NSColorSpace): NSColor = extern
  @inline def highlightWithLevel_(value: CGFloat): NSColor = extern
  @inline def shadowWithLevel_(value: CGFloat): NSColor = extern
  @inline def set(): Unit = extern
  @inline def setFill(): Unit = extern
  @inline def setStroke(): Unit = extern
  @inline def blendedColorWithFraction_color_(fraction: CGFloat, color: NSColor): NSColor = extern
  @inline def colorWithAlphaComponent_(alpha: CGFloat): NSColor = extern
  @inline def getRed_green_blue_alpha_(red: CGFloat, green: CGFloat, blue: CGFloat, alpha: CGFloat): Unit = extern
  @inline def getHue_saturation_brightness_alpha_(hue: CGFloat, saturation: CGFloat, brightness: CGFloat, alpha: CGFloat): Unit = extern
  @inline def getWhite_alpha_(white: CGFloat, alpha: CGFloat): Unit = extern
  @inline def getCyan_magenta_yellow_black_alpha_(cyan: CGFloat, magenta: CGFloat, yellow: CGFloat, black: CGFloat, alpha: CGFloat): Unit = extern
  @inline def getComponents_(components: CGFloat): Unit = extern
//  @inline def writeToPasteboard_(pasteBoard: NSPasteboard): Unit = extern
  @inline def drawSwatchInRect_(rect: NSRect): Unit = extern
  @inline def colorUsingColorSpaceName_deviceDescription_(name: NSColorSpaceName, deviceDescription: id): NSColor = extern
  @inline def colorUsingColorSpaceName_(name: NSColorSpaceName): NSColor = extern
  @inline def tpe(): NSColorType = extern
  @inline def catalogNameComponent(): NSColorListName = extern
  @inline def colorNameComponent(): NSColorName = extern
  @inline def localizedCatalogNameComponent(): NSString = extern
  @inline def localizedColorNameComponent(): NSString = extern
  @inline def redComponent(): CGFloat = extern
  @inline def greenComponent(): CGFloat = extern
  @inline def blueComponent(): CGFloat = extern
  @inline def hueComponent(): CGFloat = extern
  @inline def saturationComponent(): CGFloat = extern
  @inline def brightnessComponent(): CGFloat = extern
  @inline def whiteComponent(): CGFloat = extern
  @inline def cyanComponent(): CGFloat = extern
  @inline def magentaComponent(): CGFloat = extern
  @inline def yellowComponent(): CGFloat = extern
  @inline def blackComponent(): CGFloat = extern
//  @inline def colorSpace(): NSColorSpace = extern
  @inline def numberOfComponents(): NSInteger = extern
  @inline def patternImage(): NSImage = extern
  @inline def alphaComponent(): CGFloat = extern
//  @inline def CGColor(): CGColorRef = extern
  @inline def colorSpaceName(): NSColorSpaceName = extern
}

@ObjCClass
abstract class NSColorClass extends NSObjectClass {
//    @inline def colorWithColorSpace_components_numberOfComponents_(space: NSColorSpace, components: CGFloat, numberOfComponents: NSInteger): NSColor = extern
  @inline def colorWithSRGBRed_green_blue_alpha_(red: CGFloat, green: CGFloat, blue: CGFloat, alpha: CGFloat): NSColor = extern
  @inline def colorWithGenericGamma22White_alpha_(white: CGFloat, alpha: CGFloat): NSColor = extern
  @inline def colorWithDisplayP3Red_green_blue_alpha_(red: CGFloat, green: CGFloat, blue: CGFloat, alpha: CGFloat): NSColor = extern
  @inline def colorWithWhite_alpha_(white: CGFloat, alpha: CGFloat): NSColor = extern
  @inline def colorWithRed_green_blue_alpha_(red: CGFloat, green: CGFloat, blue: CGFloat, alpha: CGFloat): NSColor = extern
  @inline def colorWithHue_saturation_brightness_alpha_(hue: CGFloat, saturation: CGFloat, brightness: CGFloat, alpha: CGFloat): NSColor = extern
//  @inline def colorWithColorSpace_hue_saturation_brightness_alpha_(space: NSColorSpace, hue: CGFloat, saturation: CGFloat, brightness: CGFloat, alpha: CGFloat): NSColor = extern
  @inline def colorWithCatalogName_colorName_(listName: NSColorListName, colorName: NSColorName): NSColor = extern
//  @inline def colorNamed_bundle_(name: NSColorName, bundle: NSBundle): NSColor = extern
  @inline def colorNamed_(name: NSColorName): NSColor = extern
  @inline def colorWithDeviceWhite_alpha_(white: CGFloat, alpha: CGFloat): NSColor = extern
  @inline def colorWithDeviceRed_green_blue_alpha_(red: CGFloat, green: CGFloat, blue: CGFloat, alpha: CGFloat): NSColor = extern
  @inline def colorWithDeviceHue_saturation_brightness_alpha_(hue: CGFloat, saturation: CGFloat, brightness: CGFloat, alpha: CGFloat): NSColor = extern
  @inline def colorWithDeviceCyan_magenta_yellow_black_alpha_(cyan: CGFloat, magenta: CGFloat, yellow: CGFloat, black: CGFloat, alpha: CGFloat): NSColor = extern
  @inline def colorWithCalibratedWhite_alpha_(white: CGFloat, alpha: CGFloat): NSColor = extern
  @inline def colorWithCalibratedRed_green_blue_alpha_(red: CGFloat, green: CGFloat, blue: CGFloat, alpha: CGFloat): NSColor = extern
  @inline def colorWithCalibratedHue_saturation_brightness_alpha_(hue: CGFloat, saturation: CGFloat, brightness: CGFloat, alpha: CGFloat): NSColor = extern
  @inline def colorWithPatternImage_(image: NSImage): NSColor = extern
//  @inline def colorForControlTint_(controlTint: NSControlTint): NSColor = extern
//  @inline def colorFromPasteboard_(pasteBoard: NSPasteboard): NSColor = extern
//  @inline def colorWithCGColor_(cgColor: CGColorRef): NSColor = extern
  @inline def blackColor(): NSColor = extern
  @inline def darkGrayColor(): NSColor = extern
  @inline def lightGrayColor(): NSColor = extern
  @inline def whiteColor(): NSColor = extern
  @inline def grayColor(): NSColor = extern
  @inline def redColor(): NSColor = extern
  @inline def greenColor(): NSColor = extern
  @inline def blueColor(): NSColor = extern
  @inline def cyanColor(): NSColor = extern
  @inline def yellowColor(): NSColor = extern
  @inline def magentaColor(): NSColor = extern
  @inline def orangeColor(): NSColor = extern
  @inline def purpleColor(): NSColor = extern
  @inline def brownColor(): NSColor = extern
  @inline def clearColor(): NSColor = extern
  @inline def controlShadowColor(): NSColor = extern
  @inline def controlDarkShadowColor(): NSColor = extern
  @inline def controlColor(): NSColor = extern
  @inline def controlHighlightColor(): NSColor = extern
  @inline def controlLightHighlightColor(): NSColor = extern
  @inline def controlTextColor(): NSColor = extern
  @inline def controlBackgroundColor(): NSColor = extern
  @inline def selectedControlColor(): NSColor = extern
  @inline def secondarySelectedControlColor(): NSColor = extern
  @inline def selectedControlTextColor(): NSColor = extern
  @inline def disabledControlTextColor(): NSColor = extern
  @inline def textColor(): NSColor = extern
  @inline def textBackgroundColor(): NSColor = extern
  @inline def selectedTextColor(): NSColor = extern
  @inline def selectedTextBackgroundColor(): NSColor = extern
  @inline def gridColor(): NSColor = extern
  @inline def keyboardFocusIndicatorColor(): NSColor = extern
  @inline def windowBackgroundColor(): NSColor = extern
  @inline def underPageBackgroundColor(): NSColor = extern
  @inline def labelColor(): NSColor = extern
  @inline def secondaryLabelColor(): NSColor = extern
  @inline def tertiaryLabelColor(): NSColor = extern
  @inline def quaternaryLabelColor(): NSColor = extern
  @inline def scrollBarColor(): NSColor = extern
  @inline def knobColor(): NSColor = extern
  @inline def selectedKnobColor(): NSColor = extern
  @inline def windowFrameColor(): NSColor = extern
  @inline def windowFrameTextColor(): NSColor = extern
  @inline def selectedMenuItemColor(): NSColor = extern
  @inline def selectedMenuItemTextColor(): NSColor = extern
  @inline def highlightColor(): NSColor = extern
  @inline def shadowColor(): NSColor = extern
  @inline def headerColor(): NSColor = extern
  @inline def headerTextColor(): NSColor = extern
  @inline def alternateSelectedControlColor(): NSColor = extern
  @inline def alternateSelectedControlTextColor(): NSColor = extern
  @inline def scrubberTexturedBackgroundColor(): NSColor = extern
  @inline def controlAlternatingRowBackgroundColors(): NSArray[NSColor] = extern
  @inline def systemRedColor(): NSColor = extern
  @inline def systemGreenColor(): NSColor = extern
  @inline def systemBlueColor(): NSColor = extern
  @inline def systemOrangeColor(): NSColor = extern
  @inline def systemYellowColor(): NSColor = extern
  @inline def systemBrownColor(): NSColor = extern
  @inline def systemPinkColor(): NSColor = extern
  @inline def systemPurpleColor(): NSColor = extern
  @inline def systemGrayColor(): NSColor = extern
//  @inline def currentControlTint(): NSControlTint = extern
  @inline def ignoresAlpha(): BOOL = extern
  @inline def setIgnoresAlpha_(ignoresAlpha: BOOL): Unit = extern
//  @inline def colorWithCIColor_(color: CIColor): NSColor = extern
}

object NSColor extends NSColorClass {
  override type InstanceType = NSColor
}