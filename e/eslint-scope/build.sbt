organization := "org.scalablytyped"
name := "eslint-scope"
version := "3.7-dt-20180217Z-6a78fb"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "eslint" % "4.16-dt-20190128Z-87426f",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20190322Z-69283f",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20190212Z-93a4be",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        