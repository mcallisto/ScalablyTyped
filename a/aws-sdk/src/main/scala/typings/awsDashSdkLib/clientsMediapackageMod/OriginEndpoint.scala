package typings
package awsDashSdkLib.clientsMediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OriginEndpoint extends js.Object {
  /**
    * The Amazon Resource Name (ARN) assigned to the OriginEndpoint.
    */
  var Arn: js.UndefOr[__string] = js.undefined
  /**
    * The ID of the Channel the OriginEndpoint is associated with.
    */
  var ChannelId: js.UndefOr[__string] = js.undefined
  var CmafPackage: js.UndefOr[CmafPackage] = js.undefined
  var DashPackage: js.UndefOr[DashPackage] = js.undefined
  /**
    * A short text description of the OriginEndpoint.
    */
  var Description: js.UndefOr[__string] = js.undefined
  var HlsPackage: js.UndefOr[HlsPackage] = js.undefined
  /**
    * The ID of the OriginEndpoint.
    */
  var Id: js.UndefOr[__string] = js.undefined
  /**
    * A short string appended to the end of the OriginEndpoint URL.
    */
  var ManifestName: js.UndefOr[__string] = js.undefined
  var MssPackage: js.UndefOr[MssPackage] = js.undefined
  /**
    * Maximum duration (seconds) of content to retain for startover playback.
  If not specified, startover playback will be disabled for the OriginEndpoint.
    */
  var StartoverWindowSeconds: js.UndefOr[__integer] = js.undefined
  var Tags: js.UndefOr[Tags] = js.undefined
  /**
    * Amount of delay (seconds) to enforce on the playback of live content.
  If not specified, there will be no time delay in effect for the OriginEndpoint.
    */
  var TimeDelaySeconds: js.UndefOr[__integer] = js.undefined
  /**
    * The URL of the packaged OriginEndpoint for consumption.
    */
  var Url: js.UndefOr[__string] = js.undefined
  /**
    * A list of source IP CIDR blocks that will be allowed to access the OriginEndpoint.
    */
  var Whitelist: js.UndefOr[__listOf__string] = js.undefined
}

object OriginEndpoint {
  @scala.inline
  def apply(
    Arn: __string = null,
    ChannelId: __string = null,
    CmafPackage: CmafPackage = null,
    DashPackage: DashPackage = null,
    Description: __string = null,
    HlsPackage: HlsPackage = null,
    Id: __string = null,
    ManifestName: __string = null,
    MssPackage: MssPackage = null,
    StartoverWindowSeconds: js.UndefOr[__integer] = js.undefined,
    Tags: Tags = null,
    TimeDelaySeconds: js.UndefOr[__integer] = js.undefined,
    Url: __string = null,
    Whitelist: __listOf__string = null
  ): OriginEndpoint = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (ChannelId != null) __obj.updateDynamic("ChannelId")(ChannelId)
    if (CmafPackage != null) __obj.updateDynamic("CmafPackage")(CmafPackage)
    if (DashPackage != null) __obj.updateDynamic("DashPackage")(DashPackage)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (HlsPackage != null) __obj.updateDynamic("HlsPackage")(HlsPackage)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (ManifestName != null) __obj.updateDynamic("ManifestName")(ManifestName)
    if (MssPackage != null) __obj.updateDynamic("MssPackage")(MssPackage)
    if (!js.isUndefined(StartoverWindowSeconds)) __obj.updateDynamic("StartoverWindowSeconds")(StartoverWindowSeconds)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (!js.isUndefined(TimeDelaySeconds)) __obj.updateDynamic("TimeDelaySeconds")(TimeDelaySeconds)
    if (Url != null) __obj.updateDynamic("Url")(Url)
    if (Whitelist != null) __obj.updateDynamic("Whitelist")(Whitelist)
    __obj.asInstanceOf[OriginEndpoint]
  }
}

