organization := "org.scalablytyped"
name := "proj4leaflet"
version := "1.0-dt-20181017Z-cf0d7a"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190319Z-3dd886",
  "org.scalablytyped" %%% "leaflet" % "1.4-dt-20190417Z-f75a0d",
  "org.scalablytyped" %%% "proj4" % "2.5-dt-20181212Z-38e366",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        