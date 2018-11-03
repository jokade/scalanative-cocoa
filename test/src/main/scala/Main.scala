import scala.scalanative.native._
import objc._
import cocoa.foundation._

object Main {

  def main(args: Array[String]): Unit = {
    val str = NSString("Hello€, wörld!")
    val i = @@(42)
    val arr = NSArray(i,str)
    NSLog(str)
    NSLog(arr)
    println("done!")
  }

}


