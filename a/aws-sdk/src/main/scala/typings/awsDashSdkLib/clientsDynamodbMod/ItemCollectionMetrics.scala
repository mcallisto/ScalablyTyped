package typings
package awsDashSdkLib.clientsDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemCollectionMetrics extends js.Object {
  /**
    * The partition key value of the item collection. This value is the same as the partition key value of the item.
    */
  var ItemCollectionKey: js.UndefOr[ItemCollectionKeyAttributeMap] = js.undefined
  /**
    * An estimate of item collection size, in gigabytes. This value is a two-element array containing a lower bound and an upper bound for the estimate. The estimate includes the size of all the items in the table, plus the size of all attributes projected into all of the local secondary indexes on that table. Use this estimate to measure whether a local secondary index is approaching its size limit. The estimate is subject to change over time; therefore, do not rely on the precision or accuracy of the estimate.
    */
  var SizeEstimateRangeGB: js.UndefOr[ItemCollectionSizeEstimateRange] = js.undefined
}

object ItemCollectionMetrics {
  @scala.inline
  def apply(
    ItemCollectionKey: ItemCollectionKeyAttributeMap = null,
    SizeEstimateRangeGB: ItemCollectionSizeEstimateRange = null
  ): ItemCollectionMetrics = {
    val __obj = js.Dynamic.literal()
    if (ItemCollectionKey != null) __obj.updateDynamic("ItemCollectionKey")(ItemCollectionKey)
    if (SizeEstimateRangeGB != null) __obj.updateDynamic("SizeEstimateRangeGB")(SizeEstimateRangeGB)
    __obj.asInstanceOf[ItemCollectionMetrics]
  }
}

