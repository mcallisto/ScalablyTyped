package typings
package awsDashSdkLib.clientsRoute53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferDomainResponse extends js.Object {
  /**
    * Identifier for tracking the progress of the request. To use this ID to query the operation status, use GetOperationDetail.
    */
  var OperationId: awsDashSdkLib.clientsRoute53domainsMod.OperationId
}

object TransferDomainResponse {
  @scala.inline
  def apply(OperationId: OperationId): TransferDomainResponse = {
    val __obj = js.Dynamic.literal(OperationId = OperationId)
  
    __obj.asInstanceOf[TransferDomainResponse]
  }
}

