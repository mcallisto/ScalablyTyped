package typings
package awsDashSdkLib.clientsCloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListRuleNamesByTargetRequest extends js.Object {
  /**
    * The maximum number of results to return.
    */
  var Limit: js.UndefOr[LimitMax100] = js.undefined
  /**
    * The token returned by a previous call to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the target resource.
    */
  var TargetArn: awsDashSdkLib.clientsCloudwatcheventsMod.TargetArn
}

object ListRuleNamesByTargetRequest {
  @scala.inline
  def apply(TargetArn: TargetArn, Limit: js.UndefOr[LimitMax100] = js.undefined, NextToken: NextToken = null): ListRuleNamesByTargetRequest = {
    val __obj = js.Dynamic.literal(TargetArn = TargetArn)
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListRuleNamesByTargetRequest]
  }
}

