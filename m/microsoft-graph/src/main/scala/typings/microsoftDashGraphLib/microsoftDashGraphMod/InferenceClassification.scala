package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InferenceClassification extends Entity {
  /** A set of overrides for a user to always classify messages from specific senders in certain ways: focused, or other. Read-only. Nullable. */
  var overrides: js.UndefOr[js.Array[InferenceClassificationOverride]] = js.undefined
}

object InferenceClassification {
  @scala.inline
  def apply(id: java.lang.String = null, overrides: js.Array[InferenceClassificationOverride] = null): InferenceClassification = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    __obj.asInstanceOf[InferenceClassification]
  }
}

