package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpsItemNotification extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of an SNS topic where notifications are sent when this OpsItem is edited or changed.
    */
  var Arn: js.UndefOr[String] = js.undefined
}

object OpsItemNotification {
  @scala.inline
  def apply(Arn: String = null): OpsItemNotification = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    __obj.asInstanceOf[OpsItemNotification]
  }
}

