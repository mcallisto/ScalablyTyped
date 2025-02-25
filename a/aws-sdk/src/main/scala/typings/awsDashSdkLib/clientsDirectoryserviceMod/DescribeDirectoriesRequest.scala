package typings
package awsDashSdkLib.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDirectoriesRequest extends js.Object {
  /**
    * A list of identifiers of the directories for which to obtain the information. If this member is null, all directories that belong to the current account are returned. An empty list results in an InvalidParameterException being thrown.
    */
  var DirectoryIds: js.UndefOr[DirectoryIds] = js.undefined
  /**
    * The maximum number of items to return. If this value is zero, the maximum number of items is specified by the limitations of the operation.
    */
  var Limit: js.UndefOr[Limit] = js.undefined
  /**
    * The DescribeDirectoriesResult.NextToken value from a previous call to DescribeDirectories. Pass null if this is the first call.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object DescribeDirectoriesRequest {
  @scala.inline
  def apply(
    DirectoryIds: DirectoryIds = null,
    Limit: js.UndefOr[Limit] = js.undefined,
    NextToken: NextToken = null
  ): DescribeDirectoriesRequest = {
    val __obj = js.Dynamic.literal()
    if (DirectoryIds != null) __obj.updateDynamic("DirectoryIds")(DirectoryIds)
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeDirectoriesRequest]
  }
}

