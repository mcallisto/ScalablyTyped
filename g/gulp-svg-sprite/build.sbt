organization := "org.scalablytyped"
name := "gulp-svg-sprite"
version := "1.2.9-dt-20190322Z-2c9945"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-ceb6b8",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-79c22c",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7",
  "org.scalablytyped" %%% "svg-sprite" % "0.0-unknown-dt-20190322Z-2bda39",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-d5c5a1",
  "org.scalablytyped" %%% "winston" % "3.2.1-1dc2fc",
  "org.scalablytyped" %%% "winston-transport" % "4.3.0-ef6fd6")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        