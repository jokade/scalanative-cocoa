---
title: sbt Settings
keywords: 
summary: 
sidebar: sncocoa_sidebar
permalink: snc_sbt_settings.html
folder: sncocoa
---

Add this to your `build.sbt`:
```scala
libraryDependencies += "de.surfice" %%% "scalanative-cocoa-foundation" % "0.0.1-SNAPSHOT"
                       
addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)
                       
resolvers += Resolver.sonatypeRepo("snapshots")
```

Replace `scalanative-cocoa-foundation` with `scalanative-cocoa-appkit` if you want to use AppKit. However, it's probably best to start with the template in that case (see below).

SNCocoa requires scala-native 0.3.2.
{% include links.html %}
