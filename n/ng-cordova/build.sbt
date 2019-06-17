organization := "org.scalablytyped"
name := "ng-cordova"
version := "0.0-unknown-dt-20190322Z-267933"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular" % "1.6-dt-20190206Z-a98bc0",
  "org.scalablytyped" %%% "cordova-plugin-camera" % "4.0.3-d95787",
  "org.scalablytyped" %%% "cordova-plugin-file" % "6.0.1-6135bc",
  "org.scalablytyped" %%% "cordova-plugin-file-transfer" % "1.7.1-93fcf7",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        