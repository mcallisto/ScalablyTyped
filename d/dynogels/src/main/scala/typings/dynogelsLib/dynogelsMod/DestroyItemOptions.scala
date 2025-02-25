package typings
package dynogelsLib.dynogelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DestroyItemOptions extends js.Object {
  var ConditionExpression: js.UndefOr[awsDashSdkLib.clientsDynamodbMod.ConditionExpression] = js.undefined
  var ConditionalOperator: js.UndefOr[awsDashSdkLib.clientsDynamodbMod.ConditionalOperator] = js.undefined
  var Expected: js.UndefOr[awsDashSdkLib.clientsDynamodbMod.ExpectedAttributeMap] = js.undefined
  var ExpressionAttributeNames: js.UndefOr[awsDashSdkLib.clientsDynamodbMod.ExpressionAttributeNameMap] = js.undefined
  var ExpressionAttributeValues: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var ReturnConsumedCapacity: js.UndefOr[awsDashSdkLib.clientsDynamodbMod.ReturnConsumedCapacity] = js.undefined
  var ReturnItemCollectionMetrics: js.UndefOr[awsDashSdkLib.clientsDynamodbMod.ReturnItemCollectionMetrics] = js.undefined
  var ReturnValues: js.UndefOr[awsDashSdkLib.clientsDynamodbMod.ReturnValue] = js.undefined
}

object DestroyItemOptions {
  @scala.inline
  def apply(
    ConditionExpression: awsDashSdkLib.clientsDynamodbMod.ConditionExpression = null,
    ConditionalOperator: awsDashSdkLib.clientsDynamodbMod.ConditionalOperator = null,
    Expected: awsDashSdkLib.clientsDynamodbMod.ExpectedAttributeMap = null,
    ExpressionAttributeNames: awsDashSdkLib.clientsDynamodbMod.ExpressionAttributeNameMap = null,
    ExpressionAttributeValues: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    ReturnConsumedCapacity: awsDashSdkLib.clientsDynamodbMod.ReturnConsumedCapacity = null,
    ReturnItemCollectionMetrics: awsDashSdkLib.clientsDynamodbMod.ReturnItemCollectionMetrics = null,
    ReturnValues: awsDashSdkLib.clientsDynamodbMod.ReturnValue = null
  ): DestroyItemOptions = {
    val __obj = js.Dynamic.literal()
    if (ConditionExpression != null) __obj.updateDynamic("ConditionExpression")(ConditionExpression)
    if (ConditionalOperator != null) __obj.updateDynamic("ConditionalOperator")(ConditionalOperator.asInstanceOf[js.Any])
    if (Expected != null) __obj.updateDynamic("Expected")(Expected)
    if (ExpressionAttributeNames != null) __obj.updateDynamic("ExpressionAttributeNames")(ExpressionAttributeNames)
    if (ExpressionAttributeValues != null) __obj.updateDynamic("ExpressionAttributeValues")(ExpressionAttributeValues)
    if (ReturnConsumedCapacity != null) __obj.updateDynamic("ReturnConsumedCapacity")(ReturnConsumedCapacity.asInstanceOf[js.Any])
    if (ReturnItemCollectionMetrics != null) __obj.updateDynamic("ReturnItemCollectionMetrics")(ReturnItemCollectionMetrics.asInstanceOf[js.Any])
    if (ReturnValues != null) __obj.updateDynamic("ReturnValues")(ReturnValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestroyItemOptions]
  }
}

