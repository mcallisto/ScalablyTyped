organization := "org.scalablytyped"
name := "webtorrent"
version := "0.98-dt-20190212Z-198cae"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20190212Z-cab10e",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20190212Z-379be3",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-79c22c",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20190212Z-9aa618",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20190212Z-9db467",
  "org.scalablytyped" %%% "simple-peer" % "6.1-dt-20180721Z-1cb78a",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        