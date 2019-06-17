organization := "org.scalablytyped"
name := "phantomcss"
version := "0.11.1-dt-20190322Z-04a092"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "casperjs" % "1.1-dt-20180214Z-3a090e",
  "org.scalablytyped" %%% "phantomjs" % "1.9-dt-20190322Z-d8b551",
  "org.scalablytyped" %%% "resemblejs" % "v1.3.0-dt-20190322Z-fbc5e2",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        