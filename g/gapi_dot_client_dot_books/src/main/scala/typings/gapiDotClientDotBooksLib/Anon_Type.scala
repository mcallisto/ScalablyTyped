package typings
package gapiDotClientDotBooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Type extends js.Object {
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Type {
  @scala.inline
  def apply(`type`: java.lang.String = null, value: java.lang.String = null): Anon_Type = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_Type]
  }
}

