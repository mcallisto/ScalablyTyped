package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IosLobApp extends MobileLobApp {
  /** The iOS architecture for which this app can run on. */
  var applicableDeviceType: js.UndefOr[IosDeviceType] = js.undefined
  /** The build number of iOS Line of Business (LoB) app. */
  var buildNumber: js.UndefOr[java.lang.String] = js.undefined
  /** The Identity Name. */
  var bundleId: js.UndefOr[java.lang.String] = js.undefined
  /** The expiration time. */
  var expirationDateTime: js.UndefOr[java.lang.String] = js.undefined
  /** The value for the minimum applicable operating system. */
  var minimumSupportedOperatingSystem: js.UndefOr[IosMinimumOperatingSystem] = js.undefined
  /** The version number of iOS Line of Business (LoB) app. */
  var versionNumber: js.UndefOr[java.lang.String] = js.undefined
}

object IosLobApp {
  @scala.inline
  def apply(
    applicableDeviceType: IosDeviceType = null,
    assignments: js.Array[MobileAppAssignment] = null,
    buildNumber: java.lang.String = null,
    bundleId: java.lang.String = null,
    categories: js.Array[MobileAppCategory] = null,
    committedContentVersion: java.lang.String = null,
    contentVersions: js.Array[MobileAppContent] = null,
    createdDateTime: java.lang.String = null,
    description: java.lang.String = null,
    developer: java.lang.String = null,
    displayName: java.lang.String = null,
    expirationDateTime: java.lang.String = null,
    fileName: java.lang.String = null,
    id: java.lang.String = null,
    informationUrl: java.lang.String = null,
    isFeatured: js.UndefOr[scala.Boolean] = js.undefined,
    largeIcon: MimeContent = null,
    lastModifiedDateTime: java.lang.String = null,
    minimumSupportedOperatingSystem: IosMinimumOperatingSystem = null,
    notes: java.lang.String = null,
    owner: java.lang.String = null,
    privacyInformationUrl: java.lang.String = null,
    publisher: java.lang.String = null,
    publishingState: MobileAppPublishingState = null,
    size: scala.Int | scala.Double = null,
    versionNumber: java.lang.String = null
  ): IosLobApp = {
    val __obj = js.Dynamic.literal()
    if (applicableDeviceType != null) __obj.updateDynamic("applicableDeviceType")(applicableDeviceType)
    if (assignments != null) __obj.updateDynamic("assignments")(assignments)
    if (buildNumber != null) __obj.updateDynamic("buildNumber")(buildNumber)
    if (bundleId != null) __obj.updateDynamic("bundleId")(bundleId)
    if (categories != null) __obj.updateDynamic("categories")(categories)
    if (committedContentVersion != null) __obj.updateDynamic("committedContentVersion")(committedContentVersion)
    if (contentVersions != null) __obj.updateDynamic("contentVersions")(contentVersions)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (description != null) __obj.updateDynamic("description")(description)
    if (developer != null) __obj.updateDynamic("developer")(developer)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (expirationDateTime != null) __obj.updateDynamic("expirationDateTime")(expirationDateTime)
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (informationUrl != null) __obj.updateDynamic("informationUrl")(informationUrl)
    if (!js.isUndefined(isFeatured)) __obj.updateDynamic("isFeatured")(isFeatured)
    if (largeIcon != null) __obj.updateDynamic("largeIcon")(largeIcon)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (minimumSupportedOperatingSystem != null) __obj.updateDynamic("minimumSupportedOperatingSystem")(minimumSupportedOperatingSystem)
    if (notes != null) __obj.updateDynamic("notes")(notes)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (privacyInformationUrl != null) __obj.updateDynamic("privacyInformationUrl")(privacyInformationUrl)
    if (publisher != null) __obj.updateDynamic("publisher")(publisher)
    if (publishingState != null) __obj.updateDynamic("publishingState")(publishingState)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (versionNumber != null) __obj.updateDynamic("versionNumber")(versionNumber)
    __obj.asInstanceOf[IosLobApp]
  }
}

