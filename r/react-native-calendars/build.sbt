organization := "org.scalablytyped"
name := "react-native-calendars"
version := "1.20-dt-20190520Z-5e7a21"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-da6515",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-9043ed",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190613Z-007242",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190613Z-5cd9ce",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7",
  "org.scalablytyped" %%% "xdate" % "0.8-dt-20190322Z-5a1b2a")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        