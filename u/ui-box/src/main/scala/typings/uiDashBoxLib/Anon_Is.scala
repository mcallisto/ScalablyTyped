package typings
package uiDashBoxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Is[TT /* <: uiDashBoxLib.distTypesBoxDashTypesMod.Is[_] */] extends js.Object {
  var is: js.UndefOr[TT] = js.undefined
}

object Anon_Is {
  @scala.inline
  def apply[TT /* <: uiDashBoxLib.distTypesBoxDashTypesMod.Is[_] */](is: TT = null): Anon_Is[TT] = {
    val __obj = js.Dynamic.literal()
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Is[TT]]
  }
}

