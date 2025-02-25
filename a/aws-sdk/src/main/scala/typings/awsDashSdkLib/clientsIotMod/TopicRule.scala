package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicRule extends js.Object {
  /**
    * The actions associated with the rule.
    */
  var actions: js.UndefOr[ActionList] = js.undefined
  /**
    * The version of the SQL rules engine to use when evaluating the rule.
    */
  var awsIotSqlVersion: js.UndefOr[AwsIotSqlVersion] = js.undefined
  /**
    * The date and time the rule was created.
    */
  var createdAt: js.UndefOr[CreatedAtDate] = js.undefined
  /**
    * The description of the rule.
    */
  var description: js.UndefOr[Description] = js.undefined
  /**
    * The action to perform when an error occurs.
    */
  var errorAction: js.UndefOr[Action] = js.undefined
  /**
    * Specifies whether the rule is disabled.
    */
  var ruleDisabled: js.UndefOr[IsDisabled] = js.undefined
  /**
    * The name of the rule.
    */
  var ruleName: js.UndefOr[RuleName] = js.undefined
  /**
    * The SQL statement used to query the topic. When using a SQL query with multiple lines, be sure to escape the newline characters.
    */
  var sql: js.UndefOr[SQL] = js.undefined
}

object TopicRule {
  @scala.inline
  def apply(
    actions: ActionList = null,
    awsIotSqlVersion: AwsIotSqlVersion = null,
    createdAt: CreatedAtDate = null,
    description: Description = null,
    errorAction: Action = null,
    ruleDisabled: js.UndefOr[IsDisabled] = js.undefined,
    ruleName: RuleName = null,
    sql: SQL = null
  ): TopicRule = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (awsIotSqlVersion != null) __obj.updateDynamic("awsIotSqlVersion")(awsIotSqlVersion)
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt)
    if (description != null) __obj.updateDynamic("description")(description)
    if (errorAction != null) __obj.updateDynamic("errorAction")(errorAction)
    if (!js.isUndefined(ruleDisabled)) __obj.updateDynamic("ruleDisabled")(ruleDisabled)
    if (ruleName != null) __obj.updateDynamic("ruleName")(ruleName)
    if (sql != null) __obj.updateDynamic("sql")(sql)
    __obj.asInstanceOf[TopicRule]
  }
}

