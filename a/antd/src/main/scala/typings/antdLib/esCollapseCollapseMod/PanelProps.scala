package typings
package antdLib.esCollapseCollapseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var extra: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var forceRender: js.UndefOr[scala.Boolean] = js.undefined
  var header: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var isActive: js.UndefOr[scala.Boolean] = js.undefined
  var showArrow: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object PanelProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    extra: reactLib.reactMod.ReactNode = null,
    forceRender: js.UndefOr[scala.Boolean] = js.undefined,
    header: reactLib.reactMod.ReactNode = null,
    isActive: js.UndefOr[scala.Boolean] = js.undefined,
    showArrow: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.CSSProperties = null
  ): PanelProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (!js.isUndefined(forceRender)) __obj.updateDynamic("forceRender")(forceRender)
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (!js.isUndefined(isActive)) __obj.updateDynamic("isActive")(isActive)
    if (!js.isUndefined(showArrow)) __obj.updateDynamic("showArrow")(showArrow)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[PanelProps]
  }
}

