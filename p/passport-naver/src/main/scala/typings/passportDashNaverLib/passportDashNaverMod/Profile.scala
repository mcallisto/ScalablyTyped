package typings
package passportDashNaverLib.passportDashNaverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Profile
  extends passportLib.passportMod.Profile {
  var _json: passportDashNaverLib.Anon_Age
}

object Profile {
  @scala.inline
  def apply(
    _json: passportDashNaverLib.Anon_Age,
    displayName: java.lang.String,
    id: java.lang.String,
    provider: java.lang.String,
    emails: js.Array[passportLib.Anon_Type] = null,
    name: passportLib.Anon_FamilyName = null,
    photos: js.Array[passportLib.Anon_Value] = null,
    username: java.lang.String = null
  ): Profile = {
    val __obj = js.Dynamic.literal(_json = _json, displayName = displayName, id = id, provider = provider)
    if (emails != null) __obj.updateDynamic("emails")(emails)
    if (name != null) __obj.updateDynamic("name")(name)
    if (photos != null) __obj.updateDynamic("photos")(photos)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Profile]
  }
}

