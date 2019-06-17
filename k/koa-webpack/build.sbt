organization := "org.scalablytyped"
name := "koa-webpack"
version := "5.0-dt-20180605Z-afbf98"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-e3a239",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-1d552d",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-cba36d",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-9415de",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190420Z-dadf11",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-5e6a51",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190606Z-620cbf",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-4f75f9",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190322Z-bc4391",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190522Z-d89b63",
  "org.scalablytyped" %%% "loglevel" % "1.5-dt-20190205Z-5dc65c",
  "org.scalablytyped" %%% "memory-fs" % "0.3.0-dt-20190322Z-baa148",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-a73fa9",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-79c22c",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-5a14c3",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-1dd6a1",
  "org.scalablytyped" %%% "source-map" % "0.7.3-62bc9f",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-1535cb",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-267d49",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190521Z-bf298e",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "2.0-dt-20180709Z-acfa6a",
  "org.scalablytyped" %%% "webpack-hot-client" % "4.0-dt-20180621Z-7d81fa")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        