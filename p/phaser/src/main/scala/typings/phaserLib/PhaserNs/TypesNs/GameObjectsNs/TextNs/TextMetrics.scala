package typings
package phaserLib.PhaserNs.TypesNs.GameObjectsNs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Font metrics for a Text Style object.
  */
trait TextMetrics extends js.Object {
  /**
    * The ascent of the font.
    */
  var ascent: scala.Double
  /**
    * The descent of the font.
    */
  var descent: scala.Double
  /**
    * The size of the font.
    */
  var fontSize: scala.Double
}

object TextMetrics {
  @scala.inline
  def apply(ascent: scala.Double, descent: scala.Double, fontSize: scala.Double): TextMetrics = {
    val __obj = js.Dynamic.literal(ascent = ascent, descent = descent, fontSize = fontSize)
  
    __obj.asInstanceOf[TextMetrics]
  }
}

