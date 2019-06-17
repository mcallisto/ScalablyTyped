organization := "org.scalablytyped"
name := "aframe"
version := "0.8-dt-20190328Z-150108"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7",
  "org.scalablytyped" %%% "three" % "0.105.2-29a6fb",
  "org.scalablytyped" %%% "tween_dot_js" % "17.2-dt-20190124Z-2af53b")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        