package typings
package atPulumiKubernetesLib.coreV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/core/v1", "ResourceQuota")
@js.native
class ResourceQuota protected ()
  extends atPulumiKubernetesLib.coreV1ResourceQuotaMod.ResourceQuota {
  /**
    * Create a core.v1.ResourceQuota resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ResourceQuota) = this()
  def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ResourceQuota, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/kubernetes/core/v1", "ResourceQuota")
@js.native
object ResourceQuota extends js.Object {
  /**
    * Get the state of an existing `ResourceQuota` resource, as identified by `id`.
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.coreV1ResourceQuotaMod.ResourceQuota = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiKubernetesLib.coreV1ResourceQuotaMod.ResourceQuota = js.native
  /**
    * Returns true if the given object is an instance of ResourceQuota.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/core/v1/ResourceQuota.ResourceQuota */ scala.Boolean = js.native
}

