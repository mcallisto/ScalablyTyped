package typings
package reactDashSpinnersLib.reactDashSpinnersMod.ReactSpinnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CircleLoaderProps extends CommonProps {
  var size: js.UndefOr[scala.Double] = js.undefined
  var sizeUnit: js.UndefOr[java.lang.String] = js.undefined
}

object CircleLoaderProps {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    css: java.lang.String | PrecompiledCss = null,
    loading: js.UndefOr[scala.Boolean] = js.undefined,
    size: scala.Int | scala.Double = null,
    sizeUnit: java.lang.String = null
  ): CircleLoaderProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (sizeUnit != null) __obj.updateDynamic("sizeUnit")(sizeUnit)
    __obj.asInstanceOf[CircleLoaderProps]
  }
}

