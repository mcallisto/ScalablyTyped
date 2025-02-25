package typings
package atPulumiAwsLib.storagegatewayGatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GatewayArgs extends js.Object {
  /**
    * Gateway activation key during resource creation. Conflicts with `gateway_ip_address`. Additional information is available in the [Storage Gateway User Guide](https://docs.aws.amazon.com/storagegateway/latest/userguide/get-activation-key.html).
    */
  val activationKey: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  val gatewayIpAddress: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Name of the gateway.
    */
  val gatewayName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Time zone for the gateway. The time zone is of the format "GMT", "GMT-hr:mm", or "GMT+hr:mm". For example, `GMT-4:00` indicates the time is 4 hours behind GMT. The time zone is used, for example, for scheduling snapshots and your gateway's maintenance schedule.
    */
  val gatewayTimezone: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Type of the gateway. The default value is `STORED`. Valid values: `CACHED`, `FILE_S3`, `STORED`, `VTL`.
    */
  val gatewayType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  val mediumChangerType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Nested argument with Active Directory domain join information for Server Message Block (SMB) file shares. Only valid for `FILE_S3` gateway type. Must be set before creating `ActiveDirectory` authentication SMB file shares. More details below.
    */
  val smbActiveDirectorySettings: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_DomainNamePasswordUsername]
  ] = js.undefined
  val smbGuestPassword: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  val tapeDriveType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object GatewayArgs {
  @scala.inline
  def apply(
    gatewayName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    gatewayTimezone: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    activationKey: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    gatewayIpAddress: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    gatewayType: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    mediumChangerType: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    smbActiveDirectorySettings: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_DomainNamePasswordUsername] = null,
    smbGuestPassword: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    tapeDriveType: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): GatewayArgs = {
    val __obj = js.Dynamic.literal(gatewayName = gatewayName.asInstanceOf[js.Any], gatewayTimezone = gatewayTimezone.asInstanceOf[js.Any])
    if (activationKey != null) __obj.updateDynamic("activationKey")(activationKey.asInstanceOf[js.Any])
    if (gatewayIpAddress != null) __obj.updateDynamic("gatewayIpAddress")(gatewayIpAddress.asInstanceOf[js.Any])
    if (gatewayType != null) __obj.updateDynamic("gatewayType")(gatewayType.asInstanceOf[js.Any])
    if (mediumChangerType != null) __obj.updateDynamic("mediumChangerType")(mediumChangerType.asInstanceOf[js.Any])
    if (smbActiveDirectorySettings != null) __obj.updateDynamic("smbActiveDirectorySettings")(smbActiveDirectorySettings.asInstanceOf[js.Any])
    if (smbGuestPassword != null) __obj.updateDynamic("smbGuestPassword")(smbGuestPassword.asInstanceOf[js.Any])
    if (tapeDriveType != null) __obj.updateDynamic("tapeDriveType")(tapeDriveType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayArgs]
  }
}

