organization := "org.scalablytyped"
name := "rx-node"
version := "0.0-unknown-dt-20190322Z-404629"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-79c22c",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-4ab25a",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20190322Z-05bcc1",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20190322Z-2eddd3",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        