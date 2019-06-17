organization := "org.scalablytyped"
name := "phosphor__dragdrop"
version := "1.3.1-7872e2"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "phosphor__algorithm" % "1.1.3-f3a25f",
  "org.scalablytyped" %%% "phosphor__coreutils" % "1.3.1-a27c8c",
  "org.scalablytyped" %%% "phosphor__disposable" % "1.1.3-927d2a",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        