organization := "org.scalablytyped"
name := "postcss-load-config"
version := "2.0-dt-20190612Z-9ff09e"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cosmiconfig" % "5.0-dt-20180614Z-fc1cec",
  "org.scalablytyped" %%% "postcss" % "6.0.23-61704e",
  "org.scalablytyped" %%% "source-map" % "0.7.3-62bc9f",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        