package typings
package awsDashSdkLib.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SupportedProductConfig extends js.Object {
  /**
    * The list of user-supplied arguments.
    */
  var Args: js.UndefOr[XmlStringList] = js.undefined
  /**
    * The name of the product configuration.
    */
  var Name: js.UndefOr[XmlStringMaxLen256] = js.undefined
}

object SupportedProductConfig {
  @scala.inline
  def apply(Args: XmlStringList = null, Name: XmlStringMaxLen256 = null): SupportedProductConfig = {
    val __obj = js.Dynamic.literal()
    if (Args != null) __obj.updateDynamic("Args")(Args)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[SupportedProductConfig]
  }
}

