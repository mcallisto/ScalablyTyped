organization := "org.scalablytyped"
name := "html-webpack-plugin"
version := "3.2-dt-20181121Z-4a50c9"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-1d552d",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-2eed31",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190212Z-b13b37",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-79c22c",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20190322Z-29e8de",
  "org.scalablytyped" %%% "source-map" % "0.7.3-62bc9f",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-1535cb",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-267d49",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190521Z-bf298e")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        