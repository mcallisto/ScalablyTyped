organization := "org.scalablytyped"
name := "d3-graphviz"
version := "2.6-dt-20181026Z-de546e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20190212Z-e040d2",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20190212Z-95ea07",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190212Z-2307af",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20190212Z-1a6f4b",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20190212Z-ada8fe",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        