organization := "org.scalablytyped"
name := "google-cloud__pubsub"
version := "0.29.1-51ebe8"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "gaxios" % "1.8.4-b2b6ed",
  "org.scalablytyped" %%% "google-auth-library" % "3.1.2-f350af",
  "org.scalablytyped" %%% "google-cloud__precise-date" % "1.0.0-7cc66d",
  "org.scalablytyped" %%% "grpc" % "1.21.1-8231c3",
  "org.scalablytyped" %%% "gtoken" % "2.3.3-fdb10d",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20190322Z-2e1e85",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-79c22c",
  "org.scalablytyped" %%% "p-defer" % "2.1.0-071ec8",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-b879fa",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        