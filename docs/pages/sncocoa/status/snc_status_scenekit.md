---
title: Status of SceneKit bindings
keywords:
summary:
sidebar: sncocoa_sidebar
permalink: snc_status_scenekit.html
folder: sncocoa
datatable: true
missing: <i class="fa fa-close" style="color:red"></i>
ok: <i class="fa fa-check" style="color:green"></i>
partial: <i class="fa fa-adjust" style="color:orange"></i>
test_needed: <i class="fa fa-search" style="color:orange"></i>
---
The following table lists all headers from the SceneKit framework, and their support status in sncocoa.
 
<div class="datatable-begin"></div>

| Header                                 | Status            | Scala modules | Notes |
|----------------------------------------|-------------------|---------------|-------|
| ModelIO.h                              | {{page.missing}}  |               |       | 
| SCNAction.h                            | {{page.partial}} {{page.test_needed}}  | SCNAction, SCNActionable |       | 
| SCNAnimation.h                         | {{page.missing}}  |               |       | 
| SCNAudioSource.h                       | {{page.missing}}  |               |       | 
| SCNBoundingVolume.h                    | {{page.missing}}  |               |       | 
| SCNCAAnimationExtensions.h             | {{page.missing}}  |               |       | 
| SCNCamera.h                            | {{page.partial}} {{page.test_needed}} | SCNCamera              |       | 
| SCNCameraController.h                  | {{page.missing}}  |               |       | 
| SCNConstraint.h                        | {{page.partial}} {{page.test_needed}} | SCNConstraint, SCNLookAtConstraint |       | 
| SCNGeometry.h                          | {{page.partial}} {{page.test_needed}} | SCNGeometry, SCNGeometryElement, SCNGeometrySource, SCNGeometryTessellator  |       | 
| SCNHitTest.h                           | {{page.missing}}  |               |       | 
| SCNJavascript.h                        | {{page.missing}}  |               |       | 
| SCNLayer.h                             | {{page.missing}}  |               |       | 
| SCNLevelOfDetail.h                     | {{page.missing}}  |               |       | 
| SCNLight.h                             | {{page.partial}} {{page.test_needed}}  | SCNLight              |       | 
| SCNMaterial.h                          | {{page.partial}} {{page.test_needed}} | SCNMaterial |       | 
| SCNMaterialProperty.h                  | {{page.partial}} {{page.test_needed}} | SCNMaterialProperty |       | 
| SCNMorpher.h                           | {{page.missing}}  |               |       | 
| SCNNode.h                              | {{page.partial}} {{page.test_needed}} | SCNNode, SCNNodeRendererDelegate |       | 
| SCNParametricGeometry.h                | {{page.partial}} {{page.test_needed}} | SCNBox, SCNCapsule, SCNCone, SCNCylinder, SCNFloor, SCNPlane, SCNPyramid, SCNShape, SCNSphere, SCNText, SCNTorus, SCNTube |       | 
| SCNParticleSystem.h                    | {{page.missing}}  |               |       | 
| SCNPhysicsBehavior.h                   | {{page.missing}}  |               |       | 
| SCNPhysicsBody.h                       | {{page.missing}}  |               |       | 
| SCNPhysicsContact.h                    | {{page.missing}}  |               |       | 
| SCNPhysicsField.h                      | {{page.missing}}  |               |       | 
| SCNPhysicsShape.h                      | {{page.missing}}  |               |       | 
| SCNPhysicsWorld.h                      | {{page.missing}}  |               |       | 
| SCNReferenceNode.h                     | {{page.missing}}  |               |       | 
| SCNRenderer.h                          | {{page.missing}}  |               |       | 
| SCNScene.h                             | {{page.partial}} {{page.test_needed}} | SCNScene, SCNSceneExportDelegate |       | 
| SCNSceneRenderer.h                     | {{page.partial}} {{page.test_needed}} | SCNSceneRenderer |       | 
| SCNSceneSource.h                       | {{page.missing}}  |               |       | 
| SCNShadable.h                          | {{page.missing}}  |               |       | 
| SCNSkinner.h                           | {{page.missing}}  |               |       | 
| SCNTechnique.h                         | {{page.missing}}  |               |       | 
| SCNTransaction.h                       | {{page.missing}}  |               |       | 
| SCNView.h                              | {{page.partial}} {{page.test_needed}} | SCNView |       | 
| SceneKit.h                             | {{page.missing}}  |               |       | 
| SceneKitTypes.h                        | {{page.missing}}  |               |       | 

<div class="datatable-end"></div>

{% include links.html %}

