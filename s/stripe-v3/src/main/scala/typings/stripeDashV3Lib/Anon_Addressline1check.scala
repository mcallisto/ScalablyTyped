package typings
package stripeDashV3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Addressline1check extends js.Object {
  var address_line1_check: scala.Boolean | scala.Null
  var address_postal_code_check: scala.Boolean | scala.Null
  var cvc_check: scala.Boolean | scala.Null
}

object Anon_Addressline1check {
  @scala.inline
  def apply(
    address_line1_check: js.UndefOr[scala.Boolean] = js.undefined,
    address_postal_code_check: js.UndefOr[scala.Boolean] = js.undefined,
    cvc_check: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Addressline1check = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(address_line1_check)) __obj.updateDynamic("address_line1_check")(address_line1_check)
    if (!js.isUndefined(address_postal_code_check)) __obj.updateDynamic("address_postal_code_check")(address_postal_code_check)
    if (!js.isUndefined(cvc_check)) __obj.updateDynamic("cvc_check")(cvc_check)
    __obj.asInstanceOf[Anon_Addressline1check]
  }
}

