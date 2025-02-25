package typings
package awsDashSdkLib.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionState extends js.Object {
  /**
    * The user-specified reason why the transition between two stages of a pipeline was disabled.
    */
  var disabledReason: js.UndefOr[DisabledReason] = js.undefined
  /**
    * Whether the transition between stages is enabled (true) or disabled (false).
    */
  var enabled: js.UndefOr[Enabled] = js.undefined
  /**
    * The timestamp when the transition state was last changed.
    */
  var lastChangedAt: js.UndefOr[LastChangedAt] = js.undefined
  /**
    * The ID of the user who last changed the transition state.
    */
  var lastChangedBy: js.UndefOr[LastChangedBy] = js.undefined
}

object TransitionState {
  @scala.inline
  def apply(
    disabledReason: DisabledReason = null,
    enabled: js.UndefOr[Enabled] = js.undefined,
    lastChangedAt: LastChangedAt = null,
    lastChangedBy: LastChangedBy = null
  ): TransitionState = {
    val __obj = js.Dynamic.literal()
    if (disabledReason != null) __obj.updateDynamic("disabledReason")(disabledReason)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (lastChangedAt != null) __obj.updateDynamic("lastChangedAt")(lastChangedAt)
    if (lastChangedBy != null) __obj.updateDynamic("lastChangedBy")(lastChangedBy)
    __obj.asInstanceOf[TransitionState]
  }
}

