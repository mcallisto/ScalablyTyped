organization := "org.scalablytyped"
name := "cwise-compiler"
version := "1.1-dt-20180214Z-53d640"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cwise-parser" % "1.0-dt-20180301Z-7c8d52",
  "org.scalablytyped" %%% "ndarray" % "1.0-dt-20190212Z-2a2963",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        