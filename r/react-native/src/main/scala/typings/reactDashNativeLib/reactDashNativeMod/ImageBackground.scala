package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped new (args : ...any): react-native.react-native.NativeMethodsMixin */ @JSImport("react-native", "ImageBackground")
@js.native
class ImageBackground ()
  extends reactLib.reactMod.Component[ImageBackgroundProps, js.Object, js.Any] {
  var abortPrefetch: js.UndefOr[js.Function1[/* requestId */ scala.Double, scala.Unit]] = js.native
  var queryCache: js.UndefOr[
    js.Function1[
      /* urls */ js.Array[java.lang.String], 
      js.Promise[
        org.scalablytyped.runtime.StringDictionary[
          reactDashNativeLib.reactDashNativeLibStrings.memory | reactDashNativeLib.reactDashNativeLibStrings.disk | reactDashNativeLib.reactDashNativeLibStrings.`disk/memory`
        ]
      ]
    ]
  ] = js.native
  var resizeMode: ImageResizeMode = js.native
  def getSize(
    uri: java.lang.String,
    success: js.Function2[/* width */ scala.Double, /* height */ scala.Double, scala.Unit],
    failure: js.Function1[/* error */ js.Any, scala.Unit]
  ): js.Any = js.native
  def prefetch(url: java.lang.String): js.Any = js.native
}

