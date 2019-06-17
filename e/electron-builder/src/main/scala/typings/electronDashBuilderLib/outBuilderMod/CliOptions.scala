package typings
package electronDashBuilderLib.outBuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait CliOptions
  extends electronDashPublishLib.electronDashPublishMod.PublishOptions {
  var arch: js.UndefOr[java.lang.String] = js.undefined
  var arm64: js.UndefOr[scala.Boolean] = js.undefined
  var armv7l: js.UndefOr[scala.Boolean] = js.undefined
  var dir: js.UndefOr[scala.Boolean] = js.undefined
  var ia32: js.UndefOr[scala.Boolean] = js.undefined
  var platform: js.UndefOr[java.lang.String] = js.undefined
  var x64: js.UndefOr[scala.Boolean] = js.undefined
}

object CliOptions {
  @scala.inline
  def apply(
    arch: java.lang.String = null,
    arm64: js.UndefOr[scala.Boolean] = js.undefined,
    armv7l: js.UndefOr[scala.Boolean] = js.undefined,
    dir: js.UndefOr[scala.Boolean] = js.undefined,
    ia32: js.UndefOr[scala.Boolean] = js.undefined,
    platform: java.lang.String = null,
    publish: electronDashPublishLib.electronDashPublishMod.PublishPolicy = null,
    x64: js.UndefOr[scala.Boolean] = js.undefined
  ): CliOptions = {
    val __obj = js.Dynamic.literal()
    if (arch != null) __obj.updateDynamic("arch")(arch)
    if (!js.isUndefined(arm64)) __obj.updateDynamic("arm64")(arm64)
    if (!js.isUndefined(armv7l)) __obj.updateDynamic("armv7l")(armv7l)
    if (!js.isUndefined(dir)) __obj.updateDynamic("dir")(dir)
    if (!js.isUndefined(ia32)) __obj.updateDynamic("ia32")(ia32)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    if (publish != null) __obj.updateDynamic("publish")(publish)
    if (!js.isUndefined(x64)) __obj.updateDynamic("x64")(x64)
    __obj.asInstanceOf[CliOptions]
  }
}

