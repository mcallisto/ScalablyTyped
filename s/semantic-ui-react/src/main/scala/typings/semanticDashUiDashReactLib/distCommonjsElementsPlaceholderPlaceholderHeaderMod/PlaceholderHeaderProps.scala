package typings
package semanticDashUiDashReactLib.distCommonjsElementsPlaceholderPlaceholderHeaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaceholderHeaderProps
  extends StrictPlaceholderHeaderProps
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object PlaceholderHeaderProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    as: js.Any = null,
    children: reactLib.reactMod.ReactNode = null,
    className: java.lang.String = null,
    content: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent = null,
    image: js.UndefOr[scala.Boolean] = js.undefined
  ): PlaceholderHeaderProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(image)) __obj.updateDynamic("image")(image)
    __obj.asInstanceOf[PlaceholderHeaderProps]
  }
}

