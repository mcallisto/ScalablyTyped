package typings
package vexflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Text extends js.Object {
  var text: java.lang.String
  var `type`: scala.Double
  var width: scala.Double
}

object Anon_Text {
  @scala.inline
  def apply(text: java.lang.String, `type`: scala.Double, width: scala.Double): Anon_Text = {
    val __obj = js.Dynamic.literal(text = text, width = width)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Text]
  }
}

