organization := "org.scalablytyped"
name := "hapi__bell"
version := "10.1-dt-20190425Z-421d25"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "hapi__boom" % "7.4-dt-20190404Z-994e65",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20190521Z-87aea1",
  "org.scalablytyped" %%% "hapi__hapi" % "18.2-dt-20190612Z-fa8dd2",
  "org.scalablytyped" %%% "hapi__iron" % "5.1-dt-20190404Z-e6c453",
  "org.scalablytyped" %%% "hapi__joi" % "15.0-dt-20190616Z-d855f5",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20190404Z-7b4900",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20190404Z-4152f2",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20190404Z-29c46f",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-00ed50",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-79c22c",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        