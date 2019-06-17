organization := "org.scalablytyped"
name := "material__textfield"
version := "0.35-dt-20190313Z-352704"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20190313Z-8b3f0b",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20190213Z-635979",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20190213Z-2a05cd",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20190213Z-1081dc",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20190313Z-1a3cc1",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        