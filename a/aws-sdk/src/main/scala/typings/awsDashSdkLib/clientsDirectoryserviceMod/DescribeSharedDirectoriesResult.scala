package typings
package awsDashSdkLib.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeSharedDirectoriesResult extends js.Object {
  /**
    * If not null, token that indicates that more results are available. Pass this value for the NextToken parameter in a subsequent call to DescribeSharedDirectories to retrieve the next set of items.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * A list of all shared directories in your account.
    */
  var SharedDirectories: js.UndefOr[SharedDirectories] = js.undefined
}

object DescribeSharedDirectoriesResult {
  @scala.inline
  def apply(NextToken: NextToken = null, SharedDirectories: SharedDirectories = null): DescribeSharedDirectoriesResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (SharedDirectories != null) __obj.updateDynamic("SharedDirectories")(SharedDirectories)
    __obj.asInstanceOf[DescribeSharedDirectoriesResult]
  }
}

