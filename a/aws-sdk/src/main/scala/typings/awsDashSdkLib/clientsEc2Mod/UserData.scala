package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserData extends js.Object {
  /**
    * The user data. If you are using an AWS SDK or command line tool, Base64-encoding is performed for you, and you can load the text from a file. Otherwise, you must provide Base64-encoded text.
    */
  var Data: js.UndefOr[String] = js.undefined
}

object UserData {
  @scala.inline
  def apply(Data: String = null): UserData = {
    val __obj = js.Dynamic.literal()
    if (Data != null) __obj.updateDynamic("Data")(Data)
    __obj.asInstanceOf[UserData]
  }
}

