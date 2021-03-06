
lazy val commonSettings = Seq(
  organization := "sparking",
  version := "0.1-SNAPSHOT",
  scalaVersion := "2.11.7"
)

lazy val util = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "sparking.util",
    crossPaths := false,
    libraryDependencies ++= {
      val akkaVersion = "2.3.9"
      val sprayVersion = "1.3.3"
      val kafkaVersion = "0.9.0.1"
      Seq(
        "org.apache.kafka" %% "kafka" % kafkaVersion,
        "com.datastax.cassandra" % "cassandra-driver-core" % "3.0.0",
        "com.typesafe.akka" %% "akka-actor" % akkaVersion,
        "com.typesafe.akka" %% "akka-slf4j" % akkaVersion,
        "com.typesafe.akka" %% "akka-testkit" % akkaVersion % "test",
        "io.spray" %% "spray-can" % sprayVersion,
        "io.spray" %% "spray-routing" % sprayVersion,
        "io.spray" %% "spray-testkit" % sprayVersion % "test",
        "io.spray" %% "spray-json" % "1.3.2",
        "org.scalatest" %% "scalatest" % "2.2.6" % "test",
        "ch.qos.logback" % "logback-classic" % "1.1.6",
        "ch.qos.logback" % "logback-core" % "1.1.6"
      )
    }
  )
