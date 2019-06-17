organization := "org.scalablytyped"
name := "babelify"
version := "v7.3.0-dt-20190322Z-6d7183"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20190212Z-646d54",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20190212Z-b6f674",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20190212Z-d11678",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20190212Z-665848",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20190424Z-9072c8",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20190212Z-2ee979",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-79c22c",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        