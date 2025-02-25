package typings
package awsDashSdkLib.clientsCloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeRuleResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the rule.
    */
  var Arn: js.UndefOr[RuleArn] = js.undefined
  /**
    * The description of the rule.
    */
  var Description: js.UndefOr[RuleDescription] = js.undefined
  /**
    * The event pattern. For more information, see Events and Event Patterns in the Amazon CloudWatch Events User Guide.
    */
  var EventPattern: js.UndefOr[EventPattern] = js.undefined
  /**
    * If this is a managed rule, created by an AWS service on your behalf, this field displays the principal name of the AWS service that created the rule.
    */
  var ManagedBy: js.UndefOr[ManagedBy] = js.undefined
  /**
    * The name of the rule.
    */
  var Name: js.UndefOr[RuleName] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the IAM role associated with the rule.
    */
  var RoleArn: js.UndefOr[RoleArn] = js.undefined
  /**
    * The scheduling expression. For example, "cron(0 20 * * ? *)", "rate(5 minutes)".
    */
  var ScheduleExpression: js.UndefOr[ScheduleExpression] = js.undefined
  /**
    * Specifies whether the rule is enabled or disabled.
    */
  var State: js.UndefOr[RuleState] = js.undefined
}

object DescribeRuleResponse {
  @scala.inline
  def apply(
    Arn: RuleArn = null,
    Description: RuleDescription = null,
    EventPattern: EventPattern = null,
    ManagedBy: ManagedBy = null,
    Name: RuleName = null,
    RoleArn: RoleArn = null,
    ScheduleExpression: ScheduleExpression = null,
    State: RuleState = null
  ): DescribeRuleResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (EventPattern != null) __obj.updateDynamic("EventPattern")(EventPattern)
    if (ManagedBy != null) __obj.updateDynamic("ManagedBy")(ManagedBy)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn)
    if (ScheduleExpression != null) __obj.updateDynamic("ScheduleExpression")(ScheduleExpression)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRuleResponse]
  }
}

