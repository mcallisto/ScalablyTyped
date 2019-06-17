organization := "org.scalablytyped"
name := "koa-html-minifier"
version := "1.0-dt-20180823Z-34d36c"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-e3a239",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-cba36d",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-2eed31",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-9415de",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190420Z-dadf11",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-5e6a51",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190606Z-620cbf",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190212Z-b13b37",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-4f75f9",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190322Z-bc4391",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190522Z-d89b63",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-a73fa9",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-79c22c",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-5a14c3",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20190322Z-29e8de",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-1dd6a1",
  "org.scalablytyped" %%% "source-map" % "0.7.3-62bc9f",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-267d49")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        