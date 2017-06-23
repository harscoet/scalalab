name := "scalalab"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.spotify" %% "scio-core" % "0.3.2",
  "com.google.cloud.bigtable" % "bigtable-hbase-1.2" % "0.9.7.1",
  "org.apache.hbase" % "hbase-client" % "1.2.5"
)
