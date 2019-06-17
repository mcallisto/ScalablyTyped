organization := "org.scalablytyped"
name := "rebass"
version := "3.0-dt-20190514Z-ca9f97"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-da6515",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-9043ed",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190613Z-007242",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190613Z-5cd9ce",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7",
  "org.scalablytyped" %%% "styled-components" % "4.1-dt-20190604Z-89441b",
  "org.scalablytyped" %%% "styled-system" % "4.2-dt-20190521Z-c2ddaf")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        