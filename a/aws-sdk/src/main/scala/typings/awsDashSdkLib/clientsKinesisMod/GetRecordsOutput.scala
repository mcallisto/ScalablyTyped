package typings
package awsDashSdkLib.clientsKinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRecordsOutput extends js.Object {
  /**
    * The number of milliseconds the GetRecords response is from the tip of the stream, indicating how far behind current time the consumer is. A value of zero indicates that record processing is caught up, and there are no new records to process at this moment.
    */
  var MillisBehindLatest: js.UndefOr[MillisBehindLatest] = js.undefined
  /**
    * The next position in the shard from which to start sequentially reading data records. If set to null, the shard has been closed and the requested iterator does not return any more data. 
    */
  var NextShardIterator: js.UndefOr[ShardIterator] = js.undefined
  /**
    * The data records retrieved from the shard.
    */
  var Records: RecordList
}

object GetRecordsOutput {
  @scala.inline
  def apply(
    Records: RecordList,
    MillisBehindLatest: js.UndefOr[MillisBehindLatest] = js.undefined,
    NextShardIterator: ShardIterator = null
  ): GetRecordsOutput = {
    val __obj = js.Dynamic.literal(Records = Records)
    if (!js.isUndefined(MillisBehindLatest)) __obj.updateDynamic("MillisBehindLatest")(MillisBehindLatest)
    if (NextShardIterator != null) __obj.updateDynamic("NextShardIterator")(NextShardIterator)
    __obj.asInstanceOf[GetRecordsOutput]
  }
}

