package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/withWidth.WithWidthOptions> */
trait PartialWithWidthOptions extends js.Object {
  var initialWidth: js.UndefOr[atMaterialDashUiCoreLib.stylesCreateBreakpointsMod.Breakpoint] = js.undefined
  var noSSR: js.UndefOr[scala.Boolean] = js.undefined
  var resizeInterval: js.UndefOr[scala.Double] = js.undefined
  var withTheme: js.UndefOr[scala.Boolean] = js.undefined
}

object PartialWithWidthOptions {
  @scala.inline
  def apply(
    initialWidth: atMaterialDashUiCoreLib.stylesCreateBreakpointsMod.Breakpoint = null,
    noSSR: js.UndefOr[scala.Boolean] = js.undefined,
    resizeInterval: scala.Int | scala.Double = null,
    withTheme: js.UndefOr[scala.Boolean] = js.undefined
  ): PartialWithWidthOptions = {
    val __obj = js.Dynamic.literal()
    if (initialWidth != null) __obj.updateDynamic("initialWidth")(initialWidth)
    if (!js.isUndefined(noSSR)) __obj.updateDynamic("noSSR")(noSSR)
    if (resizeInterval != null) __obj.updateDynamic("resizeInterval")(resizeInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(withTheme)) __obj.updateDynamic("withTheme")(withTheme)
    __obj.asInstanceOf[PartialWithWidthOptions]
  }
}

