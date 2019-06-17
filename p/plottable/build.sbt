organization := "org.scalablytyped"
name := "plottable"
version := "3.8.6-d7f0c4"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20190212Z-4de694",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-6d980d",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190212Z-c7d4e0",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190212Z-3033c6",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-4a0c10",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20190212Z-6b0d7c",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190606Z-03812d",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7",
  "org.scalablytyped" %%% "typesettable" % "4.1.0-a19d23")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        