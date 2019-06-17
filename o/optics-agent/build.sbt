organization := "org.scalablytyped"
name := "optics-agent"
version := "1.1-dt-20181022Z-c9dfbe"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-e3a239",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-cba36d",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-3879a7",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-15cb02",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-9415de",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190420Z-dadf11",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-5e6a51",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190606Z-620cbf",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190616Z-334d10",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190426Z-626ebf",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-0137c6",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190414Z-c32e5a",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-4f75f9",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190322Z-bc4391",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190522Z-d89b63",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-a73fa9",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-00ed50",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-8ad15f",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-79c22c",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-f947de",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-5a14c3",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-1dd6a1",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-8a14c5",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        