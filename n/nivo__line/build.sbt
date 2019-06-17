organization := "org.scalablytyped"
name := "nivo__line"
version := "0.58.0-273789"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-da6515",
  "org.scalablytyped" %%% "nivo__axes" % "0.58.0-31756f",
  "org.scalablytyped" %%% "nivo__colors" % "0.58.0-fe128a",
  "org.scalablytyped" %%% "nivo__core" % "0.58.0-97effe",
  "org.scalablytyped" %%% "nivo__legends" % "0.58.0-16e750",
  "org.scalablytyped" %%% "nivo__scales" % "0.58.0-088cda",
  "org.scalablytyped" %%% "nivo__tooltip" % "0.58.0-c20cb7",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-9043ed",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190613Z-007242",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        