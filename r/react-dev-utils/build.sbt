organization := "org.scalablytyped"
name := "react-dev-utils"
version := "9.0-dt-20190506Z-b91efe"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-1d552d",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-cba36d",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-2eed31",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-9415de",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20190326Z-23cf22",
  "org.scalablytyped" %%% "eslint" % "4.16-dt-20190128Z-87426f",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20190322Z-69283f",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-5e6a51",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190606Z-620cbf",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190212Z-b13b37",
  "org.scalablytyped" %%% "html-webpack-plugin" % "3.2-dt-20181121Z-4a50c9",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20190301Z-30fa6d",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190114Z-4e2217",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20190212Z-93a4be",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-a73fa9",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-79c22c",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-5a14c3",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20190322Z-29e8de",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-1dd6a1",
  "org.scalablytyped" %%% "source-map" % "0.7.3-62bc9f",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-1535cb",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-267d49",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190521Z-bf298e",
  "org.scalablytyped" %%% "webpack-dev-server" % "3.1-dt-20190524Z-230fe0")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        