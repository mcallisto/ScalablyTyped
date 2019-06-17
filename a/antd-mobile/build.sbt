organization := "org.scalablytyped"
name := "antd-mobile"
version := "2.2.14-43e6be"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-da6515",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-9043ed",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-883b47",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190613Z-007242",
  "org.scalablytyped" %%% "rmc-calendar" % "1.1.4-7d9b2c",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-66a6df",
  "org.scalablytyped" %%% "rmc-input-number" % "1.0.5-d8e109",
  "org.scalablytyped" %%% "rmc-pull-to-refresh" % "1.0.11-53e485",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-c43c91",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        