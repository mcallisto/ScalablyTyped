package typings
package awsDashSdkLib.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListStackSetsOutput extends js.Object {
  /**
    * If the request doesn't return all of the remaining results, NextToken is set to a token. To retrieve the next set of results, call ListStackInstances again and assign that token to the request object's NextToken parameter. If the request returns all results, NextToken is set to null.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * A list of StackSetSummary structures that contain information about the user's stack sets.
    */
  var Summaries: js.UndefOr[StackSetSummaries] = js.undefined
}

object ListStackSetsOutput {
  @scala.inline
  def apply(NextToken: NextToken = null, Summaries: StackSetSummaries = null): ListStackSetsOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Summaries != null) __obj.updateDynamic("Summaries")(Summaries)
    __obj.asInstanceOf[ListStackSetsOutput]
  }
}

