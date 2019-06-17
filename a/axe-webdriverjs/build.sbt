organization := "org.scalablytyped"
name := "axe-webdriverjs"
version := "2.1-dt-20190329Z-c5e378"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "axe-core" % "3.2.2-d2096d",
  "org.scalablytyped" %%% "selenium-webdriver" % "4.0-dt-20190329Z-cf9d58",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        