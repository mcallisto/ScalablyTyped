organization := "org.scalablytyped"
name := "mobx-apollo"
version := "0.0-dt-20181017Z-32c24c"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-cache" % "1.3.2-1b7f77",
  "org.scalablytyped" %%% "apollo-client" % "2.6.2-138e09",
  "org.scalablytyped" %%% "apollo-link" % "1.2.11-40c4ee",
  "org.scalablytyped" %%% "apollo-utilities" % "1.3.0-2913b7",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190616Z-334d10",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-15b0de",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.18-4c7007")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        