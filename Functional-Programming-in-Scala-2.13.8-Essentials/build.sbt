ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "Functional-Programming-in-Scala-2.13.8-Essentials",
    idePackagePrefix := Some("com.scala2FP.essentials")
  )

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.2.11" % "test"
)
