organization := "org.scalablytyped"
name := "sanitize-html"
version := "1.20.1-dt-20190603Z-b21ac9"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "domhandler" % "2.4-dt-20190326Z-dd6f3e",
  "org.scalablytyped" %%% "domutils" % "1.7-dt-20190326Z-d85875",
  "org.scalablytyped" %%% "htmlparser2" % "v3.10.x-dt-20190326Z-f5bc56",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-79c22c",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        