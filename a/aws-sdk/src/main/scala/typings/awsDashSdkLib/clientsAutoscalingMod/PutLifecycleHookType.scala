package typings
package awsDashSdkLib.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutLifecycleHookType extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName
  /**
    * Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses or if an unexpected failure occurs. This parameter can be either CONTINUE or ABANDON. The default value is ABANDON.
    */
  var DefaultResult: js.UndefOr[LifecycleActionResult] = js.undefined
  /**
    * The maximum time, in seconds, that can elapse before the lifecycle hook times out. The range is from 30 to 7200 seconds. The default value is 3600 seconds (1 hour). If the lifecycle hook times out, Amazon EC2 Auto Scaling performs the action that you specified in the DefaultResult parameter. You can prevent the lifecycle hook from timing out by calling RecordLifecycleActionHeartbeat.
    */
  var HeartbeatTimeout: js.UndefOr[HeartbeatTimeout] = js.undefined
  /**
    * The name of the lifecycle hook.
    */
  var LifecycleHookName: AsciiStringMaxLen255
  /**
    * The instance state to which you want to attach the lifecycle hook. The valid values are:   autoscaling:EC2_INSTANCE_LAUNCHING   autoscaling:EC2_INSTANCE_TERMINATING   Conditional: This parameter is required for new lifecycle hooks, but optional when updating existing hooks.
    */
  var LifecycleTransition: js.UndefOr[LifecycleTransition] = js.undefined
  /**
    * Additional information that you want to include any time Amazon EC2 Auto Scaling sends a message to the notification target.
    */
  var NotificationMetadata: js.UndefOr[XmlStringMaxLen1023] = js.undefined
  /**
    * The ARN of the notification target that Amazon EC2 Auto Scaling uses to notify you when an instance is in the transition state for the lifecycle hook. This target can be either an SQS queue or an SNS topic. If you specify an empty string, this overrides the current ARN. This operation uses the JSON format when sending notifications to an Amazon SQS queue, and an email key-value pair format when sending notifications to an Amazon SNS topic. When you specify a notification target, Amazon EC2 Auto Scaling sends it a test message. Test messages contain the following additional key-value pair: "Event": "autoscaling:TEST_NOTIFICATION".
    */
  var NotificationTargetARN: js.UndefOr[NotificationTargetResourceName] = js.undefined
  /**
    * The ARN of the IAM role that allows the Auto Scaling group to publish to the specified notification target, for example, an Amazon SNS topic or an Amazon SQS queue. Conditional: This parameter is required for new lifecycle hooks, but optional when updating existing hooks.
    */
  var RoleARN: js.UndefOr[ResourceName] = js.undefined
}

object PutLifecycleHookType {
  @scala.inline
  def apply(
    AutoScalingGroupName: ResourceName,
    LifecycleHookName: AsciiStringMaxLen255,
    DefaultResult: LifecycleActionResult = null,
    HeartbeatTimeout: js.UndefOr[HeartbeatTimeout] = js.undefined,
    LifecycleTransition: LifecycleTransition = null,
    NotificationMetadata: XmlStringMaxLen1023 = null,
    NotificationTargetARN: NotificationTargetResourceName = null,
    RoleARN: ResourceName = null
  ): PutLifecycleHookType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName, LifecycleHookName = LifecycleHookName)
    if (DefaultResult != null) __obj.updateDynamic("DefaultResult")(DefaultResult)
    if (!js.isUndefined(HeartbeatTimeout)) __obj.updateDynamic("HeartbeatTimeout")(HeartbeatTimeout)
    if (LifecycleTransition != null) __obj.updateDynamic("LifecycleTransition")(LifecycleTransition)
    if (NotificationMetadata != null) __obj.updateDynamic("NotificationMetadata")(NotificationMetadata)
    if (NotificationTargetARN != null) __obj.updateDynamic("NotificationTargetARN")(NotificationTargetARN)
    if (RoleARN != null) __obj.updateDynamic("RoleARN")(RoleARN)
    __obj.asInstanceOf[PutLifecycleHookType]
  }
}

