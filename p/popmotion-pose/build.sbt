organization := "org.scalablytyped"
name := "popmotion-pose"
version := "3.4.8-9c68aa"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "framesync" % "4.0.2-941fa5",
  "org.scalablytyped" %%% "popmotion" % "8.6.10-b734c4",
  "org.scalablytyped" %%% "popmotion__easing" % "1.0.2-d752ac",
  "org.scalablytyped" %%% "popmotion__popcorn" % "0.4.0-70d802",
  "org.scalablytyped" %%% "pose-core" % "2.1.0-ccdd9a",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7",
  "org.scalablytyped" %%% "style-value-types" % "3.1.4-f605e6",
  "org.scalablytyped" %%% "stylefire" % "4.1.4-2d7576",
  "org.scalablytyped" %%% "ts-essentials" % "1.0.4-9b06d0")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        