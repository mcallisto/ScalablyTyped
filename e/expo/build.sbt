organization := "org.scalablytyped"
name := "expo"
version := "32.0-dt-20190502Z-c1dde7"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-da6515",
  "org.scalablytyped" %%% "fbemitter" % "2.0.0-dt-20190503Z-a170d3",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-9043ed",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190613Z-007242",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190613Z-5cd9ce",
  "org.scalablytyped" %%% "react-native-maps" % "0.24-dt-20190519Z-5e0b3e",
  "org.scalablytyped" %%% "react-native-svg" % "9.5.1-15a8e3",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        