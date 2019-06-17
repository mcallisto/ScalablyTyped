organization := "org.scalablytyped"
name := "jupyterlab__codemirror"
version := "0.19.1-1eb8b8"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "codemirror" % "0.0-unknown-dt-20190409Z-fb303f",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20190322Z-69283f",
  "org.scalablytyped" %%% "jupyterlab__coreutils" % "2.2.1-7ee8fe",
  "org.scalablytyped" %%% "phosphor__algorithm" % "1.1.3-f3a25f",
  "org.scalablytyped" %%% "phosphor__coreutils" % "1.3.1-a27c8c",
  "org.scalablytyped" %%% "phosphor__disposable" % "1.1.3-927d2a",
  "org.scalablytyped" %%% "phosphor__signaling" % "1.2.3-266418",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7",
  "org.scalablytyped" %%% "tern" % "0.23-dt-20190516Z-135fe1")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        