package typings
package avoscloudDashSdkLib.avoscloudDashSdkMod.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchOptions
  extends avoscloudDashSdkLib.avoscloudDashSdkMod.SuccessFailureOptions
     with avoscloudDashSdkLib.avoscloudDashSdkMod.SilentOption
     with avoscloudDashSdkLib.avoscloudDashSdkMod.UseMasterKeyOption

object FetchOptions {
  @scala.inline
  def apply(
    error: js.Function = null,
    silent: js.UndefOr[scala.Boolean] = js.undefined,
    success: js.Function = null,
    useMasterKey: js.UndefOr[scala.Boolean] = js.undefined
  ): FetchOptions = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (success != null) __obj.updateDynamic("success")(success)
    if (!js.isUndefined(useMasterKey)) __obj.updateDynamic("useMasterKey")(useMasterKey)
    __obj.asInstanceOf[FetchOptions]
  }
}

