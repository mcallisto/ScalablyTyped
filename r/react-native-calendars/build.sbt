organization := "org.scalablytyped"
name := "react-native-calendars"
version := "1.20-dt-20190627Z-4d05f1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-c945ed",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-c6e514",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190703Z-55594c",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20190705Z-45b073",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "xdate" % "0.8-dt-20190322Z-33a5d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        