organization := "org.scalablytyped"
name := "fhir-kit-client"
version := "1.1-dt-20190614Z-027048"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-998c42",
  "org.scalablytyped" %%% "fhir" % "0.0-unknown-dt-20190322Z-02fcda",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-b6ef41",
  "org.scalablytyped" %%% "json-patch" % "0.0-unknown-dt-20190322Z-2e6502",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-79c22c",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190412Z-862dd9",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-d23035")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        