package typings
package awsDashSdkLib.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAssessmentRunAgentsResponse extends js.Object {
  /**
    * A list of ARNs that specifies the agents returned by the action.
    */
  var assessmentRunAgents: AssessmentRunAgentList
  /**
    *  When a response is generated, if there is more data to be listed, this parameter is present in the response and contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more data to be listed, this parameter is set to null.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}

object ListAssessmentRunAgentsResponse {
  @scala.inline
  def apply(assessmentRunAgents: AssessmentRunAgentList, nextToken: PaginationToken = null): ListAssessmentRunAgentsResponse = {
    val __obj = js.Dynamic.literal(assessmentRunAgents = assessmentRunAgents)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListAssessmentRunAgentsResponse]
  }
}

