package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Session extends js.Object {
  def getActiveUser(): User
  def getActiveUserLocale(): java.lang.String
  def getEffectiveUser(): User
  def getScriptTimeZone(): java.lang.String
  def getTemporaryActiveUserKey(): java.lang.String
  def getTimeZone(): java.lang.String
  def getUser(): User
}

object Session {
  @scala.inline
  def apply(
    getActiveUser: () => User,
    getActiveUserLocale: () => java.lang.String,
    getEffectiveUser: () => User,
    getScriptTimeZone: () => java.lang.String,
    getTemporaryActiveUserKey: () => java.lang.String,
    getTimeZone: () => java.lang.String,
    getUser: () => User
  ): Session = {
    val __obj = js.Dynamic.literal(getActiveUser = js.Any.fromFunction0(getActiveUser), getActiveUserLocale = js.Any.fromFunction0(getActiveUserLocale), getEffectiveUser = js.Any.fromFunction0(getEffectiveUser), getScriptTimeZone = js.Any.fromFunction0(getScriptTimeZone), getTemporaryActiveUserKey = js.Any.fromFunction0(getTemporaryActiveUserKey), getTimeZone = js.Any.fromFunction0(getTimeZone), getUser = js.Any.fromFunction0(getUser))
  
    __obj.asInstanceOf[Session]
  }
}

