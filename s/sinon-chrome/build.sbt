organization := "org.scalablytyped"
name := "sinon-chrome"
version := "v2.2.4-dt-20190322Z-4ce91e"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chrome" % "0.0-unknown-dt-20190520Z-d63731",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20190322Z-6661c8",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20190322Z-0692d9",
  "org.scalablytyped" %%% "sinon" % "7.0-dt-20190612Z-b24af4",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        