lazy val renaissanceCore = RootProject(uri("../../renaissance-core"))

lazy val neo4j = (project in file("."))
  .settings(
    name := "neo4j",
    version := (version in renaissanceCore).value,
    organization := (organization in renaissanceCore).value,
    scalaVersion := "2.11.12",
    scalacOptions += "-target:jvm-1.8",
    libraryDependencies ++= Seq(
      "commons-io" % "commons-io" % "2.6",
      // neo4j 3.5.22 compiles but does not work with Scala 2.12.12
      "org.neo4j" % "neo4j" % "3.5.12",
      "net.liftweb" %% "lift-json" % "3.2.0"
    )
  )
  .dependsOn(
    renaissanceCore
  )
