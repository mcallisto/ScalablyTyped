package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDeviceDefinitionVersionsResponse extends js.Object {
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
  /**
    * Information about a version.
    */
  var Versions: js.UndefOr[__listOfVersionInformation] = js.undefined
}

object ListDeviceDefinitionVersionsResponse {
  @scala.inline
  def apply(NextToken: __string = null, Versions: __listOfVersionInformation = null): ListDeviceDefinitionVersionsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Versions != null) __obj.updateDynamic("Versions")(Versions)
    __obj.asInstanceOf[ListDeviceDefinitionVersionsResponse]
  }
}

