package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeNetworkAclsRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * One or more filters.    association.association-id - The ID of an association ID for the ACL.    association.network-acl-id - The ID of the network ACL involved in the association.    association.subnet-id - The ID of the subnet involved in the association.    default - Indicates whether the ACL is the default network ACL for the VPC.    entry.cidr - The IPv4 CIDR range specified in the entry.    entry.icmp.code - The ICMP code specified in the entry, if any.    entry.icmp.type - The ICMP type specified in the entry, if any.    entry.ipv6-cidr - The IPv6 CIDR range specified in the entry.    entry.port-range.from - The start of the port range specified in the entry.     entry.port-range.to - The end of the port range specified in the entry.     entry.protocol - The protocol specified in the entry (tcp | udp | icmp or a protocol number).    entry.rule-action - Allows or denies the matching traffic (allow | deny).    entry.rule-number - The number of an entry (in other words, rule) in the set of ACL entries.    network-acl-id - The ID of the network ACL.    owner-id - The ID of the AWS account that owns the network ACL.    tag:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.    tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.    vpc-id - The ID of the VPC for the network ACL.  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[DescribeNetworkAclsMaxResults] = js.undefined
  /**
    * One or more network ACL IDs. Default: Describes all your network ACLs.
    */
  var NetworkAclIds: js.UndefOr[ValueStringList] = js.undefined
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object DescribeNetworkAclsRequest {
  @scala.inline
  def apply(
    DryRun: js.UndefOr[Boolean] = js.undefined,
    Filters: FilterList = null,
    MaxResults: js.UndefOr[DescribeNetworkAclsMaxResults] = js.undefined,
    NetworkAclIds: ValueStringList = null,
    NextToken: String = null
  ): DescribeNetworkAclsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NetworkAclIds != null) __obj.updateDynamic("NetworkAclIds")(NetworkAclIds)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeNetworkAclsRequest]
  }
}

