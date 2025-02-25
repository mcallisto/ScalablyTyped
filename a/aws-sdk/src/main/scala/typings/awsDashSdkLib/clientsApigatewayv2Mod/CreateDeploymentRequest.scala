package typings
package awsDashSdkLib.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDeploymentRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: __string
  /**
    * The description for the deployment resource.
    */
  var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
  /**
    * The name of the Stage resource for the Deployment
    resource to create.
    */
  var StageName: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
}

object CreateDeploymentRequest {
  @scala.inline
  def apply(
    ApiId: __string,
    Description: StringWithLengthBetween0And1024 = null,
    StageName: StringWithLengthBetween1And128 = null
  ): CreateDeploymentRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (StageName != null) __obj.updateDynamic("StageName")(StageName)
    __obj.asInstanceOf[CreateDeploymentRequest]
  }
}

