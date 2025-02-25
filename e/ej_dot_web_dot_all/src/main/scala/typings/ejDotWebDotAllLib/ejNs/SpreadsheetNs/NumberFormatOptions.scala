package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberFormatOptions extends js.Object {
  /** Pass the number format object
    */
  var NumFormat: js.UndefOr[js.Any] = js.undefined
  /** Pass the style object
    */
  var style: js.UndefOr[js.Any] = js.undefined
}

object NumberFormatOptions {
  @scala.inline
  def apply(NumFormat: js.Any = null, style: js.Any = null): NumberFormatOptions = {
    val __obj = js.Dynamic.literal()
    if (NumFormat != null) __obj.updateDynamic("NumFormat")(NumFormat)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[NumberFormatOptions]
  }
}

