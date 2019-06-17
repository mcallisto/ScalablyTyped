organization := "org.scalablytyped"
name := "rx-lite-testing"
version := "4.0-dt-20180214Z-1d27a1"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-4ab25a",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20190322Z-05bcc1",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20190322Z-76869f",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        