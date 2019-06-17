organization := "org.scalablytyped"
name := "vfile-location"
version := "2.0-dt-20181127Z-bbadd5"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-79c22c",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20190213Z-f59de6",
  "org.scalablytyped" %%% "vfile" % "3.0-dt-20181205Z-01d59b",
  "org.scalablytyped" %%% "vfile-message" % "1.0-dt-20181205Z-b74eba")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        