package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersAddEmailsParams extends js.Object {
  /**
    * Adds one or more email addresses to your GitHub account. Must contain at least one email address. **Note:** Alternatively, you can pass a single email address or an `array` of emails addresses directly, but we recommend that you pass an object using the `emails` key.
    */
  var emails: js.Array[java.lang.String]
}

object UsersAddEmailsParams {
  @scala.inline
  def apply(emails: js.Array[java.lang.String]): UsersAddEmailsParams = {
    val __obj = js.Dynamic.literal(emails = emails)
  
    __obj.asInstanceOf[UsersAddEmailsParams]
  }
}

