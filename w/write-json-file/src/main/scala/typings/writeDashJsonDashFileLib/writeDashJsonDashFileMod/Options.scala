package typings
package writeDashJsonDashFileLib.writeDashJsonDashFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Detect indentation automatically if the file exists.
  		@default false
  		*/
  val detectIndent: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		Indentation as a string or number of spaces. Pass in `undefined` for no formatting.
  		@default '\t'
  		*/
  val indent: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
  		Mode used when writing the file.
  		@default 0o666
  		*/
  val mode: js.UndefOr[scala.Double] = js.undefined
  /**
  		Passed into `JSON.stringify`.
  		*/
  val replacer: js.UndefOr[Replacer | (js.Array[scala.Double | java.lang.String])] = js.undefined
  /**
  		Sort the keys recursively. Optionally pass in a compare function.
  		@default false
  		*/
  val sortKeys: js.UndefOr[scala.Boolean | SortKeys] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    detectIndent: js.UndefOr[scala.Boolean] = js.undefined,
    indent: java.lang.String | scala.Double = null,
    mode: scala.Int | scala.Double = null,
    replacer: Replacer | (js.Array[scala.Double | java.lang.String]) = null,
    sortKeys: scala.Boolean | SortKeys = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(detectIndent)) __obj.updateDynamic("detectIndent")(detectIndent)
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (replacer != null) __obj.updateDynamic("replacer")(replacer.asInstanceOf[js.Any])
    if (sortKeys != null) __obj.updateDynamic("sortKeys")(sortKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

