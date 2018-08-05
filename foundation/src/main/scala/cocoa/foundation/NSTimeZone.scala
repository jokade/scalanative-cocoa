package cocoa.foundation

import scala.language.experimental.macros
import scalanative.native._


@ObjC
class NSTimeZone extends NSObject with NSCopying with NSSecureCoding {
  @inline def secondsFromGMTForDate(aDate: NSDate): NSInteger = extern
  @inline def abbreviationForDate(aDate: NSDate): NSString = extern
  @inline def isDaylightSavingTimeForDate(aDate: NSDate): BOOL = extern
  @inline def daylightSavingTimeOffsetForDate(aDate: NSDate): NSTimeInterval = extern
  @inline def nextDaylightSavingTimeTransitionAfterDate(aDate: NSDate): NSDate = extern
  @inline def name(): NSString = extern
  @inline def data(): NSData = extern
  @inline def isEqualToTimeZone(aTimeZone: NSTimeZone): BOOL = extern
  @inline def localizedName(style: NSTimeZoneNameStyle, locale: NSLocale): NSString = extern
  @inline def secondsFromGMT(): NSInteger = extern
  @inline def abbreviation(): NSString = extern
  @inline def isDaylightSavingTime(): BOOL = extern
  @inline def daylightSavingTimeOffset(): NSTimeInterval = extern
  @inline def nextDaylightSavingTimeTransition(): NSDate = extern
  @inline def initWithName(tzName: NSString): NSTimeZone = extern
  @inline def initWithName(tzName: NSString, aData: NSData): NSTimeZone = extern
}


@ObjCClass
abstract class NSTimeZoneClass extends NSObjectClass {
  @inline def systemTimeZone(): NSTimeZone = extern
  @inline def resetSystemTimeZone(): Unit = extern
  @inline def defaultTimeZone(): NSTimeZone = extern
  @inline def setDefaultTimeZone(aTimeZone: NSTimeZone): Unit = extern
  @inline def localTimeZone(): NSTimeZone = extern
  @inline def knownTimeZoneNames(): NSArray[NSString] = extern
  @inline def abbreviationDictionary(): NSDictionary[NSString, NSString] = extern
  @inline def setAbbreviationDictionary(dict: NSString): Unit = extern
  @inline def timeZoneDataVersion(): NSString = extern
  @inline def timeZoneWithName(tzName: NSString): NSTimeZone = extern
  @inline def timeZoneWithName(tzName: NSString, aData: NSData): NSTimeZone = extern
  @inline def timeZoneForSecondsFromGMT(seconds: NSInteger): NSTimeZone = extern
  @inline def timeZoneWithAbbreviation(abbreviation: NSString): NSTimeZone = extern
}

object NSTimeZone extends NSTimeZoneClass {
  override type InstanceType = NSTimeZone
}