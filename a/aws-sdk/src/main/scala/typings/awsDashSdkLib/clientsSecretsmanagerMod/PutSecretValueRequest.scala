package typings
package awsDashSdkLib.clientsSecretsmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutSecretValueRequest extends js.Object {
  /**
    * (Optional) Specifies a unique identifier for the new version of the secret.   If you use the AWS CLI or one of the AWS SDK to call this operation, then you can leave this parameter empty. The CLI or SDK generates a random UUID for you and includes that in the request. If you don't use the SDK and instead generate a raw HTTP request to the Secrets Manager service endpoint, then you must generate a ClientRequestToken yourself for new versions and include that value in the request.   This value helps ensure idempotency. Secrets Manager uses this value to prevent the accidental creation of duplicate versions if there are failures and retries during the Lambda rotation function's processing. We recommend that you generate a UUID-type value to ensure uniqueness within the specified secret.    If the ClientRequestToken value isn't already associated with a version of the secret then a new version of the secret is created.    If a version with this value already exists and that version's SecretString or SecretBinary values are the same as those in the request then the request is ignored (the operation is idempotent).    If a version with this value already exists and that version's SecretString and SecretBinary values are different from those in the request then the request fails because you cannot modify an existing secret version. You can only create new versions to store new secret values.   This value becomes the VersionId of the new version.
    */
  var ClientRequestToken: js.UndefOr[ClientRequestTokenType] = js.undefined
  /**
    * (Optional) Specifies binary data that you want to encrypt and store in the new version of the secret. To use this parameter in the command-line tools, we recommend that you store your binary data in a file and then use the appropriate technique for your tool to pass the contents of the file as a parameter. Either SecretBinary or SecretString must have a value, but not both. They cannot both be empty. This parameter is not accessible if the secret using the Secrets Manager console. 
    */
  var SecretBinary: js.UndefOr[SecretBinaryType] = js.undefined
  /**
    * Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.  If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t create secret names that end with a hyphen followed by six characters. 
    */
  var SecretId: SecretIdType
  /**
    * (Optional) Specifies text data that you want to encrypt and store in this new version of the secret. Either SecretString or SecretBinary must have a value, but not both. They cannot both be empty. If you create this secret by using the Secrets Manager console then Secrets Manager puts the protected secret text in only the SecretString parameter. The Secrets Manager console stores the information as a JSON structure of key/value pairs that the default Lambda rotation function knows how to parse. For storing multiple values, we recommend that you use a JSON text string argument and specify key/value pairs. For information on how to format a JSON parameter for the various command line tool environments, see Using JSON for Parameters in the AWS CLI User Guide.  For example:  [{"username":"bob"},{"password":"abc123xyz456"}]  If your command-line tool or SDK requires quotation marks around the parameter, you should use single quotes to avoid confusion with the double quotes required in the JSON text.
    */
  var SecretString: js.UndefOr[SecretStringType] = js.undefined
  /**
    * (Optional) Specifies a list of staging labels that are attached to this version of the secret. These staging labels are used to track the versions through the rotation process by the Lambda rotation function. A staging label must be unique to a single version of the secret. If you specify a staging label that's already associated with a different version of the same secret then that staging label is automatically removed from the other version and attached to this version. If you do not specify a value for VersionStages then Secrets Manager automatically moves the staging label AWSCURRENT to this new version.
    */
  var VersionStages: js.UndefOr[SecretVersionStagesType] = js.undefined
}

object PutSecretValueRequest {
  @scala.inline
  def apply(
    SecretId: SecretIdType,
    ClientRequestToken: ClientRequestTokenType = null,
    SecretBinary: SecretBinaryType = null,
    SecretString: SecretStringType = null,
    VersionStages: SecretVersionStagesType = null
  ): PutSecretValueRequest = {
    val __obj = js.Dynamic.literal(SecretId = SecretId)
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken)
    if (SecretBinary != null) __obj.updateDynamic("SecretBinary")(SecretBinary.asInstanceOf[js.Any])
    if (SecretString != null) __obj.updateDynamic("SecretString")(SecretString)
    if (VersionStages != null) __obj.updateDynamic("VersionStages")(VersionStages)
    __obj.asInstanceOf[PutSecretValueRequest]
  }
}

