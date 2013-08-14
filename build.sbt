sbtPlugin := true

name := "jacoco4sbt"

organization := "de.johoop"

version := "2.2.0"

resolvers += "Sonatype Release" at "https://oss.sonatype.org/content/repositories/releases"

scalaVersion := "2.10.2"

libraryDependencies ++= Seq(
  "org.jacoco" % "org.jacoco.core" % "0.6.2.201302030002" artifacts(Artifact("org.jacoco.core", "jar", "jar")),
  "org.jacoco" % "org.jacoco.report" % "0.6.2.201302030002" artifacts(Artifact("org.jacoco.report", "jar", "jar")))
   
scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")