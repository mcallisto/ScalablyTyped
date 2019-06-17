organization := "org.scalablytyped"
name := "guardian__prosemirror-invisibles"
version := "1.2-dt-20190213Z-c22d7e"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20180214Z-6ec4a1",
  "org.scalablytyped" %%% "prosemirror-model" % "1.7-dt-20190520Z-f47d49",
  "org.scalablytyped" %%% "prosemirror-state" % "1.2-dt-20190222Z-2ed9d7",
  "org.scalablytyped" %%% "prosemirror-transform" % "1.1-dt-20180621Z-45f13a",
  "org.scalablytyped" %%% "prosemirror-view" % "1.3-dt-20190520Z-188584",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        