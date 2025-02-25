package typings
package awsDashSdkLib.clientsMediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamSelection extends js.Object {
  /**
    * The maximum video bitrate (bps) to include in output.
    */
  var MaxVideoBitsPerSecond: js.UndefOr[__integer] = js.undefined
  /**
    * The minimum video bitrate (bps) to include in output.
    */
  var MinVideoBitsPerSecond: js.UndefOr[__integer] = js.undefined
  /**
    * A directive that determines the order of streams in the output.
    */
  var StreamOrder: js.UndefOr[StreamOrder] = js.undefined
}

object StreamSelection {
  @scala.inline
  def apply(
    MaxVideoBitsPerSecond: js.UndefOr[__integer] = js.undefined,
    MinVideoBitsPerSecond: js.UndefOr[__integer] = js.undefined,
    StreamOrder: StreamOrder = null
  ): StreamSelection = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxVideoBitsPerSecond)) __obj.updateDynamic("MaxVideoBitsPerSecond")(MaxVideoBitsPerSecond)
    if (!js.isUndefined(MinVideoBitsPerSecond)) __obj.updateDynamic("MinVideoBitsPerSecond")(MinVideoBitsPerSecond)
    if (StreamOrder != null) __obj.updateDynamic("StreamOrder")(StreamOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamSelection]
  }
}

