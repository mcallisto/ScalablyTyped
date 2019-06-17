organization := "org.scalablytyped"
name := "yog2-kernel"
version := "1.9-dt-20190312Z-a011b4"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-cba36d",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-9415de",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-5e6a51",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190606Z-620cbf",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190606Z-03812d",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-a73fa9",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-79c22c",
  "org.scalablytyped" %%% "node-ral" % "0.18-dt-20181121Z-02e500",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-5a14c3",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-1dd6a1",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7",
  "org.scalablytyped" %%% "yog-bigpipe" % "0.4-dt-20180214Z-04f436",
  "org.scalablytyped" %%% "yog-log" % "0.1-dt-20181121Z-577d9e")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        