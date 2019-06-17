organization := "org.scalablytyped"
name := "router5"
version := "7.0.2-1d7596"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "path-parser" % "4.2.0-32e047",
  "org.scalablytyped" %%% "route-node" % "3.4.2-15cd27",
  "org.scalablytyped" %%% "router5-transition-path" % "7.0.1-f0d611",
  "org.scalablytyped" %%% "search-params" % "2.1.3-7f4593",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        