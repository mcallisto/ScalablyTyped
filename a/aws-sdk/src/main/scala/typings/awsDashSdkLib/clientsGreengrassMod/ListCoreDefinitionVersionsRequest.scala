package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListCoreDefinitionVersionsRequest extends js.Object {
  /**
    * The ID of the core definition.
    */
  var CoreDefinitionId: __string
  /**
    * The maximum number of results to be returned per request.
    */
  var MaxResults: js.UndefOr[__string] = js.undefined
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
}

object ListCoreDefinitionVersionsRequest {
  @scala.inline
  def apply(CoreDefinitionId: __string, MaxResults: __string = null, NextToken: __string = null): ListCoreDefinitionVersionsRequest = {
    val __obj = js.Dynamic.literal(CoreDefinitionId = CoreDefinitionId)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListCoreDefinitionVersionsRequest]
  }
}

