organization := "org.scalablytyped"
name := "inversify-restify-utils"
version := "3.4.0-b1755a"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-9792f3",
  "org.scalablytyped" %%% "inversify" % "5.0.1-97ad01",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-79c22c",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20190528Z-f86363",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-a183d7",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        