package typings
package awsDashSdkLib.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessLog extends js.Object {
  /**
    * The interval for publishing the access logs. You can specify an interval of either 5 minutes or 60 minutes. Default: 60 minutes
    */
  var EmitInterval: js.UndefOr[AccessLogInterval] = js.undefined
  /**
    * Specifies whether access logs are enabled for the load balancer.
    */
  var Enabled: AccessLogEnabled
  /**
    * The name of the Amazon S3 bucket where the access logs are stored.
    */
  var S3BucketName: js.UndefOr[S3BucketName] = js.undefined
  /**
    * The logical hierarchy you created for your Amazon S3 bucket, for example my-bucket-prefix/prod. If the prefix is not provided, the log is placed at the root level of the bucket.
    */
  var S3BucketPrefix: js.UndefOr[AccessLogPrefix] = js.undefined
}

object AccessLog {
  @scala.inline
  def apply(
    Enabled: AccessLogEnabled,
    EmitInterval: js.UndefOr[AccessLogInterval] = js.undefined,
    S3BucketName: S3BucketName = null,
    S3BucketPrefix: AccessLogPrefix = null
  ): AccessLog = {
    val __obj = js.Dynamic.literal(Enabled = Enabled)
    if (!js.isUndefined(EmitInterval)) __obj.updateDynamic("EmitInterval")(EmitInterval)
    if (S3BucketName != null) __obj.updateDynamic("S3BucketName")(S3BucketName)
    if (S3BucketPrefix != null) __obj.updateDynamic("S3BucketPrefix")(S3BucketPrefix)
    __obj.asInstanceOf[AccessLog]
  }
}

