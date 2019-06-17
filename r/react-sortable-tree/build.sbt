organization := "org.scalablytyped"
name := "react-sortable-tree"
version := "0.3-dt-20190318Z-64ec3c"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-da6515",
  "org.scalablytyped" %%% "dnd-core" % "7.6.0-77a5d7",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-bf6eb8",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-9043ed",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190613Z-007242",
  "org.scalablytyped" %%% "react-dnd" % "7.6.1-953692",
  "org.scalablytyped" %%% "react-virtualized" % "9.21-dt-20190528Z-3bdd68",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        