package typings
package markedLib.markedMod.TokensNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemStart
  extends markedLib.markedMod.Token {
  var `type`: markedLib.markedLibStrings.list_item_start
}

object ListItemStart {
  @scala.inline
  def apply(`type`: markedLib.markedLibStrings.list_item_start): ListItemStart = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ListItemStart]
  }
}

