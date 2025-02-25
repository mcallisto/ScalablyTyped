package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldsIndex extends js.Object {
  /**
    * An array of date fields or field json objects.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FieldsIndex.html#dateFields)
    *
    * @default []
    */
  var dateFields: js.Array[_ | Field]
  /**
    * Returns a field with the specified field name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FieldsIndex.html#get)
    *
    * @param fieldName The name of the field. The name is case-insensitive.
    *
    */
  def get(fieldName: java.lang.String): Field
  /**
    * Checks if a field with the specified field name exists in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FieldsIndex.html#has)
    *
    * @param fieldName The name of the field. The name is case-insensitive.
    *
    */
  def has(fieldName: java.lang.String): scala.Boolean
  /**
    * Checks if a field with the specified field name is a date field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FieldsIndex.html#isDateField)
    *
    * @param fieldName The name of the field.
    *
    */
  def isDateField(fieldName: java.lang.String): scala.Boolean
}

@JSGlobal("__esri.FieldsIndex")
@js.native
class FieldsIndexCls () extends FieldsIndex {
  def this(properties: js.Any) = this()
  /**
    * An array of date fields or field json objects.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FieldsIndex.html#dateFields)
    *
    * @default []
    */
  /* CompleteClass */
  override var dateFields: js.Array[_ | Field] = js.native
  /**
    * Returns a field with the specified field name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FieldsIndex.html#get)
    *
    * @param fieldName The name of the field. The name is case-insensitive.
    *
    */
  /* CompleteClass */
  override def get(fieldName: java.lang.String): Field = js.native
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

object FieldsIndex {
  @scala.inline
  def apply(
    dateFields: js.Array[_ | Field],
    get: java.lang.String => Field,
    has: java.lang.String => scala.Boolean,
    isDateField: java.lang.String => scala.Boolean
  ): FieldsIndex = {
    val __obj = js.Dynamic.literal(dateFields = dateFields, get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), isDateField = js.Any.fromFunction1(isDateField))
  
    __obj.asInstanceOf[FieldsIndex]
  }
}

