organization in ThisBuild := "de.surfice"

version := "0.0.1-SNAPSHOT"

scalaVersion in ThisBuild := "2.11.11"

val Version = new {
  val config      = "1.3.1"
  val scopt       = "3.6.0"
  val smacrotools = "0.0.7-SNAPSHOT"
  val slogging    = "0.5.3"
}


lazy val commonSettings = Seq(
  scalacOptions ++= Seq("-deprecation","-unchecked","-feature","-language:implicitConversions","-Xlint"),
  addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full),
  libraryDependencies += "com.lihaoyi" %%% "utest" % "0.4.8" % "test",
  testFrameworks += new TestFramework("utest.runner.Framework")
  )

lazy val nativeSettings = Seq(
  nativeLinkingOptions ++= Seq("-framework","Cocoa")
)

lazy val root = project.in(file("."))
  .aggregate(objc,foundation,appkit)
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


lazy val test = project
  .enablePlugins(ScalaNativePlugin)
  .dependsOn(appkit)
  .settings(commonSettings ++ nativeSettings ++ dontPublish:_*)

lazy val dontPublish = Seq(
  publish := {},
  publishLocal := {},
  com.typesafe.sbt.pgp.PgpKeys.publishSigned := {},
  com.typesafe.sbt.pgp.PgpKeys.publishLocalSigned := {},
  publishArtifact := false,
  publishTo := Some(Resolver.file("Unused transient repository",file("target/unusedrepo")))
)
