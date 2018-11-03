organization in ThisBuild := "de.surfice"

version in ThisBuild := "0.0.2-SNAPSHOT"

scalaVersion in ThisBuild := "2.11.12"

val Version = new {
  val slogging    = "0.5.3"
  val objc        = "0.0.6-SNAPSHOT"
  val utest       = "0.6.3"
}


lazy val commonSettings = Seq(
  scalacOptions ++= Seq("-deprecation","-unchecked","-feature","-language:implicitConversions","-Xlint"),
  addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full),
  libraryDependencies ++= Seq(
    "de.surfice" %%% "scalanative-interop-objc" % Version.objc
    //"com.lihaoyi" %%% "utest" % Version.utest % "test"
    ),
  testFrameworks += new TestFramework("utest.runner.Framework")
)

lazy val nativeSettings = Seq(
  nativeCompileOptions ++= Seq("-g"),
  nativeLinkStubs := true
)

lazy val cocoa = project.in(file("."))
  .aggregate(foundation,appkit,coredata,uikit,scenekit_macos)
  .settings(dontPublish:_*)
  .settings(
    name := "sncocoa"
    )

lazy val foundation = project
  .enablePlugins(ScalaNativePlugin)
  .settings(commonSettings ++ nativeSettings ++ publishingSettings:_*)
  .settings(
    name := "scalanative-cocoa-foundation"
  )

lazy val appkit = project
  .enablePlugins(ScalaNativePlugin)
  .dependsOn(foundation)
  .settings(commonSettings ++ nativeSettings ++ publishingSettings:_*)
  .settings(
    name := "scalanative-cocoa-appkit"
  )

lazy val uikit = project
  .enablePlugins(ScalaNativePlugin)
  .dependsOn(foundation)
  .settings(commonSettings ++ nativeSettings ++ publishingSettings:_*)
  .settings(
    name := "scalanative-cocoa-uikit"
  )

lazy val coredata = project
  .enablePlugins(ScalaNativePlugin)
  .dependsOn(foundation)
  .settings(commonSettings ++ nativeSettings ++ publishingSettings:_*)
  .settings(
    name := "scalanative-cocoa-coredata"
  )

lazy val scenekit_macos = project
  .enablePlugins(ScalaNativePlugin)
  .dependsOn(appkit)
  .settings(commonSettings ++ nativeSettings ++ publishingSettings:_*)
  .settings(
    name := "scalanative-cocoa-scenekit-macos",
    unmanagedSourceDirectories in Compile += baseDirectory.value / ".." / "scenekit" / "src" / "main" / "scala",
    unmanagedResourceDirectories in Compile += baseDirectory.value / ".." / "scenekit" / "src" / "main" / "resources"
  )

lazy val test = project
  .enablePlugins(ScalaNativePlugin,NBHMakePlugin)
  .dependsOn(appkit,scenekit_macos)
  .settings(commonSettings ++ nativeSettings ++ dontPublish:_*)
  .settings(
    pconfPlatform := PConfPlatform.MacOS,
    nativeLinkingOptions ++= Seq(
      "-framework", "Foundation",
      "/Volumes/JKDATA/dev/scala-native/cocoa/util.o"
    )
  )

lazy val dontPublish = Seq(
  publish := {},
  publishLocal := {},
  com.typesafe.sbt.pgp.PgpKeys.publishSigned := {},
  com.typesafe.sbt.pgp.PgpKeys.publishLocalSigned := {},
  publishArtifact := false,
  publishTo := Some(Resolver.file("Unused transient repository",file("target/unusedrepo")))
)

lazy val publishingSettings = Seq(
  publishMavenStyle := true,
  publishTo := {
    val nexus = "https://oss.sonatype.org/"
    if (isSnapshot.value)
      Some("snapshots" at nexus + "content/repositories/snapshots")
    else
      Some("releases"  at nexus + "service/local/staging/deploy/maven2")
  },
  pomExtra := (
    <url>https://github.com/jokade/scalantive-cocoa</url>
    <licenses>
      <license>
        <name>MIT License</name>
        <url>http://www.opensource.org/licenses/mit-license.php</url>
      </license>
    </licenses>
    <scm>
      <url>git@github.com:jokade/scalantive-cocoa</url>
      <connection>scm:git:git@github.com:jokade/scalantive-cocoa.git</connection>
    </scm>
    <developers>
      <developer>
        <id>jokade</id>
        <name>Johannes Kastner</name>
        <email>jokade@karchedon.de</email>
      </developer>
    </developers>
  )
)

