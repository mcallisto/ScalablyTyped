package typings
package awsDashSdkLib.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSolutionVersionResponse extends js.Object {
  /**
    * The ARN of the new solution version.
    */
  var solutionVersionArn: js.UndefOr[Arn] = js.undefined
}

object CreateSolutionVersionResponse {
  @scala.inline
  def apply(solutionVersionArn: Arn = null): CreateSolutionVersionResponse = {
    val __obj = js.Dynamic.literal()
    if (solutionVersionArn != null) __obj.updateDynamic("solutionVersionArn")(solutionVersionArn)
    __obj.asInstanceOf[CreateSolutionVersionResponse]
  }
}

