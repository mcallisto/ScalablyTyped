package typings
package chartDotJsLib.chartDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartAnimationOptions extends js.Object {
  var animateRotate: js.UndefOr[scala.Boolean] = js.undefined
  var animateScale: js.UndefOr[scala.Boolean] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
  var easing: js.UndefOr[Easing] = js.undefined
  var onComplete: js.UndefOr[js.Function1[/* chart */ js.Any, scala.Unit]] = js.undefined
  var onProgress: js.UndefOr[js.Function1[/* chart */ js.Any, scala.Unit]] = js.undefined
}

object ChartAnimationOptions {
  @scala.inline
  def apply(
    animateRotate: js.UndefOr[scala.Boolean] = js.undefined,
    animateScale: js.UndefOr[scala.Boolean] = js.undefined,
    duration: scala.Int | scala.Double = null,
    easing: Easing = null,
    onComplete: /* chart */ js.Any => scala.Unit = null,
    onProgress: /* chart */ js.Any => scala.Unit = null
  ): ChartAnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animateRotate)) __obj.updateDynamic("animateRotate")(animateRotate)
    if (!js.isUndefined(animateScale)) __obj.updateDynamic("animateScale")(animateScale)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction1(onComplete))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1(onProgress))
    __obj.asInstanceOf[ChartAnimationOptions]
  }
}

