package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetJobResponse extends js.Object {
  /**
    * Each job converts an input file into an output file or files. For more information, see the User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
    */
  var Job: js.UndefOr[Job] = js.undefined
}

object GetJobResponse {
  @scala.inline
  def apply(Job: Job = null): GetJobResponse = {
    val __obj = js.Dynamic.literal()
    if (Job != null) __obj.updateDynamic("Job")(Job)
    __obj.asInstanceOf[GetJobResponse]
  }
}

