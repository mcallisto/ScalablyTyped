package typings
package atPulumiKubernetesLib.appsV1DaemonSetListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/apps/v1/DaemonSetList", "DaemonSetList")
@js.native
class DaemonSetList protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a apps.v1.DaemonSetList resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1Ns.DaemonSetList) = this()
  def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1Ns.DaemonSetList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1`] = js.native
  /**
    * A list of daemon sets.
    */
  val items: atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns.DaemonSet]] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.DaemonSetList] = js.native
  /**
    * Standard list metadata. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
    */
  val metadata: atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
}

/* static members */
@JSImport("@pulumi/kubernetes/apps/v1/DaemonSetList", "DaemonSetList")
@js.native
object DaemonSetList extends js.Object {
  /**
    * Get the state of an existing `DaemonSetList` resource, as identified by `id`.
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.appsV1DaemonSetListMod.DaemonSetList = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiKubernetesLib.appsV1DaemonSetListMod.DaemonSetList = js.native
  /**
    * Returns true if the given object is an instance of DaemonSetList.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1/DaemonSetList.DaemonSetList */ scala.Boolean = js.native
}

