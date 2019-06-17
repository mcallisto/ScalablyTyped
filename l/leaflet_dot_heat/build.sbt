organization := "org.scalablytyped"
name := "leaflet_dot_heat"
version := "0.2-dt-20180214Z-59261b"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190319Z-3dd886",
  "org.scalablytyped" %%% "leaflet" % "1.4-dt-20190417Z-f75a0d",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        