organization := "org.scalablytyped"
name := "vega-embed"
version := "3.18.2-0450ef"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "json-stable-stringify" % "1.0-dt-20180214Z-dd7393",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7",
  "org.scalablytyped" %%% "vega-lib" % "4.4.0-c96d06",
  "org.scalablytyped" %%% "vega-lite" % "2.6.0-14a249",
  "org.scalablytyped" %%% "vega-tooltip" % "0.12.0-f7da93",
  "org.scalablytyped" %%% "vega-typings" % "0.7.1-fa8bb1",
  "org.scalablytyped" %%% "vega-util" % "1.10.0-a6995e")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        