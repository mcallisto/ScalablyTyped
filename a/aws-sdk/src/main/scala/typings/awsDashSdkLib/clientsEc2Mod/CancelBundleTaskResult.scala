package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelBundleTaskResult extends js.Object {
  /**
    * Information about the bundle task.
    */
  var BundleTask: js.UndefOr[BundleTask] = js.undefined
}

object CancelBundleTaskResult {
  @scala.inline
  def apply(BundleTask: BundleTask = null): CancelBundleTaskResult = {
    val __obj = js.Dynamic.literal()
    if (BundleTask != null) __obj.updateDynamic("BundleTask")(BundleTask)
    __obj.asInstanceOf[CancelBundleTaskResult]
  }
}

