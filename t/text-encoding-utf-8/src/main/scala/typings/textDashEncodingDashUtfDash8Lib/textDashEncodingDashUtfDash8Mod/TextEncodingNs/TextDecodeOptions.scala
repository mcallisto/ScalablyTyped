package typings
package textDashEncodingDashUtfDash8Lib.textDashEncodingDashUtfDash8Mod.TextEncodingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextDecodeOptions extends js.Object {
  var stream: js.UndefOr[scala.Boolean] = js.undefined
}

object TextDecodeOptions {
  @scala.inline
  def apply(stream: js.UndefOr[scala.Boolean] = js.undefined): TextDecodeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(stream)) __obj.updateDynamic("stream")(stream)
    __obj.asInstanceOf[TextDecodeOptions]
  }
}

