package typings
package atJupyterlabServicesLib.libWorkspaceMod.WorkspaceManagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The instantiation options for a workspace manager.
  */
trait IOptions extends js.Object {
  /**
    * The server settings used to make API requests.
    */
  var serverSettings: js.UndefOr[atJupyterlabServicesLib.libServerconnectionMod.ServerConnectionNs.ISettings] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(serverSettings: atJupyterlabServicesLib.libServerconnectionMod.ServerConnectionNs.ISettings = null): IOptions = {
    val __obj = js.Dynamic.literal()
    if (serverSettings != null) __obj.updateDynamic("serverSettings")(serverSettings)
    __obj.asInstanceOf[IOptions]
  }
}

