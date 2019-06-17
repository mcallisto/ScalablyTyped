organization := "org.scalablytyped"
name := "jupyterlab__csvviewer"
version := "0.19.1-6f8e77"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "phosphor__algorithm" % "1.1.3-f3a25f",
  "org.scalablytyped" %%% "phosphor__commands" % "1.6.2-a1e6f1",
  "org.scalablytyped" %%% "phosphor__coreutils" % "1.3.1-a27c8c",
  "org.scalablytyped" %%% "phosphor__datagrid" % "0.1.7-572b48",
  "org.scalablytyped" %%% "phosphor__disposable" % "1.1.3-927d2a",
  "org.scalablytyped" %%% "phosphor__messaging" % "1.2.3-dbcc84",
  "org.scalablytyped" %%% "phosphor__signaling" % "1.2.3-266418",
  "org.scalablytyped" %%% "phosphor__virtualdom" % "1.1.3-21c862",
  "org.scalablytyped" %%% "phosphor__widgets" % "1.7.0-7b59c0",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        