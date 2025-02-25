package typings
package awsDashSdkLib.clientsS3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobReport extends js.Object {
  /**
    * The bucket where specified job-completion report will be stored.
    */
  var Bucket: js.UndefOr[S3BucketArnString] = js.undefined
  /**
    * Indicates whether the specified job will generate a job-completion report.
    */
  var Enabled: Boolean
  /**
    * The format of the specified job-completion report.
    */
  var Format: js.UndefOr[JobReportFormat] = js.undefined
  /**
    * An optional prefix to describe where in the specified bucket the job-completion report will be stored. Amazon S3 will store the job-completion report at &lt;prefix&gt;/job-&lt;job-id&gt;/report.json.
    */
  var Prefix: js.UndefOr[ReportPrefixString] = js.undefined
  /**
    * Indicates whether the job-completion report will include details of all tasks or only failed tasks.
    */
  var ReportScope: js.UndefOr[JobReportScope] = js.undefined
}

object JobReport {
  @scala.inline
  def apply(
    Enabled: Boolean,
    Bucket: S3BucketArnString = null,
    Format: JobReportFormat = null,
    Prefix: ReportPrefixString = null,
    ReportScope: JobReportScope = null
  ): JobReport = {
    val __obj = js.Dynamic.literal(Enabled = Enabled)
    if (Bucket != null) __obj.updateDynamic("Bucket")(Bucket)
    if (Format != null) __obj.updateDynamic("Format")(Format.asInstanceOf[js.Any])
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix)
    if (ReportScope != null) __obj.updateDynamic("ReportScope")(ReportScope.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobReport]
  }
}

