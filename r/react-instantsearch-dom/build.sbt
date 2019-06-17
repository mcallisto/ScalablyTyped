organization := "org.scalablytyped"
name := "react-instantsearch-dom"
version := "5.2-dt-20190605Z-5fab85"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "algoliasearch" % "3.30.1-dt-20190521Z-bc80e5",
  "org.scalablytyped" %%% "algoliasearch-helper" % "2.26-dt-20190524Z-7c2a1e",
  "org.scalablytyped" %%% "csstype" % "2.6.5-da6515",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-79c22c",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-9043ed",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190613Z-007242",
  "org.scalablytyped" %%% "react-instantsearch-core" % "5.2-dt-20190605Z-f040e0",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        