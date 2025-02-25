package typings
package reactDashImageDashFallbackLib.reactDashImageDashFallbackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactImageFallbackProps extends js.Object {
  var fallbackImage: java.lang.String | reactLib.reactMod.ReactElement | (js.Array[reactLib.reactMod.ReactElement | java.lang.String])
  var initialImage: js.UndefOr[java.lang.String | reactLib.reactMod.ReactElement] = js.undefined
  var initialTimeout: js.UndefOr[scala.Double] = js.undefined
  var onError: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.SyntheticEvent[stdLib.HTMLImageElement, reactLib.Event], 
      scala.Unit
    ]
  ] = js.undefined
  var onLoad: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.SyntheticEvent[stdLib.HTMLImageElement, reactLib.Event], 
      scala.Unit
    ]
  ] = js.undefined
  var src: java.lang.String
}

object ReactImageFallbackProps {
  @scala.inline
  def apply(
    fallbackImage: java.lang.String | reactLib.reactMod.ReactElement | (js.Array[reactLib.reactMod.ReactElement | java.lang.String]),
    src: java.lang.String,
    initialImage: java.lang.String | reactLib.reactMod.ReactElement = null,
    initialTimeout: scala.Int | scala.Double = null,
    onError: /* event */ reactLib.reactMod.SyntheticEvent[stdLib.HTMLImageElement, reactLib.Event] => scala.Unit = null,
    onLoad: /* event */ reactLib.reactMod.SyntheticEvent[stdLib.HTMLImageElement, reactLib.Event] => scala.Unit = null
  ): ReactImageFallbackProps = {
    val __obj = js.Dynamic.literal(fallbackImage = fallbackImage.asInstanceOf[js.Any], src = src)
    if (initialImage != null) __obj.updateDynamic("initialImage")(initialImage.asInstanceOf[js.Any])
    if (initialTimeout != null) __obj.updateDynamic("initialTimeout")(initialTimeout.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    __obj.asInstanceOf[ReactImageFallbackProps]
  }
}

