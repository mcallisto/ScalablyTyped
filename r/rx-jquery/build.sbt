organization := "org.scalablytyped"
name := "rx-jquery"
version := "0.0-unknown-dt-20190322Z-c4dd91"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190108Z-2868fc",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-4ab25a",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20190322Z-5355bd",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20190322Z-05bcc1",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20190322Z-2eddd3",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181116Z-7e62be",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180214Z-5bd82c",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20190322Z-0d44fb",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180214Z-127d8d",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180214Z-e494c2",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180214Z-1d27a1",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20190322Z-0392b5",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20190322Z-76869f",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-cea4c1",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        