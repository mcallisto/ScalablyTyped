package typings
package sbdLib.sbdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var abbreviations: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var allowed_tags: js.UndefOr[sbdLib.sbdLibNumbers.`false` | js.Array[java.lang.String]] = js.undefined
  var html_boundaries: js.UndefOr[scala.Boolean] = js.undefined
  var newline_boundaries: js.UndefOr[scala.Boolean] = js.undefined
  var preserve_whitespace: js.UndefOr[scala.Boolean] = js.undefined
  var sanitize: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    abbreviations: js.Array[java.lang.String] = null,
    allowed_tags: sbdLib.sbdLibNumbers.`false` | js.Array[java.lang.String] = null,
    html_boundaries: js.UndefOr[scala.Boolean] = js.undefined,
    newline_boundaries: js.UndefOr[scala.Boolean] = js.undefined,
    preserve_whitespace: js.UndefOr[scala.Boolean] = js.undefined,
    sanitize: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (abbreviations != null) __obj.updateDynamic("abbreviations")(abbreviations)
    if (allowed_tags != null) __obj.updateDynamic("allowed_tags")(allowed_tags.asInstanceOf[js.Any])
    if (!js.isUndefined(html_boundaries)) __obj.updateDynamic("html_boundaries")(html_boundaries)
    if (!js.isUndefined(newline_boundaries)) __obj.updateDynamic("newline_boundaries")(newline_boundaries)
    if (!js.isUndefined(preserve_whitespace)) __obj.updateDynamic("preserve_whitespace")(preserve_whitespace)
    if (!js.isUndefined(sanitize)) __obj.updateDynamic("sanitize")(sanitize)
    __obj.asInstanceOf[Options]
  }
}

