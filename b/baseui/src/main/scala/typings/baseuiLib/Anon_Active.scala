package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Active extends js.Object {
  @JSName("$active")
  var $active: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Active {
  @scala.inline
  def apply($active: js.UndefOr[scala.Boolean] = js.undefined): Anon_Active = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($active)) __obj.updateDynamic("$active")($active)
    __obj.asInstanceOf[Anon_Active]
  }
}

