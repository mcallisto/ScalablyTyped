organization := "org.scalablytyped"
name := "pollyjs__core"
version := "2.3-dt-20190227Z-880003"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "pollyjs__adapter" % "2.0-dt-20190131Z-98a9e8",
  "org.scalablytyped" %%% "pollyjs__persister" % "2.0-dt-20190131Z-5cce3b",
  "org.scalablytyped" %%% "pollyjs__utils" % "2.0-dt-20190131Z-93d0fd",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        