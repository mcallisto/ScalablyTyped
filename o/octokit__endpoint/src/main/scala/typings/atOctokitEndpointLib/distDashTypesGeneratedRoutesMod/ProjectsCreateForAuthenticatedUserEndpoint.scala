package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsCreateForAuthenticatedUserEndpoint extends js.Object {
  var body: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var page: js.UndefOr[scala.Double] = js.undefined
  var per_page: js.UndefOr[scala.Double] = js.undefined
}

object ProjectsCreateForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(
    name: java.lang.String,
    body: java.lang.String = null,
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null
  ): ProjectsCreateForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(name = name)
    if (body != null) __obj.updateDynamic("body")(body)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsCreateForAuthenticatedUserEndpoint]
  }
}

