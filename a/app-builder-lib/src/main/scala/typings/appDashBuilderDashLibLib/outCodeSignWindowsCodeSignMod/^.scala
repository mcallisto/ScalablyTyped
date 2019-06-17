package typings
package appDashBuilderDashLibLib.outCodeSignWindowsCodeSignMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/codeSign/windowsCodeSign", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getCertInfo(file: java.lang.String, password: java.lang.String): js.Promise[CertificateInfo] = js.native
  def getCertificateFromStoreInfo(
    options: appDashBuilderDashLibLib.outOptionsWinOptionsMod.WindowsConfiguration,
    vm: appDashBuilderDashLibLib.outVmVmMod.VmManager
  ): js.Promise[CertificateFromStoreInfo] = js.native
  def getSignVendorPath(): js.Promise[java.lang.String] = js.native
  def sign(options: WindowsSignOptions, packager: appDashBuilderDashLibLib.outWinPackagerMod.WinPackager): js.Promise[scala.Unit] = js.native
}

