package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeshTexture extends Accessor {
  /**
    * A direct reference to the image data. The image data can be an [image element](https://developer.mozilla.org/en-US/docs/Web/API/HTMLImageElement), [canvas element](https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement) or [ImageData](https://developer.mozilla.org/en-US/docs/Web/API/ImageData).  The data property is mutually exclusive with the url property, setting the data will clear the url (if there is one).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTexture.html#data)
    */
  var data: stdLib.HTMLImageElement | stdLib.HTMLCanvasElement | stdLib.ImageData = js.native
  /**
    * Indicates whether the image data should be interpreted as being semi-transparent. The default value is automatically derived when the data property contains a canvas element or an ImageData object. If instead a url to a .png file was provided, it is assumed that transparency is present. In all other cases it defaults to `false`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTexture.html#transparent)
    *
    * @default undefined
    */
  var transparent: scala.Boolean = js.native
  /**
    * The url to the image resource. This can either be a remote url (absolute or relative) or a data url.  The url property is mutually exclusive with the data property, setting the url will clear the data (if there is one).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTexture.html#url)
    */
  var url: java.lang.String = js.native
  /**
    * Specifies how uv coordinates outside the [0, 1] range are handled. One of "repeat", "clamp" or "mirror". Can also be specified separately for the two texture axes using an object:
    * ```js
    * {
    *   vertical: "clamp",
    *   horizontal: "repeat"
    * }
    * ```
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTexture.html#wrap)
    *
    * @default "repeat"
    */
  var wrap: java.lang.String | js.Any = js.native
}

@JSGlobal("__esri.MeshTexture")
@js.native
/**
  * MeshTexture represents image data to be used for a MeshMaterial. It is mapped to the mesh by its uv vertex attributes. MeshTexture instances can be used with the [MeshComponent.material.colorTexture](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshComponent.html#material) and [MeshComponent.material.normalTexture](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshComponent.html#material) properties. Images can be referred to either by url or directly by data ( [image element](https://developer.mozilla.org/en-US/docs/Web/API/HTMLImageElement), [canvas element](https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement) or [ImageData](https://developer.mozilla.org/en-US/docs/Web/API/ImageData)).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTexture.html)
  */
class MeshTextureCls () extends MeshTexture {
  def this(properties: MeshTextureProperties) = this()
}

