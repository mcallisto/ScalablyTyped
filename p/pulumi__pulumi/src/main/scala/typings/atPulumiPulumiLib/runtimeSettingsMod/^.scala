package typings
package atPulumiPulumiLib.runtimeSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/runtime/settings", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var excessiveDebugOutput: scala.Boolean = js.native
  def disconnect(): scala.Unit = js.native
  def disconnectSync(): scala.Unit = js.native
  def getEngine(): js.UndefOr[js.Object] = js.native
  def getMonitor(): js.UndefOr[js.Object] = js.native
  def getProject(): java.lang.String = js.native
  def getRootResource(): js.Promise[js.UndefOr[atPulumiPulumiLib.resourceMod.URN]] = js.native
  def getStack(): java.lang.String = js.native
  def hasMonitor(): scala.Boolean = js.native
  def isDryRun(): scala.Boolean = js.native
  def isQueryMode(): scala.Boolean = js.native
  def isTestModeEnabled(): scala.Boolean = js.native
  def monitorSupportsSecrets(): js.Promise[scala.Boolean] = js.native
  def rpcKeepAlive(): js.Function0[scala.Unit] = js.native
  def serialize(): scala.Boolean = js.native
  def setRootResource(res: atPulumiPulumiLib.resourceMod.ComponentResource): js.Promise[scala.Unit] = js.native
}

