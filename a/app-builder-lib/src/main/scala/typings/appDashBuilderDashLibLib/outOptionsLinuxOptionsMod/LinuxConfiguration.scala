package typings
package appDashBuilderDashLibLib.outOptionsLinuxOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinuxConfiguration
  extends appDashBuilderDashLibLib.outOptionsPlatformSpecificBuildOptionsMod.PlatformSpecificBuildOptions
     with CommonLinuxOptions {
  /**
    * @deprecated
    * @private
    */
  val depends: js.UndefOr[js.Array[java.lang.String] | scala.Null] = js.undefined
  /**
    * The executable name. Defaults to `productName`.
    * Cannot be specified per target, allowed only in the `linux`.
    */
  val executableName: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The path to icon set directory or one png file, relative to the [build resources](/configuration/configuration#MetadataDirectories-buildResources) or to the project directory. The icon filename must contain the size (e.g. 32x32.png) of the icon.
    * By default will be generated automatically based on the macOS icns file.
    */
  @JSName("icon")
  val icon_LinuxConfiguration: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The maintainer. Defaults to [author](/configuration/configuration#Metadata-author).
    */
  val maintainer: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * backward compatibility + to allow specify fpm-only category for all possible fpm targets in one place
    * @private
    */
  val packageCategory: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * Target package type: list of `AppImage`, `snap`, `deb`, `rpm`, `freebsd`, `pacman`, `p5p`, `apk`, `7z`, `zip`, `tar.xz`, `tar.lz`, `tar.gz`, `tar.bz2`, `dir`.
    *
    * electron-builder [docker image](/multi-platform-build#docker) can be used to build Linux targets on any platform.
    *
    * Please [do not put an AppImage into another archive](https://github.com/probonopd/AppImageKit/wiki/Creating-AppImages#common-mistake) like a .zip or .tar.gz.
    * @default AppImage
    */
  @JSName("target")
  val target_LinuxConfiguration: js.UndefOr[appDashBuilderDashLibLib.outCoreMod.TargetConfigType] = js.undefined
  /**
    * The vendor. Defaults to [author](/configuration/configuration#Metadata-author).
    */
  val vendor: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object LinuxConfiguration {
  @scala.inline
  def apply(
    appId: java.lang.String = null,
    artifactName: java.lang.String = null,
    asar: appDashBuilderDashLibLib.outOptionsPlatformSpecificBuildOptionsMod.AsarOptions | scala.Boolean = null,
    asarUnpack: js.Array[java.lang.String] | java.lang.String = null,
    category: java.lang.String = null,
    compression: appDashBuilderDashLibLib.outCoreMod.CompressionLevel = null,
    cscKeyPassword: java.lang.String = null,
    cscLink: java.lang.String = null,
    depends: js.Array[java.lang.String] = null,
    description: java.lang.String = null,
    desktop: js.Any = null,
    detectUpdateChannel: js.UndefOr[scala.Boolean] = js.undefined,
    electronUpdaterCompatibility: java.lang.String = null,
    executableName: java.lang.String = null,
    extraFiles: (js.Array[
      appDashBuilderDashLibLib.outOptionsPlatformSpecificBuildOptionsMod.FileSet | java.lang.String
    ]) | appDashBuilderDashLibLib.outOptionsPlatformSpecificBuildOptionsMod.FileSet | java.lang.String = null,
    extraResources: (js.Array[
      appDashBuilderDashLibLib.outOptionsPlatformSpecificBuildOptionsMod.FileSet | java.lang.String
    ]) | appDashBuilderDashLibLib.outOptionsPlatformSpecificBuildOptionsMod.FileSet | java.lang.String = null,
    fileAssociations: js.Array[appDashBuilderDashLibLib.outOptionsFileAssociationMod.FileAssociation] | appDashBuilderDashLibLib.outOptionsFileAssociationMod.FileAssociation = null,
    files: (js.Array[
      appDashBuilderDashLibLib.outOptionsPlatformSpecificBuildOptionsMod.FileSet | java.lang.String
    ]) | appDashBuilderDashLibLib.outOptionsPlatformSpecificBuildOptionsMod.FileSet | java.lang.String = null,
    forceCodeSigning: js.UndefOr[scala.Boolean] = js.undefined,
    generateUpdatesFilesForAllChannels: js.UndefOr[scala.Boolean] = js.undefined,
    icon: java.lang.String = null,
    maintainer: java.lang.String = null,
    mimeTypes: js.Array[java.lang.String] = null,
    packageCategory: java.lang.String = null,
    protocols: js.Array[appDashBuilderDashLibLib.outOptionsPlatformSpecificBuildOptionsMod.Protocol] | appDashBuilderDashLibLib.outOptionsPlatformSpecificBuildOptionsMod.Protocol = null,
    publish: builderDashUtilDashRuntimeLib.outPublishOptionsMod.Publish = null,
    releaseInfo: appDashBuilderDashLibLib.outOptionsPlatformSpecificBuildOptionsMod.ReleaseInfo = null,
    synopsis: java.lang.String = null,
    target: appDashBuilderDashLibLib.outCoreMod.TargetConfigType = null,
    vendor: java.lang.String = null
  ): LinuxConfiguration = {
    val __obj = js.Dynamic.literal()
    if (appId != null) __obj.updateDynamic("appId")(appId)
    if (artifactName != null) __obj.updateDynamic("artifactName")(artifactName)
    if (asar != null) __obj.updateDynamic("asar")(asar.asInstanceOf[js.Any])
    if (asarUnpack != null) __obj.updateDynamic("asarUnpack")(asarUnpack.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category)
    if (compression != null) __obj.updateDynamic("compression")(compression)
    if (cscKeyPassword != null) __obj.updateDynamic("cscKeyPassword")(cscKeyPassword)
    if (cscLink != null) __obj.updateDynamic("cscLink")(cscLink)
    if (depends != null) __obj.updateDynamic("depends")(depends)
    if (description != null) __obj.updateDynamic("description")(description)
    if (desktop != null) __obj.updateDynamic("desktop")(desktop)
    if (!js.isUndefined(detectUpdateChannel)) __obj.updateDynamic("detectUpdateChannel")(detectUpdateChannel)
    if (electronUpdaterCompatibility != null) __obj.updateDynamic("electronUpdaterCompatibility")(electronUpdaterCompatibility)
    if (executableName != null) __obj.updateDynamic("executableName")(executableName)
    if (extraFiles != null) __obj.updateDynamic("extraFiles")(extraFiles.asInstanceOf[js.Any])
    if (extraResources != null) __obj.updateDynamic("extraResources")(extraResources.asInstanceOf[js.Any])
    if (fileAssociations != null) __obj.updateDynamic("fileAssociations")(fileAssociations.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (!js.isUndefined(forceCodeSigning)) __obj.updateDynamic("forceCodeSigning")(forceCodeSigning)
    if (!js.isUndefined(generateUpdatesFilesForAllChannels)) __obj.updateDynamic("generateUpdatesFilesForAllChannels")(generateUpdatesFilesForAllChannels)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (maintainer != null) __obj.updateDynamic("maintainer")(maintainer)
    if (mimeTypes != null) __obj.updateDynamic("mimeTypes")(mimeTypes)
    if (packageCategory != null) __obj.updateDynamic("packageCategory")(packageCategory)
    if (protocols != null) __obj.updateDynamic("protocols")(protocols.asInstanceOf[js.Any])
    if (publish != null) __obj.updateDynamic("publish")(publish.asInstanceOf[js.Any])
    if (releaseInfo != null) __obj.updateDynamic("releaseInfo")(releaseInfo)
    if (synopsis != null) __obj.updateDynamic("synopsis")(synopsis)
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (vendor != null) __obj.updateDynamic("vendor")(vendor)
    __obj.asInstanceOf[LinuxConfiguration]
  }
}

