package typings
package awsDashSdkLib.clientsDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryOutput extends js.Object {
  /**
    * The capacity units consumed by the Query operation. The data returned includes the total provisioned throughput consumed, along with statistics for the table and any indexes involved in the operation. ConsumedCapacity is only returned if the ReturnConsumedCapacity parameter was specified. For more information, see Provisioned Throughput in the Amazon DynamoDB Developer Guide.
    */
  var ConsumedCapacity: js.UndefOr[ConsumedCapacity] = js.undefined
  /**
    * The number of items in the response. If you used a QueryFilter in the request, then Count is the number of items returned after the filter was applied, and ScannedCount is the number of matching items before the filter was applied. If you did not use a filter in the request, then Count and ScannedCount are the same.
    */
  var Count: js.UndefOr[Integer] = js.undefined
  /**
    * An array of item attributes that match the query criteria. Each element in this array consists of an attribute name and the value for that attribute.
    */
  var Items: js.UndefOr[ItemList] = js.undefined
  /**
    * The primary key of the item where the operation stopped, inclusive of the previous result set. Use this value to start a new operation, excluding this value in the new request. If LastEvaluatedKey is empty, then the "last page" of results has been processed and there is no more data to be retrieved. If LastEvaluatedKey is not empty, it does not necessarily mean that there is more data in the result set. The only way to know when you have reached the end of the result set is when LastEvaluatedKey is empty.
    */
  var LastEvaluatedKey: js.UndefOr[Key] = js.undefined
  /**
    * The number of items evaluated, before any QueryFilter is applied. A high ScannedCount value with few, or no, Count results indicates an inefficient Query operation. For more information, see Count and ScannedCount in the Amazon DynamoDB Developer Guide. If you did not use a filter in the request, then ScannedCount is the same as Count.
    */
  var ScannedCount: js.UndefOr[Integer] = js.undefined
}

object QueryOutput {
  @scala.inline
  def apply(
    ConsumedCapacity: ConsumedCapacity = null,
    Count: js.UndefOr[Integer] = js.undefined,
    Items: ItemList = null,
    LastEvaluatedKey: Key = null,
    ScannedCount: js.UndefOr[Integer] = js.undefined
  ): QueryOutput = {
    val __obj = js.Dynamic.literal()
    if (ConsumedCapacity != null) __obj.updateDynamic("ConsumedCapacity")(ConsumedCapacity)
    if (!js.isUndefined(Count)) __obj.updateDynamic("Count")(Count)
    if (Items != null) __obj.updateDynamic("Items")(Items)
    if (LastEvaluatedKey != null) __obj.updateDynamic("LastEvaluatedKey")(LastEvaluatedKey)
    if (!js.isUndefined(ScannedCount)) __obj.updateDynamic("ScannedCount")(ScannedCount)
    __obj.asInstanceOf[QueryOutput]
  }
}

