organization := "org.scalablytyped"
name := "sc-broker-cluster"
version := "6.1-dt-20190415Z-8c8da2"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "async" % "3.0-dt-20190604Z-efd583",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20190322Z-b4c694",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-c38f1d",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-e32b13",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20190304Z-8356c3",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-79c22c",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-c78a95",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-066341",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-7a0187",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        