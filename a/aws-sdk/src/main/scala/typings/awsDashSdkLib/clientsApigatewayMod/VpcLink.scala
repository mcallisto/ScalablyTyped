package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcLink extends js.Object {
  /**
    * The description of the VPC link.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The identifier of the VpcLink. It is used in an Integration to reference this VpcLink.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * The name used to label and identify the VPC link.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The status of the VPC link. The valid values are AVAILABLE, PENDING, DELETING, or FAILED. Deploying an API will wait if the status is PENDING and will fail if the status is DELETING. 
    */
  var status: js.UndefOr[VpcLinkStatus] = js.undefined
  /**
    * A description about the VPC link status.
    */
  var statusMessage: js.UndefOr[String] = js.undefined
  /**
    * The collection of tags. Each tag element is associated with a given resource.
    */
  var tags: js.UndefOr[MapOfStringToString] = js.undefined
  /**
    * The ARNs of network load balancers of the VPC targeted by the VPC link. The network load balancers must be owned by the same AWS account of the API owner.
    */
  var targetArns: js.UndefOr[ListOfString] = js.undefined
}

object VpcLink {
  @scala.inline
  def apply(
    description: String = null,
    id: String = null,
    name: String = null,
    status: VpcLinkStatus = null,
    statusMessage: String = null,
    tags: MapOfStringToString = null,
    targetArns: ListOfString = null
  ): VpcLink = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusMessage != null) __obj.updateDynamic("statusMessage")(statusMessage)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (targetArns != null) __obj.updateDynamic("targetArns")(targetArns)
    __obj.asInstanceOf[VpcLink]
  }
}

