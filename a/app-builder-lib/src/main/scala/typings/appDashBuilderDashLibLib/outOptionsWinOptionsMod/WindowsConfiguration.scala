package typings
package appDashBuilderDashLibLib.outOptionsWinOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait WindowsConfiguration extends js.Object {
  /**
    * The path to an additional certificate file you want to add to the signature block.
    */
  val additionalCertificateFile: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The path to the *.pfx certificate you want to sign with. Please use it only if you cannot use env variable `CSC_LINK` (`WIN_CSC_LINK`) for some reason.
    * Please see [Code Signing](/code-signing).
    */
  val certificateFile: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The password to the certificate provided in `certificateFile`. Please use it only if you cannot use env variable `CSC_KEY_PASSWORD` (`WIN_CSC_KEY_PASSWORD`) for some reason.
    * Please see [Code Signing](/code-signing).
    */
  val certificatePassword: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The SHA1 hash of the signing certificate. The SHA1 hash is commonly specified when multiple certificates satisfy the criteria specified by the remaining switches. Works only on Windows (or on macOS if [Parallels Desktop](https://www.parallels.com/products/desktop/) Windows 10 virtual machines exits).
    */
  val certificateSha1: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The name of the subject of the signing certificate. Required only for EV Code Signing and works only on Windows (or on macOS if [Parallels Desktop](https://www.parallels.com/products/desktop/) Windows 10 virtual machines exits).
    */
  val certificateSubjectName: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The path to application icon.
    * @default build/icon.ico
    */
  val icon: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The trademarks and registered trademarks.
    */
  val legalTrademarks: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * [The publisher name](https://github.com/electron-userland/electron-builder/issues/1187#issuecomment-278972073), exactly as in your code signed certificate. Several names can be provided.
    * Defaults to common name from your code signing certificate.
    */
  val publisherName: js.UndefOr[java.lang.String | js.Array[java.lang.String] | scala.Null] = js.undefined
  /**
    * The [security level](https://msdn.microsoft.com/en-us/library/6ad1fshk.aspx#Anchor_9) at which the application requests to be executed.
    * Cannot be specified per target, allowed only in the `win`.
    * @default asInvoker
    */
  val requestedExecutionLevel: js.UndefOr[RequestedExecutionLevel | scala.Null] = js.undefined
  /**
    * The URL of the RFC 3161 time stamp server.
    * @default http://timestamp.comodoca.com/rfc3161
    */
  val rfc3161TimeStampServer: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The custom function (or path to file or module id) to sign Windows executable.
    */
  val sign: js.UndefOr[
    appDashBuilderDashLibLib.outCodeSignWindowsCodeSignMod.CustomWindowsSign | java.lang.String | scala.Null
  ] = js.undefined
  /**
    * Whether to sign and add metadata to executable. Advanced option.
    * @default true
    */
  val signAndEditExecutable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to sign DLL files. Advanced option.
    * @see https://github.com/electron-userland/electron-builder/issues/3101#issuecomment-404212384
    * @default false
    */
  val signDlls: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Array of signing algorithms used. For AppX `sha256` is always used.
    * @default ['sha1', 'sha256']
    */
  val signingHashAlgorithms: js.UndefOr[
    (js.Array[
      appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.sha1 | appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.sha256
    ]) | scala.Null
  ] = js.undefined
  /**
    * The target package type: list of `nsis`, `nsis-web` (Web installer), `portable` ([portable](/configuration/nsis#portable) app without installation), `appx`, `msi`, `squirrel`, `7z`, `zip`, `tar.xz`, `tar.lz`, `tar.gz`, `tar.bz2`, `dir`.
    * AppX package can be built only on Windows 10.
    *
    * To use Squirrel.Windows please install `electron-builder-squirrel-windows` dependency.
    *
    * @default nsis
    */
  val target: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TargetConfigType */ js.Any
  ] = js.undefined
  /**
    * The URL of the time stamp server.
    * @default http://timestamp.digicert.com
    */
  val timeStampServer: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * Whether to verify the signature of an available update before installation.
    * The [publisher name](#publisherName) will be used for the signature verification.
    *
    * @default true
    */
  val verifyUpdateCodeSignature: js.UndefOr[scala.Boolean] = js.undefined
}

object WindowsConfiguration {
  @scala.inline
  def apply(
    additionalCertificateFile: java.lang.String = null,
    certificateFile: java.lang.String = null,
    certificatePassword: java.lang.String = null,
    certificateSha1: java.lang.String = null,
    certificateSubjectName: java.lang.String = null,
    icon: java.lang.String = null,
    legalTrademarks: java.lang.String = null,
    publisherName: java.lang.String | js.Array[java.lang.String] = null,
    requestedExecutionLevel: RequestedExecutionLevel = null,
    rfc3161TimeStampServer: java.lang.String = null,
    sign: appDashBuilderDashLibLib.outCodeSignWindowsCodeSignMod.CustomWindowsSign | java.lang.String = null,
    signAndEditExecutable: js.UndefOr[scala.Boolean] = js.undefined,
    signDlls: js.UndefOr[scala.Boolean] = js.undefined,
    signingHashAlgorithms: js.Array[
      appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.sha1 | appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.sha256
    ] = null,
    target: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TargetConfigType */ js.Any = null,
    timeStampServer: java.lang.String = null,
    verifyUpdateCodeSignature: js.UndefOr[scala.Boolean] = js.undefined
  ): WindowsConfiguration = {
    val __obj = js.Dynamic.literal()
    if (additionalCertificateFile != null) __obj.updateDynamic("additionalCertificateFile")(additionalCertificateFile)
    if (certificateFile != null) __obj.updateDynamic("certificateFile")(certificateFile)
    if (certificatePassword != null) __obj.updateDynamic("certificatePassword")(certificatePassword)
    if (certificateSha1 != null) __obj.updateDynamic("certificateSha1")(certificateSha1)
    if (certificateSubjectName != null) __obj.updateDynamic("certificateSubjectName")(certificateSubjectName)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (legalTrademarks != null) __obj.updateDynamic("legalTrademarks")(legalTrademarks)
    if (publisherName != null) __obj.updateDynamic("publisherName")(publisherName.asInstanceOf[js.Any])
    if (requestedExecutionLevel != null) __obj.updateDynamic("requestedExecutionLevel")(requestedExecutionLevel)
    if (rfc3161TimeStampServer != null) __obj.updateDynamic("rfc3161TimeStampServer")(rfc3161TimeStampServer)
    if (sign != null) __obj.updateDynamic("sign")(sign.asInstanceOf[js.Any])
    if (!js.isUndefined(signAndEditExecutable)) __obj.updateDynamic("signAndEditExecutable")(signAndEditExecutable)
    if (!js.isUndefined(signDlls)) __obj.updateDynamic("signDlls")(signDlls)
    if (signingHashAlgorithms != null) __obj.updateDynamic("signingHashAlgorithms")(signingHashAlgorithms)
    if (target != null) __obj.updateDynamic("target")(target)
    if (timeStampServer != null) __obj.updateDynamic("timeStampServer")(timeStampServer)
    if (!js.isUndefined(verifyUpdateCodeSignature)) __obj.updateDynamic("verifyUpdateCodeSignature")(verifyUpdateCodeSignature)
    __obj.asInstanceOf[WindowsConfiguration]
  }
}

