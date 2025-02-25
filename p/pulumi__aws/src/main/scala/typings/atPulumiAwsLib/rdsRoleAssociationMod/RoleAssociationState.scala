package typings
package atPulumiAwsLib.rdsRoleAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoleAssociationState extends js.Object {
  /**
    * DB Instance Identifier to associate with the IAM Role.
    */
  val dbInstanceIdentifier: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Name of the feature for association. This can be found in the AWS documentation relevant to the integration or a full list is available in the `SupportedFeatureNames` list returned by [AWS CLI rds describe-db-engine-versions](https://docs.aws.amazon.com/cli/latest/reference/rds/describe-db-engine-versions.html).
    */
  val featureName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Amazon Resource Name (ARN) of the IAM Role to associate with the DB Instance.
    */
  val roleArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object RoleAssociationState {
  @scala.inline
  def apply(
    dbInstanceIdentifier: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    featureName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    roleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): RoleAssociationState = {
    val __obj = js.Dynamic.literal()
    if (dbInstanceIdentifier != null) __obj.updateDynamic("dbInstanceIdentifier")(dbInstanceIdentifier.asInstanceOf[js.Any])
    if (featureName != null) __obj.updateDynamic("featureName")(featureName.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoleAssociationState]
  }
}

