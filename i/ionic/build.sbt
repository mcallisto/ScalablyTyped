organization := "org.scalablytyped"
name := "ionic"
version := "5.0.2-aa324f"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-bb979e",
  "org.scalablytyped" %%% "inquirer" % "6.x-dt-20190522Z-001afe",
  "org.scalablytyped" %%% "ionic__cli-framework" % "2.0.2-998b47",
  "org.scalablytyped" %%% "ionic__utils-network" % "1.0.1-3e0c2c",
  "org.scalablytyped" %%% "ionic__utils-object" % "1.0.1-bd3857",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "1.0.2-130a9f",
  "org.scalablytyped" %%% "log-update" % "3.2.0-0fb61e",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-8428c2",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-79c22c",
  "org.scalablytyped" %%% "rxjs" % "6.5.2-198571",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7",
  "org.scalablytyped" %%% "string-width" % "4.1.0-3ecaba",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20190312Z-8c8ba4",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-666474")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        