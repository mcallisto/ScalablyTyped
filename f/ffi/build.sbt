organization := "org.scalablytyped"
name := "ffi"
version := "0.2-dt-20190212Z-4c418c"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-79c22c",
  "org.scalablytyped" %%% "ref" % "0.0-unknown-dt-20190322Z-ef7a64",
  "org.scalablytyped" %%% "ref-struct" % "0.0-unknown-dt-20190322Z-95a8ae",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        