lazy val commonSettings = Seq(
  name := "CrossDeps",
  version := "0.1",
  scalaVersion := "2.12.9",
  scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")
)

lazy val jvm = project.settings(commonSettings)