package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IpPermission extends js.Object {
  /**
    * The start of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type number. A value of -1 indicates all ICMP/ICMPv6 types. If you specify all ICMP/ICMPv6 types, you must specify all codes.
    */
  var FromPort: js.UndefOr[Integer] = js.undefined
  /**
    * The IP protocol name (tcp, udp, icmp, icmpv6) or number (see Protocol Numbers). [VPC only] Use -1 to specify all protocols. When authorizing security group rules, specifying -1 or a protocol number other than tcp, udp, icmp, or icmpv6 allows traffic on all ports, regardless of any port range you specify. For tcp, udp, and icmp, you must specify a port range. For icmpv6, the port range is optional; if you omit the port range, traffic for all types and codes is allowed.
    */
  var IpProtocol: js.UndefOr[String] = js.undefined
  /**
    * The IPv4 ranges.
    */
  var IpRanges: js.UndefOr[IpRangeList] = js.undefined
  /**
    * [VPC only] The IPv6 ranges.
    */
  var Ipv6Ranges: js.UndefOr[Ipv6RangeList] = js.undefined
  /**
    * [VPC only] The prefix list IDs for an AWS service. With outbound rules, this is the AWS service to access through a VPC endpoint from instances associated with the security group.
    */
  var PrefixListIds: js.UndefOr[PrefixListIdList] = js.undefined
  /**
    * The end of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code. A value of -1 indicates all ICMP/ICMPv6 codes. If you specify all ICMP/ICMPv6 types, you must specify all codes.
    */
  var ToPort: js.UndefOr[Integer] = js.undefined
  /**
    * The security group and AWS account ID pairs.
    */
  var UserIdGroupPairs: js.UndefOr[UserIdGroupPairList] = js.undefined
}

object IpPermission {
  @scala.inline
  def apply(
    FromPort: js.UndefOr[Integer] = js.undefined,
    IpProtocol: String = null,
    IpRanges: IpRangeList = null,
    Ipv6Ranges: Ipv6RangeList = null,
    PrefixListIds: PrefixListIdList = null,
    ToPort: js.UndefOr[Integer] = js.undefined,
    UserIdGroupPairs: UserIdGroupPairList = null
  ): IpPermission = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(FromPort)) __obj.updateDynamic("FromPort")(FromPort)
    if (IpProtocol != null) __obj.updateDynamic("IpProtocol")(IpProtocol)
    if (IpRanges != null) __obj.updateDynamic("IpRanges")(IpRanges)
    if (Ipv6Ranges != null) __obj.updateDynamic("Ipv6Ranges")(Ipv6Ranges)
    if (PrefixListIds != null) __obj.updateDynamic("PrefixListIds")(PrefixListIds)
    if (!js.isUndefined(ToPort)) __obj.updateDynamic("ToPort")(ToPort)
    if (UserIdGroupPairs != null) __obj.updateDynamic("UserIdGroupPairs")(UserIdGroupPairs)
    __obj.asInstanceOf[IpPermission]
  }
}

