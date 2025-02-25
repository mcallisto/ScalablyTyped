package typings
package arcgisDashJsDashApiLib.esriPopupContentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/popup/content", "FieldsContent")
@js.native
/**
  * A `FieldsContent` popup element represents the [FieldInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html) associated with a feature. If this is not set within the content, it will revert to whatever may be set within the [PopupTemplate.fieldInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#fieldInfos) property.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-FieldsContent.html)
  */
class FieldsContentCls ()
  extends arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.FieldsContent {
  def this(properties: arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.FieldsContentProperties) = this()
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

