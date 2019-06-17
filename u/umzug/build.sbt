organization := "org.scalablytyped"
name := "umzug"
version := "v2.2.0-dt-20190524Z-22f991"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190524Z-135f46",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190322Z-588bab",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20181219Z-ed54b2",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190606Z-03812d",
  "org.scalablytyped" %%% "mongodb" % "3.1-dt-20190531Z-4af486",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-79c22c",
  "org.scalablytyped" %%% "sequelize" % "4.28.0-dt-20190530Z-f13ffb",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7",
  "org.scalablytyped" %%% "validator" % "v10.11.0-dt-20190608Z-2db286")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        