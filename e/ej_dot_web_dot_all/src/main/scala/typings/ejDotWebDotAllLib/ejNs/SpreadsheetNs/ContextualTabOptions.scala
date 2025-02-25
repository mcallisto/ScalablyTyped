package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextualTabOptions extends js.Object {
  /** Pass the background color
    */
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /** Pass the border color
    */
  var borderColor: js.UndefOr[java.lang.String] = js.undefined
  /** Pass the tabs object to add in ribbon
    */
  var tabs: js.UndefOr[js.Any] = js.undefined
}

object ContextualTabOptions {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String = null,
    borderColor: java.lang.String = null,
    tabs: js.Any = null
  ): ContextualTabOptions = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (tabs != null) __obj.updateDynamic("tabs")(tabs)
    __obj.asInstanceOf[ContextualTabOptions]
  }
}

