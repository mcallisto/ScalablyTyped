organization := "org.scalablytyped"
name := "material-components-web"
version := "0.43-dt-20190212Z-7f1f1e"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "material__auto-init" % "0.35-dt-20190213Z-beef57",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20190313Z-8b3f0b",
  "org.scalablytyped" %%% "material__checkbox" % "0.35-dt-20190313Z-332d76",
  "org.scalablytyped" %%% "material__chips" % "0.35-dt-20190213Z-d6c235",
  "org.scalablytyped" %%% "material__dialog" % "0.35-dt-20190313Z-0b56ae",
  "org.scalablytyped" %%% "material__drawer" % "0.43-dt-20190213Z-8c0fc9",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20190213Z-635979",
  "org.scalablytyped" %%% "material__form-field" % "0.35-dt-20190313Z-d8a2cf",
  "org.scalablytyped" %%% "material__grid-list" % "0.35-dt-20190213Z-e15c2f",
  "org.scalablytyped" %%% "material__icon-toggle" % "0.35-dt-20190313Z-20d4f5",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20190213Z-2a05cd",
  "org.scalablytyped" %%% "material__linear-progress" % "0.35-dt-20190213Z-34be48",
  "org.scalablytyped" %%% "material__list" % "0.43-dt-20190313Z-37082a",
  "org.scalablytyped" %%% "material__menu" % "0.35-dt-20190213Z-803899",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20190213Z-1081dc",
  "org.scalablytyped" %%% "material__radio" % "0.35-dt-20190313Z-a086a3",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20190313Z-1a3cc1",
  "org.scalablytyped" %%% "material__select" % "0.35-dt-20190313Z-7b5e1b",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20190213Z-faa47d",
  "org.scalablytyped" %%% "material__slider" % "0.35-dt-20190313Z-e1a38d",
  "org.scalablytyped" %%% "material__snackbar" % "0.35-dt-20190313Z-a367d3",
  "org.scalablytyped" %%% "material__tabs" % "0.35-dt-20190313Z-486b47",
  "org.scalablytyped" %%% "material__textfield" % "0.35-dt-20190313Z-352704",
  "org.scalablytyped" %%% "material__toolbar" % "0.35-dt-20190313Z-20a95b",
  "org.scalablytyped" %%% "material__top-app-bar" % "0.35-dt-20190213Z-017bee",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        