organization := "org.scalablytyped"
name := "storybook__components"
version := "5.1.8-2a52f3"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-da6515",
  "org.scalablytyped" %%% "emotion-theming" % "10.0.10-2ac1e8",
  "org.scalablytyped" %%% "emotion__core" % "10.0.10-0ea656",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.6-2268c3",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.12-99d32f",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.13-b6903a",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.1-9fa614",
  "org.scalablytyped" %%% "popper_dot_js" % "1.15.0-000827",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-9043ed",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190613Z-007242",
  "org.scalablytyped" %%% "react-syntax-highlighter" % "10.2-dt-20190530Z-81c87d",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7",
  "org.scalablytyped" %%% "storybook__theming" % "5.1.8-5640f6")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        