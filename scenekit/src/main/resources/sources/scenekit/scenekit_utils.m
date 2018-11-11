#import <SceneKit/SceneKit.h>

void SCNNode_setPosition(SCNNode *node, CGFloat x, CGFloat y, CGFloat z) {
  node.position = SCNVector3Make(x,y,z);
}

void SCNNode_setRotation(SCNNode *node, CGFloat x, CGFloat y, CGFloat z, CGFloat w) {
  node.rotation = SCNVector4Make(x,y,z,w);
}

void SCNNode_setScale(SCNNode *node, CGFloat x, CGFloat y, CGFloat z) {
  node.scale = SCNVector3Make(x,y,z);
}
