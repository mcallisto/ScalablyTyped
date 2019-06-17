organization := "org.scalablytyped"
name := "hexo"
version := "3.8-dt-20190221Z-fc7f56"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-9792f3",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-9415de",
  "org.scalablytyped" %%% "hexo-util" % "0.6-dt-20180810Z-912449",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-8428c2",
  "org.scalablytyped" %%% "moment" % "2.24.0-31c23a",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-79c22c",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7",
  "org.scalablytyped" %%% "underscore" % "1.8-dt-20190617Z-66ed90")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        