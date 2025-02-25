package typings
package vegaDashTooltipLib.buildDefaultsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Do not use the default styles provided by Vega Tooltip. If you enable this option, you need to use your own styles. It is not necessary to disable the default style when using a custom theme.
    */
  var disableDefaultStyle: scala.Boolean
  /**
    * ID of the tooltip element.
    */
  var id: java.lang.String
  /**
    * The maximum recursion depth when printing objects in the tooltip.
    */
  var maxDepth: scala.Double
  /**
    * X offset.
    */
  var offsetX: scala.Double
  /**
    * Y offset.
    */
  var offsetY: scala.Double
  /**
    * ID of the tooltip CSS style.
    */
  var styleId: java.lang.String
  /**
    * The name of the theme. You can use the CSS class called [THEME]-theme to style the tooltips.
    *
    * There are two predefined themes: "light" (default) and "dark".
    */
  var theme: java.lang.String
}

object Options {
  @scala.inline
  def apply(
    disableDefaultStyle: scala.Boolean,
    id: java.lang.String,
    maxDepth: scala.Double,
    offsetX: scala.Double,
    offsetY: scala.Double,
    styleId: java.lang.String,
    theme: java.lang.String
  ): Options = {
    val __obj = js.Dynamic.literal(disableDefaultStyle = disableDefaultStyle, id = id, maxDepth = maxDepth, offsetX = offsetX, offsetY = offsetY, styleId = styleId, theme = theme)
  
    __obj.asInstanceOf[Options]
  }
}

