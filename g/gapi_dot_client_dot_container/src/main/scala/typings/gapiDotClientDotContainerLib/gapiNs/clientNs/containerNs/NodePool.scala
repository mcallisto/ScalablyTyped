package typings
package gapiDotClientDotContainerLib.gapiNs.clientNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodePool extends js.Object {
  /**
    * Autoscaler configuration for this NodePool. Autoscaler is enabled
    * only if a valid configuration is present.
    */
  var autoscaling: js.UndefOr[NodePoolAutoscaling] = js.undefined
  /** The node configuration of the pool. */
  var config: js.UndefOr[NodeConfig] = js.undefined
  /**
    * The initial node count for the pool. You must ensure that your
    * Compute Engine <a href="/compute/docs/resource-quotas">resource quota</a>
    * is sufficient for this number of instances. You must also have available
    * firewall and routes quota.
    */
  var initialNodeCount: js.UndefOr[scala.Double] = js.undefined
  /**
    * [Output only] The resource URLs of [instance
    * groups](/compute/docs/instance-groups/) associated with this
    * node pool.
    */
  var instanceGroupUrls: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** NodeManagement configuration for this NodePool. */
  var management: js.UndefOr[NodeManagement] = js.undefined
  /** The name of the node pool. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** [Output only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** [Output only] The status of the nodes in this pool instance. */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /**
    * [Output only] Additional information about the current status of this
    * node pool instance, if available.
    */
  var statusMessage: js.UndefOr[java.lang.String] = js.undefined
  /** [Output only] The version of the Kubernetes of this node. */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object NodePool {
  @scala.inline
  def apply(
    autoscaling: NodePoolAutoscaling = null,
    config: NodeConfig = null,
    initialNodeCount: scala.Int | scala.Double = null,
    instanceGroupUrls: js.Array[java.lang.String] = null,
    management: NodeManagement = null,
    name: java.lang.String = null,
    selfLink: java.lang.String = null,
    status: java.lang.String = null,
    statusMessage: java.lang.String = null,
    version: java.lang.String = null
  ): NodePool = {
    val __obj = js.Dynamic.literal()
    if (autoscaling != null) __obj.updateDynamic("autoscaling")(autoscaling)
    if (config != null) __obj.updateDynamic("config")(config)
    if (initialNodeCount != null) __obj.updateDynamic("initialNodeCount")(initialNodeCount.asInstanceOf[js.Any])
    if (instanceGroupUrls != null) __obj.updateDynamic("instanceGroupUrls")(instanceGroupUrls)
    if (management != null) __obj.updateDynamic("management")(management)
    if (name != null) __obj.updateDynamic("name")(name)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (status != null) __obj.updateDynamic("status")(status)
    if (statusMessage != null) __obj.updateDynamic("statusMessage")(statusMessage)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[NodePool]
  }
}

