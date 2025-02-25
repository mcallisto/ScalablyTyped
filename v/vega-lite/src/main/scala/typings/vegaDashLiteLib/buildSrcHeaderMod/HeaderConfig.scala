package typings
package vegaDashLiteLib.buildSrcHeaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderConfig extends js.Object {
  /**
    * The rotation angle of the header labels.
    *
    * __Default value:__ `0`.
    *
    * @minimum -360
    * @maximum 360
    */
  var labelAngle: js.UndefOr[scala.Double] = js.undefined
  /**
    * The color of the header label, can be in hex color code or regular color name.
    */
  var labelColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The font of the header label.
    */
  var labelFont: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The font size of the header label, in pixels.
    *
    * @minimum 0
    */
  var labelFontSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * The maximum length of the header label in pixels. The text value will be automatically truncated if the rendered size exceeds the limit.
    *
    * __Default value:__ `0`, indicating no limit
    */
  var labelLimit: js.UndefOr[scala.Double] = js.undefined
  /**
    * The anchor position for placing the title. One of `"start"`, `"middle"`, or `"end"`. For example, with an orientation of top these anchor positions map to a left-, center-, or right-aligned title.
    *
    * __Default value:__ `"middle"` for [single](https://vega.github.io/vega-lite/docs/spec.html) and [layered](https://vega.github.io/vega-lite/docs/layer.html) views.
    * `"start"` for other composite views.
    *
    * __Note:__ [For now](https://github.com/vega/vega-lite/issues/2875), `anchor` is only customizable only for [single](https://vega.github.io/vega-lite/docs/spec.html) and [layered](https://vega.github.io/vega-lite/docs/layer.html) views.  For other composite views, `anchor` is always `"start"`.
    */
  var titleAnchor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The rotation angle of the header title.
    *
    * __Default value:__ `0`.
    *
    * @minimum -360
    * @maximum 360
    */
  var titleAngle: js.UndefOr[scala.Double] = js.undefined
  /**
    * Vertical text baseline for the header title. One of `"top"`, `"bottom"`, `"middle"`.
    *
    * __Default value:__ `"middle"`
    */
  var titleBaseline: js.UndefOr[vegaDashTypingsLib.typesSpecEncodeMod.TextBaseline] = js.undefined
  /**
    * Color of the header title, can be in hex color code or regular color name.
    */
  var titleColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Font of the header title. (e.g., `"Helvetica Neue"`).
    */
  var titleFont: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Font size of the header title.
    *
    * @minimum 0
    */
  var titleFontSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Font weight of the header title.
    * This can be either a string (e.g `"bold"`, `"normal"`) or a number (`100`, `200`, `300`, ..., `900` where `"normal"` = `400` and `"bold"` = `700`).
    */
  var titleFontWeight: js.UndefOr[vegaDashLiteLib.buildSrcVegaDotSchemaMod.FontWeight] = js.undefined
  /**
    * The maximum length of the header title in pixels. The text value will be automatically truncated if the rendered size exceeds the limit.
    *
    * __Default value:__ `0`, indicating no limit
    */
  var titleLimit: js.UndefOr[scala.Double] = js.undefined
}

object HeaderConfig {
  @scala.inline
  def apply(
    labelAngle: scala.Int | scala.Double = null,
    labelColor: java.lang.String = null,
    labelFont: java.lang.String = null,
    labelFontSize: scala.Int | scala.Double = null,
    labelLimit: scala.Int | scala.Double = null,
    titleAnchor: java.lang.String = null,
    titleAngle: scala.Int | scala.Double = null,
    titleBaseline: vegaDashTypingsLib.typesSpecEncodeMod.TextBaseline = null,
    titleColor: java.lang.String = null,
    titleFont: java.lang.String = null,
    titleFontSize: scala.Int | scala.Double = null,
    titleFontWeight: vegaDashLiteLib.buildSrcVegaDotSchemaMod.FontWeight = null,
    titleLimit: scala.Int | scala.Double = null
  ): HeaderConfig = {
    val __obj = js.Dynamic.literal()
    if (labelAngle != null) __obj.updateDynamic("labelAngle")(labelAngle.asInstanceOf[js.Any])
    if (labelColor != null) __obj.updateDynamic("labelColor")(labelColor)
    if (labelFont != null) __obj.updateDynamic("labelFont")(labelFont)
    if (labelFontSize != null) __obj.updateDynamic("labelFontSize")(labelFontSize.asInstanceOf[js.Any])
    if (labelLimit != null) __obj.updateDynamic("labelLimit")(labelLimit.asInstanceOf[js.Any])
    if (titleAnchor != null) __obj.updateDynamic("titleAnchor")(titleAnchor)
    if (titleAngle != null) __obj.updateDynamic("titleAngle")(titleAngle.asInstanceOf[js.Any])
    if (titleBaseline != null) __obj.updateDynamic("titleBaseline")(titleBaseline)
    if (titleColor != null) __obj.updateDynamic("titleColor")(titleColor)
    if (titleFont != null) __obj.updateDynamic("titleFont")(titleFont)
    if (titleFontSize != null) __obj.updateDynamic("titleFontSize")(titleFontSize.asInstanceOf[js.Any])
    if (titleFontWeight != null) __obj.updateDynamic("titleFontWeight")(titleFontWeight.asInstanceOf[js.Any])
    if (titleLimit != null) __obj.updateDynamic("titleLimit")(titleLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderConfig]
  }
}

