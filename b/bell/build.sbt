organization := "org.scalablytyped"
name := "bell"
version := "9.3-dt-20190119Z-355c95"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-3879a7",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-15cb02",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190426Z-626ebf",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-0137c6",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190414Z-c32e5a",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-00ed50",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-8ad15f",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-79c22c",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-f947de",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-8a14c5",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        