organization in ThisBuild := "de.surfice"

version := "0.0.1-SNAPSHOT"

scalaVersion in ThisBuild := "2.11.11"

val Version = new {
  val smacrotools = "0.0.6"
}


lazy val commonSettings = Seq(
  scalacOptions ++= Seq("-deprecation","-unchecked","-feature","-language:implicitConversions","-Xlint"),
  nativeLinkingOptions ++= Seq("-framework","Foundation"),
  addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)
  )

lazy val root = project.in(file("."))
  .aggregate(objc,foundation)
  .settings(dontPublish:_*)
  .settings(
    name := "scalanative-cocoa"
    )

lazy val objc = project
  .enablePlugins(ScalaNativePlugin)
  .settings(commonSettings:_*)
  .settings(
    name := "scalanative-objc",
    libraryDependencies ++= Seq(
      "de.surfice" %% "smacrotools" % Version.smacrotools
    )
  )

lazy val foundation = project
  .enablePlugins(ScalaNativePlugin)
  .dependsOn(objc)
  .settings(commonSettings:_*)
  .settings(
    name := "scalanative-cocoa-foundation"
  )

lazy val test = project
  .enablePlugins(ScalaNativePlugin)
  .dependsOn(foundation)
  .settings(commonSettings ++ dontPublish:_*)

lazy val dontPublish = Seq(
  publish := {},
  publishLocal := {},
  com.typesafe.sbt.pgp.PgpKeys.publishSigned := {},
  com.typesafe.sbt.pgp.PgpKeys.publishLocalSigned := {},
  publishArtifact := false,
  publishTo := Some(Resolver.file("Unused transient repository",file("target/unusedrepo")))
)
