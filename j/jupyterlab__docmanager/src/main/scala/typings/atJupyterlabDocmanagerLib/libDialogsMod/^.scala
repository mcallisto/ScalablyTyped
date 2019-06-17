package typings
package atJupyterlabDocmanagerLib.libDialogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/docmanager/lib/dialogs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getOpenPath(contentsManager: js.Any): js.Promise[js.UndefOr[java.lang.String]] = js.native
  def isValidFileName(name: java.lang.String): scala.Boolean = js.native
  def renameDialog(
    manager: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify IDocumentManager */ js.Any,
    oldPath: java.lang.String
  ): js.Promise[atJupyterlabServicesLib.libContentsMod.ContentsNs.IModel | scala.Null] = js.native
  def renameFile(
    manager: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify IDocumentManager */ js.Any,
    oldPath: java.lang.String,
    newPath: java.lang.String
  ): js.Promise[atJupyterlabServicesLib.libContentsMod.ContentsNs.IModel | scala.Null] = js.native
  def shouldOverwrite(path: java.lang.String): js.Promise[scala.Boolean] = js.native
}

