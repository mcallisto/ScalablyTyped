package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Website extends js.Object {
  /** The URL of the website. */
  var address: js.UndefOr[java.lang.String] = js.undefined
  /** The display name of the web site. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** The possible values are: other, home, work, blog, profile. */
  var `type`: js.UndefOr[WebsiteType] = js.undefined
}

object Website {
  @scala.inline
  def apply(address: java.lang.String = null, displayName: java.lang.String = null, `type`: WebsiteType = null): Website = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Website]
  }
}

