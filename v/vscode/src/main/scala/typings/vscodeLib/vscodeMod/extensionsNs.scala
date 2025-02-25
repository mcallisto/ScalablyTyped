package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "extensions")
@js.native
object extensionsNs extends js.Object {
  val all: js.Array[vscodeLib.vscodeMod.Extension[js.Any]] = js.native
  val onDidChange: vscodeLib.vscodeMod.Event[scala.Unit] = js.native
  def getExtension(extensionId: java.lang.String): js.UndefOr[vscodeLib.vscodeMod.Extension[_]] = js.native
  @JSName("getExtension")
  def getExtension_T[T](extensionId: java.lang.String): js.UndefOr[vscodeLib.vscodeMod.Extension[T]] = js.native
}

