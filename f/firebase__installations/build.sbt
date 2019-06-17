organization := "org.scalablytyped"
name := "firebase__installations"
version := "0.1.6-4b665e"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "firebase__app-types" % "0.4.0-995810",
  "org.scalablytyped" %%% "firebase__installations-types" % "0.1.1-649cf2",
  "org.scalablytyped" %%% "firebase__util" % "0.2.19-59bc32",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        