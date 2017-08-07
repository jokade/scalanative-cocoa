import cocoa.foundation.NSLog

import scala.scalanative.native
//     Project: scalanative-cocoa
//      Module: 
// Description: 

import cocoa.foundation._
import objc.runtime._
import scalanative.native._

object Main extends App {
  val s = ns"My first app!"
  val l = s.length
  println(l)
  if(s.hasPrefix(ns"My"))
    println("YEAH")
//  val l = objc_msgSend(s,sel_registerName(c"length"))
  NSLog(s)
  println("end")
}
