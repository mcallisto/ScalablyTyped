package typings
package atPhosphorDatagridLib.libJsonmodelMod.JSONModelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object when specifies the schema for a data model.
  *
  * #### Notes
  * This is based on the JSON Table Schema specification:
  * https://specs.frictionlessdata.io/table-schema/
  */
trait ISchema extends js.Object {
  /**
    * The fields which describe the data model columns.
    *
    * Primary key fields are rendered as row header columns.
    */
  val fields: js.Array[IField]
  /**
    * The values to treat as "missing" data.
    *
    * Missing values are automatically converted to `null`.
    */
  val missingValues: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The field names which act as primary keys.
    *
    * Primary key fields are rendered as row header columns.
    */
  val primaryKey: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object ISchema {
  @scala.inline
  def apply(
    fields: js.Array[IField],
    missingValues: js.Array[java.lang.String] = null,
    primaryKey: java.lang.String | js.Array[java.lang.String] = null
  ): ISchema = {
    val __obj = js.Dynamic.literal(fields = fields)
    if (missingValues != null) __obj.updateDynamic("missingValues")(missingValues)
    if (primaryKey != null) __obj.updateDynamic("primaryKey")(primaryKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISchema]
  }
}

