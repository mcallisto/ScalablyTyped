package typings
package atPulumiAwsLib.ec2VpcEndpointServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcEndpointServiceArgs extends js.Object {
  /**
    * Whether or not VPC endpoint connection requests to the service must be accepted by the service owner - `true` or `false`.
    */
  val acceptanceRequired: atPulumiPulumiLib.outputMod.Input[scala.Boolean]
  /**
    * The ARNs of one or more principals allowed to discover the endpoint service.
    */
  val allowedPrincipals: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The ARNs of one or more Network Load Balancers for the endpoint service.
    */
  val networkLoadBalancerArns: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
}

object VpcEndpointServiceArgs {
  @scala.inline
  def apply(
    acceptanceRequired: atPulumiPulumiLib.outputMod.Input[scala.Boolean],
    networkLoadBalancerArns: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]],
    allowedPrincipals: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null
  ): VpcEndpointServiceArgs = {
    val __obj = js.Dynamic.literal(acceptanceRequired = acceptanceRequired.asInstanceOf[js.Any], networkLoadBalancerArns = networkLoadBalancerArns.asInstanceOf[js.Any])
    if (allowedPrincipals != null) __obj.updateDynamic("allowedPrincipals")(allowedPrincipals.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcEndpointServiceArgs]
  }
}

