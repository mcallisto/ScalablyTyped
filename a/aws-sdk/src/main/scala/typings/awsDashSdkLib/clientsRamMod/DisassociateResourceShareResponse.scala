package typings
package awsDashSdkLib.clientsRamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisassociateResourceShareResponse extends js.Object {
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientToken: js.UndefOr[String] = js.undefined
  /**
    * Information about the associations.
    */
  var resourceShareAssociations: js.UndefOr[ResourceShareAssociationList] = js.undefined
}

object DisassociateResourceShareResponse {
  @scala.inline
  def apply(clientToken: String = null, resourceShareAssociations: ResourceShareAssociationList = null): DisassociateResourceShareResponse = {
    val __obj = js.Dynamic.literal()
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken)
    if (resourceShareAssociations != null) __obj.updateDynamic("resourceShareAssociations")(resourceShareAssociations)
    __obj.asInstanceOf[DisassociateResourceShareResponse]
  }
}

