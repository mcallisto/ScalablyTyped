package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeGameSessionQueuesOutput extends js.Object {
  /**
    * Collection of objects that describes the requested game session queues.
    */
  var GameSessionQueues: js.UndefOr[GameSessionQueueList] = js.undefined
  /**
    * Token that indicates where to resume retrieving results on the next call to this action. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
}

object DescribeGameSessionQueuesOutput {
  @scala.inline
  def apply(GameSessionQueues: GameSessionQueueList = null, NextToken: NonZeroAndMaxString = null): DescribeGameSessionQueuesOutput = {
    val __obj = js.Dynamic.literal()
    if (GameSessionQueues != null) __obj.updateDynamic("GameSessionQueues")(GameSessionQueues)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeGameSessionQueuesOutput]
  }
}

