organization := "org.scalablytyped"
name := "webtorrent"
version := "0.98-dt-20190212Z-aa07c1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20190212Z-fd0126",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20190212Z-d8c958",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190709Z-570c89",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20190212Z-292a2e",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20190212Z-c2bf33",
  "org.scalablytyped" %%% "simple-peer" % "6.1-dt-20190626Z-2bf543",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        