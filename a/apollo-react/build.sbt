organization := "org.scalablytyped"
name := "apollo-react"
version := "0.7.1-ef96fe"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-cache" % "1.3.2-1b7f77",
  "org.scalablytyped" %%% "apollo-client" % "2.6.2-138e09",
  "org.scalablytyped" %%% "apollo-link" % "1.2.11-40c4ee",
  "org.scalablytyped" %%% "apollo-utilities" % "1.3.0-2913b7",
  "org.scalablytyped" %%% "csstype" % "2.6.5-da6515",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190616Z-334d10",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-9043ed",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190613Z-007242",
  "org.scalablytyped" %%% "redux" % "4.0.1-70acf5",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7",
  "org.scalablytyped" %%% "typed-graphql" % "1.0.2-20e918",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-15b0de",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.18-4c7007")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        