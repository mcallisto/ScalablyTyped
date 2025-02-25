package typings
package officeDashJsLib.WordNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "customProperty.toJSON()". */
trait CustomPropertyData extends js.Object {
  /**
    *
    * Gets the key of the custom property. Read only.
    *
    * [Api set: WordApi 1.3]
    */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets the value type of the custom property. Possible values are: String, Number, Date, Boolean. Read only.
    *
    * [Api set: WordApi 1.3]
    */
  var `type`: js.UndefOr[
    officeDashJsLib.WordNs.DocumentPropertyType | officeDashJsLib.officeDashJsLibStrings.String | officeDashJsLib.officeDashJsLibStrings.Number | officeDashJsLib.officeDashJsLibStrings.Date | officeDashJsLib.officeDashJsLibStrings.Boolean
  ] = js.undefined
  /**
    *
    * Gets or sets the value of the custom property. Note that even though Word on the web and the docx file format allow these properties to be arbitrarily long, the desktop version of Word will truncate string values to 255 16-bit chars (possibly creating invalid unicode by breaking up a surrogate pair).
    *
    * [Api set: WordApi 1.3]
    */
  var value: js.UndefOr[js.Any] = js.undefined
}

object CustomPropertyData {
  @scala.inline
  def apply(
    key: java.lang.String = null,
    `type`: officeDashJsLib.WordNs.DocumentPropertyType | officeDashJsLib.officeDashJsLibStrings.String | officeDashJsLib.officeDashJsLibStrings.Number | officeDashJsLib.officeDashJsLibStrings.Date | officeDashJsLib.officeDashJsLibStrings.Boolean = null,
    value: js.Any = null
  ): CustomPropertyData = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[CustomPropertyData]
  }
}

