package typings
package awsDashSdkLib.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListChangeSetsInput extends js.Object {
  /**
    * A string (provided by the ListChangeSets response output) that identifies the next page of change sets that you want to retrieve.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The name or the Amazon Resource Name (ARN) of the stack for which you want to list change sets.
    */
  var StackName: StackNameOrId
}

object ListChangeSetsInput {
  @scala.inline
  def apply(StackName: StackNameOrId, NextToken: NextToken = null): ListChangeSetsInput = {
    val __obj = js.Dynamic.literal(StackName = StackName)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListChangeSetsInput]
  }
}

