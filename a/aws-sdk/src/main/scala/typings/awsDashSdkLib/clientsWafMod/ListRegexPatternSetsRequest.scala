package typings
package awsDashSdkLib.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListRegexPatternSetsRequest extends js.Object {
  /**
    * Specifies the number of RegexPatternSet objects that you want AWS WAF to return for this request. If you have more RegexPatternSet objects than the number you specify for Limit, the response includes a NextMarker value that you can use to get another batch of RegexPatternSet objects.
    */
  var Limit: js.UndefOr[PaginationLimit] = js.undefined
  /**
    * If you specify a value for Limit and you have more RegexPatternSet objects than the value of Limit, AWS WAF returns a NextMarker value in the response that allows you to list another group of RegexPatternSet objects. For the second and subsequent ListRegexPatternSets requests, specify the value of NextMarker from the previous response to get information about another batch of RegexPatternSet objects.
    */
  var NextMarker: js.UndefOr[NextMarker] = js.undefined
}

object ListRegexPatternSetsRequest {
  @scala.inline
  def apply(Limit: js.UndefOr[PaginationLimit] = js.undefined, NextMarker: NextMarker = null): ListRegexPatternSetsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit)
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker)
    __obj.asInstanceOf[ListRegexPatternSetsRequest]
  }
}

