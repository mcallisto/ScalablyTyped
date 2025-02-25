package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deployment extends js.Object {
  /**
    * The app ID.
    */
  var AppId: js.UndefOr[String] = js.undefined
  /**
    * Used to specify a stack or deployment command.
    */
  var Command: js.UndefOr[DeploymentCommand] = js.undefined
  /**
    * A user-defined comment.
    */
  var Comment: js.UndefOr[String] = js.undefined
  /**
    * Date when the deployment completed.
    */
  var CompletedAt: js.UndefOr[DateTime] = js.undefined
  /**
    * Date when the deployment was created.
    */
  var CreatedAt: js.UndefOr[DateTime] = js.undefined
  /**
    * A string that contains user-defined custom JSON. It can be used to override the corresponding default stack configuration attribute values for stack or to pass data to recipes. The string should be in the following format:  "{\"key1\": \"value1\", \"key2\": \"value2\",...}"  For more information on custom JSON, see Use Custom JSON to Modify the Stack Configuration Attributes.
    */
  var CustomJson: js.UndefOr[String] = js.undefined
  /**
    * The deployment ID.
    */
  var DeploymentId: js.UndefOr[String] = js.undefined
  /**
    * The deployment duration.
    */
  var Duration: js.UndefOr[Integer] = js.undefined
  /**
    * The user's IAM ARN.
    */
  var IamUserArn: js.UndefOr[String] = js.undefined
  /**
    * The IDs of the target instances.
    */
  var InstanceIds: js.UndefOr[Strings] = js.undefined
  /**
    * The stack ID.
    */
  var StackId: js.UndefOr[String] = js.undefined
  /**
    * The deployment status:   running   successful   failed  
    */
  var Status: js.UndefOr[String] = js.undefined
}

object Deployment {
  @scala.inline
  def apply(
    AppId: String = null,
    Command: DeploymentCommand = null,
    Comment: String = null,
    CompletedAt: DateTime = null,
    CreatedAt: DateTime = null,
    CustomJson: String = null,
    DeploymentId: String = null,
    Duration: js.UndefOr[Integer] = js.undefined,
    IamUserArn: String = null,
    InstanceIds: Strings = null,
    StackId: String = null,
    Status: String = null
  ): Deployment = {
    val __obj = js.Dynamic.literal()
    if (AppId != null) __obj.updateDynamic("AppId")(AppId)
    if (Command != null) __obj.updateDynamic("Command")(Command)
    if (Comment != null) __obj.updateDynamic("Comment")(Comment)
    if (CompletedAt != null) __obj.updateDynamic("CompletedAt")(CompletedAt)
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt)
    if (CustomJson != null) __obj.updateDynamic("CustomJson")(CustomJson)
    if (DeploymentId != null) __obj.updateDynamic("DeploymentId")(DeploymentId)
    if (!js.isUndefined(Duration)) __obj.updateDynamic("Duration")(Duration)
    if (IamUserArn != null) __obj.updateDynamic("IamUserArn")(IamUserArn)
    if (InstanceIds != null) __obj.updateDynamic("InstanceIds")(InstanceIds)
    if (StackId != null) __obj.updateDynamic("StackId")(StackId)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    __obj.asInstanceOf[Deployment]
  }
}

