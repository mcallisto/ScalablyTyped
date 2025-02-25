package typings
package jsrenderLib.JsViewsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context
  extends /* prop */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /* Ancestor tags */
  var parentTags: js.UndefOr[Hash[Tag]] = js.undefined
  /* ctx object */
  /* Root data object or array */
  var root: js.Any
  /* This tag */
  var tag: js.UndefOr[Tag] = js.undefined
  /* tagCtx object */
  var tagCtx: js.UndefOr[js.Any] = js.undefined
}

object Context {
  @scala.inline
  def apply(
    root: js.Any,
    StringDictionary: /* prop */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    parentTags: Hash[Tag] = null,
    tag: Tag = null,
    tagCtx: js.Any = null
  ): Context = {
    val __obj = js.Dynamic.literal(root = root)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (parentTags != null) __obj.updateDynamic("parentTags")(parentTags)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    if (tagCtx != null) __obj.updateDynamic("tagCtx")(tagCtx)
    __obj.asInstanceOf[Context]
  }
}

