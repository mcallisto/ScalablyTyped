package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksSetSuitesPreferencesResponse extends js.Object {
  var preferences: ChecksSetSuitesPreferencesResponsePreferences
  var repository: ChecksSetSuitesPreferencesResponseRepository
}

object ChecksSetSuitesPreferencesResponse {
  @scala.inline
  def apply(
    preferences: ChecksSetSuitesPreferencesResponsePreferences,
    repository: ChecksSetSuitesPreferencesResponseRepository
  ): ChecksSetSuitesPreferencesResponse = {
    val __obj = js.Dynamic.literal(preferences = preferences, repository = repository)
  
    __obj.asInstanceOf[ChecksSetSuitesPreferencesResponse]
  }
}

