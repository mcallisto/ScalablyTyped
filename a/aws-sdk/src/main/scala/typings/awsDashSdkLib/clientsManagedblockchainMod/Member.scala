package typings
package awsDashSdkLib.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Member extends js.Object {
  /**
    * The date and time that the member was created.
    */
  var CreationDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * An optional description for the member.
    */
  var Description: js.UndefOr[DescriptionString] = js.undefined
  /**
    * Attributes relevant to a member for the blockchain framework that the Managed Blockchain network uses.
    */
  var FrameworkAttributes: js.UndefOr[MemberFrameworkAttributes] = js.undefined
  /**
    * The unique identifier of the member.
    */
  var Id: js.UndefOr[ResourceIdString] = js.undefined
  /**
    * The name of the member.
    */
  var Name: js.UndefOr[NetworkMemberNameString] = js.undefined
  /**
    * The unique identifier of the network to which the member belongs.
    */
  var NetworkId: js.UndefOr[ResourceIdString] = js.undefined
  /**
    * The status of a member.    CREATING - The AWS account is in the process of creating a member.    AVAILABLE - The member has been created and can participate in the network.    CREATE_FAILED - The AWS account attempted to create a member and creation failed.    DELETING - The member and all associated resources are in the process of being deleted. Either the AWS account that owns the member deleted it, or the member is being deleted as the result of an APPROVED PROPOSAL to remove the member.    DELETED - The member can no longer participate on the network and all associated resources are deleted. Either the AWS account that owns the member deleted it, or the member is being deleted as the result of an APPROVED PROPOSAL to remove the member.  
    */
  var Status: js.UndefOr[MemberStatus] = js.undefined
}

object Member {
  @scala.inline
  def apply(
    CreationDate: Timestamp = null,
    Description: DescriptionString = null,
    FrameworkAttributes: MemberFrameworkAttributes = null,
    Id: ResourceIdString = null,
    Name: NetworkMemberNameString = null,
    NetworkId: ResourceIdString = null,
    Status: MemberStatus = null
  ): Member = {
    val __obj = js.Dynamic.literal()
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (FrameworkAttributes != null) __obj.updateDynamic("FrameworkAttributes")(FrameworkAttributes)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (NetworkId != null) __obj.updateDynamic("NetworkId")(NetworkId)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Member]
  }
}

