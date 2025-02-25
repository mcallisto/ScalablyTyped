package typings
package arcgisDashJsDashApiLib.esriLayersSupportFieldsIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/layers/support/FieldsIndex", JSImport.Namespace)
@js.native
class Class ()
  extends arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.FieldsIndex {
  def this(properties: js.Any) = this()
  /**
    * An array of date fields or field json objects.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FieldsIndex.html#dateFields)
    *
    * @default []
    */
  /* CompleteClass */
  override var dateFields: js.Array[_ | arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.Field] = js.native
  /**
    * Returns a field with the specified field name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FieldsIndex.html#get)
    *
    * @param fieldName The name of the field. The name is case-insensitive.
    *
    */
  /* CompleteClass */
  override def get(fieldName: java.lang.String): arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.Field = js.native
  /**
    * Checks if a field with the specified field name exists in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FieldsIndex.html#has)
    *
    * @param fieldName The name of the field. The name is case-insensitive.
    *
    */
  /* CompleteClass */
  override def has(fieldName: java.lang.String): scala.Boolean = js.native
  /**
    * Checks if a field with the specified field name is a date field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FieldsIndex.html#isDateField)
    *
    * @param fieldName The name of the field.
    *
    */
  /* CompleteClass */
  override def isDateField(fieldName: java.lang.String): scala.Boolean = js.native
}

