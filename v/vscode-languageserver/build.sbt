organization := "org.scalablytyped"
name := "vscode-languageserver"
version := "5.2.1-c42764"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190709Z-570c89",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-b4cd10",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.14.1-cff04f",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.14.0-8a2ee1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        