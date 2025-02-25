package typings
package awsDashSdkLib.clientsDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactGetItemsInput extends js.Object {
  /**
    * A value of TOTAL causes consumed capacity information to be returned, and a value of NONE prevents that information from being returned. No other value is valid.
    */
  var ReturnConsumedCapacity: js.UndefOr[ReturnConsumedCapacity] = js.undefined
  /**
    * An ordered array of up to 25 TransactGetItem objects, each of which contains a Get structure.
    */
  var TransactItems: TransactGetItemList
}

object TransactGetItemsInput {
  @scala.inline
  def apply(TransactItems: TransactGetItemList, ReturnConsumedCapacity: ReturnConsumedCapacity = null): TransactGetItemsInput = {
    val __obj = js.Dynamic.literal(TransactItems = TransactItems)
    if (ReturnConsumedCapacity != null) __obj.updateDynamic("ReturnConsumedCapacity")(ReturnConsumedCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactGetItemsInput]
  }
}

