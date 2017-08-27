name := "KafkaAndCassandra"

version := "0.1"

scalaVersion := "2.12.2"

libraryDependencies += "org.apache.kafka" % "kafka-clients" % "0.11.0.0"

libraryDependencies += "org.twitter4j" % "twitter4j-core" % "4.0.6"

libraryDependencies += "com.datastax.cassandra" % "cassandra-driver-extras" % "3.0.0"

libraryDependencies += "com.typesafe"  %  "config" % "1.3.1"

libraryDependencies += "ch.qos.logback" %  "logback-classic" % "1.1.7"

libraryDependencies += "log4j" % "log4j" % "1.2.17"