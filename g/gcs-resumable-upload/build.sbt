organization := "org.scalablytyped"
name := "gcs-resumable-upload"
version := "1.1.0-99c149"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181202Z-89169e",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-ac3e5b",
  "org.scalablytyped" %%% "gaxios" % "1.8.4-b2b6ed",
  "org.scalablytyped" %%% "google-auth-library" % "3.1.2-f350af",
  "org.scalablytyped" %%% "gtoken" % "2.3.3-fdb10d",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-79c22c",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181017Z-a490dc",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        