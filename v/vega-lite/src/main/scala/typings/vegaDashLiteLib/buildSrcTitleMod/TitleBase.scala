package typings
package vegaDashLiteLib.buildSrcTitleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TitleBase extends js.Object {
  /**
    * The anchor position for placing the title. One of `"start"`, `"middle"`, or `"end"`. For example, with an orientation of top these anchor positions map to a left-, center-, or right-aligned title.
    *
    * __Default value:__ `"middle"` for [single](https://vega.github.io/vega-lite/docs/spec.html) and [layered](https://vega.github.io/vega-lite/docs/layer.html) views.
    * `"start"` for other composite views.
    *
    * __Note:__ [For now](https://github.com/vega/vega-lite/issues/2875), `anchor` is only customizable only for [single](https://vega.github.io/vega-lite/docs/spec.html) and [layered](https://vega.github.io/vega-lite/docs/layer.html) views.  For other composite views, `anchor` is always `"start"`.
    */
  var anchor: js.UndefOr[vegaDashLiteLib.buildSrcVegaDotSchemaMod.Anchor] = js.undefined
  /**
    * The orthogonal offset in pixels by which to displace the title from its position along the edge of the chart.
    */
  var offset: js.UndefOr[scala.Double] = js.undefined
  /**
    * The orientation of the title relative to the chart. One of `"top"` (the default), `"bottom"`, `"left"`, or `"right"`.
    */
  var orient: js.UndefOr[vegaDashLiteLib.buildSrcVegaDotSchemaMod.TitleOrient] = js.undefined
  /**
    * A [mark style property](https://vega.github.io/vega-lite/docs/config.html#style) to apply to the title text mark.
    *
    * __Default value:__ `"group-title"`.
    */
  var style: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object TitleBase {
  @scala.inline
  def apply(
    anchor: vegaDashLiteLib.buildSrcVegaDotSchemaMod.Anchor = null,
    offset: scala.Int | scala.Double = null,
    orient: vegaDashLiteLib.buildSrcVegaDotSchemaMod.TitleOrient = null,
    style: java.lang.String | js.Array[java.lang.String] = null
  ): TitleBase = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (orient != null) __obj.updateDynamic("orient")(orient)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[TitleBase]
  }
}

