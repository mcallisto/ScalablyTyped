organization := "org.scalablytyped"
name := "pouch-redux-middleware"
version := "0.5-dt-20180214Z-ab3751"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190411Z-1b4fdf",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20190212Z-d6a2e6",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20190212Z-4047ca",
  "org.scalablytyped" %%% "redux" % "4.0.1-70acf5",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        