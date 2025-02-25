package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateHookParamsConfig extends js.Object {
  var content_type: js.UndefOr[java.lang.String] = js.undefined
  var insecure_ssl: js.UndefOr[java.lang.String] = js.undefined
  var secret: js.UndefOr[java.lang.String] = js.undefined
  var url: java.lang.String
}

object ReposCreateHookParamsConfig {
  @scala.inline
  def apply(
    url: java.lang.String,
    content_type: java.lang.String = null,
    insecure_ssl: java.lang.String = null,
    secret: java.lang.String = null
  ): ReposCreateHookParamsConfig = {
    val __obj = js.Dynamic.literal(url = url)
    if (content_type != null) __obj.updateDynamic("content_type")(content_type)
    if (insecure_ssl != null) __obj.updateDynamic("insecure_ssl")(insecure_ssl)
    if (secret != null) __obj.updateDynamic("secret")(secret)
    __obj.asInstanceOf[ReposCreateHookParamsConfig]
  }
}

