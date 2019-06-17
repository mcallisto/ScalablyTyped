organization := "org.scalablytyped"
name := "apollo-upload-client"
version := "8.1-dt-20181017Z-a8a078"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.11-40c4ee",
  "org.scalablytyped" %%% "apollo-link-http-common" % "0.2.14-9c2c62",
  "org.scalablytyped" %%% "extract-files" % "3.1-dt-20180516Z-a5a029",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190616Z-334d10",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-79c22c",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7",
  "org.scalablytyped" %%% "ts-invariant" % "0.4.2-4ebd4c",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.18-4c7007")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        