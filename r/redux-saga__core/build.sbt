organization := "org.scalablytyped"
name := "redux-saga__core"
version := "1.0.3-d1ac6c"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "redux" % "4.0.1-70acf5",
  "org.scalablytyped" %%% "redux-saga__types" % "1.0.2-912338",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7",
  "org.scalablytyped" %%% "typescript-compare" % "0.0.2-e633c5",
  "org.scalablytyped" %%% "typescript-logic" % "0.0.0-950743",
  "org.scalablytyped" %%% "typescript-tuple" % "2.2.1-a32da4")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        