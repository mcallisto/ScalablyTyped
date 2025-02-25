package typings
package ngDashDialogLib.ngDashDialogMod.angularMod.dialogNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDialogConfirmScope extends IDialogScope {
  /**
  			 * Use this method to close the dialog and resolve the promise that was returned when opening the modal.
  			 *
  			 * The function accepts a single optional parameter which is used as the value of the resolved promise.
  			 * @param {any} [value] - The value with which the promise will resolve
  			 */
  def confirm(): scala.Unit = js.native
  def confirm(value: js.Any): scala.Unit = js.native
}

