organization := "org.scalablytyped"
name := "p-any"
version := "2.1.0-fa2331"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "aggregate-error" % "3.0.0-16c491",
  "org.scalablytyped" %%% "p-cancelable" % "2.0.0-531bde",
  "org.scalablytyped" %%% "p-some" % "4.1.0-c05197",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7",
  "org.scalablytyped" %%% "type-fest" % "0.3.1-11f697")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        