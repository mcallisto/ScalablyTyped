package typings
package atIonicCliDashFrameworkLib.libOutputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogUpdateOutputStrategyOptions extends js.Object {
  val colors: js.UndefOr[atIonicCliDashFrameworkLib.libColorsMod.Colors] = js.undefined
  val stream: js.UndefOr[nodeLib.NodeJSNs.WritableStream] = js.undefined
}

object LogUpdateOutputStrategyOptions {
  @scala.inline
  def apply(
    colors: atIonicCliDashFrameworkLib.libColorsMod.Colors = null,
    stream: nodeLib.NodeJSNs.WritableStream = null
  ): LogUpdateOutputStrategyOptions = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (stream != null) __obj.updateDynamic("stream")(stream)
    __obj.asInstanceOf[LogUpdateOutputStrategyOptions]
  }
}

