//     Project: scalanative-cocoa
//      Module: Foundation
// Description: Utility functions for rich Cocoa wrappers.
package cocoa.foundation

import objc.runtime.id

import scala.scalanative.native._

package object util {

  /**
   * Passes the provided object references as a CArray to the specified function.
   *
   * @param objects Objects to be passed as CArray
   * @param f Function called with CArray and number of elements in the array
   * @tparam T
   * @tparam R
   *
   * @note This function is not suited for large sequences since it stackallocates
   *       the CArray and copies the references into it
   */
  def withCArray[T<:NSObject,R](objects: Seq[T])(f: (Ptr[id],Int)=>R): R = Zone { implicit z =>
    val count = objects.size
    val array = stackalloc[id]( sizeof[id] * count)
    for(i<-0 until count)
      !(array + i) = objects(i)
    f(array,count)
  }
}
