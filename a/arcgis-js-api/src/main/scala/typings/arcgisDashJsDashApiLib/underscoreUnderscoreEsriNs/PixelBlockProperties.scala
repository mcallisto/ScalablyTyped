package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PixelBlockProperties extends js.Object {
  /**
    * The height (or number of rows) of the PixelBlock in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#height)
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * Bit Mask. All pixels are valid when mask is null.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#mask)
    */
  var mask: js.UndefOr[js.Array[scala.Double] | stdLib.Uint8Array] = js.undefined
  /**
    * Indicates whether mask should be used as alpha values. If no (default), a pixel is valid when corresponding mask value is truthy
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#maskIsAlpha)
    */
  var maskIsAlpha: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The pixel type.  **Possible Values:** s8 | s16 | s32 | u8 | u16 | u32 | f32 | f64
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#pixelType)
    */
  var pixelType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A two dimensional array representing the pixels from the Image Service displayed on the client. The length of the first dimension is the same as the number of bands in the layer. The length of the second dimension is [height](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#height) * [width](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#width). The length of each band is the same. The pixels in each band are arranged row by row in this format: `[p_00, p_10, p_20, ... p_10, p_11, ...]` where `p_xy` is the pixel value at the column `x` and row `y`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#pixels)
    */
  var pixels: js.UndefOr[
    js.Array[scala.Double] | stdLib.Int8Array | stdLib.Uint8Array | stdLib.Uint8ClampedArray | stdLib.Int16Array | stdLib.Uint16Array | stdLib.Int32Array | stdLib.Uint32Array | stdLib.Float32Array | stdLib.Float64Array
  ] = js.undefined
  /**
    * An array of objects containing numeric statistical properties. Each object has the following specification if defined.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#statistics)
    */
  var statistics: js.UndefOr[js.Array[PixelBlockStatistics]] = js.undefined
  /**
    * Number of valid pixels
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#validPixelCount)
    */
  var validPixelCount: js.UndefOr[scala.Double] = js.undefined
  /**
    * The width (or number of columns) of the PixelBlock in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#width)
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object PixelBlockProperties {
  @scala.inline
  def apply(
    height: scala.Int | scala.Double = null,
    mask: js.Array[scala.Double] | stdLib.Uint8Array = null,
    maskIsAlpha: js.UndefOr[scala.Boolean] = js.undefined,
    pixelType: java.lang.String = null,
    pixels: js.Array[scala.Double] | stdLib.Int8Array | stdLib.Uint8Array | stdLib.Uint8ClampedArray | stdLib.Int16Array | stdLib.Uint16Array | stdLib.Int32Array | stdLib.Uint32Array | stdLib.Float32Array | stdLib.Float64Array = null,
    statistics: js.Array[PixelBlockStatistics] = null,
    validPixelCount: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): PixelBlockProperties = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (!js.isUndefined(maskIsAlpha)) __obj.updateDynamic("maskIsAlpha")(maskIsAlpha)
    if (pixelType != null) __obj.updateDynamic("pixelType")(pixelType)
    if (pixels != null) __obj.updateDynamic("pixels")(pixels.asInstanceOf[js.Any])
    if (statistics != null) __obj.updateDynamic("statistics")(statistics)
    if (validPixelCount != null) __obj.updateDynamic("validPixelCount")(validPixelCount.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PixelBlockProperties]
  }
}

