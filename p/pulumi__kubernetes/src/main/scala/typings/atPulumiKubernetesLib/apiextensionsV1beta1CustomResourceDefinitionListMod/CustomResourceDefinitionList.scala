package typings
package atPulumiKubernetesLib.apiextensionsV1beta1CustomResourceDefinitionListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/apiextensions/v1beta1/CustomResourceDefinitionList", "CustomResourceDefinitionList")
@js.native
class CustomResourceDefinitionList protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a apiextensions.v1beta1.CustomResourceDefinitionList resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.apiextensionsNs.v1beta1Ns.CustomResourceDefinitionList) = this()
  def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.apiextensionsNs.v1beta1Ns.CustomResourceDefinitionList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiextensionsDOTk8sDOTio/v1beta1`
  ] = js.native
  /**
    * Items individual CustomResourceDefinitions
    */
  val items: atPulumiPulumiLib.outputMod.Output[
    js.Array[
      atPulumiKubernetesLib.typesOutputMod.apiextensionsNs.v1beta1Ns.CustomResourceDefinition
    ]
  ] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.CustomResourceDefinitionList] = js.native
  val metadata: atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
}

/* static members */
@JSImport("@pulumi/kubernetes/apiextensions/v1beta1/CustomResourceDefinitionList", "CustomResourceDefinitionList")
@js.native
object CustomResourceDefinitionList extends js.Object {
  /**
    * Get the state of an existing `CustomResourceDefinitionList` resource, as identified by `id`.
    * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
    * Kubernetes convention) the ID becomes default/<name>.
    *
    * Pulumi will keep track of this resource using `name` as the Pulumi ID.
    *
    * @param name _Unique_ name used to register this resource with Pulumi.
    * @param id An ID for the Kubernetes resource to retrieve. Takes the form
    *  <namespace>/<name> or <name>.
    * @param opts Uniquely specifies a CustomResource to select.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.apiextensionsV1beta1CustomResourceDefinitionListMod.CustomResourceDefinitionList = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiKubernetesLib.apiextensionsV1beta1CustomResourceDefinitionListMod.CustomResourceDefinitionList = js.native
  /**
    * Returns true if the given object is an instance of CustomResourceDefinitionList.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apiextensions/v1beta1/CustomResourceDefinitionList.CustomResourceDefinitionList */ scala.Boolean = js.native
}

