package typings
package atHapiJoiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Allow extends js.Object {
  /**
    * - `true` to use the IANA list of registered TLDs. This is the default value.
    * - `false` to allow any TLD not listed in the `deny` list, if present.
    * - A `Set` or array of the allowed TLDs. Cannot be used together with `deny`.
    */
  var allow: js.UndefOr[stdLib.Set[java.lang.String] | js.Array[java.lang.String] | scala.Boolean] = js.undefined
  /**
    * - A `Set` or array of the forbidden TLDs. Cannot be used together with a custom `allow` list.
    */
  var deny: js.UndefOr[stdLib.Set[java.lang.String] | js.Array[java.lang.String]] = js.undefined
}

object Anon_Allow {
  @scala.inline
  def apply(
    allow: stdLib.Set[java.lang.String] | js.Array[java.lang.String] | scala.Boolean = null,
    deny: stdLib.Set[java.lang.String] | js.Array[java.lang.String] = null
  ): Anon_Allow = {
    val __obj = js.Dynamic.literal()
    if (allow != null) __obj.updateDynamic("allow")(allow.asInstanceOf[js.Any])
    if (deny != null) __obj.updateDynamic("deny")(deny.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Allow]
  }
}

