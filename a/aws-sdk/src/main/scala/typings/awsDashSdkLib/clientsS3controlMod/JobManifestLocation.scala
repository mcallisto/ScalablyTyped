package typings
package awsDashSdkLib.clientsS3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobManifestLocation extends js.Object {
  /**
    * The ETag for the specified manifest object.
    */
  var ETag: NonEmptyMaxLength1024String
  /**
    * The Amazon Resource Name (ARN) for a manifest object.
    */
  var ObjectArn: S3KeyArnString
  /**
    * The optional version ID to identify a specific version of the manifest object.
    */
  var ObjectVersionId: js.UndefOr[S3ObjectVersionId] = js.undefined
}

object JobManifestLocation {
  @scala.inline
  def apply(
    ETag: NonEmptyMaxLength1024String,
    ObjectArn: S3KeyArnString,
    ObjectVersionId: S3ObjectVersionId = null
  ): JobManifestLocation = {
    val __obj = js.Dynamic.literal(ETag = ETag, ObjectArn = ObjectArn)
    if (ObjectVersionId != null) __obj.updateDynamic("ObjectVersionId")(ObjectVersionId)
    __obj.asInstanceOf[JobManifestLocation]
  }
}

