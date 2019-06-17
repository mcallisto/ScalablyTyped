organization := "org.scalablytyped"
name := "plotly_dot_js"
version := "1.44-dt-20190612Z-d5d0bb"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-array" % "2.0-dt-20190221Z-13f37f",
  "org.scalablytyped" %%% "d3-axis" % "1.0-dt-20190212Z-0606df",
  "org.scalablytyped" %%% "d3-brush" % "1.0-dt-20190212Z-5d3f00",
  "org.scalablytyped" %%% "d3-chord" % "1.0-dt-20190212Z-005eb1",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20190212Z-4de694",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20190212Z-9b6499",
  "org.scalablytyped" %%% "d3-contour" % "1.3-dt-20190205Z-6d65e9",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20190212Z-b84057",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20190212Z-787cd5",
  "org.scalablytyped" %%% "d3-dsv" % "1.0-dt-20190326Z-608717",
  "org.scalablytyped" %%% "d3-ease" % "1.0-dt-20190212Z-19206c",
  "org.scalablytyped" %%% "d3-force" % "1.2-dt-20190212Z-eca2d0",
  "org.scalablytyped" %%% "d3-format" % "1.3-dt-20190212Z-0d5315",
  "org.scalablytyped" %%% "d3-geo" % "1.11-dt-20190212Z-0829c4",
  "org.scalablytyped" %%% "d3-hierarchy" % "1.1-dt-20190212Z-a4ca99",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20190212Z-57cc87",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-6d980d",
  "org.scalablytyped" %%% "d3-quadtree" % "1.0-dt-20190212Z-8fd785",
  "org.scalablytyped" %%% "d3-random" % "1.1-dt-20190212Z-c08180",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20190212Z-7dc2a2",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190212Z-c7d4e0",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190212Z-3033c6",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-4a0c10",
  "org.scalablytyped" %%% "d3-time-format" % "2.1-dt-20190212Z-16d493",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20190212Z-1f0555",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20190212Z-6b0d7c",
  "org.scalablytyped" %%% "d3-voronoi" % "1.1-dt-20190212Z-61528c",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20190212Z-acb40c",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190319Z-3dd886",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        