organization := "org.scalablytyped"
name := "ionic__angular"
version := "4.5.0-e5870a"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular__common" % "8.0.1-161cfe",
  "org.scalablytyped" %%% "angular__core" % "8.0.1-d533b9",
  "org.scalablytyped" %%% "angular__forms" % "8.0.1-71dd25",
  "org.scalablytyped" %%% "angular__router" % "8.0.1-c16a11",
  "org.scalablytyped" %%% "ionic__core" % "4.5.0-252fa6",
  "org.scalablytyped" %%% "rxjs" % "6.5.2-198571",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        