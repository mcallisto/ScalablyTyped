package typings
package atPulumiAwsLib.elasticloadbalancingLoadBalancerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadBalancerState extends js.Object {
  /**
    * An Access Logs block. Access Logs documented below.
    */
  val accessLogs: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_BucketBucketPrefixEnabledInterval]
  ] = js.undefined
  /**
    * The ARN of the ELB
    */
  val arn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The AZ's to serve traffic in.
    */
  val availabilityZones: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * Boolean to enable connection draining. Default: `false`
    */
  val connectionDraining: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The time in seconds to allow for connections to drain. Default: `300`
    */
  val connectionDrainingTimeout: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * Enable cross-zone load balancing. Default: `true`
    */
  val crossZoneLoadBalancing: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The DNS name of the ELB
    */
  val dnsName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A health_check block. Health Check documented below.
    */
  val healthCheck: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_HealthyThresholdIntervalTarget]
  ] = js.undefined
  /**
    * The time in seconds that the connection is allowed to be idle. Default: `60`
    */
  val idleTimeout: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * A list of instance ids to place in the ELB pool.
    */
  val instances: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * If true, ELB will be an internal ELB.
    */
  val internal: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * A list of listener blocks. Listeners documented below.
    */
  val listeners: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_InstancePortInstanceProtocolLbPort]
      ]
    ]
  ] = js.undefined
  /**
    * The name of the ELB
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Creates a unique name beginning with the specified
    * prefix. Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A list of security group IDs to assign to the ELB.
    * Only valid if creating an ELB within a VPC
    */
  val securityGroups: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The name of the security group that you can use as
    * part of your inbound rules for your load balancer's back-end application
    * instances. Use this for Classic or Default VPC only.
    */
  val sourceSecurityGroup: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the security group that you can use as
    * part of your inbound rules for your load balancer's back-end application
    * instances. Only available on ELBs launched in a VPC.
    */
  val sourceSecurityGroupId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A list of subnet IDs to attach to the ELB.
    */
  val subnets: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * The canonical hosted zone ID of the ELB (to be used in a Route 53 Alias record)
    */
  val zoneId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object LoadBalancerState {
  @scala.inline
  def apply(
    accessLogs: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_BucketBucketPrefixEnabledInterval] = null,
    arn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    availabilityZones: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    connectionDraining: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    connectionDrainingTimeout: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    crossZoneLoadBalancing: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    dnsName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    healthCheck: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_HealthyThresholdIntervalTarget] = null,
    idleTimeout: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    instances: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    internal: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    listeners: atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_InstancePortInstanceProtocolLbPort]
      ]
    ] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    namePrefix: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    securityGroups: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    sourceSecurityGroup: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    sourceSecurityGroupId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    subnets: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    zoneId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): LoadBalancerState = {
    val __obj = js.Dynamic.literal()
    if (accessLogs != null) __obj.updateDynamic("accessLogs")(accessLogs.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (availabilityZones != null) __obj.updateDynamic("availabilityZones")(availabilityZones.asInstanceOf[js.Any])
    if (connectionDraining != null) __obj.updateDynamic("connectionDraining")(connectionDraining.asInstanceOf[js.Any])
    if (connectionDrainingTimeout != null) __obj.updateDynamic("connectionDrainingTimeout")(connectionDrainingTimeout.asInstanceOf[js.Any])
    if (crossZoneLoadBalancing != null) __obj.updateDynamic("crossZoneLoadBalancing")(crossZoneLoadBalancing.asInstanceOf[js.Any])
    if (dnsName != null) __obj.updateDynamic("dnsName")(dnsName.asInstanceOf[js.Any])
    if (healthCheck != null) __obj.updateDynamic("healthCheck")(healthCheck.asInstanceOf[js.Any])
    if (idleTimeout != null) __obj.updateDynamic("idleTimeout")(idleTimeout.asInstanceOf[js.Any])
    if (instances != null) __obj.updateDynamic("instances")(instances.asInstanceOf[js.Any])
    if (internal != null) __obj.updateDynamic("internal")(internal.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    if (securityGroups != null) __obj.updateDynamic("securityGroups")(securityGroups.asInstanceOf[js.Any])
    if (sourceSecurityGroup != null) __obj.updateDynamic("sourceSecurityGroup")(sourceSecurityGroup.asInstanceOf[js.Any])
    if (sourceSecurityGroupId != null) __obj.updateDynamic("sourceSecurityGroupId")(sourceSecurityGroupId.asInstanceOf[js.Any])
    if (subnets != null) __obj.updateDynamic("subnets")(subnets.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (zoneId != null) __obj.updateDynamic("zoneId")(zoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancerState]
  }
}

