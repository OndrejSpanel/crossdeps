lazy val commonSettings = Seq(
  name := "CrossDeps",
  version := "0.1",
  scalaVersion := "2.12.9",
  scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature"),
  libraryDependencies += "org.scalatest" %%% "scalatest" % "3.0.0" % "test"
)

lazy val jvm = project.settings(commonSettings)

lazy val js = project.settings(commonSettings)
  .enablePlugins(ScalaJSPlugin)