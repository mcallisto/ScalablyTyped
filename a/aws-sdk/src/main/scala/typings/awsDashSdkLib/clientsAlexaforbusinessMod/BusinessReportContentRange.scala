package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BusinessReportContentRange extends js.Object {
  /**
    * The interval of the content range.
    */
  var Interval: js.UndefOr[BusinessReportInterval] = js.undefined
}

object BusinessReportContentRange {
  @scala.inline
  def apply(Interval: BusinessReportInterval = null): BusinessReportContentRange = {
    val __obj = js.Dynamic.literal()
    if (Interval != null) __obj.updateDynamic("Interval")(Interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[BusinessReportContentRange]
  }
}

