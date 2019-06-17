organization := "org.scalablytyped"
name := "d3-graphviz"
version := "2.6-dt-20181026Z-ceae1f"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20190212Z-9b6499",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20190212Z-57cc87",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190212Z-c7d4e0",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20190212Z-6b0d7c",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20190212Z-acb40c",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        