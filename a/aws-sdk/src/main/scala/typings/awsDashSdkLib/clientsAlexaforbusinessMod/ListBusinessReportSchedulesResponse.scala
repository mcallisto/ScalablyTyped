package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBusinessReportSchedulesResponse extends js.Object {
  /**
    * The schedule of the reports.
    */
  var BusinessReportSchedules: js.UndefOr[BusinessReportScheduleList] = js.undefined
  /**
    * The token used to list the remaining schedules from the previous API call.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object ListBusinessReportSchedulesResponse {
  @scala.inline
  def apply(BusinessReportSchedules: BusinessReportScheduleList = null, NextToken: NextToken = null): ListBusinessReportSchedulesResponse = {
    val __obj = js.Dynamic.literal()
    if (BusinessReportSchedules != null) __obj.updateDynamic("BusinessReportSchedules")(BusinessReportSchedules)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListBusinessReportSchedulesResponse]
  }
}

