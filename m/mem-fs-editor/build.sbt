organization := "org.scalablytyped"
name := "mem-fs-editor"
version := "5.1-dt-20190217Z-216bd5"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ejs" % "2.6-dt-20190223Z-1d6572",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-1e3092",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20181203Z-f373d3",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-b68043",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-79c22c",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-d5c5a1")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        