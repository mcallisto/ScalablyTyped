organization := "org.scalablytyped"
name := "rappid"
version := "1.5-dt-20190619Z-9f1f3e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "backbone" % "1.4-dt-20190619Z-8ad2fa",
  "org.scalablytyped" %%% "jointjs" % "3.0.2-1f29ae",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190624Z-b9b940",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-c53ffb",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "underscore" % "1.9-dt-20190701Z-5dbada")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        