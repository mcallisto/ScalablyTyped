package typings
package preactDashI18nLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fields extends js.Object {
  var fields: js.UndefOr[js.Object] = js.undefined
  var id: java.lang.String
  var plural: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Fields {
  @scala.inline
  def apply(id: java.lang.String, fields: js.Object = null, plural: scala.Int | scala.Double = null): Anon_Fields = {
    val __obj = js.Dynamic.literal(id = id)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (plural != null) __obj.updateDynamic("plural")(plural.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Fields]
  }
}

