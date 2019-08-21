lazy val commonSettings = Seq(
  version := "0.1",
  scalaVersion := "2.12.9",
  scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature"),
  libraryDependencies += "org.scalatest" %%% "scalatest" % "3.0.0" % "test"
)

lazy val shared = (project in file("shared")).settings(commonSettings).enablePlugins(ScalaJSPlugin)

lazy val jvm = (project in file("jvm")).settings(commonSettings).dependsOn(shared)

lazy val js = (project in file("js"))
  .settings(commonSettings)
  .settings(name := "CrossDeps")
  .enablePlugins(ScalaJSPlugin)
  .dependsOn(shared)

lazy val root = (project in file(".")).aggregate(jvm, js)