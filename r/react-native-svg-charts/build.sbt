organization := "org.scalablytyped"
name := "react-native-svg-charts"
version := "5.0-dt-20181105Z-44297b"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-da6515",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-6d980d",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20190212Z-7dc2a2",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190212Z-3033c6",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-4a0c10",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-9043ed",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190613Z-007242",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190613Z-5cd9ce",
  "org.scalablytyped" %%% "react-native-svg" % "9.5.1-15a8e3",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        