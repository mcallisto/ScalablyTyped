organization := "org.scalablytyped"
name := "twilio-chat"
version := "3.2.3-57cf96"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "loglevel" % "1.5-dt-20190205Z-5dc65c",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-79c22c",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7",
  "org.scalablytyped" %%% "twilio-mcs-client" % "0.2.3-ed747d",
  "org.scalablytyped" %%% "twilio-notifications" % "0.5.6-fa7646",
  "org.scalablytyped" %%% "twilio-sync" % "0.10.4-dc492a",
  "org.scalablytyped" %%% "twilio-transport" % "0.3.4-b3ac28",
  "org.scalablytyped" %%% "twilsock" % "0.5.9-150784")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        