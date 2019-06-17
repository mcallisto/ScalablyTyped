organization := "org.scalablytyped"
name := "blueprintjs__core"
version := "3.15.1-ac4cb1"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "blueprintjs__icons" % "3.9.0-41c64a",
  "org.scalablytyped" %%% "csstype" % "2.6.5-da6515",
  "org.scalablytyped" %%% "popper_dot_js" % "1.15.0-000827",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-9043ed",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190613Z-007242",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        