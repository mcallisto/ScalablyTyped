package typings
package atPulumiAwsLib.lambdaPermissionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionState extends js.Object {
  /**
    * The AWS Lambda action you want to allow in this statement. (e.g. `lambda:InvokeFunction`)
    */
  val action: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The Event Source Token to validate.  Used with [Alexa Skills][1].
    */
  val eventSourceToken: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Name of the Lambda function whose resource policy you are updating
    */
  val function: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[java.lang.String | atPulumiAwsLib.lambdaFunctionMod.Function]
  ] = js.undefined
  /**
    * The principal who is getting this permission.
    * e.g. `s3.amazonaws.com`, an AWS account ID, or any valid AWS service principal
    * such as `events.amazonaws.com` or `sns.amazonaws.com`.
    */
  val principal: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Query parameter to specify function version or alias name.
    * The permission will then apply to the specific qualified ARN.
    * e.g. `arn:aws:lambda:aws-region:acct-id:function:function-name:2`
    */
  val qualifier: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * This parameter is used for S3 and SES. The AWS account ID (without a hyphen) of the source owner.
    */
  val sourceAccount: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * When granting Amazon S3 or CloudWatch Events permission to
    * invoke your function, you should specify this field with the Amazon Resource Name (ARN)
    * for the S3 Bucket or CloudWatch Events Rule as its value.  This ensures that only events
    * generated from the specified bucket or rule can invoke the function.
    * API Gateway ARNs have a unique structure described
    * [here](http://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-control-access-using-iam-policies-to-invoke-api.html).
    */
  val sourceArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  val statementId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  val statementIdPrefix: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object PermissionState {
  @scala.inline
  def apply(
    action: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    eventSourceToken: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    function: atPulumiPulumiLib.outputMod.Input[java.lang.String | atPulumiAwsLib.lambdaFunctionMod.Function] = null,
    principal: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    qualifier: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    sourceAccount: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    sourceArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    statementId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    statementIdPrefix: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): PermissionState = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (eventSourceToken != null) __obj.updateDynamic("eventSourceToken")(eventSourceToken.asInstanceOf[js.Any])
    if (function != null) __obj.updateDynamic("function")(function.asInstanceOf[js.Any])
    if (principal != null) __obj.updateDynamic("principal")(principal.asInstanceOf[js.Any])
    if (qualifier != null) __obj.updateDynamic("qualifier")(qualifier.asInstanceOf[js.Any])
    if (sourceAccount != null) __obj.updateDynamic("sourceAccount")(sourceAccount.asInstanceOf[js.Any])
    if (sourceArn != null) __obj.updateDynamic("sourceArn")(sourceArn.asInstanceOf[js.Any])
    if (statementId != null) __obj.updateDynamic("statementId")(statementId.asInstanceOf[js.Any])
    if (statementIdPrefix != null) __obj.updateDynamic("statementIdPrefix")(statementIdPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionState]
  }
}

