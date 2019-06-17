organization := "org.scalablytyped"
name := "yeoman-environment"
version := "2.3-dt-20190522Z-8174b3"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "inquirer" % "6.x-dt-20190522Z-001afe",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20181203Z-f373d3",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-79c22c",
  "org.scalablytyped" %%% "rxjs" % "6.5.2-198571",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-666474",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-d5c5a1",
  "org.scalablytyped" %%% "yeoman-generator" % "3.1-dt-20190522Z-631588")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        