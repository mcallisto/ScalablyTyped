package typings
package awsDashSdkLib.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends js.Object {
  /**
    * The tag key.
    */
  var Key: TagKey
  /**
    * Determines whether the tag is added to new instances as they are launched in the group.
    */
  var PropagateAtLaunch: js.UndefOr[PropagateAtLaunch] = js.undefined
  /**
    * The name of the group.
    */
  var ResourceId: js.UndefOr[XmlString] = js.undefined
  /**
    * The type of resource. The only supported value is auto-scaling-group.
    */
  var ResourceType: js.UndefOr[XmlString] = js.undefined
  /**
    * The tag value.
    */
  var Value: js.UndefOr[TagValue] = js.undefined
}

object Tag {
  @scala.inline
  def apply(
    Key: TagKey,
    PropagateAtLaunch: js.UndefOr[PropagateAtLaunch] = js.undefined,
    ResourceId: XmlString = null,
    ResourceType: XmlString = null,
    Value: TagValue = null
  ): Tag = {
    val __obj = js.Dynamic.literal(Key = Key)
    if (!js.isUndefined(PropagateAtLaunch)) __obj.updateDynamic("PropagateAtLaunch")(PropagateAtLaunch)
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId)
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType)
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[Tag]
  }
}

