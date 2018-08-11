---
title: Status of Foundation bindings
keywords:
summary:
sidebar: sncocoa_sidebar
permalink: snc_status_foundation.html
folder: sncocoa
datatable: true
missing: <i class="fa fa-close" style="color:red"></i>
ok: <i class="fa fa-check" style="color:green"></i>
partial: <i class="fa fa-adjust" style="color:orange"></i>
test_needed: <i class="fa fa-search" style="color:orange"></i>
---
The following table lists all headers from the macOS Foundation framework (version 6.9),
and their support status in sncocoa. Although the SNCocoa bindings are created from the macOS Foundation headers,
they although work on iOS (for supported features).

<div class="datatable-begin"></div>

| Header                                 | Status            | Scala modules | Notes |
|----------------------------------------|-------------------|---------------|-------|
| FoundationLegacySwiftCompatibility.h   | {{page.missing}}  |               |       | 
| NSAffineTransform.h                    | {{page.missing}}  |               |       | 
| NSAppleEventDescriptor.h               | {{page.missing}}  |               |       | 
| NSAppleEventManager.h                  | {{page.missing}}  |               |       | 
| NSAppleScript.h                        | {{page.missing}}  |               |       | 
| NSArchiver.h                           | {{page.missing}}  |               |       | 
| NSArray.h                              | {{page.partial}} {{page.test_needed}} | NSArray, NSMutableArray              |       | 
| NSAttributedString.h                   | {{page.missing}}  |               |       | 
| NSAutoreleasePool.h                    | {{page.missing}}  |               |       | 
| NSBackgroundActivityScheduler.h        | {{page.missing}}  |               |       | 
| NSBundle.h                             | {{page.missing}}  |               |       | 
| NSByteCountFormatter.h                 | {{page.missing}}  |               |       | 
| NSByteOrder.h                          | {{page.missing}}  |               |       | 
| NSCache.h                              | {{page.missing}}  |               |       | 
| NSCalendar.h                           | {{page.missing}}  |               |       | 
| NSCalendarDate.h                       | {{page.missing}}  |               |       | 
| NSCharacterSet.h                       | {{page.ok}} {{page.test_needed}}  | NSCharacterSet, NSMutableCharacterSet |       | 
| NSClassDescription.h                   | {{page.missing}}  |               |       | 
| NSCoder.h                              | {{page.ok}} {{page.test_needed}}  | NSCoder, Foundation    |       | 
| NSComparisonPredicate.h                | {{page.missing}}  |               |       | 
| NSCompoundPredicate.h                  | {{page.missing}}  |               |       | 
| NSConnection.h                         | {{page.missing}}  |               |       | 
| NSData.h                               | {{page.partial}} {{page.test_needed}} | NSData, NSMutableData, NSPurgeableData, foundation |       | 
| NSDate.h                               | {{page.missing}}  |               |       | 
| NSDateComponentsFormatter.h            | {{page.missing}}  |               |       | 
| NSDateFormatter.h                      | {{page.missing}}  |               |       | 
| NSDateInterval.h                       | {{page.missing}}  |               |       | 
| NSDateIntervalFormatter.h              | {{page.missing}}  |               |       | 
| NSDebug.h                              | {{page.missing}}  |               |       | 
| NSDecimal.h                            | {{page.missing}}  |               |       | 
| NSDecimalNumber.h                      | {{page.missing}}  |               |       | 
| NSDictionary.h                         | {{page.partial}} {{page.test_needed}} | NSDictionary, NSMutableDictionary |       | 
| NSDistantObject.h                      | {{page.missing}}  |               |       | 
| NSDistributedLock.h                    | {{page.missing}}  |               |       | 
| NSDistributedNotificationCenter.h      | {{page.missing}}  |               |       | 
| NSEnergyFormatter.h                    | {{page.missing}}  |               |       | 
| NSEnumerator.h                         | {{page.ok}} {{page.test_needed}}  | NSEnumerator, NSFastEnumeration |       | 
| NSError.h                              | {{page.ok}} {{page.test_needed}}  | NSError, NSObject   |       | 
| NSException.h                          | {{page.missing}}  |               |       | 
| NSExpression.h                         | {{page.missing}}  |               |       | 
| NSExtensionContext.h                   | {{page.missing}}  |               |       | 
| NSExtensionItem.h                      | {{page.missing}}  |               |       | 
| NSExtensionRequestHandling.h           | {{page.missing}}  |               |       | 
| NSFileCoordinator.h                    | {{page.missing}}  |               |       | 
| NSFileHandle.h                         | {{page.missing}}  |               |       | 
| NSFileManager.h                        | {{page.missing}}  |               |       | 
| NSFilePresenter.h                      | {{page.missing}}  |               |       | 
| NSFileVersion.h                        | {{page.missing}}  |               |       | 
| NSFileWrapper.h                        | {{page.missing}}  |               |       | 
| NSFormatter.h                          | {{page.missing}}  |               |       | 
| NSGarbageCollector.h                   | {{page.missing}}  |               |       | 
| NSGeometry.h                           | {{page.missing}}  |               |       | 
| NSHFSFileTypes.h                       | {{page.missing}}  |               |       | 
| NSHTTPCookie.h                         | {{page.missing}}  |               |       | 
| NSHTTPCookieStorage.h                  | {{page.missing}}  |               |       | 
| NSHashTable.h                          | {{page.missing}}  |               |       | 
| NSHost.h                               | {{page.missing}}  |               |       | 
| NSISO8601DateFormatter.h               | {{page.missing}}  |               |       | 
| NSIndexPath.h                          | {{page.missing}}  |               |       | 
| NSIndexSet.h                           | {{page.ok}} {{page.test_needed}}  | NSIndexSet, NSMutableIndexSet  |       | 
| NSInvocation.h                         | {{page.missing}}  |               |       | 
| NSItemProvider.h                       | {{page.missing}}  |               |       | 
| NSItemProviderReadingWriting.h         | {{page.missing}}  |               |       | 
| NSJSONSerialization.h                  | {{page.missing}}  |               |       | 
| NSKeyValueCoding.h                     | {{page.missing}}  |               |       | 
| NSKeyValueObserving.h                  | {{page.missing}}  |               |       | 
| NSKeyedArchiver.h                      | {{page.missing}}  |               |       | 
| NSLengthFormatter.h                    | {{page.missing}}  |               |       | 
| NSLinguisticTagger.h                   | {{page.missing}}  |               |       | 
| NSLocale.h                             | {{page.partial}} {{page.test_needed}} | NSLocale, Foundation              |       | 
| NSLock.h                               | {{page.missing}}  |               |       | 
| NSMapTable.h                           | {{page.missing}}  |               |       | 
| NSMassFormatter.h                      | {{page.missing}}  |               |       | 
| NSMeasurement.h                        | {{page.missing}}  |               |       | 
| NSMeasurementFormatter.h               | {{page.missing}}  |               |       | 
| NSMetadata.h                           | {{page.missing}}  |               |       | 
| NSMetadataAttributes.h                 | {{page.missing}}  |               |       | 
| NSMethodSignature.h                    | {{page.missing}}  |               |       | 
| NSNetServices.h                        | {{page.missing}}  |               |       | 
| NSNotification.h                       | {{page.ok}} {{test_needed}}  | NSNotification, NSNotificationCenter |       | 
| NSNotificationQueue.h                  | {{page.missing}}  |               |       | 
| NSNull.h                               | {{page.missing}}  |               |       | 
| NSNumberFormatter.h                    | {{page.missing}}  |               |       | 
| NSObjCRuntime.h                        | {{page.missing}}  |               |       | 
| NSObject.h                             | {{page.partial}} {{page.test_needed}}  | Foundation, NSObject  |       | 
| NSObjectScripting.h                    | {{page.missing}}  |               |       | 
| NSOperation.h                          | {{page.missing}}  |               |       | 
| NSOrderedSet.h                         | {{page.missing}}  |               |       | 
| NSOrthography.h                        | {{page.missing}}  |               |       | 
| NSPathUtilities.h                      | {{page.missing}}  |               |       | 
| NSPersonNameComponents.h               | {{page.missing}}  |               |       | 
| NSPersonNameComponentsFormatter.h      | {{page.missing}}  |               |       | 
| NSPointerArray.h                       | {{page.missing}}  |               |       | 
| NSPointerFunctions.h                   | {{page.missing}}  |               |       | 
| NSPort.h                               | {{page.missing}}  |               |       | 
| NSPortCoder.h                          | {{page.missing}}  |               |       | 
| NSPortMessage.h                        | {{page.missing}}  |               |       | 
| NSPortNameServer.h                     | {{page.missing}}  |               |       | 
| NSPredicate.h                          | {{page.missing}}  |               |       | 
| NSProcessInfo.h                        | {{page.missing}}  |               |       | 
| NSProgress.h                           | {{page.missing}}  |               |       | 
| NSPropertyList.h                       | {{page.missing}}  |               |       | 
| NSProtocolChecker.h                    | {{page.missing}}  |               |       | 
| NSProxy.h                              | {{page.missing}}  |               |       | 
| NSRange.h                              | {{page.missing}}  |               |       | 
| NSRegularExpression.h                  | {{page.missing}}  |               |       | 
| NSRunLoop.h                            | {{page.missing}}  |               |       | 
| NSScanner.h                            | {{page.missing}}  |               |       | 
| NSScriptClassDescription.h             | {{page.missing}}  |               |       | 
| NSScriptCoercionHandler.h              | {{page.missing}}  |               |       | 
| NSScriptCommand.h                      | {{page.missing}}  |               |       | 
| NSScriptCommandDescription.h           | {{page.missing}}  |               |       | 
| NSScriptExecutionContext.h             | {{page.missing}}  |               |       | 
| NSScriptKeyValueCoding.h               | {{page.missing}}  |               |       | 
| NSScriptObjectSpecifiers.h             | {{page.missing}}  |               |       | 
| NSScriptStandardSuiteCommands.h        | {{page.missing}}  |               |       | 
| NSScriptSuiteRegistry.h                | {{page.missing}}  |               |       | 
| NSScriptWhoseTests.h                   | {{page.missing}}  |               |       | 
| NSSet.h                                | {{page.missing}}  |               |       | 
| NSSortDescriptor.h                     | {{page.missing}}  |               |       | 
| NSSpellServer.h                        | {{page.missing}}  |               |       | 
| NSStream.h                             | {{page.missing}}  |               |       | 
| NSString.h                             | {{page.partial}} {{page.test_needed}} | NSString, NSCoding              |       | 
| NSTask.h                               | {{page.missing}}  |               |       | 
| NSTextCheckingResult.h                 | {{page.missing}}  |               |       | 
| NSThread.h                             | {{page.missing}}  |               |       | 
| NSTimeZone.h                           | {{page.missing}}  |               |       | 
| NSTimer.h                              | {{page.missing}}  |               |       | 
| NSURL.h                                | {{page.partial}} {{page.test_needed}} | NSURL, NSURLQueryItem, NSURLComponents, NSString, NSCharacterSet    |       | 
| NSURLAuthenticationChallenge.h         | {{page.missing}}  |               |       | 
| NSURLCache.h                           | {{page.missing}}  |               |       | 
| NSURLConnection.h                      | {{page.missing}}  |               |       | 
| NSURLCredential.h                      | {{page.missing}}  |               |       | 
| NSURLCredentialStorage.h               | {{page.missing}}  |               |       | 
| NSURLDownload.h                        | {{page.missing}}  |               |       | 
| NSURLError.h                           | {{page.missing}}  |               |       | 
| NSURLHandle.h                          | {{page.missing}}  |               |       | 
| NSURLProtectionSpace.h                 | {{page.missing}}  |               |       | 
| NSURLProtocol.h                        | {{page.missing}}  |               |       | 
| NSURLRequest.h                         | {{page.missing}}  |               |       | 
| NSURLResponse.h                        | {{page.missing}}  |               |       | 
| NSURLSession.h                         | {{page.missing}}  |               |       | 
| NSUUID.h                               | {{page.missing}}  |               |       | 
| NSUbiquitousKeyValueStore.h            | {{page.missing}}  |               |       | 
| NSUndoManager.h                        | {{page.missing}}  |               |       | 
| NSUnit.h                               | {{page.missing}}  |               |       | 
| NSUserActivity.h                       | {{page.missing}}  |               |       | 
| NSUserDefaults.h                       | {{page.missing}}  |               |       | 
| NSUserNotification.h                   | {{page.missing}}  |               |       | 
| NSUserScriptTask.h                     | {{page.missing}}  |               |       | 
| NSValue.h                              | {{page.ok}} {{page.test_needed}}  | NSValue, NSNumber  |       | 
| NSValueTransformer.h                   | {{page.missing}}  |               |       | 
| NSXMLDTD.h                             | {{page.missing}}  |               |       | 
| NSXMLDTDNode.h                         | {{page.missing}}  |               |       | 
| NSXMLDocument.h                        | {{page.missing}}  |               |       | 
| NSXMLElement.h                         | {{page.missing}}  |               |       | 
| NSXMLNode.h                            | {{page.missing}}  |               |       | 
| NSXMLNodeOptions.h                     | {{page.missing}}  |               |       | 
| NSXMLParser.h                          | {{page.missing}}  |               |       | 
| NSXPCConnection.h                      | {{page.missing}}  |               |       | 
| NSZone.h                               | {{page.missing}}  |               |       | 
                                        
<div class="datatable-end"></div>

{% include links.html %}
