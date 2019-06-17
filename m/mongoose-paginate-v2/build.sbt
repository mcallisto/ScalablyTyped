organization := "org.scalablytyped"
name := "mongoose-paginate-v2"
version := "1.0-dt-20190227Z-1d7a04"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190322Z-588bab",
  "org.scalablytyped" %%% "mongodb" % "3.1-dt-20190531Z-4af486",
  "org.scalablytyped" %%% "mongoose" % "5.5.1-dt-20190610Z-5fcd80",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-79c22c",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        