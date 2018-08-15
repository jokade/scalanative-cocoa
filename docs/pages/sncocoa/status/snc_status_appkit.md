---
title: Status of AppKit bindings
keywords:
summary:
sidebar: sncocoa_sidebar
permalink: snc_status_appkit.html
folder: sncocoa
datatable: true
missing: <i class="fa fa-close" style="color:red"></i>
ok: <i class="fa fa-check" style="color:green"></i>
partial: <i class="fa fa-adjust" style="color:orange"></i>
test_needed: <i class="fa fa-search" style="color:orange"></i>
---
The following table lists all headers from the macOS AppKit framework (version 6.9),
and their support status in SNCocoa.

<div class="datatable-begin"></div>

| Header                                 | Status            | Scala modules | Notes |
|----------------------------------------|-------------------|---------------|-------|
| AppKitDefines.h                        | {{page.missing}}  |               |       | 
| AppKitErrors.h                         | {{page.missing}}  |               |       | 
| NSATSTypesetter.h                      | {{page.missing}}  |               |       | 
| NSAccessibility.h                      | {{page.missing}}  |               |       | 
| NSAccessibilityConstants.h             | {{page.missing}}  |               |       | 
| NSAccessibilityCustomAction.h          | {{page.missing}}  |               |       | 
| NSAccessibilityCustomRotor.h           | {{page.missing}}  |               |       | 
| NSAccessibilityElement.h               | {{page.missing}}  |               |       | 
| NSAccessibilityProtocols.h             | {{page.missing}}  |               |       | 
| NSActionCell.h                         | {{page.missing}}  |               |       | 
| NSAffineTransform.h                    | {{page.missing}}  |               |       | 
| NSAlert.h                              | {{page.partial}} {{page.test_needed}}  | NSAlert, NSAlertDelegate              |       | 
| NSAlignmentFeedbackFilter.h            | {{page.missing}}  |               |       | 
| NSAnimation.h                          | {{page.missing}}  |               |       | 
| NSAnimationContext.h                   | {{page.missing}}  |               |       | 
| NSAppearance.h                         | {{page.missing}}  |               |       | 
| NSAppleScriptExtensions.h              | {{page.missing}}  |               |       | 
| NSApplication.h                        | {{page.partial}} {{page.test_needed}}  | NSApplication, NSApplicationDelegate  |       | 
| NSApplicationScripting.h               | {{page.missing}}  |               |       | 
| NSArrayController.h                    | {{page.partial}} {{page.test_needed}} | NSArrayController              |       | 
| NSAttributedString.h                   | {{page.missing}}  |               |       | 
| NSBezierPath.h                         | {{page.missing}}  |               |       | 
| NSBitmapImageRep.h                     | {{page.missing}}  |               |       | 
| NSBox.h                                | {{page.missing}}  |               |       | 
| NSBrowser.h                            | {{page.missing}}  |               |       | 
| NSBrowserCell.h                        | {{page.missing}}  |               |       | 
| NSButton.h                             | {{page.partial}} {{page.test_needed}} | NSButton              |       | 
| NSButtonCell.h                         | {{page.missing}}  |               |       | 
| NSCIImageRep.h                         | {{page.missing}}  |               |       | 
| NSCachedImageRep.h                     | {{page.missing}}  |               |       | 
| NSCandidateListTouchBarItem.h          | {{page.missing}}  |               |       | 
| NSCell.h                               | {{page.missing}}  |               |       | 
| NSClickGestureRecognizer.h             | {{page.missing}}  |               |       | 
| NSClipView.h                           | {{page.missing}}  |               |       | 
| NSCollectionView.h                     | {{page.missing}}  |               |       | 
| NSCollectionViewFlowLayout.h           | {{page.missing}}  |               |       | 
| NSCollectionViewGridLayout.h           | {{page.missing}}  |               |       | 
| NSCollectionViewLayout.h               | {{page.missing}}  |               |       | 
| NSCollectionViewTransitionLayout.h     | {{page.missing}}  |               |       | 
| NSColor.h                              | {{page.partial}} {{page.test_needed}} | NSColor  |       | 
| NSColorList.h                          | {{page.missing}}  |               |       | 
| NSColorPanel.h                         | {{page.missing}}  |               |       | 
| NSColorPicker.h                        | {{page.missing}}  |               |       | 
| NSColorPickerTouchBarItem.h            | {{page.missing}}  |               |       | 
| NSColorPicking.h                       | {{page.missing}}  |               |       | 
| NSColorSpace.h                         | {{page.missing}}  |               |       | 
| NSColorWell.h                          | {{page.missing}}  |               |       | 
| NSComboBox.h                           | {{page.missing}}  |               |       | 
| NSComboBoxCell.h                       | {{page.missing}}  |               |       | 
| NSControl.h                            | {{page.partial}} {{page.test_needed}} | NSControl, NSControlTextEditingDelegate   |       | 
| NSController.h                         | {{page.ok}} {{page.test_needed}} | NSController              |       | 
| NSCursor.h                             | {{page.missing}}  |               |       | 
| NSCustomImageRep.h                     | {{page.missing}}  |               |       | 
| NSCustomTouchBarItem.h                 | {{page.missing}}  |               |       | 
| NSDataAsset.h                          | {{page.missing}}  |               |       | 
| NSDatePicker.h                         | {{page.missing}}  |               |       | 
| NSDatePickerCell.h                     | {{page.missing}}  |               |       | 
| NSDictionaryController.h               | {{page.missing}}  |               |       | 
| NSDockTile.h                           | {{page.missing}}  |               |       | 
| NSDocument.h                           | {{page.missing}}  |               |       | 
| NSDocumentController.h                 | {{page.missing}}  |               |       | 
| NSDocumentScripting.h                  | {{page.missing}}  |               |       | 
| NSDragging.h                           | {{page.missing}}  |               |       | 
| NSDraggingItem.h                       | {{page.missing}}  |               |       | 
| NSDraggingSession.h                    | {{page.missing}}  |               |       | 
| NSDrawer.h                             | {{page.missing}}  |               |       | 
| NSEPSImageRep.h                        | {{page.missing}}  |               |       | 
| NSErrors.h                             | {{page.missing}}  |               |       | 
| NSEvent.h                              | {{page.partial}} {{test_needed}} | NSEvent              |       | 
| NSFilePromiseProvider.h                | {{page.missing}}  |               |       | 
| NSFilePromiseReceiver.h                | {{page.missing}}  |               |       | 
| NSFileWrapper.h                        | {{page.missing}}  |               |       | 
| NSFileWrapperExtensions.h              | {{page.missing}}  |               |       | 
| NSFont.h                               | {{page.missing}}  |               |       | 
| NSFontAssetRequest.h                   | {{page.missing}}  |               |       | 
| NSFontCollection.h                     | {{page.missing}}  |               |       | 
| NSFontDescriptor.h                     | {{page.missing}}  |               |       | 
| NSFontManager.h                        | {{page.missing}}  |               |       | 
| NSFontPanel.h                          | {{page.missing}}  |               |       | 
| NSForm.h                               | {{page.missing}}  |               |       | 
| NSFormCell.h                           | {{page.missing}}  |               |       | 
| NSGestureRecognizer.h                  | {{page.missing}}  |               |       | 
| NSGlyphGenerator.h                     | {{page.missing}}  |               |       | 
| NSGlyphInfo.h                          | {{page.missing}}  |               |       | 
| NSGradient.h                           | {{page.missing}}  |               |       | 
| NSGraphics.h                           | {{page.missing}}  |               |       | 
| NSGraphicsContext.h                    | {{page.missing}}  |               |       | 
| NSGridView.h                           | {{page.missing}}  |               |       | 
| NSGroupTouchBarItem.h                  | {{page.missing}}  |               |       | 
| NSHapticFeedback.h                     | {{page.missing}}  |               |       | 
| NSHelpManager.h                        | {{page.missing}}  |               |       | 
| NSImage.h                              | {{page.partial}} {{page.test_needed}} | NSImage, NSImageDelegate   |       | 
| NSImageCell.h                          | {{page.missing}}  |               |       | 
| NSImageRep.h                           | {{page.partial}} {{page.test_needed}} | NSImageRep              |       | 
| NSImageView.h                          | {{page.missing}}  |               |       | 
| NSInputManager.h                       | {{page.missing}}  |               |       | 
| NSInputServer.h                        | {{page.missing}}  |               |       | 
| NSInterfaceStyle.h                     | {{page.missing}}  |               |       | 
| NSItemProvider.h                       | {{page.missing}}  |               |       | 
| NSKeyValueBinding.h                    | {{page.missing}}  |               |       | 
| NSLayoutAnchor.h                       | {{page.missing}}  |               |       | 
| NSLayoutConstraint.h                   | {{page.missing}}  |               |       | 
| NSLayoutGuide.h                        | {{page.missing}}  |               |       | 
| NSLayoutManager.h                      | {{page.missing}}  |               |       | 
| NSLevelIndicator.h                     | {{page.missing}}  |               |       | 
| NSLevelIndicatorCell.h                 | {{page.missing}}  |               |       | 
| NSMagnificationGestureRecognizer.h     | {{page.missing}}  |               |       | 
| NSMatrix.h                             | {{page.missing}}  |               |       | 
| NSMediaLibraryBrowserController.h      | {{page.missing}}  |               |       | 
| NSMenu.h                               | {{page.missing}}  |               |       | 
| NSMenuItem.h                           | {{page.missing}}  |               |       | 
| NSMenuItemCell.h                       | {{page.missing}}  |               |       | 
| NSMenuView.h                           | {{page.missing}}  |               |       | 
| NSMovie.h                              | {{page.missing}}  |               |       | 
| NSMovieView.h                          | {{page.missing}}  |               |       | 
| NSNib.h                                | {{page.missing}}  |               |       | 
| NSNibConnector.h                       | {{page.missing}}  |               |       | 
| NSNibControlConnector.h                | {{page.missing}}  |               |       | 
| NSNibDeclarations.h                    | {{page.missing}}  |               |       | 
| NSNibLoading.h                         | {{page.missing}}  |               |       | 
| NSNibOutletConnector.h                 | {{page.missing}}  |               |       | 
| NSObjectController.h                   | {{page.partial}} {{page.test_needed}} | NSObjectController  |       | 
| NSOpenGL.h                             | {{page.missing}}  |               |       | 
| NSOpenGLLayer.h                        | {{page.missing}}  |               |       | 
| NSOpenGLView.h                         | {{page.missing}}  |               |       | 
| NSOpenPanel.h                          | {{page.missing}}  |               |       | 
| NSOutlineView.h                        | {{page.missing}}  |               |       | 
| NSPDFImageRep.h                        | {{page.missing}}  |               |       | 
| NSPDFInfo.h                            | {{page.missing}}  |               |       | 
| NSPDFPanel.h                           | {{page.missing}}  |               |       | 
| NSPICTImageRep.h                       | {{page.missing}}  |               |       | 
| NSPageController.h                     | {{page.missing}}  |               |       | 
| NSPageLayout.h                         | {{page.missing}}  |               |       | 
| NSPanGestureRecognizer.h               | {{page.missing}}  |               |       | 
| NSPanel.h                              | {{page.missing}}  |               |       | 
| NSParagraphStyle.h                     | {{page.missing}}  |               |       | 
| NSPasteboard.h                         | {{page.missing}}  |               |       | 
| NSPasteboardItem.h                     | {{page.missing}}  |               |       | 
| NSPathCell.h                           | {{page.missing}}  |               |       | 
| NSPathComponentCell.h                  | {{page.missing}}  |               |       | 
| NSPathControl.h                        | {{page.missing}}  |               |       | 
| NSPathControlItem.h                    | {{page.missing}}  |               |       | 
| NSPersistentDocument.h                 | {{page.missing}}  |               |       | 
| NSPopUpButton.h                        | {{page.missing}}  |               |       | 
| NSPopUpButtonCell.h                    | {{page.missing}}  |               |       | 
| NSPopover.h                            | {{page.missing}}  |               |       | 
| NSPopoverTouchBarItem.h                | {{page.missing}}  |               |       | 
| NSPredicateEditor.h                    | {{page.missing}}  |               |       | 
| NSPredicateEditorRowTemplate.h         | {{page.missing}}  |               |       | 
| NSPressGestureRecognizer.h             | {{page.missing}}  |               |       | 
| NSPressureConfiguration.h              | {{page.missing}}  |               |       | 
| NSPrintInfo.h                          | {{page.missing}}  |               |       | 
| NSPrintOperation.h                     | {{page.missing}}  |               |       | 
| NSPrintPanel.h                         | {{page.missing}}  |               |       | 
| NSPrinter.h                            | {{page.missing}}  |               |       | 
| NSProgressIndicator.h                  | {{page.missing}}  |               |       | 
| NSQuickDrawView.h                      | {{page.missing}}  |               |       | 
| NSResponder.h                          | {{page.partial}} {{page.test_needed}}  | NSResponder |       | 
| NSRotationGestureRecognizer.h          | {{page.missing}}  |               |       | 
| NSRuleEditor.h                         | {{page.missing}}  |               |       | 
| NSRulerMarker.h                        | {{page.missing}}  |               |       | 
| NSRulerView.h                          | {{page.missing}}  |               |       | 
| NSRunningApplication.h                 | {{page.missing}}  |               |       | 
| NSSavePanel.h                          | {{page.missing}}  |               |       | 
| NSScreen.h                             | {{page.missing}}  |               |       | 
| NSScrollView.h                         | {{page.missing}}  |               |       | 
| NSScroller.h                           | {{page.missing}}  |               |       | 
| NSScrubber.h                           | {{page.missing}}  |               |       | 
| NSScrubberItemView.h                   | {{page.missing}}  |               |       | 
| NSScrubberLayout.h                     | {{page.missing}}  |               |       | 
| NSSearchField.h                        | {{page.missing}}  |               |       | 
| NSSearchFieldCell.h                    | {{page.missing}}  |               |       | 
| NSSecureTextField.h                    | {{page.missing}}  |               |       | 
| NSSegmentedCell.h                      | {{page.missing}}  |               |       | 
| NSSegmentedControl.h                   | {{page.missing}}  |               |       | 
| NSShadow.h                             | {{page.missing}}  |               |       | 
| NSSharingService.h                     | {{page.missing}}  |               |       | 
| NSSharingServicePickerTouchBarItem.h   | {{page.missing}}  |               |       | 
| NSSimpleHorizontalTypesetter.h         | {{page.missing}}  |               |       | 
| NSSlider.h                             | {{page.missing}}  |               |       | 
| NSSliderAccessory.h                    | {{page.missing}}  |               |       | 
| NSSliderCell.h                         | {{page.missing}}  |               |       | 
| NSSliderTouchBarItem.h                 | {{page.missing}}  |               |       | 
| NSSound.h                              | {{page.missing}}  |               |       | 
| NSSpeechRecognizer.h                   | {{page.missing}}  |               |       | 
| NSSpeechSynthesizer.h                  | {{page.missing}}  |               |       | 
| NSSpellChecker.h                       | {{page.missing}}  |               |       | 
| NSSpellProtocol.h                      | {{page.missing}}  |               |       | 
| NSSpellServer.h                        | {{page.missing}}  |               |       | 
| NSSplitView.h                          | {{page.missing}}  |               |       | 
| NSSplitViewController.h                | {{page.missing}}  |               |       | 
| NSSplitViewItem.h                      | {{page.missing}}  |               |       | 
| NSStackView.h                          | {{page.missing}}  |               |       | 
| NSStatusBar.h                          | {{page.missing}}  |               |       | 
| NSStatusBarButton.h                    | {{page.missing}}  |               |       | 
| NSStatusItem.h                         | {{page.missing}}  |               |       | 
| NSStepper.h                            | {{page.missing}}  |               |       | 
| NSStepperCell.h                        | {{page.missing}}  |               |       | 
| NSStoryboard.h                         | {{page.missing}}  |               |       | 
| NSStoryboardSegue.h                    | {{page.missing}}  |               |       | 
| NSStringDrawing.h                      | {{page.missing}}  |               |       | 
| NSTabView.h                            | {{page.missing}}  |               |       | 
| NSTabViewController.h                  | {{page.missing}}  |               |       | 
| NSTabViewItem.h                        | {{page.missing}}  |               |       | 
| NSTableCellView.h                      | {{page.missing}}  |               |       | 
| NSTableColumn.h                        | {{page.missing}}  |               |       | 
| NSTableHeaderCell.h                    | {{page.missing}}  |               |       | 
| NSTableHeaderView.h                    | {{page.missing}}  |               |       | 
| NSTableRowView.h                       | {{page.missing}}  |               |       | 
| NSTableView.h                          | {{page.missing}}  |               |       | 
| NSTableViewRowAction.h                 | {{page.missing}}  |               |       | 
| NSText.h                               | {{page.partial}} {{page.test_needed}} | NSText, NSTextDelegate    |       | 
| NSTextAlternatives.h                   | {{page.missing}}  |               |       | 
| NSTextAttachment.h                     | {{page.missing}}  |               |       | 
| NSTextContainer.h                      | {{page.missing}}  |               |       | 
| NSTextField.h                          | {{page.partial}} {{page.test_needed}} | NSTextField, NSTextFieldDelegate    |       | 
| NSTextFieldCell.h                      | {{page.missing}}  |               |       | 
| NSTextFinder.h                         | {{page.missing}}  |               |       | 
| NSTextInputClient.h                    | {{page.missing}}  |               |       | 
| NSTextInputContext.h                   | {{page.missing}}  |               |       | 
| NSTextList.h                           | {{page.missing}}  |               |       | 
| NSTextStorage.h                        | {{page.missing}}  |               |       | 
| NSTextStorageScripting.h               | {{page.missing}}  |               |       | 
| NSTextTable.h                          | {{page.missing}}  |               |       | 
| NSTextView.h                           | {{page.missing}}  |               |       | 
| NSTitlebarAccessoryViewController.h    | {{page.missing}}  |               |       | 
| NSTokenField.h                         | {{page.missing}}  |               |       | 
| NSTokenFieldCell.h                     | {{page.missing}}  |               |       | 
| NSToolbar.h                            | {{page.missing}}  |               |       | 
| NSToolbarItem.h                        | {{page.missing}}  |               |       | 
| NSToolbarItemGroup.h                   | {{page.missing}}  |               |       | 
| NSTouch.h                              | {{page.missing}}  |               |       | 
| NSTouchBar.h                           | {{page.missing}}  |               |       | 
| NSTouchBarItem.h                       | {{page.missing}}  |               |       | 
| NSTrackingArea.h                       | {{page.missing}}  |               |       | 
| NSTreeController.h                     | {{page.missing}}  |               |       | 
| NSTreeNode.h                           | {{page.missing}}  |               |       | 
| NSTypesetter.h                         | {{page.missing}}  |               |       | 
| NSUserActivity.h                       | {{page.missing}}  |               |       | 
| NSUserDefaultsController.h             | {{page.missing}}  |               |       | 
| NSUserInterfaceCompression.h           | {{page.missing}}  |               |       | 
| NSUserInterfaceItemIdentification.h    | {{page.missing}}  |               |       | 
| NSUserInterfaceItemSearching.h         | {{page.missing}}  |               |       | 
| NSUserInterfaceLayout.h                | {{page.missing}}  |               |       | 
| NSUserInterfaceValidation.h            | {{page.missing}}  |               |       | 
| NSView.h                               | {{page.partial}} {{page.test_needed}} | NSView     |       | 
| NSViewController.h                     | {{page.missing}}  |               |       | 
| NSVisualEffectView.h                   | {{page.missing}}  |               |       | 
| NSWindow.h                             | {{page.partial}} {{page.test_needed}} | NSWindow, NSWindowDelegate  |       | 
| NSWindowController.h                   | {{page.missing}}  |               |       | 
| NSWindowRestoration.h                  | {{page.missing}}  |               |       | 
| NSWindowScripting.h                    | {{page.missing}}  |               |       | 
| NSWindowTab.h                          | {{page.missing}}  |               |       | 
| NSWindowTabGroup.h                     | {{page.missing}}  |               |       | 
| NSWorkspace.h                          | {{page.missing}}  |               |       | 

<div class="datatable-end"></div>

{% include links.html %}
