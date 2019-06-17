organization := "org.scalablytyped"
name := "power-assert"
version := "1.5.0-dt-20190322Z-2625c2"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "empower" % "1.2.1-dt-20190322Z-d29e9d",
  "org.scalablytyped" %%% "power-assert-formatter" % "1.4.1-dt-20190322Z-b0debd",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        