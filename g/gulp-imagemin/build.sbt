organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-777529"
scalaVersion := "2.13.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "imagemin" % "6.0-dt-20180823Z-ad2d2b",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-883291",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-44c9ad",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-68916c",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-7fd1d6",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-79c22c",
  "org.scalablytyped" %%% "std" % "3.5-d95bf7",
  "org.scalablytyped" %%% "svgo" % "1.0-dt-20190605Z-ad214b")
publishArtifact in packageDoc := false

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        