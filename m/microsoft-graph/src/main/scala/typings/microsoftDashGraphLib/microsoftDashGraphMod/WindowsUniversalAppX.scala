package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowsUniversalAppX extends MobileLobApp {
  /** The Windows architecture(s) for which this app can run on. Possible values are: none, x86, x64, arm, neutral. */
  var applicableArchitectures: js.UndefOr[WindowsArchitecture] = js.undefined
  /** The Windows device type(s) for which this app can run on. Possible values are: none, desktop, mobile, holographic, team. */
  var applicableDeviceTypes: js.UndefOr[WindowsDeviceType] = js.undefined
  /** The Identity Name. */
  var identityName: js.UndefOr[java.lang.String] = js.undefined
  /** The Identity Publisher Hash. */
  var identityPublisherHash: js.UndefOr[java.lang.String] = js.undefined
  /** The Identity Resource Identifier. */
  var identityResourceIdentifier: js.UndefOr[java.lang.String] = js.undefined
  /** The identity version. */
  var identityVersion: js.UndefOr[java.lang.String] = js.undefined
  /** Whether or not the app is a bundle. */
  var isBundle: js.UndefOr[scala.Boolean] = js.undefined
  /** The value for the minimum applicable operating system. */
  var minimumSupportedOperatingSystem: js.UndefOr[WindowsMinimumOperatingSystem] = js.undefined
}

object WindowsUniversalAppX {
  @scala.inline
  def apply(
    applicableArchitectures: WindowsArchitecture = null,
    applicableDeviceTypes: WindowsDeviceType = null,
    assignments: js.Array[MobileAppAssignment] = null,
    categories: js.Array[MobileAppCategory] = null,
    committedContentVersion: java.lang.String = null,
    contentVersions: js.Array[MobileAppContent] = null,
    createdDateTime: java.lang.String = null,
    description: java.lang.String = null,
    developer: java.lang.String = null,
    displayName: java.lang.String = null,
    fileName: java.lang.String = null,
    id: java.lang.String = null,
    identityName: java.lang.String = null,
    identityPublisherHash: java.lang.String = null,
    identityResourceIdentifier: java.lang.String = null,
    identityVersion: java.lang.String = null,
    informationUrl: java.lang.String = null,
    isBundle: js.UndefOr[scala.Boolean] = js.undefined,
    isFeatured: js.UndefOr[scala.Boolean] = js.undefined,
    largeIcon: MimeContent = null,
    lastModifiedDateTime: java.lang.String = null,
    minimumSupportedOperatingSystem: WindowsMinimumOperatingSystem = null,
    notes: java.lang.String = null,
    owner: java.lang.String = null,
    privacyInformationUrl: java.lang.String = null,
    publisher: java.lang.String = null,
    publishingState: MobileAppPublishingState = null,
    size: scala.Int | scala.Double = null
  ): WindowsUniversalAppX = {
    val __obj = js.Dynamic.literal()
    if (applicableArchitectures != null) __obj.updateDynamic("applicableArchitectures")(applicableArchitectures)
    if (applicableDeviceTypes != null) __obj.updateDynamic("applicableDeviceTypes")(applicableDeviceTypes)
    if (assignments != null) __obj.updateDynamic("assignments")(assignments)
    if (categories != null) __obj.updateDynamic("categories")(categories)
    if (committedContentVersion != null) __obj.updateDynamic("committedContentVersion")(committedContentVersion)
    if (contentVersions != null) __obj.updateDynamic("contentVersions")(contentVersions)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (description != null) __obj.updateDynamic("description")(description)
    if (developer != null) __obj.updateDynamic("developer")(developer)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identityName != null) __obj.updateDynamic("identityName")(identityName)
    if (identityPublisherHash != null) __obj.updateDynamic("identityPublisherHash")(identityPublisherHash)
    if (identityResourceIdentifier != null) __obj.updateDynamic("identityResourceIdentifier")(identityResourceIdentifier)
    if (identityVersion != null) __obj.updateDynamic("identityVersion")(identityVersion)
    if (informationUrl != null) __obj.updateDynamic("informationUrl")(informationUrl)
    if (!js.isUndefined(isBundle)) __obj.updateDynamic("isBundle")(isBundle)
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
    __obj.asInstanceOf[WindowsUniversalAppX]
  }
}

