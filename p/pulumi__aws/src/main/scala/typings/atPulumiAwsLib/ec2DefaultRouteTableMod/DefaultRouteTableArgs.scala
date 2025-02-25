package typings
package atPulumiAwsLib.ec2DefaultRouteTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultRouteTableArgs extends js.Object {
  /**
    * The ID of the Default Routing Table.
    */
  val defaultRouteTableId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * A list of virtual gateways for propagation.
    */
  val propagatingVgws: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * A list of route objects. Their keys are documented below.
    * This argument is processed in [attribute-as-blocks mode](https://www.terraform.io/docs/configuration/attr-as-blocks.html).
    */
  val routes: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_CidrBlockEgressOnlyGatewayId]
      ]
    ]
  ] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
}

object DefaultRouteTableArgs {
  @scala.inline
  def apply(
    defaultRouteTableId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    propagatingVgws: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    routes: atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_CidrBlockEgressOnlyGatewayId]
      ]
    ] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null
  ): DefaultRouteTableArgs = {
    val __obj = js.Dynamic.literal(defaultRouteTableId = defaultRouteTableId.asInstanceOf[js.Any])
    if (propagatingVgws != null) __obj.updateDynamic("propagatingVgws")(propagatingVgws.asInstanceOf[js.Any])
    if (routes != null) __obj.updateDynamic("routes")(routes.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultRouteTableArgs]
  }
}

