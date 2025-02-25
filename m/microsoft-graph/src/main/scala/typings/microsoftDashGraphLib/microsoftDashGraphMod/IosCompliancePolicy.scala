package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IosCompliancePolicy extends DeviceCompliancePolicy {
  /** Require that devices have enabled device threat protection . */
  var deviceThreatProtectionEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Require Mobile Threat Protection minimum risk level to report noncompliance. Possible values are: unavailable, secured, low, medium, high, notSet. */
  var deviceThreatProtectionRequiredSecurityLevel: js.UndefOr[DeviceThreatProtectionLevel] = js.undefined
  /** Indicates whether or not to require a managed email profile. */
  var managedEmailProfileRequired: js.UndefOr[scala.Boolean] = js.undefined
  /** Maximum IOS version. */
  var osMaximumVersion: js.UndefOr[java.lang.String] = js.undefined
  /** Minimum IOS version. */
  var osMinimumVersion: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates whether or not to block simple passcodes. */
  var passcodeBlockSimple: js.UndefOr[scala.Boolean] = js.undefined
  /** Number of days before the passcode expires. Valid values 1 to 65535 */
  var passcodeExpirationDays: js.UndefOr[scala.Double] = js.undefined
  /** The number of character sets required in the password. */
  var passcodeMinimumCharacterSetCount: js.UndefOr[scala.Double] = js.undefined
  /** Minimum length of passcode. Valid values 4 to 14 */
  var passcodeMinimumLength: js.UndefOr[scala.Double] = js.undefined
  /** Minutes of inactivity before a passcode is required. */
  var passcodeMinutesOfInactivityBeforeLock: js.UndefOr[scala.Double] = js.undefined
  /** Number of previous passcodes to block. Valid values 1 to 24 */
  var passcodePreviousPasscodeBlockCount: js.UndefOr[scala.Double] = js.undefined
  /** Indicates whether or not to require a passcode. */
  var passcodeRequired: js.UndefOr[scala.Boolean] = js.undefined
  /** The required passcode type. Possible values are: deviceDefault, alphanumeric, numeric. */
  var passcodeRequiredType: js.UndefOr[RequiredPasswordType] = js.undefined
  /** Devices must not be jailbroken or rooted. */
  var securityBlockJailbrokenDevices: js.UndefOr[scala.Boolean] = js.undefined
}

object IosCompliancePolicy {
  @scala.inline
  def apply(
    assignments: js.Array[DeviceCompliancePolicyAssignment] = null,
    createdDateTime: java.lang.String = null,
    description: java.lang.String = null,
    deviceSettingStateSummaries: js.Array[SettingStateDeviceSummary] = null,
    deviceStatusOverview: DeviceComplianceDeviceOverview = null,
    deviceStatuses: js.Array[DeviceComplianceDeviceStatus] = null,
    deviceThreatProtectionEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    deviceThreatProtectionRequiredSecurityLevel: DeviceThreatProtectionLevel = null,
    displayName: java.lang.String = null,
    id: java.lang.String = null,
    lastModifiedDateTime: java.lang.String = null,
    managedEmailProfileRequired: js.UndefOr[scala.Boolean] = js.undefined,
    osMaximumVersion: java.lang.String = null,
    osMinimumVersion: java.lang.String = null,
    passcodeBlockSimple: js.UndefOr[scala.Boolean] = js.undefined,
    passcodeExpirationDays: scala.Int | scala.Double = null,
    passcodeMinimumCharacterSetCount: scala.Int | scala.Double = null,
    passcodeMinimumLength: scala.Int | scala.Double = null,
    passcodeMinutesOfInactivityBeforeLock: scala.Int | scala.Double = null,
    passcodePreviousPasscodeBlockCount: scala.Int | scala.Double = null,
    passcodeRequired: js.UndefOr[scala.Boolean] = js.undefined,
    passcodeRequiredType: RequiredPasswordType = null,
    scheduledActionsForRule: js.Array[DeviceComplianceScheduledActionForRule] = null,
    securityBlockJailbrokenDevices: js.UndefOr[scala.Boolean] = js.undefined,
    userStatusOverview: DeviceComplianceUserOverview = null,
    userStatuses: js.Array[DeviceComplianceUserStatus] = null,
    version: scala.Int | scala.Double = null
  ): IosCompliancePolicy = {
    val __obj = js.Dynamic.literal()
    if (assignments != null) __obj.updateDynamic("assignments")(assignments)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (description != null) __obj.updateDynamic("description")(description)
    if (deviceSettingStateSummaries != null) __obj.updateDynamic("deviceSettingStateSummaries")(deviceSettingStateSummaries)
    if (deviceStatusOverview != null) __obj.updateDynamic("deviceStatusOverview")(deviceStatusOverview)
    if (deviceStatuses != null) __obj.updateDynamic("deviceStatuses")(deviceStatuses)
    if (!js.isUndefined(deviceThreatProtectionEnabled)) __obj.updateDynamic("deviceThreatProtectionEnabled")(deviceThreatProtectionEnabled)
    if (deviceThreatProtectionRequiredSecurityLevel != null) __obj.updateDynamic("deviceThreatProtectionRequiredSecurityLevel")(deviceThreatProtectionRequiredSecurityLevel)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (!js.isUndefined(managedEmailProfileRequired)) __obj.updateDynamic("managedEmailProfileRequired")(managedEmailProfileRequired)
    if (osMaximumVersion != null) __obj.updateDynamic("osMaximumVersion")(osMaximumVersion)
    if (osMinimumVersion != null) __obj.updateDynamic("osMinimumVersion")(osMinimumVersion)
    if (!js.isUndefined(passcodeBlockSimple)) __obj.updateDynamic("passcodeBlockSimple")(passcodeBlockSimple)
    if (passcodeExpirationDays != null) __obj.updateDynamic("passcodeExpirationDays")(passcodeExpirationDays.asInstanceOf[js.Any])
    if (passcodeMinimumCharacterSetCount != null) __obj.updateDynamic("passcodeMinimumCharacterSetCount")(passcodeMinimumCharacterSetCount.asInstanceOf[js.Any])
    if (passcodeMinimumLength != null) __obj.updateDynamic("passcodeMinimumLength")(passcodeMinimumLength.asInstanceOf[js.Any])
    if (passcodeMinutesOfInactivityBeforeLock != null) __obj.updateDynamic("passcodeMinutesOfInactivityBeforeLock")(passcodeMinutesOfInactivityBeforeLock.asInstanceOf[js.Any])
    if (passcodePreviousPasscodeBlockCount != null) __obj.updateDynamic("passcodePreviousPasscodeBlockCount")(passcodePreviousPasscodeBlockCount.asInstanceOf[js.Any])
    if (!js.isUndefined(passcodeRequired)) __obj.updateDynamic("passcodeRequired")(passcodeRequired)
    if (passcodeRequiredType != null) __obj.updateDynamic("passcodeRequiredType")(passcodeRequiredType)
    if (scheduledActionsForRule != null) __obj.updateDynamic("scheduledActionsForRule")(scheduledActionsForRule)
    if (!js.isUndefined(securityBlockJailbrokenDevices)) __obj.updateDynamic("securityBlockJailbrokenDevices")(securityBlockJailbrokenDevices)
    if (userStatusOverview != null) __obj.updateDynamic("userStatusOverview")(userStatusOverview)
    if (userStatuses != null) __obj.updateDynamic("userStatuses")(userStatuses)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IosCompliancePolicy]
  }
}

