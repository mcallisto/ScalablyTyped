package typings
package atPulumiKubernetesLib.appsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/apps", "v1beta1")
@js.native
object v1beta1Ns extends js.Object {
  @js.native
  class ControllerRevision protected ()
    extends atPulumiKubernetesLib.appsV1beta1Mod.ControllerRevision {
    /**
      * Create a apps.v1beta1.ControllerRevision resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1beta1Ns.ControllerRevision) = this()
    def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1beta1Ns.ControllerRevision, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class ControllerRevisionList protected ()
    extends atPulumiKubernetesLib.appsV1beta1Mod.ControllerRevisionList {
    /**
      * Create a apps.v1beta1.ControllerRevisionList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1beta1Ns.ControllerRevisionList) = this()
    def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1beta1Ns.ControllerRevisionList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Deployment protected ()
    extends atPulumiKubernetesLib.appsV1beta1Mod.Deployment {
    /**
      * Create a apps.v1beta1.Deployment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1beta1Ns.Deployment) = this()
    def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1beta1Ns.Deployment, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class DeploymentList protected ()
    extends atPulumiKubernetesLib.appsV1beta1Mod.DeploymentList {
    /**
      * Create a apps.v1beta1.DeploymentList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1beta1Ns.DeploymentList) = this()
    def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1beta1Ns.DeploymentList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class StatefulSet protected ()
    extends atPulumiKubernetesLib.appsV1beta1Mod.StatefulSet {
    /**
      * Create a apps.v1beta1.StatefulSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1beta1Ns.StatefulSet) = this()
    def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1beta1Ns.StatefulSet, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class StatefulSetList protected ()
    extends atPulumiKubernetesLib.appsV1beta1Mod.StatefulSetList {
    /**
      * Create a apps.v1beta1.StatefulSetList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1beta1Ns.StatefulSetList) = this()
    def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1beta1Ns.StatefulSetList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object ControllerRevision extends js.Object {
    /**
      * Get the state of an existing `ControllerRevision` resource, as identified by `id`.
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.appsV1beta1ControllerRevisionMod.ControllerRevision = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiKubernetesLib.appsV1beta1ControllerRevisionMod.ControllerRevision = js.native
    /**
      * Returns true if the given object is an instance of ControllerRevision.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta1/ControllerRevision.ControllerRevision */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ControllerRevisionList extends js.Object {
    /**
      * Get the state of an existing `ControllerRevisionList` resource, as identified by `id`.
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.appsV1beta1ControllerRevisionListMod.ControllerRevisionList = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiKubernetesLib.appsV1beta1ControllerRevisionListMod.ControllerRevisionList = js.native
    /**
      * Returns true if the given object is an instance of ControllerRevisionList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta1/ControllerRevisionList.ControllerRevisionList */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Deployment extends js.Object {
    /**
      * Get the state of an existing `Deployment` resource, as identified by `id`.
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.appsV1beta1DeploymentMod.Deployment = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiKubernetesLib.appsV1beta1DeploymentMod.Deployment = js.native
    /**
      * Returns true if the given object is an instance of Deployment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta1/Deployment.Deployment */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object DeploymentList extends js.Object {
    /**
      * Get the state of an existing `DeploymentList` resource, as identified by `id`.
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.appsV1beta1DeploymentListMod.DeploymentList = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiKubernetesLib.appsV1beta1DeploymentListMod.DeploymentList = js.native
    /**
      * Returns true if the given object is an instance of DeploymentList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta1/DeploymentList.DeploymentList */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object StatefulSet extends js.Object {
    /**
      * Get the state of an existing `StatefulSet` resource, as identified by `id`.
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.appsV1beta1StatefulSetMod.StatefulSet = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiKubernetesLib.appsV1beta1StatefulSetMod.StatefulSet = js.native
    /**
      * Returns true if the given object is an instance of StatefulSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta1/StatefulSet.StatefulSet */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object StatefulSetList extends js.Object {
    /**
      * Get the state of an existing `StatefulSetList` resource, as identified by `id`.
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.appsV1beta1StatefulSetListMod.StatefulSetList = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiKubernetesLib.appsV1beta1StatefulSetListMod.StatefulSetList = js.native
    /**
      * Returns true if the given object is an instance of StatefulSetList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta1/StatefulSetList.StatefulSetList */ scala.Boolean = js.native
  }
  
}

