package typings
package awsDashSdkLib.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackEvent extends js.Object {
  /**
    * The token passed to the operation that generated this event. All events triggered by a given stack operation are assigned the same client request token, which you can use to track operations. For example, if you execute a CreateStack operation with the token token1, then all the StackEvents generated by that operation will have ClientRequestToken set as token1. In the console, stack operations display the client request token on the Events tab. Stack operations that are initiated from the console use the token format Console-StackOperation-ID, which helps you easily identify the stack operation . For example, if you create a stack using the console, each stack event would be assigned the same token in the following format: Console-CreateStack-7f59c3cf-00d2-40c7-b2ff-e75db0987002. 
    */
  var ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
  /**
    * The unique ID of this event.
    */
  var EventId: awsDashSdkLib.clientsCloudformationMod.EventId
  /**
    * The logical name of the resource specified in the template.
    */
  var LogicalResourceId: js.UndefOr[LogicalResourceId] = js.undefined
  /**
    * The name or unique identifier associated with the physical instance of the resource.
    */
  var PhysicalResourceId: js.UndefOr[PhysicalResourceId] = js.undefined
  /**
    * BLOB of the properties used to create the resource.
    */
  var ResourceProperties: js.UndefOr[ResourceProperties] = js.undefined
  /**
    * Current status of the resource.
    */
  var ResourceStatus: js.UndefOr[ResourceStatus] = js.undefined
  /**
    * Success/failure message associated with the resource.
    */
  var ResourceStatusReason: js.UndefOr[ResourceStatusReason] = js.undefined
  /**
    * Type of resource. (For more information, go to  AWS Resource Types Reference in the AWS CloudFormation User Guide.)
    */
  var ResourceType: js.UndefOr[ResourceType] = js.undefined
  /**
    * The unique ID name of the instance of the stack.
    */
  var StackId: awsDashSdkLib.clientsCloudformationMod.StackId
  /**
    * The name associated with a stack.
    */
  var StackName: awsDashSdkLib.clientsCloudformationMod.StackName
  /**
    * Time the status was updated.
    */
  var Timestamp: awsDashSdkLib.clientsCloudformationMod.Timestamp
}

object StackEvent {
  @scala.inline
  def apply(
    EventId: EventId,
    StackId: StackId,
    StackName: StackName,
    Timestamp: Timestamp,
    ClientRequestToken: ClientRequestToken = null,
    LogicalResourceId: LogicalResourceId = null,
    PhysicalResourceId: PhysicalResourceId = null,
    ResourceProperties: ResourceProperties = null,
    ResourceStatus: ResourceStatus = null,
    ResourceStatusReason: ResourceStatusReason = null,
    ResourceType: ResourceType = null
  ): StackEvent = {
    val __obj = js.Dynamic.literal(EventId = EventId, StackId = StackId, StackName = StackName, Timestamp = Timestamp)
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken)
    if (LogicalResourceId != null) __obj.updateDynamic("LogicalResourceId")(LogicalResourceId)
    if (PhysicalResourceId != null) __obj.updateDynamic("PhysicalResourceId")(PhysicalResourceId)
    if (ResourceProperties != null) __obj.updateDynamic("ResourceProperties")(ResourceProperties)
    if (ResourceStatus != null) __obj.updateDynamic("ResourceStatus")(ResourceStatus.asInstanceOf[js.Any])
    if (ResourceStatusReason != null) __obj.updateDynamic("ResourceStatusReason")(ResourceStatusReason)
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType)
    __obj.asInstanceOf[StackEvent]
  }
}

