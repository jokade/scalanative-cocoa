// Copyright (c) 2017. Distributed under the MIT License (see included LICENSE file).
package cocoa.foundation

import scalanative.native._
import objc._

import scala.language.experimental.macros

import scala.scalanative.posix.inttypes.uint32_t

@ObjC
class NSLocale extends NSObject with NSCopying with NSSecureCoding {
  @inline def objectForKey_(key: id): id = extern
  @inline def displayNameForKey_value_(key: id, value: id): NSString = extern
  @inline def initWithLocaleIdentifier_(string: NSString): NSLocale = extern
  @inline def localeIdentifier(): NSString = extern
}


@ObjCClass
abstract class NSLocaleClass extends NSObjectClass {
  @inline def autoupdatingCurrentLocale(): NSLocale = extern
  @inline def currentLocale(): NSLocale = extern
  @inline def systemLocale(): NSLocale = extern
  @inline def localeWithLocaleIdentifier_(ident: NSString): NSLocale = extern
  @inline def availableLocaleIdentifiers(): NSArray[NSString] = extern
  @inline def ISOLanguageCodes(): NSArray[NSString] = extern
  @inline def ISOCountryCodes(): NSArray[NSString] = extern
  @inline def ISOCurrencyCodes(): NSArray[NSString] = extern
  @inline def commonISOCurrencyCodes(): NSArray[NSString] = extern
  @inline def preferredLanguages(): NSArray[NSString] = extern
  @inline def componentsFromLocaleIdentifier_(string: NSString): NSDictionary[NSString, NSString] = extern
  @inline def localeIdentifierFromComponents_(dict: NSString): NSString = extern
  @inline def canonicalLocaleIdentifierFromString_(string: NSString): NSString = extern
  @inline def canonicalLanguageIdentifierFromString_(string: NSString): NSString = extern
  @inline def localeIdentifierFromWindowsLocaleCode_(lcid: uint32_t): NSString = extern
  @inline def windowsLocaleCodeFromLocaleIdentifier_(localeIdentifier: NSString): uint32_t = extern
  @inline def characterDirectionForLanguage_(isoLangCode: NSString): NSLocaleLanguageDirection = extern
  @inline def lineDirectionForLanguage_(isoLangCode: NSString): NSLocaleLanguageDirection = extern
}

object NSLocale extends NSLocaleClass {
  override type InstanceType = NSLocale
}