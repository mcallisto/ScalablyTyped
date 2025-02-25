package typings
package winrtLib.WindowsNs.ApplicationModelNs.DataTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.DataTransfer.DataTransferManager")
@js.native
class DataTransferManager () extends IDataTransferManager {
  /* CompleteClass */
  override var ondatarequested: js.Any = js.native
  /* CompleteClass */
  override var ontargetapplicationchosen: js.Any = js.native
}

/* static members */
@JSGlobal("Windows.ApplicationModel.DataTransfer.DataTransferManager")
@js.native
object DataTransferManager extends js.Object {
  def getForCurrentView(): winrtLib.WindowsNs.ApplicationModelNs.DataTransferNs.DataTransferManager = js.native
  def showShareUI(): scala.Unit = js.native
}

