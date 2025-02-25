package typings
package atPulumiAwsLib.route53RecordMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/route53/record", "Record")
@js.native
class Record protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a Record resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: RecordArgs) = this()
  def this(name: java.lang.String, args: RecordArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * An alias block. Conflicts with `ttl` & `records`.
    * Alias record documented below.
    */
  val aliases: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_EvaluateTargetHealth]]] = js.native
  val allowOverwrite: atPulumiPulumiLib.outputMod.Output[scala.Boolean] = js.native
  /**
    * A block indicating the routing behavior when associated health check fails. Conflicts with any other routing policy. Documented below.
    */
  val failoverRoutingPolicies: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_TypeString]]] = js.native
  /**
    * [FQDN](https://en.wikipedia.org/wiki/Fully_qualified_domain_name) built using the zone domain and `name`.
    */
  val fqdn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * A block indicating a routing policy based on the geolocation of the requestor. Conflicts with any other routing policy. Documented below.
    */
  val geolocationRoutingPolicies: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_Continent]]] = js.native
  /**
    * The health check the record should be associated with.
    */
  val healthCheckId: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * A block indicating a routing policy based on the latency between the requestor and an AWS region. Conflicts with any other routing policy. Documented below.
    */
  val latencyRoutingPolicies: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_RegionString]]] = js.native
  /**
    * Set to `true` to indicate a multivalue answer routing policy. Conflicts with any other routing policy.
    */
  val multivalueAnswerRoutingPolicy: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * DNS domain name for a CloudFront distribution, S3 bucket, ELB, or another resource record set in this hosted zone.
    */
  val name: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  val records: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  /**
    * Unique identifier to differentiate records with routing policies from one another. Required if using `failover`, `geolocation`, `latency`, or `weighted` routing policies documented below.
    */
  val setIdentifier: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The TTL of the record.
    */
  val ttl: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Double]] = js.native
  /**
    * `PRIMARY` or `SECONDARY`. A `PRIMARY` record will be served if its healthcheck is passing, otherwise the `SECONDARY` will be served. See http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-configuring-options.html#dns-failover-failover-rrsets
    */
  val `type`: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * A block indicating a weighted routing policy. Conflicts with any other routing policy. Documented below.
    */
  val weightedRoutingPolicies: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_Weight]]] = js.native
  /**
    * Hosted zone ID for a CloudFront distribution, S3 bucket, ELB, or Route 53 hosted zone. See [`resource_elb.zone_id`](https://www.terraform.io/docs/providers/aws/r/elb.html#zone_id) for example.
    */
  val zoneId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/route53/record", "Record")
@js.native
object Record extends js.Object {
  /**
    * Get an existing Record resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.route53RecordMod.Record = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.route53RecordMod.RecordState
  ): atPulumiAwsLib.route53RecordMod.Record = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.route53RecordMod.RecordState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.route53RecordMod.Record = js.native
  /**
    * Returns true if the given object is an instance of Record.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/record.Record */ scala.Boolean = js.native
}

