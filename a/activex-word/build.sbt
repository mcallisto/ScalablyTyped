organization := "org.scalablytyped"
name := "activex-word"
version := "14.0-dt-20190213Z-9081e5"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "activex-office" % "16.0-dt-20190213Z-566cc3",
  "org.scalablytyped" %%% "activex-outlook" % "14.0-dt-20190213Z-b39282",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20190213Z-eb637a",
  "org.scalablytyped" %%% "activex-vbide" % "14.0-dt-20190213Z-eb6023",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        