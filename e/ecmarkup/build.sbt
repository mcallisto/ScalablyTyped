organization := "org.scalablytyped"
name := "ecmarkup"
version := "3.16.0-161848"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "esfx__cancelable" % "1.0.0-pre.8-434a18",
  "org.scalablytyped" %%% "esfx__disposable" % "1.0.0-pre.8-198cb2",
  "org.scalablytyped" %%% "prex" % "0.4.6-df79aa",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        