organization in ThisBuild := "de.surfice"

version in ThisBuild := "0.0.1-SNAPSHOT"

scalaVersion in ThisBuild := "2.11.12"

val Version = new {
  val config      = "1.3.1"
  val smacrotools = "0.0.7-SNAPSHOT"
  val slogging    = "0.5.3"
  val utest       = "0.4.8"
}


lazy val commonSettings = Seq(
  scalacOptions ++= Seq("-deprecation","-unchecked","-feature","-language:implicitConversions","-Xlint"),
  addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full),
  libraryDependencies ++= Seq(
//    "com.lihaoyi" %%% "utest" % Version.utest % "test"
    )
//  testFrameworks += new TestFramework("utest.runner.Framework")
  )

lazy val nativeSettings = Seq(
  nativeCompileOptions ++= Seq("-g"),
  nativeLinkingOptions ++= Seq("-framework","Cocoa")
)

lazy val cocoa = project.in(file("."))
  .aggregate(objc,foundation,appkit,uikit)
  .settings(dontPublish:_*)
  .settings(
    name := "scalanative-cocoa"
    )

lazy val objc = project
  .enablePlugins(ScalaNativePlugin)
  .settings(commonSettings ++ nativeSettings:_*)
  .settings(
    name := "scalanative-objc",
    libraryDependencies ++= Seq(
      "de.surfice" %% "smacrotools" % Version.smacrotools
    )
  )

lazy val foundation = project
  .enablePlugins(ScalaNativePlugin)
  .dependsOn(objc)
  .settings(commonSettings ++ nativeSettings:_*)
  .settings(
    name := "scalanative-cocoa-foundation"
  )

lazy val appkit = project
  .enablePlugins(ScalaNativePlugin)
  .dependsOn(foundation)
  .settings(commonSettings ++ nativeSettings:_*)
  .settings(
    name := "scalanative-cocoa-appkit"
  )

lazy val uikit = project
  .enablePlugins(ScalaNativePlugin)
  .dependsOn(foundation)
  .settings(commonSettings ++ nativeSettings:_*)
  .settings(
    name := "scalanative-cocoa-uikit"
  )

lazy val test = project
  .enablePlugins(ScalaNativePlugin)
  .dependsOn(appkit)
  .settings(commonSettings ++ nativeSettings ++ dontPublish:_*)
  .settings(
    nativeLinkingOptions ++= Seq("/Volumes/JKDATA/dev/scala-native/scalanative-cocoa/util.o")
  )

lazy val dontPublish = Seq(
  publish := {},
  publishLocal := {},
  com.typesafe.sbt.pgp.PgpKeys.publishSigned := {},
  com.typesafe.sbt.pgp.PgpKeys.publishLocalSigned := {},
  publishArtifact := false,
  publishTo := Some(Resolver.file("Unused transient repository",file("target/unusedrepo")))
)
