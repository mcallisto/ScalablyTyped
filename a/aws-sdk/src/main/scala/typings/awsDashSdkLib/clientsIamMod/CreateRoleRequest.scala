package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateRoleRequest extends js.Object {
  /**
    * The trust relationship policy document that grants an entity permission to assume the role. In IAM, you must provide a JSON policy that has been converted to a string. However, for AWS CloudFormation templates formatted in YAML, you can provide the policy in JSON or YAML format. AWS CloudFormation always converts a YAML policy to JSON format before submitting it to IAM. The regex pattern used to validate this parameter is a string of characters consisting of the following:   Any printable ASCII character ranging from the space character (\\u0020) through the end of the ASCII character range   The printable characters in the Basic Latin and Latin-1 Supplement character set (through \\u00FF)   The special characters tab (\\u0009), line feed (\\u000A), and carriage return (\\u000D)    Upon success, the response includes the same trust policy as a URL-encoded JSON string.
    */
  var AssumeRolePolicyDocument: policyDocumentType
  /**
    * A description of the role.
    */
  var Description: js.UndefOr[roleDescriptionType] = js.undefined
  /**
    * The maximum session duration (in seconds) that you want to set for the specified role. If you do not specify a value for this setting, the default maximum of one hour is applied. This setting can have a value from 1 hour to 12 hours. Anyone who assumes the role from the AWS CLI or API can use the DurationSeconds API parameter or the duration-seconds CLI parameter to request a longer session. The MaxSessionDuration setting determines the maximum duration that can be requested using the DurationSeconds parameter. If users don't specify a value for the DurationSeconds parameter, their security credentials are valid for one hour by default. This applies when you use the AssumeRole* API operations or the assume-role* CLI operations but does not apply when you use those operations to create a console URL. For more information, see Using IAM Roles in the IAM User Guide.
    */
  var MaxSessionDuration: js.UndefOr[roleMaxSessionDurationType] = js.undefined
  /**
    *  The path to the role. For more information about paths, see IAM Identifiers in the IAM User Guide. This parameter is optional. If it is not included, it defaults to a slash (/). This parameter allows (through its regex pattern) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (\\u0021) through the DEL character (\\u007F), including most punctuation characters, digits, and upper and lowercased letters.
    */
  var Path: js.UndefOr[pathType] = js.undefined
  /**
    * The ARN of the policy that is used to set the permissions boundary for the role.
    */
  var PermissionsBoundary: js.UndefOr[arnType] = js.undefined
  /**
    * The name of the role to create. IAM user, group, role, and policy names must be unique within the account. Names are not distinguished by case. For example, you cannot create resources named both "MyResource" and "myresource".
    */
  var RoleName: roleNameType
  /**
    * A list of tags that you want to attach to the newly created role. Each tag consists of a key name and an associated value. For more information about tagging, see Tagging IAM Identities in the IAM User Guide.  If any one of the tags is invalid or if you exceed the allowed number of tags per role, then the entire request fails and the role is not created. 
    */
  var Tags: js.UndefOr[tagListType] = js.undefined
}

object CreateRoleRequest {
  @scala.inline
  def apply(
    AssumeRolePolicyDocument: policyDocumentType,
    RoleName: roleNameType,
    Description: roleDescriptionType = null,
    MaxSessionDuration: js.UndefOr[roleMaxSessionDurationType] = js.undefined,
    Path: pathType = null,
    PermissionsBoundary: arnType = null,
    Tags: tagListType = null
  ): CreateRoleRequest = {
    val __obj = js.Dynamic.literal(AssumeRolePolicyDocument = AssumeRolePolicyDocument, RoleName = RoleName)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (!js.isUndefined(MaxSessionDuration)) __obj.updateDynamic("MaxSessionDuration")(MaxSessionDuration)
    if (Path != null) __obj.updateDynamic("Path")(Path)
    if (PermissionsBoundary != null) __obj.updateDynamic("PermissionsBoundary")(PermissionsBoundary)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateRoleRequest]
  }
}

