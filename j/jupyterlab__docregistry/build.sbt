organization := "org.scalablytyped"
name := "jupyterlab__docregistry"
version := "0.19.1-3254b2"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-da6515",
  "org.scalablytyped" %%% "jupyterlab__apputils" % "0.19.1-e9bde8",
  "org.scalablytyped" %%% "jupyterlab__coreutils" % "2.2.1-7ee8fe",
  "org.scalablytyped" %%% "jupyterlab__observables" % "2.1.1-5fea22",
  "org.scalablytyped" %%% "jupyterlab__rendermime" % "0.19.1-0a3d55",
  "org.scalablytyped" %%% "jupyterlab__rendermime-interfaces" % "1.2.1-e07c4c",
  "org.scalablytyped" %%% "jupyterlab__services" % "3.2.1-4f8841",
  "org.scalablytyped" %%% "phosphor__algorithm" % "1.1.3-f3a25f",
  "org.scalablytyped" %%% "phosphor__commands" % "1.6.2-a1e6f1",
  "org.scalablytyped" %%% "phosphor__coreutils" % "1.3.1-a27c8c",
  "org.scalablytyped" %%% "phosphor__disposable" % "1.1.3-927d2a",
  "org.scalablytyped" %%% "phosphor__messaging" % "1.2.3-dbcc84",
  "org.scalablytyped" %%% "phosphor__signaling" % "1.2.3-266418",
  "org.scalablytyped" %%% "phosphor__virtualdom" % "1.1.3-21c862",
  "org.scalablytyped" %%% "phosphor__widgets" % "1.7.0-7b59c0",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-9043ed",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190613Z-007242",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        