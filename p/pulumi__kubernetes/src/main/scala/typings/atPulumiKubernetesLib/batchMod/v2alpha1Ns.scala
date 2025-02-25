package typings
package atPulumiKubernetesLib.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/batch", "v2alpha1")
@js.native
object v2alpha1Ns extends js.Object {
  @js.native
  class CronJob protected ()
    extends atPulumiKubernetesLib.batchV2alpha1Mod.CronJob {
    /**
      * Create a batch.v2alpha1.CronJob resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.batchNs.v2alpha1Ns.CronJob) = this()
    def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.batchNs.v2alpha1Ns.CronJob, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class CronJobList protected ()
    extends atPulumiKubernetesLib.batchV2alpha1Mod.CronJobList {
    /**
      * Create a batch.v2alpha1.CronJobList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.batchNs.v2alpha1Ns.CronJobList) = this()
    def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.batchNs.v2alpha1Ns.CronJobList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object CronJob extends js.Object {
    /**
      * Get the state of an existing `CronJob` resource, as identified by `id`.
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.batchV2alpha1CronJobMod.CronJob = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiKubernetesLib.batchV2alpha1CronJobMod.CronJob = js.native
    /**
      * Returns true if the given object is an instance of CronJob.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/batch/v2alpha1/CronJob.CronJob */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object CronJobList extends js.Object {
    /**
      * Get the state of an existing `CronJobList` resource, as identified by `id`.
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.batchV2alpha1CronJobListMod.CronJobList = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiKubernetesLib.batchV2alpha1CronJobListMod.CronJobList = js.native
    /**
      * Returns true if the given object is an instance of CronJobList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/batch/v2alpha1/CronJobList.CronJobList */ scala.Boolean = js.native
  }
  
}

