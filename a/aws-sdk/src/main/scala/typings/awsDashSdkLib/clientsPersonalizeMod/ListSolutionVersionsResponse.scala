package typings
package awsDashSdkLib.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSolutionVersionsResponse extends js.Object {
  /**
    * A token for getting the next set of solution versions (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * A list of solution versions describing the version properties.
    */
  var solutionVersions: js.UndefOr[SolutionVersions] = js.undefined
}

object ListSolutionVersionsResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, solutionVersions: SolutionVersions = null): ListSolutionVersionsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (solutionVersions != null) __obj.updateDynamic("solutionVersions")(solutionVersions)
    __obj.asInstanceOf[ListSolutionVersionsResponse]
  }
}

