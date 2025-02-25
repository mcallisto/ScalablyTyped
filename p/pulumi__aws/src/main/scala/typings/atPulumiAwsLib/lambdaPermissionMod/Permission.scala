package typings
package atPulumiAwsLib.lambdaPermissionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/lambda/permission", "Permission")
@js.native
class Permission protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a Permission resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: PermissionArgs) = this()
  def this(name: java.lang.String, args: PermissionArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The AWS Lambda action you want to allow in this statement. (e.g. `lambda:InvokeFunction`)
    */
  val action: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The Event Source Token to validate.  Used with [Alexa Skills][1].
    */
  val eventSourceToken: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Name of the Lambda function whose resource policy you are updating
    */
  val function: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The principal who is getting this permission.
    * e.g. `s3.amazonaws.com`, an AWS account ID, or any valid AWS service principal
    * such as `events.amazonaws.com` or `sns.amazonaws.com`.
    */
  val principal: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Query parameter to specify function version or alias name.
    * The permission will then apply to the specific qualified ARN.
    * e.g. `arn:aws:lambda:aws-region:acct-id:function:function-name:2`
    */
  val qualifier: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * This parameter is used for S3 and SES. The AWS account ID (without a hyphen) of the source owner.
    */
  val sourceAccount: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * When granting Amazon S3 or CloudWatch Events permission to
    * invoke your function, you should specify this field with the Amazon Resource Name (ARN)
    * for the S3 Bucket or CloudWatch Events Rule as its value.  This ensures that only events
    * generated from the specified bucket or rule can invoke the function.
    * API Gateway ARNs have a unique structure described
    * [here](http://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-control-access-using-iam-policies-to-invoke-api.html).
    */
  val sourceArn: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  val statementId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  val statementIdPrefix: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/lambda/permission", "Permission")
@js.native
object Permission extends js.Object {
  /**
    * Get an existing Permission resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.lambdaPermissionMod.Permission = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.lambdaPermissionMod.PermissionState
  ): atPulumiAwsLib.lambdaPermissionMod.Permission = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.lambdaPermissionMod.PermissionState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.lambdaPermissionMod.Permission = js.native
  /**
    * Returns true if the given object is an instance of Permission.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lambda/permission.Permission */ scala.Boolean = js.native
}

