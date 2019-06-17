organization := "org.scalablytyped"
name := "cassanknex"
version := "1.19-dt-20190304Z-a99f29"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cassandra-driver" % "4.0-dt-20190221Z-aa430a",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20190322Z-2e1e85",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-79c22c",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        