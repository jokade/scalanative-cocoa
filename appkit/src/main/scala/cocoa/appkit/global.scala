package cocoa.appkit

import cocoa.foundation.{BOOL, NSInteger, NSString}
import objc.runtime.id

import scalanative.native._

@extern
object global {

  type _NSModalSession = Ptr[Byte]
  type NSThreadPrivate = Ptr[Byte]
  type __appFlags = Ptr[Byte]

  def NSApplicationMain(argc: Int, argv: Ptr[CString]): CInt = extern
  def NSApplicationLoad(): BOOL = extern
  def NSShowsServicesMenuItem(itemName: NSString): BOOL = extern
  def NSSetShowsServicesMenuItem(itemName: NSString, enabled: BOOL): NSInteger = extern
  def NSUpdateDynamicServices(): Unit = extern
//  def NSPerformService(itemName: NSString, pboard: NSPasteboard): BOOL = extern
  def NSRegisterServicesProvider(provider: id, name: NSString): Unit = extern
  def NSUnregisterServicesProvider(name: NSString): Unit = extern
}
