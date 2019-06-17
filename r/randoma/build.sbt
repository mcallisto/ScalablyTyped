organization := "org.scalablytyped"
name := "randoma"
version := "1.2-dt-20181209Z-a02f05"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "color" % "3.0-dt-20180214Z-885780",
  "org.scalablytyped" %%% "color-convert" % "1.9-dt-20180214Z-80e27c",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-fc1cdb",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        