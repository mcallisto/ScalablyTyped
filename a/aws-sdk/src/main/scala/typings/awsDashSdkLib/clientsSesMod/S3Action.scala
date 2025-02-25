package typings
package awsDashSdkLib.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3Action extends js.Object {
  /**
    * The name of the Amazon S3 bucket that incoming email will be saved to.
    */
  var BucketName: S3BucketName
  /**
    * The customer master key that Amazon SES should use to encrypt your emails before saving them to the Amazon S3 bucket. You can use the default master key or a custom master key you created in AWS KMS as follows:   To use the default master key, provide an ARN in the form of arn:aws:kms:REGION:ACCOUNT-ID-WITHOUT-HYPHENS:alias/aws/ses. For example, if your AWS account ID is 123456789012 and you want to use the default master key in the US West (Oregon) region, the ARN of the default master key would be arn:aws:kms:us-west-2:123456789012:alias/aws/ses. If you use the default master key, you don't need to perform any extra steps to give Amazon SES permission to use the key.   To use a custom master key you created in AWS KMS, provide the ARN of the master key and ensure that you add a statement to your key's policy to give Amazon SES permission to use it. For more information about giving permissions, see the Amazon SES Developer Guide.   For more information about key policies, see the AWS KMS Developer Guide. If you do not specify a master key, Amazon SES will not encrypt your emails.  Your mail is encrypted by Amazon SES using the Amazon S3 encryption client before the mail is submitted to Amazon S3 for storage. It is not encrypted using Amazon S3 server-side encryption. This means that you must use the Amazon S3 encryption client to decrypt the email after retrieving it from Amazon S3, as the service has no access to use your AWS KMS keys for decryption. This encryption client is currently available with the AWS SDK for Java and AWS SDK for Ruby only. For more information about client-side encryption using AWS KMS master keys, see the Amazon S3 Developer Guide. 
    */
  var KmsKeyArn: js.UndefOr[AmazonResourceName] = js.undefined
  /**
    * The key prefix of the Amazon S3 bucket. The key prefix is similar to a directory name that enables you to store similar data under the same directory in a bucket.
    */
  var ObjectKeyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined
  /**
    * The ARN of the Amazon SNS topic to notify when the message is saved to the Amazon S3 bucket. An example of an Amazon SNS topic ARN is arn:aws:sns:us-west-2:123456789012:MyTopic. For more information about Amazon SNS topics, see the Amazon SNS Developer Guide.
    */
  var TopicArn: js.UndefOr[AmazonResourceName] = js.undefined
}

object S3Action {
  @scala.inline
  def apply(
    BucketName: S3BucketName,
    KmsKeyArn: AmazonResourceName = null,
    ObjectKeyPrefix: S3KeyPrefix = null,
    TopicArn: AmazonResourceName = null
  ): S3Action = {
    val __obj = js.Dynamic.literal(BucketName = BucketName)
    if (KmsKeyArn != null) __obj.updateDynamic("KmsKeyArn")(KmsKeyArn)
    if (ObjectKeyPrefix != null) __obj.updateDynamic("ObjectKeyPrefix")(ObjectKeyPrefix)
    if (TopicArn != null) __obj.updateDynamic("TopicArn")(TopicArn)
    __obj.asInstanceOf[S3Action]
  }
}

