package typings
package atPulumiAwsLib.cognitoUserPoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cognito/userPool", "UserPool")
@js.native
class UserPool protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a UserPool resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: UserPoolArgs) = this()
  def this(name: java.lang.String, args: UserPoolArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The configuration for AdminCreateUser requests.
    */
  val adminCreateUserConfig: atPulumiPulumiLib.outputMod.Output[atPulumiAwsLib.Anon_AllowAdminCreateUserOnly] = js.native
  /**
    * Attributes supported as an alias for this user pool. Possible values: phone_number, email, or preferred_username. Conflicts with `username_attributes`.
    */
  val aliasAttributes: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  /**
    * The ARN of the user pool.
    */
  val arn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The attributes to be auto-verified. Possible values: email, phone_number.
    */
  val autoVerifiedAttributes: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  /**
    * The date the user pool was created.
    */
  val creationDate: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The configuration for the user pool's device tracking.
    */
  val deviceConfiguration: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_ChallengeRequiredOnNewDevice]] = js.native
  /**
    * The Email Configuration.
    */
  val emailConfiguration: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_EmailSendingAccount]] = js.native
  /**
    * A string representing the email verification message. Conflicts with `verification_message_template` configuration block `email_message` argument.
    */
  val emailVerificationMessage: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * A string representing the email verification subject. Conflicts with `verification_message_template` configuration block `email_subject` argument.
    */
  val emailVerificationSubject: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The endpoint name of the user pool. Example format: cognito-idp.REGION.amazonaws.com/xxxx_yyyyy
    */
  val endpoint: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * A container for the AWS Lambda triggers associated with the user pool.
    */
  val lambdaConfig: atPulumiPulumiLib.outputMod.Output[atPulumiAwsLib.Anon_CreateAuthChallenge] = js.native
  /**
    * The date the user pool was last modified.
    */
  val lastModifiedDate: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Set to enable multi-factor authentication. Must be one of the following values (ON, OFF, OPTIONAL)
    */
  val mfaConfiguration: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The name of the attribute.
    */
  val name: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * A container for information about the user pool password policy.
    */
  val passwordPolicy: atPulumiPulumiLib.outputMod.Output[atPulumiAwsLib.Anon_MinimumLength] = js.native
  /**
    * A container with the schema attributes of a user pool. Maximum of 50 attributes.
    */
  val schemas: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_AttributeDataType]]] = js.native
  /**
    * A string representing the SMS authentication message.
    */
  val smsAuthenticationMessage: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The SMS Configuration.
    */
  val smsConfiguration: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_ExternalId]] = js.native
  /**
    * A string representing the SMS verification message. Conflicts with `verification_message_template` configuration block `sms_message` argument.
    */
  val smsVerificationMessage: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * A mapping of tags to assign to the User Pool.
    */
  val tags: atPulumiPulumiLib.outputMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
  /**
    * Configuration block for user pool add-ons to enable user pool advanced security mode features.
    */
  val userPoolAddOns: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_AdvancedSecurityMode]] = js.native
  /**
    * Specifies whether email addresses or phone numbers can be specified as usernames when a user signs up. Conflicts with `alias_attributes`.
    */
  val usernameAttributes: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  /**
    * The verification message templates configuration.
    */
  val verificationMessageTemplate: atPulumiPulumiLib.outputMod.Output[atPulumiAwsLib.Anon_DefaultEmailOption] = js.native
}

/* static members */
@JSImport("@pulumi/aws/cognito/userPool", "UserPool")
@js.native
object UserPool extends js.Object {
  /**
    * Get an existing UserPool resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cognitoUserPoolMod.UserPool = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cognitoUserPoolMod.UserPoolState
  ): atPulumiAwsLib.cognitoUserPoolMod.UserPool = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cognitoUserPoolMod.UserPoolState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.cognitoUserPoolMod.UserPool = js.native
  /**
    * Returns true if the given object is an instance of UserPool.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/userPool.UserPool */ scala.Boolean = js.native
}

