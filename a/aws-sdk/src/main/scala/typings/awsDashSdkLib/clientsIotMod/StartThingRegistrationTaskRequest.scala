package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartThingRegistrationTaskRequest extends js.Object {
  /**
    * The S3 bucket that contains the input file.
    */
  var inputFileBucket: RegistryS3BucketName
  /**
    * The name of input file within the S3 bucket. This file contains a newline delimited JSON file. Each line contains the parameter values to provision one device (thing).
    */
  var inputFileKey: RegistryS3KeyName
  /**
    * The IAM role ARN that grants permission the input file.
    */
  var roleArn: RoleArn
  /**
    * The provisioning template.
    */
  var templateBody: TemplateBody
}

object StartThingRegistrationTaskRequest {
  @scala.inline
  def apply(
    inputFileBucket: RegistryS3BucketName,
    inputFileKey: RegistryS3KeyName,
    roleArn: RoleArn,
    templateBody: TemplateBody
  ): StartThingRegistrationTaskRequest = {
    val __obj = js.Dynamic.literal(inputFileBucket = inputFileBucket, inputFileKey = inputFileKey, roleArn = roleArn, templateBody = templateBody)
  
    __obj.asInstanceOf[StartThingRegistrationTaskRequest]
  }
}

