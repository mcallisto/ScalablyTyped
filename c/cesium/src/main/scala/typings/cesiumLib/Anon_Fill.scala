package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fill extends js.Object {
  var fill: js.UndefOr[cesiumLib.cesiumMod.Property] = js.undefined
  var material: js.UndefOr[cesiumLib.cesiumMod.MaterialProperty] = js.undefined
  var outline: js.UndefOr[cesiumLib.cesiumMod.Property] = js.undefined
  var outlineColor: js.UndefOr[cesiumLib.cesiumMod.Property] = js.undefined
  var outlineWidth: js.UndefOr[cesiumLib.cesiumMod.Property] = js.undefined
  var radii: js.UndefOr[cesiumLib.cesiumMod.Property] = js.undefined
  var show: js.UndefOr[cesiumLib.cesiumMod.Property] = js.undefined
  var slicePartitions: js.UndefOr[cesiumLib.cesiumMod.Property] = js.undefined
  var stackPartitions: js.UndefOr[cesiumLib.cesiumMod.Property] = js.undefined
  var subdivisions: js.UndefOr[cesiumLib.cesiumMod.Property] = js.undefined
}

object Anon_Fill {
  @scala.inline
  def apply(
    fill: cesiumLib.cesiumMod.Property = null,
    material: cesiumLib.cesiumMod.MaterialProperty = null,
    outline: cesiumLib.cesiumMod.Property = null,
    outlineColor: cesiumLib.cesiumMod.Property = null,
    outlineWidth: cesiumLib.cesiumMod.Property = null,
    radii: cesiumLib.cesiumMod.Property = null,
    show: cesiumLib.cesiumMod.Property = null,
    slicePartitions: cesiumLib.cesiumMod.Property = null,
    stackPartitions: cesiumLib.cesiumMod.Property = null,
    subdivisions: cesiumLib.cesiumMod.Property = null
  ): Anon_Fill = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (material != null) __obj.updateDynamic("material")(material)
    if (outline != null) __obj.updateDynamic("outline")(outline)
    if (outlineColor != null) __obj.updateDynamic("outlineColor")(outlineColor)
    if (outlineWidth != null) __obj.updateDynamic("outlineWidth")(outlineWidth)
    if (radii != null) __obj.updateDynamic("radii")(radii)
    if (show != null) __obj.updateDynamic("show")(show)
    if (slicePartitions != null) __obj.updateDynamic("slicePartitions")(slicePartitions)
    if (stackPartitions != null) __obj.updateDynamic("stackPartitions")(stackPartitions)
    if (subdivisions != null) __obj.updateDynamic("subdivisions")(subdivisions)
    __obj.asInstanceOf[Anon_Fill]
  }
}

