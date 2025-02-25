package typings
package awsDashSdkLib.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogGroupField extends js.Object {
  /**
    * The name of a log field.
    */
  var name: js.UndefOr[Field] = js.undefined
  /**
    * The percentage of log events queried that contained the field.
    */
  var percent: js.UndefOr[Percentage] = js.undefined
}

object LogGroupField {
  @scala.inline
  def apply(name: Field = null, percent: js.UndefOr[Percentage] = js.undefined): LogGroupField = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(percent)) __obj.updateDynamic("percent")(percent)
    __obj.asInstanceOf[LogGroupField]
  }
}

