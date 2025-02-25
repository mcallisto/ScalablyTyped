organization := "org.scalablytyped"
name := "yeoman-environment"
version := "2.3-dt-20190522Z-5bcf66"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "inquirer" % "6.x-dt-20190522Z-a4c083",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20181203Z-81a293",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190709Z-570c89",
  "org.scalablytyped" %%% "rxjs" % "6.5.2-4ab268",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-4b600b",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-43117c",
  "org.scalablytyped" %%% "yeoman-generator" % "3.1-dt-20190522Z-f2ab0a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        