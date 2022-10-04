package scala.scalanative.native.objc

import scala.scalanative.native.objc.Block.BlockStruct
import scalanative.native._
import scala.scalanative.unsafe._

trait BlockAlloc {
  protected[objc] def alloc(): Ptr[BlockStruct]
  def free(block: Block): Unit = {}
}

object BlockAlloc {

  object Implicits {
    implicit val global: BlockAlloc = BlockAlloc.global
  }

  def zone(implicit z: Zone): BlockAlloc = new ZoneAlloc

  private class ZoneAlloc(implicit val z: Zone) extends BlockAlloc {
    protected[objc] override def alloc(): Ptr[BlockStruct] = scalanative.unsafe.alloc[BlockStruct]()
  }

  // doesn't currently work -- maybe if we could get the pointer to _NSConcreteStackBlock...
  /*
  object stack extends BlockAlloc {
    override protected[objc] def alloc(): Ptr[BlockStruct] = {
      val ptr = stackalloc[BlockStruct]
      // currently we have no way to get a pointer to a static struct
      !ptr._1 = ext._NSConcreteStackBlock
      ptr
    }
  }
  */

  /**
   * This allocator uses malloc/free to allocate/release blocks.
   */
  object global extends BlockAlloc {
    protected[objc] override def alloc(): Ptr[BlockStruct] = scalanative.libc.stdlib.malloc(sizeof[BlockStruct]).asInstanceOf[Ptr[BlockStruct]]

    override def free(block: Block): Unit = scalanative.libc.stdlib.free(block.asInstanceOf[Ptr[Byte]])
  }

  /*
  @extern
  object ext {

    val _NSConcreteStackBlock: CStruct1[Byte] = extern
  }
  */
}

object BlockZone {
  def apply[R](f: BlockAlloc =>R): R = Zone{ implicit z =>
    f(BlockAlloc.zone)
  }
}
