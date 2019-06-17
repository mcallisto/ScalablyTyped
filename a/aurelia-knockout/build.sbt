organization := "org.scalablytyped"
name := "aurelia-knockout"
version := "2.3.0-e0d4f2"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "aurelia-binding" % "2.3.1-c13535",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.4.2-35fba6",
  "org.scalablytyped" %%% "aurelia-loader" % "1.0.2-2334b1",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.6-5d7be4",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.3-3ab96e",
  "org.scalablytyped" %%% "aurelia-templating" % "1.10.2-5f248e",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        