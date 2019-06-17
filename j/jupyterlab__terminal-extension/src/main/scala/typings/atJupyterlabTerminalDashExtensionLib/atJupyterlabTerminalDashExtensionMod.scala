package typings
package atJupyterlabTerminalDashExtensionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/terminal-extension", JSImport.Namespace)
@js.native
object atJupyterlabTerminalDashExtensionMod extends js.Object {
  /**
    * The default terminal extension.
    */
  val default: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify JupyterLabPlugin<ITerminalTracker> */ js.Any = js.native
  def addCommands(
    app: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify JupyterLab */ js.Any,
    services: atJupyterlabServicesLib.atJupyterlabServicesMod.ServiceManager,
    tracker: atJupyterlabApputilsLib.atJupyterlabApputilsMod.InstanceTracker[
      atJupyterlabApputilsLib.atJupyterlabApputilsMod.MainAreaWidget[atJupyterlabTerminalLib.atJupyterlabTerminalMod.Terminal]
    ]
  ): scala.Unit = js.native
}

