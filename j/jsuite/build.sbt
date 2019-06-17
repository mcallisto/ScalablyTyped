organization := "org.scalablytyped"
name := "jsuite"
version := "0.0-unknown-dt-20190322Z-85822a"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190108Z-2868fc",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-cea4c1",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7",
  "org.scalablytyped" %%% "suitescript" % "0.0-unknown-dt-20190322Z-8a8f34")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        