package typings
package awsDashSdkLib.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParameterConstraints extends js.Object {
  /**
    * Whether or not the parameter is required.
    */
  var Required: js.UndefOr[__boolean] = js.undefined
}

object ParameterConstraints {
  @scala.inline
  def apply(Required: js.UndefOr[__boolean] = js.undefined): ParameterConstraints = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Required)) __obj.updateDynamic("Required")(Required)
    __obj.asInstanceOf[ParameterConstraints]
  }
}

