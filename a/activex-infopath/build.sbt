organization := "org.scalablytyped"
name := "activex-infopath"
version := "3.0-dt-20190213Z-e0460e"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20190213Z-eca078",
  "org.scalablytyped" %%% "activex-mshtml" % "4.0-dt-20190503Z-e1d51c",
  "org.scalablytyped" %%% "activex-msxml2" % "6.0-dt-20190213Z-57f0b1",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20190213Z-eb637a",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        