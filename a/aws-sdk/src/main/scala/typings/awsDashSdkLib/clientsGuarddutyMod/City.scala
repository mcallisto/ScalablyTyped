package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait City extends js.Object {
  /**
    * City name of the remote IP address.
    */
  var CityName: js.UndefOr[String] = js.undefined
}

object City {
  @scala.inline
  def apply(CityName: String = null): City = {
    val __obj = js.Dynamic.literal()
    if (CityName != null) __obj.updateDynamic("CityName")(CityName)
    __obj.asInstanceOf[City]
  }
}

