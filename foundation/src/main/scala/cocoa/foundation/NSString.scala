//     Project: scalan-cocoa
//      Module:
// Description:
package cocoa.foundation

import de.surfice.smacrotools.debug
import objc.ObjC
import objc.runtime.SEL

import scala.reflect.macros.blackbox
import scala.scalanative.native._
import scala.scalanative.runtime.struct

@ObjC
@debug
final class NSString {
  @inline def hasPrefix(prefix: NSString): BOOL = extern
  @inline def length: NSUInteger = extern
}

object NSString {

  @inline def string: NSString = extern
  @inline def stringWithCString(s: CString, encoding: NSStringEncoding): NSString = extern

  val NSASCIIStringEncoding: NSStringEncoding = 1.toULong
  val NSNEXTSTEPStringEncoding: NSStringEncoding = 2.toULong
  val NSJapaneseEUCStringEncoding: NSStringEncoding = 3.toULong
  val NSUTF8StringEncoding: NSStringEncoding = 4.toULong
  val NSISOLatin1StringEncoding: NSStringEncoding = 5.toULong
  val NSSymbolStringEncoding: NSStringEncoding = 6.toULong
  val NSNonLossyASCIIStringEncoding: NSStringEncoding = 7.toULong
  val NSShiftJISStringEncoding: NSStringEncoding = 8.toULong
  val NSISOLatin2StringEncoding: NSStringEncoding = 9.toULong
  val NSUnicodeStringEncoding: NSStringEncoding = 10.toULong
  val NSWindowsCP1251StringEncoding: NSStringEncoding = 11.toULong
  val NSWindowsCP1252StringEncoding: NSStringEncoding = 12.toULong
  val NSWindowsCP1253StringEncoding: NSStringEncoding = 13.toULong
  val NSWindowsCP1254StringEncoding: NSStringEncoding = 14.toULong
  val NSWindowsCP1250StringEncoding: NSStringEncoding = 15.toULong
  val NSISO2022JPStringEncoding: NSStringEncoding = 21.toULong
  val NSMacOSRomanStringEncoding: NSStringEncoding = 30.toULong
  val NSUTF16StringEncoding: NSStringEncoding = NSUnicodeStringEncoding
  val NSUTF16BigEndianStringEncoding: NSStringEncoding = 0x90000100.toULong
  val NSUTF16LittleEndianStringEncoding: NSStringEncoding = 0x94000100.toULong
  val NSUTF32StringEncoding: NSStringEncoding = 0x8c000100.toULong
  val NSUTF32BigEndianStringEncoding: NSStringEncoding = 0x98000100.toULong
  val NSUTF32LittleEndianStringEncoding: NSStringEncoding = 0x9c000100.toULong
  val NSProprietaryStringEncoding: NSStringEncoding = 65536.toULong

  def apply(cstring: CString): NSString = stringWithCString(cstring,NSUTF8StringEncoding)

  class Macros(val c: blackbox.Context) {
    import c.universe._
    def lengthImpl = q"""_root_.objc.runtime.objc_msgSend(${c.prefix},cocoa.foundation.NSString._sel_length)"""

  }
}
