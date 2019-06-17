package typings
package appDashBuilderDashLibLib.outFrameworkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrepareApplicationStageDirectoryOptions extends js.Object {
  /**
    * Platform doesn't process application output directory in any way. Unpack implementation must create or empty dir if need.
    */
  val appOutDir: java.lang.String
  val arch: java.lang.String
  val packager: appDashBuilderDashLibLib.outMod.PlatformPackager[_]
  val platformName: appDashBuilderDashLibLib.outElectronElectronFrameworkMod.ElectronPlatformName
  val version: java.lang.String
}

object PrepareApplicationStageDirectoryOptions {
  @scala.inline
  def apply(
    appOutDir: java.lang.String,
    arch: java.lang.String,
    packager: appDashBuilderDashLibLib.outMod.PlatformPackager[_],
    platformName: appDashBuilderDashLibLib.outElectronElectronFrameworkMod.ElectronPlatformName,
    version: java.lang.String
  ): PrepareApplicationStageDirectoryOptions = {
    val __obj = js.Dynamic.literal(appOutDir = appOutDir, arch = arch, packager = packager, platformName = platformName, version = version)
  
    __obj.asInstanceOf[PrepareApplicationStageDirectoryOptions]
  }
}

