package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageMediaInfo
  extends JSONSupport
     with MediaInfo {
  /**
    * Refresh interval of the layer in minutes. Non-zero value indicates automatic layer refresh at the specified interval. Value of `0` indicates auto refresh is not enabled. If the property does not exist, it is equivalent to having a value of `0`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-ImageMediaInfo.html#refreshInterval)
    */
  var refreshInterval: scala.Double
  /**
    * The type of popup element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-ImageMediaInfo.html#type)
    *
    * @default image
    */
  val `type`: java.lang.String
  /**
    * Defines the value format of the image media element and how the images should be retrieved.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-ImageMediaInfo.html#value)
    */
  var value: ImageMediaInfoValue
}

@JSGlobal("__esri.ImageMediaInfo")
@js.native
/**
  * An `ImageMediaInfo` is a type of media element that represents images to display within a popup.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-ImageMediaInfo.html)
  */
class ImageMediaInfoCls () extends ImageMediaInfo {
  def this(properties: ImageMediaInfoProperties) = this()
  /**
    * Defines a caption for the media.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-mixins-MediaInfo.html#caption)
    */
  /* CompleteClass */
  override var caption: java.lang.String = js.native
  /**
    * Refresh interval of the layer in minutes. Non-zero value indicates automatic layer refresh at the specified interval. Value of `0` indicates auto refresh is not enabled. If the property does not exist, it is equivalent to having a value of `0`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-ImageMediaInfo.html#refreshInterval)
    */
  /* CompleteClass */
  override var refreshInterval: scala.Double = js.native
  /**
    * The title of the media element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-mixins-MediaInfo.html#title)
    */
  /* CompleteClass */
  override var title: java.lang.String = js.native
  /**
    * The type of popup element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-ImageMediaInfo.html#type)
    *
    * @default image
    */
  /* CompleteClass */
  override val `type`: java.lang.String = js.native
  /**
    * Defines the value format of the image media element and how the images should be retrieved.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-ImageMediaInfo.html#value)
    */
  /* CompleteClass */
  override var value: ImageMediaInfoValue = js.native
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/using-fromjson/index.html) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

object ImageMediaInfo {
  @scala.inline
  def apply(
    caption: java.lang.String,
    clone: () => ImageMediaInfo,
    refreshInterval: scala.Double,
    title: java.lang.String,
    toJSON: () => js.Any,
    `type`: java.lang.String,
    value: ImageMediaInfoValue
  ): ImageMediaInfo = {
    val __obj = js.Dynamic.literal(caption = caption, clone = js.Any.fromFunction0(clone), refreshInterval = refreshInterval, title = title, toJSON = js.Any.fromFunction0(toJSON), value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ImageMediaInfo]
  }
}

