package typings
package atPulumiAwsLib.elasticloadbalancingLoadBalancerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/elasticloadbalancing/loadBalancer", "LoadBalancer")
@js.native
class LoadBalancer protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a LoadBalancer resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: LoadBalancerArgs) = this()
  def this(name: java.lang.String, args: LoadBalancerArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * An Access Logs block. Access Logs documented below.
    */
  val accessLogs: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_BucketBucketPrefixEnabled]] = js.native
  /**
    * The ARN of the ELB
    */
  val arn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The AZ's to serve traffic in.
    */
  val availabilityZones: atPulumiPulumiLib.outputMod.Output[js.Array[java.lang.String]] = js.native
  /**
    * Boolean to enable connection draining. Default: `false`
    */
  val connectionDraining: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * The time in seconds to allow for connections to drain. Default: `300`
    */
  val connectionDrainingTimeout: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Double]] = js.native
  /**
    * Enable cross-zone load balancing. Default: `true`
    */
  val crossZoneLoadBalancing: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * The DNS name of the ELB
    */
  val dnsName: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * A health_check block. Health Check documented below.
    */
  val healthCheck: atPulumiPulumiLib.outputMod.Output[atPulumiAwsLib.Anon_HealthyThresholdInterval] = js.native
  /**
    * The time in seconds that the connection is allowed to be idle. Default: `60`
    */
  val idleTimeout: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Double]] = js.native
  /**
    * A list of instance ids to place in the ELB pool.
    */
  val instances: atPulumiPulumiLib.outputMod.Output[js.Array[java.lang.String]] = js.native
  /**
    * If true, ELB will be an internal ELB.
    */
  val internal: atPulumiPulumiLib.outputMod.Output[scala.Boolean] = js.native
  /**
    * A list of listener blocks. Listeners documented below.
    */
  val listeners: atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiAwsLib.Anon_InstancePortInstanceProtocol]] = js.native
  /**
    * The name of the ELB
    */
  val name: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Creates a unique name beginning with the specified
    * prefix. Conflicts with `name`.
    */
  val namePrefix: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * A list of security group IDs to assign to the ELB.
    * Only valid if creating an ELB within a VPC
    */
  val securityGroups: atPulumiPulumiLib.outputMod.Output[js.Array[java.lang.String]] = js.native
  /**
    * The name of the security group that you can use as
    * part of your inbound rules for your load balancer's back-end application
    * instances. Use this for Classic or Default VPC only.
    */
  val sourceSecurityGroup: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The ID of the security group that you can use as
    * part of your inbound rules for your load balancer's back-end application
    * instances. Only available on ELBs launched in a VPC.
    */
  val sourceSecurityGroupId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * A list of subnet IDs to attach to the ELB.
    */
  val subnets: atPulumiPulumiLib.outputMod.Output[js.Array[java.lang.String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: atPulumiPulumiLib.outputMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
  /**
    * The canonical hosted zone ID of the ELB (to be used in a Route 53 Alias record)
    */
  val zoneId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/elasticloadbalancing/loadBalancer", "LoadBalancer")
@js.native
object LoadBalancer extends js.Object {
  /**
    * Get an existing LoadBalancer resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.elasticloadbalancingLoadBalancerMod.LoadBalancer = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.elasticloadbalancingLoadBalancerMod.LoadBalancerState
  ): atPulumiAwsLib.elasticloadbalancingLoadBalancerMod.LoadBalancer = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.elasticloadbalancingLoadBalancerMod.LoadBalancerState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.elasticloadbalancingLoadBalancerMod.LoadBalancer = js.native
  /**
    * Returns true if the given object is an instance of LoadBalancer.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancing/loadBalancer.LoadBalancer */ scala.Boolean = js.native
}

