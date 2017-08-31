---
title: Get Started
keywords:
summary:
sidebar: sncocoa_sidebar
permalink: snc_get_started.html
folder: sncocoa
---

## Template for Cocoa UI projects
If you want to create a Cocoa UI application you can start with this [giter8 template](https://github.com/jokade/scalanative-cocoa-seed.g8):
```
# g8 jokade/scalanative-cocoa-seed.g8
```
or, with a recent version of sbt:
```
# sbt new jokade/scalanative-cocoa-seed.g8
```

This template requires Xcode to be installed.

After you've created the project from the template, open the Xcode project located in `$PROJECT/xcode/` 
(you might want to rename the Xcode project folder first), and build the project (*Product* -> *Build*).

After the Xcode build is finished, run `sbt nativeLink`. this should create the application bundle in
`PROJECT/target/scala-2.11/`. To run the application in the terminal, execute

```
target/scala-2.11/$APPNAME.app/Contents/MacOS/$APPNAME
```

{% include links.html %}
