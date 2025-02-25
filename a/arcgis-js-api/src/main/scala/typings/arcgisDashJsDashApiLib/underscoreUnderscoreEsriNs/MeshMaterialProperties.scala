package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeshMaterialProperties extends js.Object {
  /**
    * Specifies how transparency on the object is handled. If `alphaMode` is set to either `mask` or `auto` this property specifies the cutoff value below which masking happens (that is, the coresponding part of the Mesh is rendered fully transparent).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#alphaCutoff)
    *
    * @default 0.5
    */
  var alphaCutoff: js.UndefOr[scala.Double] = js.undefined
  /**
    * Specifies how transparency on the object is handled. See also `alphaCutoff`.
    *
    * | Type | Description |
    * |------|-------------|
    * | opaque | Alpha is ignored, and the object is rendered fully opaque. |
    * | blend | Alpha values are used for gradual transparency, blending between the object and its background. |
    * | mask | Alpha values are used for binary transparency, either displaying the object, or its background. See also `alphaCutoff`. |
    * | auto | The implementation mixes the `mask` and `blend` settings, masking below `alphaCutoff` and blending above it. |
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#alphaMode)
    *
    * @default "auto"
    */
  var alphaMode: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Allows to specify a single, uniform color for the mesh component. This can be autocast with a named string, hex string, array of rgb or rgba values, an object with `r`, `g`, `b`, and `a` properties, or a [Color](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html) object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#color)
    */
  var color: js.UndefOr[Color | js.Array[scala.Double] | java.lang.String] = js.undefined
  /**
    * Allows to specify a texture to get color information from. The texture is accessed using the uv coordinate specified for each vertex in the mesh vertex attributes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#colorTexture)
    */
  var colorTexture: js.UndefOr[
    MeshTextureProperties | stdLib.HTMLImageElement | stdLib.HTMLCanvasElement | stdLib.ImageData | java.lang.String
  ] = js.undefined
  /**
    * Specifies whether both sides of each triangle are displayed, or only the front sides.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#doubleSided)
    *
    * @default true
    */
  var doubleSided: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Allows to specify a texture to get normal information from. The texture is accessed using the uv coordinate specified for each vertex in the mesh vertex attributes. Normal mapping requires also for tangents to be specified in the mesh vertex attributes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#normalTexture)
    */
  var normalTexture: js.UndefOr[
    MeshTextureProperties | stdLib.HTMLImageElement | stdLib.HTMLCanvasElement | stdLib.ImageData | java.lang.String
  ] = js.undefined
}

object MeshMaterialProperties {
  @scala.inline
  def apply(
    alphaCutoff: scala.Int | scala.Double = null,
    alphaMode: java.lang.String = null,
    color: Color | js.Array[scala.Double] | java.lang.String = null,
    colorTexture: MeshTextureProperties | stdLib.HTMLImageElement | stdLib.HTMLCanvasElement | stdLib.ImageData | java.lang.String = null,
    doubleSided: js.UndefOr[scala.Boolean] = js.undefined,
    normalTexture: MeshTextureProperties | stdLib.HTMLImageElement | stdLib.HTMLCanvasElement | stdLib.ImageData | java.lang.String = null
  ): MeshMaterialProperties = {
    val __obj = js.Dynamic.literal()
    if (alphaCutoff != null) __obj.updateDynamic("alphaCutoff")(alphaCutoff.asInstanceOf[js.Any])
    if (alphaMode != null) __obj.updateDynamic("alphaMode")(alphaMode)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colorTexture != null) __obj.updateDynamic("colorTexture")(colorTexture.asInstanceOf[js.Any])
    if (!js.isUndefined(doubleSided)) __obj.updateDynamic("doubleSided")(doubleSided)
    if (normalTexture != null) __obj.updateDynamic("normalTexture")(normalTexture.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeshMaterialProperties]
  }
}

