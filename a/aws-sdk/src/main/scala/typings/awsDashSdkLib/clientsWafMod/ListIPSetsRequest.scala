package typings
package awsDashSdkLib.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListIPSetsRequest extends js.Object {
  /**
    * Specifies the number of IPSet objects that you want AWS WAF to return for this request. If you have more IPSet objects than the number you specify for Limit, the response includes a NextMarker value that you can use to get another batch of IPSet objects.
    */
  var Limit: js.UndefOr[PaginationLimit] = js.undefined
  /**
    * If you specify a value for Limit and you have more IPSets than the value of Limit, AWS WAF returns a NextMarker value in the response that allows you to list another group of IPSets. For the second and subsequent ListIPSets requests, specify the value of NextMarker from the previous response to get information about another batch of IPSets.
    */
  var NextMarker: js.UndefOr[NextMarker] = js.undefined
}

object ListIPSetsRequest {
  @scala.inline
  def apply(Limit: js.UndefOr[PaginationLimit] = js.undefined, NextMarker: NextMarker = null): ListIPSetsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit)
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker)
    __obj.asInstanceOf[ListIPSetsRequest]
  }
}

