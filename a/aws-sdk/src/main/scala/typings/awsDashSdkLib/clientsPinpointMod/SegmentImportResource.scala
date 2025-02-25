package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentImportResource extends js.Object {
  /**
    * The number of channel types in the endpoint definitions that were imported to create the segment.
    */
  var ChannelCounts: js.UndefOr[MapOf__integer] = js.undefined
  /**
    * (Deprecated) Your AWS account ID, which you assigned to an external ID key in an IAM trust policy. Amazon Pinpoint previously used this value to assume an IAM role when importing endpoint definitions, but we removed this requirement. We don't recommend use of external IDs for IAM roles that are assumed by Amazon Pinpoint.
    */
  var ExternalId: __string
  /**
    * The format of the files that were imported to create the segment. Valid values are: CSV, for comma-separated values format; and, JSON, for newline-delimited JSON format.
    */
  var Format: awsDashSdkLib.clientsPinpointMod.Format
  /**
    * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that authorized Amazon Pinpoint to access the Amazon S3 location to import endpoint definitions from.
    */
  var RoleArn: __string
  /**
    * The URL of the Amazon Simple Storage Service (Amazon S3) bucket that the endpoint definitions were imported from to create the segment.
    */
  var S3Url: __string
  /**
    * The number of endpoint definitions that were imported successfully to create the segment.
    */
  var Size: __integer
}

object SegmentImportResource {
  @scala.inline
  def apply(
    ExternalId: __string,
    Format: Format,
    RoleArn: __string,
    S3Url: __string,
    Size: __integer,
    ChannelCounts: MapOf__integer = null
  ): SegmentImportResource = {
    val __obj = js.Dynamic.literal(ExternalId = ExternalId, Format = Format.asInstanceOf[js.Any], RoleArn = RoleArn, S3Url = S3Url, Size = Size)
    if (ChannelCounts != null) __obj.updateDynamic("ChannelCounts")(ChannelCounts)
    __obj.asInstanceOf[SegmentImportResource]
  }
}

