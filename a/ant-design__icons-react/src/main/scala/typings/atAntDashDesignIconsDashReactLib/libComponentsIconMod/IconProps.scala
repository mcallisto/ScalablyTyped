package typings
package atAntDashDesignIconsDashReactLib.libComponentsIconMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var focusable: js.UndefOr[java.lang.String] = js.undefined
  var onClick: js.UndefOr[reactLib.reactMod.MouseEventHandler[stdLib.SVGSVGElement]] = js.undefined
  var primaryColor: js.UndefOr[java.lang.String] = js.undefined
  var secondaryColor: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var `type`: java.lang.String | atAntDashDesignIconsLib.libTypesMod.IconDefinition
}

object IconProps {
  @scala.inline
  def apply(
    `type`: java.lang.String | atAntDashDesignIconsLib.libTypesMod.IconDefinition,
    className: java.lang.String = null,
    focusable: java.lang.String = null,
    onClick: reactLib.reactMod.MouseEventHandler[stdLib.SVGSVGElement] = null,
    primaryColor: java.lang.String = null,
    secondaryColor: java.lang.String = null,
    style: reactLib.reactMod.CSSProperties = null
  ): IconProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (focusable != null) __obj.updateDynamic("focusable")(focusable)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (primaryColor != null) __obj.updateDynamic("primaryColor")(primaryColor)
    if (secondaryColor != null) __obj.updateDynamic("secondaryColor")(secondaryColor)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[IconProps]
  }
}

