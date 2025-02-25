package typings
package awsDashSdkLib.clientsMediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HlsManifest extends js.Object {
  /**
    * This setting controls how ad markers are included in the packaged OriginEndpoint.
  "NONE" will omit all SCTE-35 ad markers from the output.
  "PASSTHROUGH" causes the manifest to contain a copy of the SCTE-35 ad
  markers (comments) taken directly from the input HTTP Live Streaming (HLS) manifest.
  "SCTE35_ENHANCED" generates ad markers and blackout tags based on SCTE-35
  messages in the input source.
    */
  var AdMarkers: js.UndefOr[AdMarkers] = js.undefined
  /**
    * When enabled, an I-Frame only stream will be included in the output.
    */
  var IncludeIframeOnlyStream: js.UndefOr[__boolean] = js.undefined
  /**
    * An optional string to include in the name of the manifest.
    */
  var ManifestName: js.UndefOr[__string] = js.undefined
  /**
    * The interval (in seconds) between each EXT-X-PROGRAM-DATE-TIME tag
  inserted into manifests. Additionally, when an interval is specified
  ID3Timed Metadata messages will be generated every 5 seconds using the
  ingest time of the content.
  If the interval is not specified, or set to 0, then
  no EXT-X-PROGRAM-DATE-TIME tags will be inserted into manifests and no
  ID3Timed Metadata messages will be generated. Note that irrespective
  of this parameter, if any ID3 Timed Metadata is found in HTTP Live Streaming (HLS) input,
  it will be passed through to HLS output.
    */
  var ProgramDateTimeIntervalSeconds: js.UndefOr[__integer] = js.undefined
  /**
    * When enabled, the EXT-X-KEY tag will be repeated in output manifests.
    */
  var RepeatExtXKey: js.UndefOr[__boolean] = js.undefined
  var StreamSelection: js.UndefOr[StreamSelection] = js.undefined
}

object HlsManifest {
  @scala.inline
  def apply(
    AdMarkers: AdMarkers = null,
    IncludeIframeOnlyStream: js.UndefOr[__boolean] = js.undefined,
    ManifestName: __string = null,
    ProgramDateTimeIntervalSeconds: js.UndefOr[__integer] = js.undefined,
    RepeatExtXKey: js.UndefOr[__boolean] = js.undefined,
    StreamSelection: StreamSelection = null
  ): HlsManifest = {
    val __obj = js.Dynamic.literal()
    if (AdMarkers != null) __obj.updateDynamic("AdMarkers")(AdMarkers.asInstanceOf[js.Any])
    if (!js.isUndefined(IncludeIframeOnlyStream)) __obj.updateDynamic("IncludeIframeOnlyStream")(IncludeIframeOnlyStream)
    if (ManifestName != null) __obj.updateDynamic("ManifestName")(ManifestName)
    if (!js.isUndefined(ProgramDateTimeIntervalSeconds)) __obj.updateDynamic("ProgramDateTimeIntervalSeconds")(ProgramDateTimeIntervalSeconds)
    if (!js.isUndefined(RepeatExtXKey)) __obj.updateDynamic("RepeatExtXKey")(RepeatExtXKey)
    if (StreamSelection != null) __obj.updateDynamic("StreamSelection")(StreamSelection)
    __obj.asInstanceOf[HlsManifest]
  }
}

