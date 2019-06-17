package typings
package atJupyterlabApplicationLib.libMimerenderersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/application/lib/mimerenderers", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val IMimeDocumentTracker: atPhosphorCoreutilsLib.atPhosphorCoreutilsMod.Token[IMimeDocumentTracker] = js.native
  def createRendermimePlugin(
    tracker: atJupyterlabApputilsLib.atJupyterlabApputilsMod.InstanceTracker[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify MimeDocument */ _
    ],
    item: atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IExtension
  ): atJupyterlabApplicationLib.libMod.JupyterLabPlugin[scala.Unit] = js.native
  def createRendermimePlugins(
    extensions: js.Array[
      atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IExtensionModule
    ]
  ): js.Array[
    atJupyterlabApplicationLib.libMod.JupyterLabPlugin[scala.Unit | IMimeDocumentTracker]
  ] = js.native
}

