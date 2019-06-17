organization := "org.scalablytyped"
name := "electron-publish"
version := "20.43.0-8e32eb"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "builder-util" % "10.0.2-e7dfec",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.2.4-1f37c5",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190411Z-1b4fdf",
  "org.scalablytyped" %%% "fs-extra-p" % "8.0.2-dedb53",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-79c22c",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7",
  "org.scalablytyped" %%% "temp-file" % "3.3.3-7ff2c1")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        