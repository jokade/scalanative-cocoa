package cocoa.foundation

import scalanative.native._
import objc._

@ObjC
class NSBundleResourceRequest extends NSObject {
  @inline def initWithTags_(tags: NSString): NSBundleResourceRequest = extern
  @inline def initWithTags_bundle_(tags: NSString, bundle: NSBundle): NSBundleResourceRequest = extern
  @inline def beginAccessingResourcesWithCompletionHandler_(completionHandler: Ptr[Byte]): Unit = extern
  @inline def conditionallyBeginAccessingResourcesWithCompletionHandler_(completionHandler: Ptr[Byte]): Unit = extern
  @inline def endAccessingResources(): Unit = extern
  @inline def loadingPriority(): Double = extern
  @inline def setLoadingPriority_(loadingPriority: Double): Unit = extern
//  @inline def tags(): NSSet[NSString] = extern
  @inline def bundle(): NSBundle = extern
//  @inline def progress(): NSProgress = extern
}

