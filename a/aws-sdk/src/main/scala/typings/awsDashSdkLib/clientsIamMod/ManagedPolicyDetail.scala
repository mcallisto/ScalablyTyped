package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedPolicyDetail extends js.Object {
  var Arn: js.UndefOr[arnType] = js.undefined
  /**
    * The number of principal entities (users, groups, and roles) that the policy is attached to.
    */
  var AttachmentCount: js.UndefOr[attachmentCountType] = js.undefined
  /**
    * The date and time, in ISO 8601 date-time format, when the policy was created.
    */
  var CreateDate: js.UndefOr[dateType] = js.undefined
  /**
    * The identifier for the version of the policy that is set as the default (operative) version. For more information about policy versions, see Versioning for Managed Policies in the Using IAM guide. 
    */
  var DefaultVersionId: js.UndefOr[policyVersionIdType] = js.undefined
  /**
    * A friendly description of the policy.
    */
  var Description: js.UndefOr[policyDescriptionType] = js.undefined
  /**
    * Specifies whether the policy can be attached to an IAM user, group, or role.
    */
  var IsAttachable: js.UndefOr[booleanType] = js.undefined
  /**
    * The path to the policy. For more information about paths, see IAM Identifiers in the Using IAM guide.
    */
  var Path: js.UndefOr[policyPathType] = js.undefined
  /**
    * The number of entities (users and roles) for which the policy is used as the permissions boundary.  For more information about permissions boundaries, see Permissions Boundaries for IAM Identities  in the IAM User Guide.
    */
  var PermissionsBoundaryUsageCount: js.UndefOr[attachmentCountType] = js.undefined
  /**
    * The stable and unique string identifying the policy. For more information about IDs, see IAM Identifiers in the Using IAM guide.
    */
  var PolicyId: js.UndefOr[idType] = js.undefined
  /**
    * The friendly name (not ARN) identifying the policy.
    */
  var PolicyName: js.UndefOr[policyNameType] = js.undefined
  /**
    * A list containing information about the versions of the policy.
    */
  var PolicyVersionList: js.UndefOr[policyDocumentVersionListType] = js.undefined
  /**
    * The date and time, in ISO 8601 date-time format, when the policy was last updated. When a policy has only one version, this field contains the date and time when the policy was created. When a policy has more than one version, this field contains the date and time when the most recent policy version was created.
    */
  var UpdateDate: js.UndefOr[dateType] = js.undefined
}

object ManagedPolicyDetail {
  @scala.inline
  def apply(
    Arn: arnType = null,
    AttachmentCount: js.UndefOr[attachmentCountType] = js.undefined,
    CreateDate: dateType = null,
    DefaultVersionId: policyVersionIdType = null,
    Description: policyDescriptionType = null,
    IsAttachable: js.UndefOr[booleanType] = js.undefined,
    Path: policyPathType = null,
    PermissionsBoundaryUsageCount: js.UndefOr[attachmentCountType] = js.undefined,
    PolicyId: idType = null,
    PolicyName: policyNameType = null,
    PolicyVersionList: policyDocumentVersionListType = null,
    UpdateDate: dateType = null
  ): ManagedPolicyDetail = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (!js.isUndefined(AttachmentCount)) __obj.updateDynamic("AttachmentCount")(AttachmentCount)
    if (CreateDate != null) __obj.updateDynamic("CreateDate")(CreateDate)
    if (DefaultVersionId != null) __obj.updateDynamic("DefaultVersionId")(DefaultVersionId)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (!js.isUndefined(IsAttachable)) __obj.updateDynamic("IsAttachable")(IsAttachable)
    if (Path != null) __obj.updateDynamic("Path")(Path)
    if (!js.isUndefined(PermissionsBoundaryUsageCount)) __obj.updateDynamic("PermissionsBoundaryUsageCount")(PermissionsBoundaryUsageCount)
    if (PolicyId != null) __obj.updateDynamic("PolicyId")(PolicyId)
    if (PolicyName != null) __obj.updateDynamic("PolicyName")(PolicyName)
    if (PolicyVersionList != null) __obj.updateDynamic("PolicyVersionList")(PolicyVersionList)
    if (UpdateDate != null) __obj.updateDynamic("UpdateDate")(UpdateDate)
    __obj.asInstanceOf[ManagedPolicyDetail]
  }
}

