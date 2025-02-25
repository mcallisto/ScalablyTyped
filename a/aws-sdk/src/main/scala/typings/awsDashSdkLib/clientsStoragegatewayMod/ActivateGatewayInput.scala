package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivateGatewayInput extends js.Object {
  /**
    * Your gateway activation key. You can obtain the activation key by sending an HTTP GET request with redirects enabled to the gateway IP address (port 80). The redirect URL returned in the response provides you the activation key for your gateway in the query string parameter activationKey. It may also include other activation-related parameters, however, these are merely defaults -- the arguments you pass to the ActivateGateway API call determine the actual configuration of your gateway.  For more information, see https://docs.aws.amazon.com/storagegateway/latest/userguide/get-activation-key.html in the Storage Gateway User Guide.
    */
  var ActivationKey: awsDashSdkLib.clientsStoragegatewayMod.ActivationKey
  /**
    * The name you configured for your gateway.
    */
  var GatewayName: awsDashSdkLib.clientsStoragegatewayMod.GatewayName
  /**
    * A value that indicates the region where you want to store your data. The gateway region specified must be the same region as the region in your Host header in the request. For more information about available regions and endpoints for AWS Storage Gateway, see Regions and Endpoints in the Amazon Web Services Glossary.  Valid Values: See AWS Storage Gateway Regions and Endpoints in the AWS General Reference. 
    */
  var GatewayRegion: RegionId
  /**
    * A value that indicates the time zone you want to set for the gateway. The time zone is of the format "GMT-hr:mm" or "GMT+hr:mm". For example, GMT-4:00 indicates the time is 4 hours behind GMT. GMT+2:00 indicates the time is 2 hours ahead of GMT. The time zone is used, for example, for scheduling snapshots and your gateway's maintenance schedule.
    */
  var GatewayTimezone: awsDashSdkLib.clientsStoragegatewayMod.GatewayTimezone
  /**
    * A value that defines the type of gateway to activate. The type specified is critical to all later functions of the gateway and cannot be changed after activation. The default value is CACHED.   Valid Values: "STORED", "CACHED", "VTL", "FILE_S3"
    */
  var GatewayType: js.UndefOr[GatewayType] = js.undefined
  /**
    * The value that indicates the type of medium changer to use for tape gateway. This field is optional.  Valid Values: "STK-L700", "AWS-Gateway-VTL"
    */
  var MediumChangerType: js.UndefOr[MediumChangerType] = js.undefined
  /**
    * A list of up to 50 tags that can be assigned to the gateway. Each tag is a key-value pair.  Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and the maximum length for a tag's value is 256. 
    */
  var Tags: js.UndefOr[Tags] = js.undefined
  /**
    * The value that indicates the type of tape drive to use for tape gateway. This field is optional.  Valid Values: "IBM-ULT3580-TD5" 
    */
  var TapeDriveType: js.UndefOr[TapeDriveType] = js.undefined
}

object ActivateGatewayInput {
  @scala.inline
  def apply(
    ActivationKey: ActivationKey,
    GatewayName: GatewayName,
    GatewayRegion: RegionId,
    GatewayTimezone: GatewayTimezone,
    GatewayType: GatewayType = null,
    MediumChangerType: MediumChangerType = null,
    Tags: Tags = null,
    TapeDriveType: TapeDriveType = null
  ): ActivateGatewayInput = {
    val __obj = js.Dynamic.literal(ActivationKey = ActivationKey, GatewayName = GatewayName, GatewayRegion = GatewayRegion, GatewayTimezone = GatewayTimezone)
    if (GatewayType != null) __obj.updateDynamic("GatewayType")(GatewayType)
    if (MediumChangerType != null) __obj.updateDynamic("MediumChangerType")(MediumChangerType)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (TapeDriveType != null) __obj.updateDynamic("TapeDriveType")(TapeDriveType)
    __obj.asInstanceOf[ActivateGatewayInput]
  }
}

