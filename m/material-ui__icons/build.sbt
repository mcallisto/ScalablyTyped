organization := "org.scalablytyped"
name := "material-ui__icons"
version := "4.2.0-216f1e"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-da6515",
  "org.scalablytyped" %%% "indefinite-observable" % "2.0.1-6799da",
  "org.scalablytyped" %%% "jss" % "9.5-dt-20190227Z-fd08d7",
  "org.scalablytyped" %%% "material-ui__core" % "3.9.3-b75a59",
  "org.scalablytyped" %%% "popper_dot_js" % "1.15.0-000827",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-9043ed",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190613Z-007242",
  "org.scalablytyped" %%% "react-transition-group" % "2.9-dt-20190607Z-8dcfa3",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        