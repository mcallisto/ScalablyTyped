organization := "org.scalablytyped"
name := "istanbul-lib-instrument"
version := "1.7-dt-20190425Z-d3b3c6"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20190424Z-9072c8",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20190425Z-1257d6",
  "org.scalablytyped" %%% "source-map" % "0.7.3-62bc9f",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        