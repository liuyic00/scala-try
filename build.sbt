// See README.md for license details.

ThisBuild / scalaVersion := "2.13.12"
ThisBuild / version      := "0.1.0"
ThisBuild / organization := "com.liuyic00"


lazy val st = (project in file("."))
  .settings(
    name := "st",
    libraryDependencies ++= Seq(
    ),
    scalacOptions ++= Seq(
      "-language:reflectiveCalls",
      "-deprecation",
      "-feature",
      "-Xcheckinit",
      "-Ymacro-annotations"
    )
  )
