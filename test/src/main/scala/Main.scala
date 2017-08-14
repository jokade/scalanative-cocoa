//     Project: scalanative-cocoa
//      Module: 
// Description:

import cocoa.foundation._
import global._

import scalanative.native._

object Main extends App {

  val s1 = NSString.string()
//  NSLog("%s",s1)
//  val s2 = NSString.stringWithCString(c"Hello",NSStringEncoding.NSASCIIStringEncoding)
  val s2 = NSString(c"Hello Worldößä&!")

  println(s1.length())
  println(s2.length())
  NSLog(s2)
//  if(!o.isProxy()) {
//    println("yeah!")
//  }
  println("end")
}

