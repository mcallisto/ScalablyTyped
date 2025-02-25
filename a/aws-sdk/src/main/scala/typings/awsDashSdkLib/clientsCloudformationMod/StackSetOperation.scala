package typings
package awsDashSdkLib.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackSetOperation extends js.Object {
  /**
    * The type of stack set operation: CREATE, UPDATE, or DELETE. Create and delete operations affect only the specified stack set instances that are associated with the specified stack set. Update operations affect both the stack set itself, as well as all associated stack set instances.
    */
  var Action: js.UndefOr[StackSetOperationAction] = js.undefined
  /**
    * The Amazon Resource Number (ARN) of the IAM role used to perform this stack set operation.  Use customized administrator roles to control which users or groups can manage specific stack sets within the same administrator account. For more information, see Define Permissions for Multiple Administrators in the AWS CloudFormation User Guide.
    */
  var AdministrationRoleARN: js.UndefOr[RoleARN] = js.undefined
  /**
    * The time at which the operation was initiated. Note that the creation times for the stack set operation might differ from the creation time of the individual stacks themselves. This is because AWS CloudFormation needs to perform preparatory work for the operation, such as dispatching the work to the requested regions, before actually creating the first stacks.
    */
  var CreationTimestamp: js.UndefOr[Timestamp] = js.undefined
  /**
    * The time at which the stack set operation ended, across all accounts and regions specified. Note that this doesn't necessarily mean that the stack set operation was successful, or even attempted, in each account or region.
    */
  var EndTimestamp: js.UndefOr[Timestamp] = js.undefined
  /**
    * The name of the IAM execution role used to create or update the stack set. Use customized execution roles to control which stack resources users and groups can include in their stack sets. 
    */
  var ExecutionRoleName: js.UndefOr[ExecutionRoleName] = js.undefined
  /**
    * The unique ID of a stack set operation.
    */
  var OperationId: js.UndefOr[ClientRequestToken] = js.undefined
  /**
    * The preferences for how AWS CloudFormation performs this stack set operation.
    */
  var OperationPreferences: js.UndefOr[StackSetOperationPreferences] = js.undefined
  /**
    * For stack set operations of action type DELETE, specifies whether to remove the stack instances from the specified stack set, but doesn't delete the stacks. You can't reassociate a retained stack, or add an existing, saved stack to a new stack set.
    */
  var RetainStacks: js.UndefOr[RetainStacksNullable] = js.undefined
  /**
    * The ID of the stack set.
    */
  var StackSetId: js.UndefOr[StackSetId] = js.undefined
  /**
    * The status of the operation.     FAILED: The operation exceeded the specified failure tolerance. The failure tolerance value that you've set for an operation is applied for each region during stack create and update operations. If the number of failed stacks within a region exceeds the failure tolerance, the status of the operation in the region is set to FAILED. This in turn sets the status of the operation as a whole to FAILED, and AWS CloudFormation cancels the operation in any remaining regions.    RUNNING: The operation is currently being performed.    STOPPED: The user has cancelled the operation.    STOPPING: The operation is in the process of stopping, at user request.     SUCCEEDED: The operation completed creating or updating all the specified stacks without exceeding the failure tolerance for the operation.  
    */
  var Status: js.UndefOr[StackSetOperationStatus] = js.undefined
}

object StackSetOperation {
  @scala.inline
  def apply(
    Action: StackSetOperationAction = null,
    AdministrationRoleARN: RoleARN = null,
    CreationTimestamp: Timestamp = null,
    EndTimestamp: Timestamp = null,
    ExecutionRoleName: ExecutionRoleName = null,
    OperationId: ClientRequestToken = null,
    OperationPreferences: StackSetOperationPreferences = null,
    RetainStacks: js.UndefOr[RetainStacksNullable] = js.undefined,
    StackSetId: StackSetId = null,
    Status: StackSetOperationStatus = null
  ): StackSetOperation = {
    val __obj = js.Dynamic.literal()
    if (Action != null) __obj.updateDynamic("Action")(Action.asInstanceOf[js.Any])
    if (AdministrationRoleARN != null) __obj.updateDynamic("AdministrationRoleARN")(AdministrationRoleARN)
    if (CreationTimestamp != null) __obj.updateDynamic("CreationTimestamp")(CreationTimestamp)
    if (EndTimestamp != null) __obj.updateDynamic("EndTimestamp")(EndTimestamp)
    if (ExecutionRoleName != null) __obj.updateDynamic("ExecutionRoleName")(ExecutionRoleName)
    if (OperationId != null) __obj.updateDynamic("OperationId")(OperationId)
    if (OperationPreferences != null) __obj.updateDynamic("OperationPreferences")(OperationPreferences)
    if (!js.isUndefined(RetainStacks)) __obj.updateDynamic("RetainStacks")(RetainStacks)
    if (StackSetId != null) __obj.updateDynamic("StackSetId")(StackSetId)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackSetOperation]
  }
}

