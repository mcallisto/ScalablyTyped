package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Organization extends DirectoryObject {
  /** The collection of service plans associated with the tenant. Not nullable. */
  var assignedPlans: js.UndefOr[js.Array[AssignedPlan]] = js.undefined
  /** Telephone number for the organization. NOTE: Although this is a string collection, only one number can be set for this property. */
  var businessPhones: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** City name of the address for the organization */
  var city: js.UndefOr[java.lang.String] = js.undefined
  /** Country/region name of the address for the organization */
  var country: js.UndefOr[java.lang.String] = js.undefined
  /** Country/region abbreviation for the organization */
  var countryLetterCode: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Timestamp of when the organization was created. The value cannot be modified and is automatically populated when the organization is created.
    * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time.
    * For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Read-only.
    */
  var createdDateTime: js.UndefOr[java.lang.String] = js.undefined
  /** The display name for the tenant. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** The collection of open extensions defined for the organization. Read-only. Nullable. */
  var extensions: js.UndefOr[js.Array[Extension]] = js.undefined
  /** Not nullable. */
  var marketingNotificationEmails: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Mobile device management authority. Possible values are: unknown, intune, sccm, office365. */
  var mobileDeviceManagementAuthority: js.UndefOr[MdmAuthority] = js.undefined
  /**
    * The time and date at which the tenant was last synced with the on-premise directory. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time.
    * For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Read-only.
    */
  var onPremisesLastSyncDateTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * true if this object is synced from an on-premises directory; false if this object was originally synced from an on-premises directory but is no longer synced;
    * null if this object has never been synced from an on-premises directory (default).
    */
  var onPremisesSyncEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Postal code of the address for the organization */
  var postalCode: js.UndefOr[java.lang.String] = js.undefined
  /** The preferred language for the organization. Should follow ISO 639-1 Code; for example 'en'. */
  var preferredLanguage: js.UndefOr[java.lang.String] = js.undefined
  /** The privacy profile of an organization. */
  var privacyProfile: js.UndefOr[PrivacyProfile] = js.undefined
  /** Not nullable. */
  var provisionedPlans: js.UndefOr[js.Array[ProvisionedPlan]] = js.undefined
  var securityComplianceNotificationMails: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var securityComplianceNotificationPhones: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** State name of the address for the organization */
  var state: js.UndefOr[java.lang.String] = js.undefined
  /** Street name of the address for organization */
  var street: js.UndefOr[java.lang.String] = js.undefined
  /** Not nullable. */
  var technicalNotificationMails: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The collection of domains associated with this tenant. Not nullable. */
  var verifiedDomains: js.UndefOr[js.Array[VerifiedDomain]] = js.undefined
}

object Organization {
  @scala.inline
  def apply(
    assignedPlans: js.Array[AssignedPlan] = null,
    businessPhones: js.Array[java.lang.String] = null,
    city: java.lang.String = null,
    country: java.lang.String = null,
    countryLetterCode: java.lang.String = null,
    createdDateTime: java.lang.String = null,
    deletedDateTime: java.lang.String = null,
    displayName: java.lang.String = null,
    extensions: js.Array[Extension] = null,
    id: java.lang.String = null,
    marketingNotificationEmails: js.Array[java.lang.String] = null,
    mobileDeviceManagementAuthority: MdmAuthority = null,
    onPremisesLastSyncDateTime: java.lang.String = null,
    onPremisesSyncEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    postalCode: java.lang.String = null,
    preferredLanguage: java.lang.String = null,
    privacyProfile: PrivacyProfile = null,
    provisionedPlans: js.Array[ProvisionedPlan] = null,
    securityComplianceNotificationMails: js.Array[java.lang.String] = null,
    securityComplianceNotificationPhones: js.Array[java.lang.String] = null,
    state: java.lang.String = null,
    street: java.lang.String = null,
    technicalNotificationMails: js.Array[java.lang.String] = null,
    verifiedDomains: js.Array[VerifiedDomain] = null
  ): Organization = {
    val __obj = js.Dynamic.literal()
    if (assignedPlans != null) __obj.updateDynamic("assignedPlans")(assignedPlans)
    if (businessPhones != null) __obj.updateDynamic("businessPhones")(businessPhones)
    if (city != null) __obj.updateDynamic("city")(city)
    if (country != null) __obj.updateDynamic("country")(country)
    if (countryLetterCode != null) __obj.updateDynamic("countryLetterCode")(countryLetterCode)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (deletedDateTime != null) __obj.updateDynamic("deletedDateTime")(deletedDateTime)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (id != null) __obj.updateDynamic("id")(id)
    if (marketingNotificationEmails != null) __obj.updateDynamic("marketingNotificationEmails")(marketingNotificationEmails)
    if (mobileDeviceManagementAuthority != null) __obj.updateDynamic("mobileDeviceManagementAuthority")(mobileDeviceManagementAuthority)
    if (onPremisesLastSyncDateTime != null) __obj.updateDynamic("onPremisesLastSyncDateTime")(onPremisesLastSyncDateTime)
    if (!js.isUndefined(onPremisesSyncEnabled)) __obj.updateDynamic("onPremisesSyncEnabled")(onPremisesSyncEnabled)
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode)
    if (preferredLanguage != null) __obj.updateDynamic("preferredLanguage")(preferredLanguage)
    if (privacyProfile != null) __obj.updateDynamic("privacyProfile")(privacyProfile)
    if (provisionedPlans != null) __obj.updateDynamic("provisionedPlans")(provisionedPlans)
    if (securityComplianceNotificationMails != null) __obj.updateDynamic("securityComplianceNotificationMails")(securityComplianceNotificationMails)
    if (securityComplianceNotificationPhones != null) __obj.updateDynamic("securityComplianceNotificationPhones")(securityComplianceNotificationPhones)
    if (state != null) __obj.updateDynamic("state")(state)
    if (street != null) __obj.updateDynamic("street")(street)
    if (technicalNotificationMails != null) __obj.updateDynamic("technicalNotificationMails")(technicalNotificationMails)
    if (verifiedDomains != null) __obj.updateDynamic("verifiedDomains")(verifiedDomains)
    __obj.asInstanceOf[Organization]
  }
}

