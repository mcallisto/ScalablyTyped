package typings
package awsDashSdkLib.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3ContentLocation extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the S3 bucket containing the application code.
    */
  var BucketARN: awsDashSdkLib.clientsKinesisanalyticsv2Mod.BucketARN
  /**
    * The file key for the object containing the application code.
    */
  var FileKey: awsDashSdkLib.clientsKinesisanalyticsv2Mod.FileKey
  /**
    * The version of the object containing the application code.
    */
  var ObjectVersion: js.UndefOr[ObjectVersion] = js.undefined
}

object S3ContentLocation {
  @scala.inline
  def apply(BucketARN: BucketARN, FileKey: FileKey, ObjectVersion: ObjectVersion = null): S3ContentLocation = {
    val __obj = js.Dynamic.literal(BucketARN = BucketARN, FileKey = FileKey)
    if (ObjectVersion != null) __obj.updateDynamic("ObjectVersion")(ObjectVersion)
    __obj.asInstanceOf[S3ContentLocation]
  }
}

