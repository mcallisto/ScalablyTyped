organization := "org.scalablytyped"
name := "apollo-server-core"
version := "2.6.3-8739ed"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-cache-control" % "0.7.2-fb94b4",
  "org.scalablytyped" %%% "apollo-datasource" % "0.5.0-1013ab",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "1.3.1-596b3f",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.3.1-5189f5",
  "org.scalablytyped" %%% "apollo-link" % "1.2.11-40c4ee",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.4.0-d2d85a",
  "org.scalablytyped" %%% "apollo-server-env" % "2.4.0-872a9e",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.3.0-0988e9",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.5.2-f1f86e",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.3.7-283714",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.20-0908e5",
  "org.scalablytyped" %%% "eventemitter3" % "3.1.2-374351",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190616Z-334d10",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.4-85bb5c",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-79c22c",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-b879fa",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-232aa2",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-dabe03",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.18-4c7007")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        