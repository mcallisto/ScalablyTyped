package typings
package intlDashMessageformatDashParserLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Capture location info in AST
    * Default is false
    */
  var captureLocation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to convert `#` in plural rule options
    * to `{var, number}`
    * Default is true
    */
  var normalizeHashtagInPlural: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    captureLocation: js.UndefOr[scala.Boolean] = js.undefined,
    normalizeHashtagInPlural: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(captureLocation)) __obj.updateDynamic("captureLocation")(captureLocation)
    if (!js.isUndefined(normalizeHashtagInPlural)) __obj.updateDynamic("normalizeHashtagInPlural")(normalizeHashtagInPlural)
    __obj.asInstanceOf[Options]
  }
}

