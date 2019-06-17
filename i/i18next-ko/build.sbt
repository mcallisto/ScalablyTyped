organization := "org.scalablytyped"
name := "i18next-ko"
version := "3.0-dt-20181017Z-e141d3"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "i18next" % "12.1-dt-20181126Z-b3fef2",
  "org.scalablytyped" %%% "knockout" % "v3.4.0-dt-20190515Z-246100",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        