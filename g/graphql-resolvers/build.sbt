organization := "org.scalablytyped"
name := "graphql-resolvers"
version := "0.2-dt-20181024Z-9edf7e"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.11-40c4ee",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190616Z-334d10",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.4-85bb5c",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.18-4c7007")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        