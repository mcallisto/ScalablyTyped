package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribePatchPropertiesRequest extends js.Object {
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The operating system type for which to list patches.
    */
  var OperatingSystem: awsDashSdkLib.clientsSsmMod.OperatingSystem
  /**
    * Indicates whether to list patches for the Windows operating system or for Microsoft applications. Not applicable for Linux operating systems.
    */
  var PatchSet: js.UndefOr[PatchSet] = js.undefined
  /**
    * The patch property for which you want to view patch details. 
    */
  var Property: PatchProperty
}

object DescribePatchPropertiesRequest {
  @scala.inline
  def apply(
    OperatingSystem: OperatingSystem,
    Property: PatchProperty,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null,
    PatchSet: PatchSet = null
  ): DescribePatchPropertiesRequest = {
    val __obj = js.Dynamic.literal(OperatingSystem = OperatingSystem.asInstanceOf[js.Any], Property = Property.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (PatchSet != null) __obj.updateDynamic("PatchSet")(PatchSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePatchPropertiesRequest]
  }
}

