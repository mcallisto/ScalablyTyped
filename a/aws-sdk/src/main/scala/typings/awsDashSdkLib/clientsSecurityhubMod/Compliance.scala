package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Compliance extends js.Object {
  /**
    * The result of a compliance check.
    */
  var Status: js.UndefOr[ComplianceStatus] = js.undefined
}

object Compliance {
  @scala.inline
  def apply(Status: ComplianceStatus = null): Compliance = {
    val __obj = js.Dynamic.literal()
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compliance]
  }
}

