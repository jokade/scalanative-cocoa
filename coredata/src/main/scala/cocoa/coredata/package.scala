// Copyright (c) 2018. Distributed under the MIT License (see included LICENSE file).
package cocoa

import scalanative.native._
import cocoa.foundation.NSUInteger

package object coredata {

  type NSManagedObjectContextConcurrencyType = NSUInteger
  object NSManagedObjectContextConcurrencyType {
    val NSPrivateQueueConcurrencyType		:NSManagedObjectContextConcurrencyType = 1.toULong
    val NSMainQueueConcurrencyType			:NSManagedObjectContextConcurrencyType = 2.toULong
  }

  type NSSnapshotEventType = NSUInteger
  object NSSnapshotEventType {
    val NSSnapshotEventUndoInsertion :NSSnapshotEventType = 1.toULong << 1
    val NSSnapshotEventUndoDeletion  :NSSnapshotEventType = 1.toULong << 2
    val NSSnapshotEventUndoUpdate    :NSSnapshotEventType = 1.toULong << 3
    val NSSnapshotEventRollback      :NSSnapshotEventType = 1.toULong << 4
    val NSSnapshotEventRefresh       :NSSnapshotEventType = 1.toULong << 5
    val NSSnapshotEventMergePolicy   :NSSnapshotEventType = 1.toULong << 6
  }

  type NSPersistentStoreDescription = foundation.NSObject
}
