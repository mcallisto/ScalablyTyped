package typings
package awsDashSdkLib.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeSolutionVersionResponse extends js.Object {
  /**
    * The solution version.
    */
  var solutionVersion: js.UndefOr[SolutionVersion] = js.undefined
}

object DescribeSolutionVersionResponse {
  @scala.inline
  def apply(solutionVersion: SolutionVersion = null): DescribeSolutionVersionResponse = {
    val __obj = js.Dynamic.literal()
    if (solutionVersion != null) __obj.updateDynamic("solutionVersion")(solutionVersion)
    __obj.asInstanceOf[DescribeSolutionVersionResponse]
  }
}

