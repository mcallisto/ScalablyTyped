package typings
package atPulumiAwsLib.sagemakerModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelArgs extends js.Object {
  /**
    * Specifies containers in the inference pipeline. If not specified, the `primary_container` argument is required. Fields are documented below.
    */
  val containers: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ContainerHostnameEnvironment]
      ]
    ]
  ] = js.undefined
  /**
    * Isolates the model container. No inbound or outbound network calls can be made to or from the model container.
    */
  val enableNetworkIsolation: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * A role that SageMaker can assume to access model artifacts and docker images for deployment.
    */
  val executionRoleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The name of the model.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The primary docker image containing inference code that is used when the model is deployed for predictions.  If not specified, the `container` argument is required. Fields are documented below.
    */
  val primaryContainer: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ContainerHostnameEnvironment]
  ] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * Specifies the VPC that you want your model to connect to. VpcConfig is used in hosting services and in batch transform.
    */
  val vpcConfig: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_SecurityGroupIdsSubnetsArrayInput]
  ] = js.undefined
}

object ModelArgs {
  @scala.inline
  def apply(
    executionRoleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    containers: atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ContainerHostnameEnvironment]
      ]
    ] = null,
    enableNetworkIsolation: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    primaryContainer: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ContainerHostnameEnvironment] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    vpcConfig: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_SecurityGroupIdsSubnetsArrayInput] = null
  ): ModelArgs = {
    val __obj = js.Dynamic.literal(executionRoleArn = executionRoleArn.asInstanceOf[js.Any])
    if (containers != null) __obj.updateDynamic("containers")(containers.asInstanceOf[js.Any])
    if (enableNetworkIsolation != null) __obj.updateDynamic("enableNetworkIsolation")(enableNetworkIsolation.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (primaryContainer != null) __obj.updateDynamic("primaryContainer")(primaryContainer.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (vpcConfig != null) __obj.updateDynamic("vpcConfig")(vpcConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelArgs]
  }
}

