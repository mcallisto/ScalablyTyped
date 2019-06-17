package typings
package atGoogleDashCloudPubsubLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FlowControl extends js.Object {
  var flowControl: js.UndefOr[atGoogleDashCloudPubsubLib.buildSrcLeaseDashManagerMod.FlowControlOptions] = js.undefined
  var gaxOpts: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CallOptions */ js.Any
  ] = js.undefined
}

object Anon_FlowControl {
  @scala.inline
  def apply(
    flowControl: atGoogleDashCloudPubsubLib.buildSrcLeaseDashManagerMod.FlowControlOptions = null,
    gaxOpts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CallOptions */ js.Any = null
  ): Anon_FlowControl = {
    val __obj = js.Dynamic.literal()
    if (flowControl != null) __obj.updateDynamic("flowControl")(flowControl)
    if (gaxOpts != null) __obj.updateDynamic("gaxOpts")(gaxOpts)
    __obj.asInstanceOf[Anon_FlowControl]
  }
}

