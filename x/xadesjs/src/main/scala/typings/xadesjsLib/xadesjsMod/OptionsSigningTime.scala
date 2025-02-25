package typings
package xadesjsLib.xadesjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsSigningTime extends js.Object {
  /**
    * Format of the signing time. Default format is ISO
    */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Signing time value. Default value if now
    */
  var value: js.UndefOr[stdLib.Date] = js.undefined
}

object OptionsSigningTime {
  @scala.inline
  def apply(format: java.lang.String = null, value: stdLib.Date = null): OptionsSigningTime = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[OptionsSigningTime]
  }
}

