package typings
package appDashBuilderDashLibLib.outFrameworkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeCopyExtraFilesOptions extends js.Object {
  var appOutDir: java.lang.String
  var asarIntegrity: appDashBuilderDashLibLib.outAsarIntegrityMod.AsarIntegrity | scala.Null
  var packager: appDashBuilderDashLibLib.outMod.PlatformPackager[_]
  var platformName: java.lang.String
}

object BeforeCopyExtraFilesOptions {
  @scala.inline
  def apply(
    appOutDir: java.lang.String,
    packager: appDashBuilderDashLibLib.outMod.PlatformPackager[_],
    platformName: java.lang.String,
    asarIntegrity: appDashBuilderDashLibLib.outAsarIntegrityMod.AsarIntegrity = null
  ): BeforeCopyExtraFilesOptions = {
    val __obj = js.Dynamic.literal(appOutDir = appOutDir, packager = packager, platformName = platformName)
    if (asarIntegrity != null) __obj.updateDynamic("asarIntegrity")(asarIntegrity)
    __obj.asInstanceOf[BeforeCopyExtraFilesOptions]
  }
}

