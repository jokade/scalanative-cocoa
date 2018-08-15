---
title: Status of CoreData bindings
keywords:
summary:
sidebar: sncocoa_sidebar
permalink: snc_status_coredata.html
folder: sncocoa
datatable: true
missing: <i class="fa fa-close" style="color:red"></i>
ok: <i class="fa fa-check" style="color:green"></i>
partial: <i class="fa fa-adjust" style="color:orange"></i>
test_needed: <i class="fa fa-search" style="color:orange"></i>
---
The following table lists all headers from the macOS CoreData framework (version 6.9),
and their support status in sncocoa.
 
<div class="datatable-begin"></div>

| Header                                 | Status            | Scala modules | Notes |
|----------------------------------------|-------------------|---------------|-------|
| CoreDataDefines.h                      | {{page.missing}}  |               |       | 
| CoreDataErrors.h                       | {{page.missing}}  |               |       | 
| NSAtomicStore.h                        | {{page.missing}}  |               |       | 
| NSAtomicStoreCacheNode.h               | {{page.missing}}  |               |       | 
| NSAttributeDescription.h               | {{page.missing}}  |               |       | 
| NSBatchDeleteRequest.h                 | {{page.missing}}  |               |       | 
| NSBatchUpdateRequest.h                 | {{page.missing}}  |               |       | 
| NSCoreDataCoreSpotlightDelegate.h      | {{page.missing}}  |               |       | 
| NSEntityDescription.h                  | {{page.partial}} {{page.test_needed}}  | NSEntityDescription              |       | 
| NSEntityMapping.h                      | {{page.missing}}  |               |       | 
| NSEntityMigrationPolicy.h              | {{page.missing}}  |               |       | 
| NSExpressionDescription.h              | {{page.missing}}  |               |       | 
| NSFetchIndexDescription.h              | {{page.missing}}  |               |       | 
| NSFetchIndexElementDescription.h       | {{page.missing}}  |               |       | 
| NSFetchRequest.h                       | {{page.missing}}  |               |       | 
| NSFetchRequestExpression.h             | {{page.missing}}  |               |       | 
| NSFetchedPropertyDescription.h         | {{page.missing}}  |               |       | 
| NSFetchedResultsController.h           | {{page.missing}}  |               |       | 
| NSIncrementalStore.h                   | {{page.missing}}  |               |       | 
| NSIncrementalStoreNode.h               | {{page.missing}}  |               |       | 
| NSManagedObject.h                      | {{page.partial}} {{page.test_needed}}  | NSManagedObject      |       | 
| NSManagedObjectContext.h               | {{page.partial}} {{page.test_needed}} | NSManagedObjectContext |       | 
| NSManagedObjectID.h                    | {{page.partial}} {{page.test_needed}} | NSManagedObjectID     |       | 
| NSManagedObjectModel.h                 | {{page.partial}} {{page.test_needed}} | NSManagedObjectModel  |       | 
| NSMappingModel.h                       | {{page.missing}}  |               |       | 
| NSMergePolicy.h                        | {{page.missing}}  |               |       | 
| NSMigrationManager.h                   | {{page.missing}}  |               |       | 
| NSPersistentContainer.h                | {{page.partial}} {{page.test_needed}} | NSPersistentContainer |       | 
| NSPersistentHistoryChange.h            | {{page.missing}}  |               |       | 
| NSPersistentHistoryChangeRequest.h     | {{page.missing}}  |               |       | 
| NSPersistentHistoryToken.h             | {{page.missing}}  |               |       | 
| NSPersistentHistoryTransaction.h       | {{page.missing}}  |               |       | 
| NSPersistentStore.h                    | {{page.missing}}  |               |       | 
| NSPersistentStoreCoordinator.h         | {{page.missing}}  |               |       | 
| NSPersistentStoreDescription.h         | {{page.missing}}  |               |       | 
| NSPersistentStoreRequest.h             | {{page.missing}}  |               |       | 
| NSPersistentStoreResult.h              | {{page.missing}}  |               |       | 
| NSPropertyDescription.h                | {{page.missing}}  |               |       | 
| NSPropertyMapping.h                    | {{page.missing}}  |               |       | 
| NSQueryGenerationToken.h               | {{page.missing}}  |               |       | 
| NSRelationshipDescription.h            | {{page.missing}}  |               |       | 
| NSSaveChangesRequest.h                 | {{page.missing}}  |               |       | 
                                        
<div class="datatable-end"></div>

{% include links.html %}
