package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnenotePatchContentCommand extends js.Object {
  /** The action to perform on the target element. The possible values are: replace, append, delete, insert, or prepend. */
  var action: js.UndefOr[OnenotePatchActionType] = js.undefined
  /**
    * A string of well-formed HTML to add to the page, and any image or file binary data.
    * If the content contains binary data, the request must be sent using the multipart/form-data content type with a 'Commands' part.
    */
  var content: js.UndefOr[java.lang.String] = js.undefined
  /** The location to add the supplied content, relative to the target element. The possible values are: after (default) or before. */
  var position: js.UndefOr[OnenotePatchInsertPosition] = js.undefined
  /** The element to update. Must be the #&amp;lt;data-id&amp;gt; or the generated &amp;lt;id&amp;gt; of the element, or the body or title keyword. */
  var target: js.UndefOr[java.lang.String] = js.undefined
}

object OnenotePatchContentCommand {
  @scala.inline
  def apply(
    action: OnenotePatchActionType = null,
    content: java.lang.String = null,
    position: OnenotePatchInsertPosition = null,
    target: java.lang.String = null
  ): OnenotePatchContentCommand = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (content != null) __obj.updateDynamic("content")(content)
    if (position != null) __obj.updateDynamic("position")(position)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[OnenotePatchContentCommand]
  }
}

