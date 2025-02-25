package typings
package semanticDashUiDashReactLib.distCommonjsViewsStatisticStatisticValueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictStatisticValueProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent] = js.undefined
  /** Format the value with smaller font size to fit nicely beside number values. */
  var text: js.UndefOr[scala.Boolean] = js.undefined
}

object StrictStatisticValueProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    children: reactLib.reactMod.ReactNode = null,
    className: java.lang.String = null,
    content: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent = null,
    text: js.UndefOr[scala.Boolean] = js.undefined
  ): StrictStatisticValueProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(text)) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[StrictStatisticValueProps]
  }
}

