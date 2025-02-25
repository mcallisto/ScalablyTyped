package typings
package atPulumiKubernetesLib.typesOutputMod.rbacNs.v1alpha1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RoleList is a collection of Roles
  */
trait RoleList extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1`
  /**
    * Items is a list of Roles
    */
  val items: js.Array[Role]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.RoleList
  /**
    * Standard object's metadata.
    */
  val metadata: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta
}

object RoleList {
  @scala.inline
  def apply(
    apiVersion: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1`,
    items: js.Array[Role],
    kind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.RoleList,
    metadata: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta
  ): RoleList = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, items = items, kind = kind, metadata = metadata)
  
    __obj.asInstanceOf[RoleList]
  }
}

