organization := "org.scalablytyped"
name := "dagre-d3"
version := "0.4-dt-20190212Z-3953c6"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190212Z-c7d4e0",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20190212Z-6b0d7c",
  "org.scalablytyped" %%% "dagre" % "0.7-dt-20190430Z-f2d3dd",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        