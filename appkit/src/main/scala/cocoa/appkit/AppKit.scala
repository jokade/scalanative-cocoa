// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa.appkit

import scalanative.native._
import cocoa.foundation._

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
