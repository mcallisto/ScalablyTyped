package typings
package atNivoWaffleLib.atNivoWaffleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaffleDatum extends js.Object {
  var id: java.lang.String | scala.Double
  var label: java.lang.String | scala.Double
  var value: scala.Double
}

object WaffleDatum {
  @scala.inline
  def apply(id: java.lang.String | scala.Double, label: java.lang.String | scala.Double, value: scala.Double): WaffleDatum = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], value = value)
  
    __obj.asInstanceOf[WaffleDatum]
  }
}

