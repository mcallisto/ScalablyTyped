package typings
package awsDashSdkLib.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateEntityRecognizerRequest extends js.Object {
  /**
    *  A unique identifier for the request. If you don't set the client request token, Amazon Comprehend generates one.
    */
  var ClientRequestToken: js.UndefOr[ClientRequestTokenString] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the AWS Identity and Management (IAM) role that grants Amazon Comprehend read access to your input data.
    */
  var DataAccessRoleArn: IamRoleArn
  /**
    * Specifies the format and location of the input data. The S3 bucket containing the input data must be located in the same region as the entity recognizer being created. 
    */
  var InputDataConfig: EntityRecognizerInputDataConfig
  /**
    *  The language of the input documents. All documents must be in the same language. Only English ("en") is currently supported. 
    */
  var LanguageCode: awsDashSdkLib.clientsComprehendMod.LanguageCode
  /**
    * The name given to the newly created recognizer. Recognizer names can be a maximum of 256 characters. Alphanumeric characters, hyphens (-) and underscores (_) are allowed. The name must be unique in the account/region.
    */
  var RecognizerName: ComprehendArnName
  /**
    * Tags to be associated with the entity recognizer being created. A tag is a key-value pair that adds as a metadata to a resource used by Amazon Comprehend. For example, a tag with "Sales" as the key might be added to a resource to indicate its use by the sales department. 
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  /**
    * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt data on the storage volume attached to the ML compute instance(s) that process the analysis job. The VolumeKmsKeyId can be either of the following formats:   KMS Key ID: "1234abcd-12ab-34cd-56ef-1234567890ab"    Amazon Resource Name (ARN) of a KMS Key: "arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"   
    */
  var VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
  /**
    * Configuration parameters for an optional private Virtual Private Cloud (VPC) containing the resources you are using for your custom entity recognizer. For more information, see Amazon VPC. 
    */
  var VpcConfig: js.UndefOr[VpcConfig] = js.undefined
}

object CreateEntityRecognizerRequest {
  @scala.inline
  def apply(
    DataAccessRoleArn: IamRoleArn,
    InputDataConfig: EntityRecognizerInputDataConfig,
    LanguageCode: LanguageCode,
    RecognizerName: ComprehendArnName,
    ClientRequestToken: ClientRequestTokenString = null,
    Tags: TagList = null,
    VolumeKmsKeyId: KmsKeyId = null,
    VpcConfig: VpcConfig = null
  ): CreateEntityRecognizerRequest = {
    val __obj = js.Dynamic.literal(DataAccessRoleArn = DataAccessRoleArn, InputDataConfig = InputDataConfig, LanguageCode = LanguageCode.asInstanceOf[js.Any], RecognizerName = RecognizerName)
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (VolumeKmsKeyId != null) __obj.updateDynamic("VolumeKmsKeyId")(VolumeKmsKeyId)
    if (VpcConfig != null) __obj.updateDynamic("VpcConfig")(VpcConfig)
    __obj.asInstanceOf[CreateEntityRecognizerRequest]
  }
}

