package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListManagedSchemaArnsRequest extends js.Object {
  /**
    * The maximum number of results to retrieve.
    */
  var MaxResults: js.UndefOr[NumberResults] = js.undefined
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The response for ListManagedSchemaArns. When this parameter is used, all minor version ARNs for a major version are listed.
    */
  var SchemaArn: js.UndefOr[Arn] = js.undefined
}

object ListManagedSchemaArnsRequest {
  @scala.inline
  def apply(
    MaxResults: js.UndefOr[NumberResults] = js.undefined,
    NextToken: NextToken = null,
    SchemaArn: Arn = null
  ): ListManagedSchemaArnsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (SchemaArn != null) __obj.updateDynamic("SchemaArn")(SchemaArn)
    __obj.asInstanceOf[ListManagedSchemaArnsRequest]
  }
}

