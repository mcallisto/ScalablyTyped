package typings
package awsDashSdkLib.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateStackSetInput extends js.Object {
  /**
    * The Amazon Resource Number (ARN) of the IAM role to use to create this stack set.  Specify an IAM role only if you are using customized administrator roles to control which users or groups can manage specific stack sets within the same administrator account. For more information, see Prerequisites: Granting Permissions for Stack Set Operations in the AWS CloudFormation User Guide.
    */
  var AdministrationRoleARN: js.UndefOr[RoleARN] = js.undefined
  /**
    * In some cases, you must explicity acknowledge that your stack set template contains certain capabilities in order for AWS CloudFormation to create the stack set and related stack instances.    CAPABILITY_IAM and CAPABILITY_NAMED_IAM  Some stack templates might include resources that can affect permissions in your AWS account; for example, by creating new AWS Identity and Access Management (IAM) users. For those stack sets, you must explicitly acknowledge this by specifying one of these capabilities. The following IAM resources require you to specify either the CAPABILITY_IAM or CAPABILITY_NAMED_IAM capability.   If you have IAM resources, you can specify either capability.    If you have IAM resources with custom names, you must specify CAPABILITY_NAMED_IAM.    If you don't specify either of these capabilities, AWS CloudFormation returns an InsufficientCapabilities error.   If your stack template contains these resources, we recommend that you review all permissions associated with them and edit their permissions if necessary.     AWS::IAM::AccessKey      AWS::IAM::Group      AWS::IAM::InstanceProfile      AWS::IAM::Policy      AWS::IAM::Role      AWS::IAM::User      AWS::IAM::UserToGroupAddition    For more information, see Acknowledging IAM Resources in AWS CloudFormation Templates.    CAPABILITY_AUTO_EXPAND  Some templates contain macros. If your stack template contains one or more macros, and you choose to create a stack directly from the processed template, without first reviewing the resulting changes in a change set, you must acknowledge this capability. For more information, see Using AWS CloudFormation Macros to Perform Custom Processing on Templates.  Stack sets do not currently support macros in stack templates. (This includes the AWS::Include and AWS::Serverless transforms, which are macros hosted by AWS CloudFormation.) Even if you specify this capability, if you include a macro in your template the stack set operation will fail.   
    */
  var Capabilities: js.UndefOr[Capabilities] = js.undefined
  /**
    * A unique identifier for this CreateStackSet request. Specify this token if you plan to retry requests so that AWS CloudFormation knows that you're not attempting to create another stack set with the same name. You might retry CreateStackSet requests to ensure that AWS CloudFormation successfully received them. If you don't specify an operation ID, the SDK generates one automatically. 
    */
  var ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
  /**
    * A description of the stack set. You can use the description to identify the stack set's purpose or other important information.
    */
  var Description: js.UndefOr[Description] = js.undefined
  /**
    * The name of the IAM execution role to use to create the stack set. If you do not specify an execution role, AWS CloudFormation uses the AWSCloudFormationStackSetExecutionRole role for the stack set operation. Specify an IAM role only if you are using customized execution roles to control which stack resources users and groups can include in their stack sets. 
    */
  var ExecutionRoleName: js.UndefOr[ExecutionRoleName] = js.undefined
  /**
    * The input parameters for the stack set template. 
    */
  var Parameters: js.UndefOr[Parameters] = js.undefined
  /**
    * The name to associate with the stack set. The name must be unique in the region where you create your stack set.  A stack name can contain only alphanumeric characters (case-sensitive) and hyphens. It must start with an alphabetic character and can't be longer than 128 characters. 
    */
  var StackSetName: awsDashSdkLib.clientsCloudformationMod.StackSetName
  /**
    * The key-value pairs to associate with this stack set and the stacks created from it. AWS CloudFormation also propagates these tags to supported resources that are created in the stacks. A maximum number of 50 tags can be specified. If you specify tags as part of a CreateStackSet action, AWS CloudFormation checks to see if you have the required IAM permission to tag resources. If you don't, the entire CreateStackSet action fails with an access denied error, and the stack set is not created.
    */
  var Tags: js.UndefOr[Tags] = js.undefined
  /**
    * The structure that contains the template body, with a minimum length of 1 byte and a maximum length of 51,200 bytes. For more information, see Template Anatomy in the AWS CloudFormation User Guide. Conditional: You must specify either the TemplateBody or the TemplateURL parameter, but not both.
    */
  var TemplateBody: js.UndefOr[TemplateBody] = js.undefined
  /**
    * The location of the file that contains the template body. The URL must point to a template (maximum size: 460,800 bytes) that's located in an Amazon S3 bucket. For more information, see Template Anatomy in the AWS CloudFormation User Guide. Conditional: You must specify either the TemplateBody or the TemplateURL parameter, but not both.
    */
  var TemplateURL: js.UndefOr[TemplateURL] = js.undefined
}

object CreateStackSetInput {
  @scala.inline
  def apply(
    StackSetName: StackSetName,
    AdministrationRoleARN: RoleARN = null,
    Capabilities: Capabilities = null,
    ClientRequestToken: ClientRequestToken = null,
    Description: Description = null,
    ExecutionRoleName: ExecutionRoleName = null,
    Parameters: Parameters = null,
    Tags: Tags = null,
    TemplateBody: TemplateBody = null,
    TemplateURL: TemplateURL = null
  ): CreateStackSetInput = {
    val __obj = js.Dynamic.literal(StackSetName = StackSetName)
    if (AdministrationRoleARN != null) __obj.updateDynamic("AdministrationRoleARN")(AdministrationRoleARN)
    if (Capabilities != null) __obj.updateDynamic("Capabilities")(Capabilities)
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (ExecutionRoleName != null) __obj.updateDynamic("ExecutionRoleName")(ExecutionRoleName)
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (TemplateBody != null) __obj.updateDynamic("TemplateBody")(TemplateBody)
    if (TemplateURL != null) __obj.updateDynamic("TemplateURL")(TemplateURL)
    __obj.asInstanceOf[CreateStackSetInput]
  }
}

