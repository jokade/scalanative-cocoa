package cocoa.appkit

import cocoa.foundation.{BOOL, NSInteger, NSString}
import scalanative.native._
import objc.runtime.id


@extern
object AppKit {


  // from NSApplication.h
  type _NSModalSession = Ptr[Byte]
  type NSThreadPrivate = Ptr[Byte]
  type __appFlags = Ptr[Byte]
  def NSApplicationMain(argc: CInt, argv: Ptr[Ptr[CSignedChar]]): CInt = extern
  def NSApplicationLoad(): BOOL = extern
  def NSShowsServicesMenuItem(itemName: NSString): BOOL = extern
  def NSSetShowsServicesMenuItem(itemName: NSString, enabled: BOOL): NSInteger = extern
  def NSUpdateDynamicServices(): Unit = extern
//  def NSPerformService_pboard_(itemName: NSString, pboard: NSPasteboard): BOOL = extern
//  def NSRegisterServicesProvider_name_(provider: id, name: NSServiceProviderName): Unit = extern
//  def NSUnregisterServicesProvider_(name: NSServiceProviderName): Unit = extern


  // from NSEvent.h
  def NSEventMaskFromType_(`type`: NSEventType): NSEventMask = extern

}
