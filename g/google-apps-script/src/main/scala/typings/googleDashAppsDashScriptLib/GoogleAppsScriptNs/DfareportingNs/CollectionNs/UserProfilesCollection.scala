package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserProfilesCollection extends js.Object {
  // Gets one user profile by ID.
  def get(profileId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.UserProfile
  // Retrieves list of user profiles for a user.
  def list(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.UserProfileList
}

object UserProfilesCollection {
  @scala.inline
  def apply(
    get: java.lang.String => googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.UserProfile,
    list: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.UserProfileList
  ): UserProfilesCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction0(list))
  
    __obj.asInstanceOf[UserProfilesCollection]
  }
}

