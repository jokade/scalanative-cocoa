package cocoa.foundation

import scala.language.experimental.macros
import scalanative.native._
import objc._

@ObjC
class NSBundle extends NSObject {
  @inline def initWithPath_(path: NSString): NSBundle = extern
  @inline def initWithURL_(url: NSURL): NSBundle = extern
  @inline def load(): BOOL = extern
  @inline def unload(): BOOL = extern
  @inline def preflightAndReturnError_(error: NSError): BOOL = extern
  @inline def loadAndReturnError_(error: NSError): BOOL = extern
  @inline def URLForAuxiliaryExecutable_(executableName: NSString): NSURL = extern
  @inline def pathForAuxiliaryExecutable_(executableName: NSString): NSString = extern
  @inline def URLForResource_ext_(name: NSString, ext: NSString): NSURL = extern
  @inline def URLForResource_ext_subpath_(name: NSString, ext: NSString, subpath: NSString): NSURL = extern
  @inline def URLForResource_ext_subpath_localizationName_(name: NSString, ext: NSString, subpath: NSString, localizationName: NSString): NSURL = extern
  @inline def URLsForResourcesWithExtension_subpath_(ext: NSString, subpath: NSString): NSArray[NSURL] = extern
  @inline def URLsForResourcesWithExtension_subpath_localizationName_(ext: NSString, subpath: NSString, localizationName: NSString): NSArray[NSURL] = extern
  @inline def pathForResource_ext_(name: NSString, ext: NSString): NSString = extern
  @inline def pathForResource_ext_subpath_(name: NSString, ext: NSString, subpath: NSString): NSString = extern
  @inline def pathForResource_ext_subpath_localizationName_(name: NSString, ext: NSString, subpath: NSString, localizationName: NSString): NSString = extern
  @inline def pathsForResourcesOfType_subpath_(ext: NSString, subpath: NSString): NSArray[NSString] = extern
  @inline def pathsForResourcesOfType_subpath_localizationName_(ext: NSString, subpath: NSString, localizationName: NSString): NSArray[NSString] = extern
  @inline def localizedStringForKey_value_tableName_(key: NSString, value: NSString, tableName: NSString): NSString = extern
  @inline def objectForInfoDictionaryKey_(key: NSString): id = extern
  @inline def classNamed_(className: NSString): id = extern
  @inline def isLoaded(): BOOL = extern
  @inline def bundleURL(): NSURL = extern
  @inline def resourceURL(): NSURL = extern
  @inline def executableURL(): NSURL = extern
  @inline def privateFrameworksURL(): NSURL = extern
  @inline def sharedFrameworksURL(): NSURL = extern
  @inline def sharedSupportURL(): NSURL = extern
  @inline def builtInPlugInsURL(): NSURL = extern
  @inline def appStoreReceiptURL(): NSURL = extern
  @inline def bundlePath(): NSString = extern
  @inline def resourcePath(): NSString = extern
  @inline def executablePath(): NSString = extern
  @inline def privateFrameworksPath(): NSString = extern
  @inline def sharedFrameworksPath(): NSString = extern
  @inline def sharedSupportPath(): NSString = extern
  @inline def builtInPlugInsPath(): NSString = extern
  @inline def bundleIdentifier(): NSString = extern
  @inline def infoDictionary(): NSDictionary[NSString, NSObject] = extern
  @inline def localizedInfoDictionary(): NSDictionary[NSString, NSObject] = extern
  @inline def principalClass(): id = extern
  @inline def preferredLocalizations(): NSArray[NSString] = extern
  @inline def localizations(): NSArray[NSString] = extern
  @inline def developmentLocalization(): NSString = extern
  @inline def executableArchitectures(): NSArray[NSNumber] = extern
  @inline def setPreservationPriority_tags_(priority: Double, tags: NSString): Unit = extern
  @inline def preservationPriorityForTag_(tag: NSString): Double = extern
}

@ObjCClass
abstract class NSBundleClass extends NSObjectClass {
  @inline def bundleWithPath_(path: NSString): NSBundle = extern
  @inline def bundleWithURL_(url: NSURL): NSBundle = extern
  @inline def bundleForClass_(aClass: id): NSBundle = extern
  @inline def bundleWithIdentifier_(identifier: NSString): NSBundle = extern
  @inline def URLForResource_ext_subpath_bundleURL_(name: NSString, ext: NSString, subpath: NSString, bundleURL: NSURL): NSURL = extern
  @inline def URLsForResourcesWithExtension_subpath_bundleURL_(ext: NSString, subpath: NSString, bundleURL: NSURL): NSArray[NSURL] = extern
  @inline def pathForResource_ext_bundlePath_(name: NSString, ext: NSString, bundlePath: NSString): NSString = extern
  @inline def pathsForResourcesOfType_bundlePath_(ext: NSString, bundlePath: NSString): NSArray[NSString] = extern
  @inline def preferredLocalizationsFromArray_(localizationsArray: NSString): NSArray[NSString] = extern
  @inline def preferredLocalizationsFromArray_preferencesArray_(localizationsArray: NSString, preferencesArray: NSString): NSArray[NSString] = extern
  @inline def mainBundle(): NSBundle = extern
  @inline def allBundles(): NSArray[NSBundle] = extern
  @inline def allFrameworks(): NSArray[NSBundle] = extern
}

object NSBundle extends NSBundleClass {
  override type InstanceType = NSBundle
}
