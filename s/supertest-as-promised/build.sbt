organization := "org.scalablytyped"
name := "supertest-as-promised"
version := "2.0-dt-20190524Z-402420"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190524Z-135f46",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-bb979e",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-79c22c",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20190312Z-8c8ba4",
  "org.scalablytyped" %%% "supertest" % "v2.0.1-dt-20190322Z-dfc4bb")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        