organization := "org.scalablytyped"
name := "firebase__database"
version := "0.4.5-b9a996"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "firebase__app-types" % "0.4.0-995810",
  "org.scalablytyped" %%% "firebase__database-types" % "0.4.0-81af69",
  "org.scalablytyped" %%% "firebase__util" % "0.2.19-59bc32",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        