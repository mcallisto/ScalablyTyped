package typings
package phaserLib.PhaserNs.TypesNs.GameObjectsNs.GraphicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Graphics fill style settings.
  */
trait FillStyle extends js.Object {
  /**
    * The fill alpha.
    */
  var alpha: js.UndefOr[scala.Double] = js.undefined
  /**
    * The fill color.
    */
  var color: js.UndefOr[scala.Double] = js.undefined
}

object FillStyle {
  @scala.inline
  def apply(alpha: scala.Int | scala.Double = null, color: scala.Int | scala.Double = null): FillStyle = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillStyle]
  }
}

