package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Network extends js.Object {
  /**
    * The destination domain of network-related information about a finding.
    */
  var DestinationDomain: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The destination IPv4 address of network-related information about a finding.
    */
  var DestinationIpV4: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The destination IPv6 address of network-related information about a finding.
    */
  var DestinationIpV6: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The destination port of network-related information about a finding.
    */
  var DestinationPort: js.UndefOr[Integer] = js.undefined
  /**
    * The direction of network traffic associated with a finding.
    */
  var Direction: js.UndefOr[NetworkDirection] = js.undefined
  /**
    * The protocol of network-related information about a finding.
    */
  var Protocol: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The source domain of network-related information about a finding.
    */
  var SourceDomain: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The source IPv4 address of network-related information about a finding.
    */
  var SourceIpV4: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The source IPv6 address of network-related information about a finding.
    */
  var SourceIpV6: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The source media access control (MAC) address of network-related information about a finding.
    */
  var SourceMac: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The source port of network-related information about a finding.
    */
  var SourcePort: js.UndefOr[Integer] = js.undefined
}

object Network {
  @scala.inline
  def apply(
    DestinationDomain: NonEmptyString = null,
    DestinationIpV4: NonEmptyString = null,
    DestinationIpV6: NonEmptyString = null,
    DestinationPort: js.UndefOr[Integer] = js.undefined,
    Direction: NetworkDirection = null,
    Protocol: NonEmptyString = null,
    SourceDomain: NonEmptyString = null,
    SourceIpV4: NonEmptyString = null,
    SourceIpV6: NonEmptyString = null,
    SourceMac: NonEmptyString = null,
    SourcePort: js.UndefOr[Integer] = js.undefined
  ): Network = {
    val __obj = js.Dynamic.literal()
    if (DestinationDomain != null) __obj.updateDynamic("DestinationDomain")(DestinationDomain)
    if (DestinationIpV4 != null) __obj.updateDynamic("DestinationIpV4")(DestinationIpV4)
    if (DestinationIpV6 != null) __obj.updateDynamic("DestinationIpV6")(DestinationIpV6)
    if (!js.isUndefined(DestinationPort)) __obj.updateDynamic("DestinationPort")(DestinationPort)
    if (Direction != null) __obj.updateDynamic("Direction")(Direction.asInstanceOf[js.Any])
    if (Protocol != null) __obj.updateDynamic("Protocol")(Protocol)
    if (SourceDomain != null) __obj.updateDynamic("SourceDomain")(SourceDomain)
    if (SourceIpV4 != null) __obj.updateDynamic("SourceIpV4")(SourceIpV4)
    if (SourceIpV6 != null) __obj.updateDynamic("SourceIpV6")(SourceIpV6)
    if (SourceMac != null) __obj.updateDynamic("SourceMac")(SourceMac)
    if (!js.isUndefined(SourcePort)) __obj.updateDynamic("SourcePort")(SourcePort)
    __obj.asInstanceOf[Network]
  }
}

