package typings
package atPulumiKubernetesLib.typesOutputMod.schedulingNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DEPRECATED - This group version of PriorityClass is deprecated by
  * scheduling.k8s.io/v1/PriorityClass. PriorityClass defines mapping from a priority class name
  * to the priority integer value. The value can be any valid integer.
  */
trait PriorityClass extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1beta1`
  /**
    * description is an arbitrary string that usually provides guidelines on when this priority
    * class should be used.
    */
  val description: java.lang.String
  /**
    * globalDefault specifies whether this PriorityClass should be considered as the default
    * priority for pods that do not have any priority class. Only one PriorityClass can be marked
    * as `globalDefault`. However, if more than one PriorityClasses exists with their
    * `globalDefault` field set to true, the smallest value of such global default
    * PriorityClasses will be used as the default priority.
    */
  val globalDefault: scala.Boolean
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PriorityClass
  /**
    * Standard object's metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  val metadata: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta
  /**
    * PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never,
    * PreemptLowerPriority. Defaults to PreemptLowerPriority if unset. This field is alpha-level
    * and is only honored by servers that enable the NonPreemptingPriority feature.
    */
  val preemptionPolicy: java.lang.String
  /**
    * The value of this priority class. This is the actual priority that pods receive when they
    * have the name of this class in their pod spec.
    */
  val value: scala.Double
}

object PriorityClass {
  @scala.inline
  def apply(
    apiVersion: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1beta1`,
    description: java.lang.String,
    globalDefault: scala.Boolean,
    kind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PriorityClass,
    metadata: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta,
    preemptionPolicy: java.lang.String,
    value: scala.Double
  ): PriorityClass = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, description = description, globalDefault = globalDefault, kind = kind, metadata = metadata, preemptionPolicy = preemptionPolicy, value = value)
  
    __obj.asInstanceOf[PriorityClass]
  }
}

