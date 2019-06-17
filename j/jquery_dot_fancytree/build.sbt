organization := "org.scalablytyped"
name := "jquery_dot_fancytree"
version := "2.28.2-0-dt-20190322Z-b68cac"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190108Z-2868fc",
  "org.scalablytyped" %%% "jqueryui" % "1.12-dt-20190322Z-a65f13",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-cea4c1",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        