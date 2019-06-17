organization := "org.scalablytyped"
name := "prosemirror-markdown"
version := "1.0-dt-20181102Z-ed0644"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "linkify-it" % "2.1.0-dt-20190326Z-8cca82",
  "org.scalablytyped" %%% "markdown-it" % "0.0-unknown-dt-20190322Z-92c4d3",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20180214Z-6ec4a1",
  "org.scalablytyped" %%% "prosemirror-model" % "1.7-dt-20190520Z-f47d49",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        