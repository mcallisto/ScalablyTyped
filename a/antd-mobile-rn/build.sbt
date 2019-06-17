organization := "org.scalablytyped"
name := "antd-mobile-rn"
version := "2.3.3-1a8356"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-da6515",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-9043ed",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-883b47",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190613Z-007242",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190613Z-5cd9ce",
  "org.scalablytyped" %%% "react-native-drawer-layout" % "1.3-dt-20181017Z-9c8eee",
  "org.scalablytyped" %%% "rmc-cascader" % "5.0.3-66a6df",
  "org.scalablytyped" %%% "rmc-tabs" % "1.2.29-c43c91",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7",
  "org.scalablytyped" %%% "utility-types" % "2.1.0-65295d")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        