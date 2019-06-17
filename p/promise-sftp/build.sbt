organization := "org.scalablytyped"
name := "promise-sftp"
version := "1.3-dt-20190524Z-2fe300"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190524Z-135f46",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-79c22c",
  "org.scalablytyped" %%% "promise-ftp-common" % "1.1-dt-20180709Z-cf813d",
  "org.scalablytyped" %%% "ssh2" % "v0.5.x-dt-20190322Z-492066",
  "org.scalablytyped" %%% "ssh2-streams" % "v0.1.9-dt-20190322Z-d0e630",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        