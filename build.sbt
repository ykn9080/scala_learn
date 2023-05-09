ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

libraryDependencies += "org.scala-lang" % "scala-library" % "2.13.10"
val sparkVersion = "3.3.2"
libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "org.apache.spark" %% "spark-mllib" % sparkVersion,
  "org.apache.spark" %% "spark-yarn" % sparkVersion,
"org.apache.spark" %% "spark-streaming" % sparkVersion,
  "org.apache.spark" % "spark-sql-kafka-0-10_2.11" % sparkVersion,
  "org.apache.spark" % "spark-streaming-kafka-0-8_2.11" % sparkVersion
)

lazy val root = (project in file("."))
  .settings(
    name := "scala_learn"
  )