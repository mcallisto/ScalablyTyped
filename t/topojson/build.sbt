organization := "org.scalablytyped"
name := "topojson"
version := "3.2-dt-20190326Z-6692d1"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190319Z-3dd886",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7",
  "org.scalablytyped" %%% "topojson-client" % "3.0-dt-20180414Z-983718",
  "org.scalablytyped" %%% "topojson-simplify" % "3.0-dt-20180414Z-f48c73",
  "org.scalablytyped" %%% "topojson-specification" % "1.0-dt-20190213Z-09f46e")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        