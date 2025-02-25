package typings
package atPulumiKubernetesLib.eventsV1beta1EventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/events/v1beta1/Event", "Event")
@js.native
class Event protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a events.v1beta1.Event resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.eventsNs.v1beta1Ns.Event) = this()
  def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.eventsNs.v1beta1Ns.Event, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * What action was taken/failed regarding to the regarding object.
    */
  val action: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`eventsDOTk8sDOTio/v1beta1`] = js.native
  /**
    * Deprecated field assuring backward compatibility with core.v1 Event type
    */
  val deprecatedCount: atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  /**
    * Deprecated field assuring backward compatibility with core.v1 Event type
    */
  val deprecatedFirstTimestamp: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Deprecated field assuring backward compatibility with core.v1 Event type
    */
  val deprecatedLastTimestamp: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Deprecated field assuring backward compatibility with core.v1 Event type
    */
  val deprecatedSource: atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.EventSource] = js.native
  /**
    * Required. Time when this Event was first observed.
    */
  val eventTime: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Event] = js.native
  val metadata: atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  /**
    * Optional. A human-readable description of the status of this operation. Maximal length of
    * the note is 1kB, but libraries should be prepared to handle values up to 64kB.
    */
  val note: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Why the action was taken.
    */
  val reason: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The object this Event is about. In most cases it's an Object reporting controller
    * implements. E.g. ReplicaSetController implements ReplicaSets and this event is emitted
    * because it acts on some changes in a ReplicaSet object.
    */
  val regarding: atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ObjectReference] = js.native
  /**
    * Optional secondary object for more complex actions. E.g. when regarding object triggers a
    * creation or deletion of related object.
    */
  val related: atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ObjectReference] = js.native
  /**
    * Name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`.
    */
  val reportingController: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * ID of the controller instance, e.g. `kubelet-xyzf`.
    */
  val reportingInstance: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Data about the Event series this event represents or nil if it's a singleton Event.
    */
  val series: atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.eventsNs.v1beta1Ns.EventSeries] = js.native
  /**
    * Type of this event (Normal, Warning), new types could be added in the future.
    */
  val `type`: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/kubernetes/events/v1beta1/Event", "Event")
@js.native
object Event extends js.Object {
  /**
    * Get the state of an existing `Event` resource, as identified by `id`.
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.eventsV1beta1EventMod.Event = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiKubernetesLib.eventsV1beta1EventMod.Event = js.native
  /**
    * Returns true if the given object is an instance of Event.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/events/v1beta1/Event.Event */ scala.Boolean = js.native
}

