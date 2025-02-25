package typings
package vegaDashLiteLib.buildSrcDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonDataFormat
  extends DataFormatBase
     with DataFormat {
  /**
    * The JSON property containing the desired data.
    * This parameter can be used when the loaded JSON file may have surrounding structure or meta-data.
    * For example `"property": "values.features"` is equivalent to retrieving `json.values.features`
    * from the loaded JSON object.
    */
  var property: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Type of input data: `"json"`, `"csv"`, `"tsv"`, `"dsv"`.
    * The default format type is determined by the extension of the file URL.
    * If no extension is detected, `"json"` will be used by default.
    */
  var `type`: js.UndefOr[vegaDashLiteLib.vegaDashLiteLibStrings.json] = js.undefined
}

object JsonDataFormat {
  @scala.inline
  def apply(
    parse: vegaDashLiteLib.vegaDashLiteLibStrings.auto | Parse = null,
    property: java.lang.String = null,
    `type`: vegaDashLiteLib.vegaDashLiteLibStrings.json = null
  ): JsonDataFormat = {
    val __obj = js.Dynamic.literal()
    if (parse != null) __obj.updateDynamic("parse")(parse.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[JsonDataFormat]
  }
}

