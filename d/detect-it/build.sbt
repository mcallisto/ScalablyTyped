organization := "org.scalablytyped"
name := "detect-it"
version := "2.1-dt-20180214Z-460ccc"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "detect-hover" % "1.0-dt-20180214Z-d5ad57",
  "org.scalablytyped" %%% "detect-passive-events" % "1.0-dt-20180214Z-98c61e",
  "org.scalablytyped" %%% "detect-pointer" % "1.0-dt-20180214Z-f7eb5b",
  "org.scalablytyped" %%% "detect-touch-events" % "1.0-dt-20180214Z-a06cee")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        