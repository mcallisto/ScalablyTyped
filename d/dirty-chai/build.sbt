organization := "org.scalablytyped"
name := "dirty-chai"
version := "2.0-dt-20190514Z-d03362"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chai" % "4.1-dt-20181019Z-f87f73",
  "org.scalablytyped" %%% "chai-as-promised" % "7.1.0-dt-20190322Z-56757c",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        