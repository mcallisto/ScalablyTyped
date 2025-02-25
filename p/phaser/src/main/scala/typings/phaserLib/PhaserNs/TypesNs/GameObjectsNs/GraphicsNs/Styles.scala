package typings
package phaserLib.PhaserNs.TypesNs.GameObjectsNs.GraphicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Graphics style settings.
  */
trait Styles extends js.Object {
  /**
    * The style applied to shape areas.
    */
  var fillStyle: js.UndefOr[FillStyle] = js.undefined
  /**
    * The style applied to shape outlines.
    */
  var lineStyle: js.UndefOr[LineStyle] = js.undefined
}

object Styles {
  @scala.inline
  def apply(fillStyle: FillStyle = null, lineStyle: LineStyle = null): Styles = {
    val __obj = js.Dynamic.literal()
    if (fillStyle != null) __obj.updateDynamic("fillStyle")(fillStyle)
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle)
    __obj.asInstanceOf[Styles]
  }
}

