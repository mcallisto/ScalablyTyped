package typings
package playmusicLib.playmusicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistData extends js.Object {
  var items: js.UndefOr[js.Array[PlaylistItem]] = js.undefined
}

object PlaylistData {
  @scala.inline
  def apply(items: js.Array[PlaylistItem] = null): PlaylistData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[PlaylistData]
  }
}

