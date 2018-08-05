// Copyright (c) 2017. Distributed under the MIT License (see included LICENSE file).
package cocoa.foundation

import scalanative.native._

import scala.language.experimental.macros

import scala.scalanative.posix.inttypes.uint32_t

@ObjC
class NSLocale extends NSObject with NSCopying with NSSecureCoding {
  @inline def objectForKey(key: id): id = extern
  @inline def displayNameForKey(key: id, value: id): NSString = extern
  @inline def initWithLocaleIdentifier(string: NSString): NSLocale = extern
  @inline def initWithCoder(aDecoder: NSCoder): NSLocale = extern
  @inline def localeIdentifier(): NSString = extern
}


@ObjCClass
abstract class NSLocaleClass extends NSObjectClass {
  @inline def autoupdatingCurrentLocale(): NSLocale = extern
  @inline def currentLocale(): NSLocale = extern
  @inline def systemLocale(): NSLocale = extern
  @inline def localeWithLocaleIdentifier(ident: NSString): NSLocale = extern
  @inline def availableLocaleIdentifiers(): NSArray[NSString] = extern
  @inline def ISOLanguageCodes(): NSArray[NSString] = extern
  @inline def ISOCountryCodes(): NSArray[NSString] = extern
  @inline def ISOCurrencyCodes(): NSArray[NSString] = extern
  @inline def commonISOCurrencyCodes(): NSArray[NSString] = extern
  @inline def preferredLanguages(): NSArray[NSString] = extern
  @inline def componentsFromLocaleIdentifier(string: NSString): NSDictionary[NSString, NSString] = extern
  @inline def localeIdentifierFromComponents(dict: NSString): NSString = extern
  @inline def canonicalLocaleIdentifierFromString(string: NSString): NSString = extern
  @inline def canonicalLanguageIdentifierFromString(string: NSString): NSString = extern
  @inline def localeIdentifierFromWindowsLocaleCode(lcid: uint32_t): NSString = extern
  @inline def windowsLocaleCodeFromLocaleIdentifier(localeIdentifier: NSString): uint32_t = extern
//  @inline def characterDirectionForLanguage(isoLangCode: NSString): NSLocaleLanguageDirection = extern
//  @inline def lineDirectionForLanguage(isoLangCode: NSString): NSLocaleLanguageDirection = extern
}

object NSLocale extends NSLocaleClass {
  override type InstanceType = NSLocale
}