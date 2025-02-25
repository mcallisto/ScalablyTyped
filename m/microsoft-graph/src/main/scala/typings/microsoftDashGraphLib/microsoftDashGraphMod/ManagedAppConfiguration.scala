package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedAppConfiguration extends ManagedAppPolicy {
  /** A set of string key and string value pairs to be sent to apps for users to whom the configuration is scoped, unalterned by this service */
  var customSettings: js.UndefOr[js.Array[KeyValuePair]] = js.undefined
}

object ManagedAppConfiguration {
  @scala.inline
  def apply(
    createdDateTime: java.lang.String = null,
    customSettings: js.Array[KeyValuePair] = null,
    description: java.lang.String = null,
    displayName: java.lang.String = null,
    id: java.lang.String = null,
    lastModifiedDateTime: java.lang.String = null,
    version: java.lang.String = null
  ): ManagedAppConfiguration = {
    val __obj = js.Dynamic.literal()
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (customSettings != null) __obj.updateDynamic("customSettings")(customSettings)
    if (description != null) __obj.updateDynamic("description")(description)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[ManagedAppConfiguration]
  }
}

